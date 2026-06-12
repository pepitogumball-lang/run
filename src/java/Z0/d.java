package z0;

import java.util.List;
import u0.l;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import android.util.Log;
import F1.c0;
import java.util.ArrayList;
import h2.N;
import androidx.work.impl.WorkDatabase_Impl;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

public final class d extends SQLiteOpenHelper
{
    public final b[] C;
    public final f2.d D;
    public boolean E;
    
    public d(final Context context, final String s, final b[] c, final f2.d d) {
        d.getClass();
        super(context, s, (SQLiteDatabase$CursorFactory)null, 12, (DatabaseErrorHandler)new c(d, c));
        this.D = d;
        this.C = c;
    }
    
    public static b a(final b[] array, final SQLiteDatabase sqLiteDatabase) {
        final b b = array[0];
        if (b == null || (SQLiteDatabase)b.D != sqLiteDatabase) {
            array[0] = new b((SQLiteClosable)sqLiteDatabase, 0);
        }
        return array[0];
    }
    
    public final b b() {
        monitorenter(this);
        Label_0038: {
            try {
                this.E = false;
                final SQLiteDatabase writableDatabase = this.getWritableDatabase();
                if (this.E) {
                    this.close();
                    final b b = this.b();
                    monitorexit(this);
                    return b;
                }
                break Label_0038;
            }
            finally {
                monitorexit(this);
                final SQLiteDatabase writableDatabase;
                final b a = a(this.C, writableDatabase);
                monitorexit(this);
                return a;
            }
        }
    }
    
    public final void close() {
        synchronized (this) {
            super.close();
            this.C[0] = null;
        }
    }
    
    public final void onConfigure(final SQLiteDatabase sqLiteDatabase) {
        a(this.C, sqLiteDatabase);
        this.D.getClass();
    }
    
    public final void onCreate(SQLiteDatabase i) {
        final b a = a(this.C, i);
        final f2.d d = this.D;
        d.getClass();
        i = (SQLiteDatabase)a.i("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        Label_0216: {
            int n = 0;
            int int1 = 0;
            Label_0069: {
                try {
                    final boolean moveToFirst = ((Cursor)i).moveToFirst();
                    n = 0;
                    if (moveToFirst) {
                        int1 = ((Cursor)i).getInt(0);
                        if (int1 == 0) {
                            int1 = 1;
                            break Label_0069;
                        }
                    }
                }
                finally {
                    break Label_0216;
                }
                int1 = 0;
            }
            ((Cursor)i).close();
            final C2.b b = (C2.b)d.E;
            final b b2;
            C2.b.m(b2);
            if (int1 == 0) {
                final N y = C2.b.y(b2);
                if (!y.a) {
                    final StringBuilder sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                    sb.append(y.b);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d.m(b2);
            final int s = WorkDatabase_Impl.s;
            final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)b.D;
            final ArrayList g = ((l)workDatabase_Impl).g;
            if (g != null) {
                for (int size = ((List)g).size(), j = n; j < size; ++j) {
                    ((List)((l)workDatabase_Impl).g).get(j).getClass();
                }
            }
            return;
        }
        ((Cursor)i).close();
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        this.E = true;
        this.D.k(a(this.C, sqLiteDatabase), n, n2);
    }
    
    public final void onOpen(SQLiteDatabase i) {
        if (!this.E) {
            final f2.d d = this.D;
            final b a = a(this.C, i);
            d.getClass();
            i = (SQLiteDatabase)a.i("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            Label_0526: {
                int int1 = 0;
                Label_0076: {
                    try {
                        final boolean moveToFirst = ((Cursor)i).moveToFirst();
                        final int n = 0;
                        if (moveToFirst) {
                            int1 = ((Cursor)i).getInt(0);
                            if (int1 != 0) {
                                int1 = 1;
                                break Label_0076;
                            }
                        }
                    }
                    finally {
                        break Label_0526;
                    }
                    int1 = 0;
                }
                ((Cursor)i).close();
                final N y;
                Label_0492: {
                    final f2.d d2;
                    Label_0198: {
                        if (int1 != 0) {
                            final Cursor j = a.j((y0.c)new c0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 2));
                            final Throwable t;
                            Label_0169: {
                                Label_0131: {
                                    try {
                                        if (j.moveToFirst()) {
                                            j.getString(0);
                                            break Label_0131;
                                        }
                                    }
                                    finally {
                                        break Label_0169;
                                    }
                                    t = null;
                                }
                                j.close();
                                if ("c103703e120ae8cc73c9248622f3cd1e".equals((Object)t)) {
                                    break Label_0198;
                                }
                                if ("49f946663a8deb7054212b8adda248c6".equals((Object)t)) {
                                    break Label_0198;
                                }
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                            }
                            j.close();
                            throw t;
                        }
                        y = C2.b.y(a);
                        if (!y.a) {
                            break Label_0492;
                        }
                        d2.m(a);
                    }
                    final Object o = d2.E;
                    final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)((C2.b)o).D;
                    final int s = WorkDatabase_Impl.s;
                    (((l)workDatabase_Impl).a = a).h("PRAGMA foreign_keys = ON");
                    final u0.f d3 = ((l)((C2.b)o).D).d;
                    final u0.f f;
                    monitorenter(f = d3);
                    Label_0278: {
                        try {
                            if (d3.e) {
                                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                                monitorexit(f);
                                break Label_0278;
                            }
                            break Label_0278;
                        }
                        finally {
                            monitorexit(f);
                            while (true) {
                                int n2 = 0;
                                final int size;
                                iftrue(Label_0478:)(n2 >= size);
                                ((List)((l)((C2.b)o).D).g).get(n2).getClass();
                                a.a();
                                try {
                                    final int k = WorkDatabase.k;
                                    final StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
                                    sb.append(System.currentTimeMillis() - WorkDatabase.j);
                                    sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                    a.h(sb.toString());
                                    a.k();
                                    a.g();
                                    ++n2;
                                    continue;
                                }
                                finally {
                                    a.g();
                                }
                                Label_0478: {
                                    break Label_0478;
                                    a.h("PRAGMA temp_store = MEMORY;");
                                    a.h("PRAGMA recursive_triggers='ON';");
                                    a.h("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                                    d3.c(a);
                                    d3.f = new f(((SQLiteDatabase)a.D).compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                                    d3.e = true;
                                    monitorexit(f);
                                    break Label_0278;
                                }
                                d2.D = null;
                                return;
                                final ArrayList g = ((l)((C2.b)o).D).g;
                                iftrue(Label_0478:)(g == null);
                                size = ((List)g).size();
                                final int n;
                                n2 = n;
                                continue;
                            }
                        }
                    }
                }
                final StringBuilder sb2 = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb2.append(y.b);
                throw new IllegalStateException(sb2.toString());
            }
            ((Cursor)i).close();
        }
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        this.E = true;
        this.D.k(a(this.C, sqLiteDatabase), n, n2);
    }
}
