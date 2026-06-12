package u1;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import java.util.Arrays;
import java.util.List;
import android.database.sqlite.SQLiteOpenHelper;

public final class k extends SQLiteOpenHelper
{
    public static final String E;
    public static final int F;
    public static final List G;
    public final int C;
    public boolean D;
    
    static {
        final StringBuilder sb = new StringBuilder("INSERT INTO global_log_event_state VALUES (");
        sb.append(System.currentTimeMillis());
        sb.append(")");
        E = sb.toString();
        F = 7;
        G = Arrays.asList((Object[])new j[] { new j(0), new j(1), new j(2), new j(3), new j(4), new j(5), new j(6) });
    }
    
    public k(final int c, final Context context, final String s) {
        super(context, s, (SQLiteDatabase$CursorFactory)null, c);
        this.D = false;
        this.C = c;
    }
    
    public static void a(final SQLiteDatabase sqLiteDatabase, int i, final int n) {
        final List g = k.G;
        if (n <= g.size()) {
            while (i < n) {
                switch (((j)g.get(i)).a) {
                    default: {
                        sqLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
                        sqLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
                        sqLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
                        break;
                    }
                    case 5: {
                        sqLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    }
                    case 4: {
                        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                        sqLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                        sqLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                        sqLiteDatabase.execSQL(k.E);
                        break;
                    }
                    case 3: {
                        sqLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                        sqLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                        break;
                    }
                    case 2: {
                        sqLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    }
                    case 1: {
                        sqLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                        sqLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                        sqLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                        break;
                    }
                    case 0: {
                        sqLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                        sqLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                        sqLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                        sqLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                        sqLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                        break;
                    }
                }
                ++i;
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(n);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(g.size());
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void onConfigure(final SQLiteDatabase sqLiteDatabase) {
        this.D = true;
        sqLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sqLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        if (!this.D) {
            this.onConfigure(sqLiteDatabase);
        }
        a(sqLiteDatabase, 0, this.C);
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        sqLiteDatabase.execSQL("DROP TABLE events");
        sqLiteDatabase.execSQL("DROP TABLE event_metadata");
        sqLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.D) {
            this.onConfigure(sqLiteDatabase);
        }
        a(sqLiteDatabase, 0, n2);
    }
    
    public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
        if (!this.D) {
            this.onConfigure(sqLiteDatabase);
        }
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        if (!this.D) {
            this.onConfigure(sqLiteDatabase);
        }
        a(sqLiteDatabase, n, n2);
    }
}
