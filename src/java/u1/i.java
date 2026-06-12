package u1;

import c4.f;
import L3.q;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import java.util.Objects;
import android.database.Cursor;
import java.util.Iterator;
import android.util.Base64;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import n1.j;
import android.database.sqlite.SQLiteDatabase;
import w1.a;
import v1.c;

public final class i implements d, c, c
{
    public static final k1.c H;
    public final k C;
    public final a D;
    public final a E;
    public final u1.a F;
    public final b5.a G;
    
    static {
        H = new k1.c("proto");
    }
    
    public i(final a d, final a e, final u1.a f, final k c, final b5.a g) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
    }
    
    public static Long b(final SQLiteDatabase sqLiteDatabase, j query) {
        final StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        final ArrayList list = new ArrayList((Collection)Arrays.asList((Object[])new String[] { query.a, String.valueOf(x1.a.a(query.c)) }));
        final byte[] b = query.b;
        if (b != null) {
            sb.append(" and extras = ?");
            list.add((Object)Base64.encodeToString(b, 0));
        }
        else {
            sb.append(" and extras is null");
        }
        query = (j)sqLiteDatabase.query("transport_contexts", new String[] { "_id" }, sb.toString(), (String[])list.toArray((Object[])new String[0]), (String)null, (String)null, (String)null);
        try {
            Long value;
            if (!((Cursor)query).moveToNext()) {
                value = null;
            }
            else {
                value = ((Cursor)query).getLong(0);
            }
            return value;
        }
        finally {
            ((Cursor)query).close();
        }
    }
    
    public static String h(final Iterable iterable) {
        final StringBuilder sb = new StringBuilder("(");
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            sb.append(((b)iterator.next()).a);
            if (iterator.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }
    
    public static Object i(final Cursor cursor, final g g) {
        try {
            return g.apply((Object)cursor);
        }
        finally {
            cursor.close();
        }
    }
    
    public final SQLiteDatabase a() {
        final k c = this.C;
        Objects.requireNonNull((Object)c);
        final a e = this.E;
        final long i = e.i();
        try {
            return c.getWritableDatabase();
        }
        catch (final SQLiteDatabaseLockedException ex) {
            if (e.i() < this.F.c + i) {
                SystemClock.sleep(50L);
                return c.getWritableDatabase();
            }
            throw new RuntimeException("Timed out while trying to open db.", (Throwable)ex);
        }
    }
    
    public final Object c(final g g) {
        final SQLiteDatabase a = this.a();
        a.beginTransaction();
        try {
            final Object apply = g.apply((Object)a);
            a.setTransactionSuccessful();
            return apply;
        }
        finally {
            a.endTransaction();
        }
    }
    
    public final void close() {
        this.C.close();
    }
    
    public final ArrayList d(final SQLiteDatabase sqLiteDatabase, final j j, final int n) {
        final ArrayList list = new ArrayList();
        final Long b = b(sqLiteDatabase, j);
        if (b == null) {
            return list;
        }
        i(sqLiteDatabase.query("events", new String[] { "_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob" }, "context_id = ?", new String[] { b.toString() }, (String)null, (String)null, (String)null, String.valueOf(n)), (g)new q((Object)this, (Object)list, (Object)j, 8));
        return list;
    }
    
    public final void f(final long n, final q1.c c, final String s) {
        this.c((g)new f((Object)s, (Object)c, n));
    }
    
    public final Object g(final v1.b b) {
        final SQLiteDatabase a = this.a();
        final a e = this.E;
        final long i = e.i();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    final Object c = b.c();
                    a.setTransactionSuccessful();
                    return c;
                }
                finally {
                    a.endTransaction();
                }
            }
            catch (final SQLiteDatabaseLockedException ex) {
                if (e.i() < this.F.c + i) {
                    SystemClock.sleep(50L);
                    continue;
                }
                throw new RuntimeException("Timed out while trying to acquire the lock.", (Throwable)ex);
            }
            break;
        }
    }
}
