package u0;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import android.database.sqlite.SQLiteException;
import Y3.a;
import z0.b;
import android.util.Log;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Locale;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import g2.n;
import I1.F;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.HashMap;

public final class f
{
    public static final String[] j;
    public final HashMap a;
    public final String[] b;
    public final WorkDatabase_Impl c;
    public final AtomicBoolean d;
    public volatile boolean e;
    public volatile z0.f f;
    public final F g;
    public final q.f h;
    public final n i;
    
    static {
        j = new String[] { "UPDATE", "DELETE", "INSERT" };
    }
    
    public f(final WorkDatabase_Impl c, final HashMap hashMap, HashMap a, final String... array) {
        int i = 0;
        this.d = new AtomicBoolean(false);
        this.e = false;
        this.h = new q.f();
        this.i = new n((Object)this, 10);
        this.c = c;
        this.g = new F(array.length);
        this.a = new HashMap();
        Collections.newSetFromMap((Map)new IdentityHashMap());
        final int length = array.length;
        this.b = new String[length];
        while (i < length) {
            final String s = array[i];
            final Locale us = Locale.US;
            final String lowerCase = s.toLowerCase(us);
            this.a.put((Object)lowerCase, (Object)i);
            final String s2 = (String)hashMap.get((Object)array[i]);
            if (s2 != null) {
                this.b[i] = s2.toLowerCase(us);
            }
            else {
                this.b[i] = lowerCase;
            }
            ++i;
        }
        for (final Map$Entry map$Entry : hashMap.entrySet()) {
            final String s3 = (String)map$Entry.getValue();
            final Locale us2 = Locale.US;
            final String lowerCase2 = s3.toLowerCase(us2);
            if (this.a.containsKey((Object)lowerCase2)) {
                final String lowerCase3 = ((String)map$Entry.getKey()).toLowerCase(us2);
                a = this.a;
                a.put((Object)lowerCase3, a.get((Object)lowerCase2));
            }
        }
    }
    
    public final boolean a() {
        final b a = ((l)this.c).a;
        if (a == null || !((SQLiteDatabase)a.D).isOpen()) {
            return false;
        }
        if (!this.e) {
            ((l)this.c).c.e();
        }
        if (!this.e) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }
    
    public final void b(final b b, final int n) {
        b.h(Y3.a.j(n, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)"));
        final String s = this.b[n];
        final StringBuilder sb = new StringBuilder();
        final String[] j = u0.f.j;
        for (int i = 0; i < 3; ++i) {
            final String s2 = j[i];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(s);
            sb.append("_");
            sb.append(s2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(s2);
            sb.append(" ON `");
            sb.append(s);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(n);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            b.h(sb.toString());
        }
    }
    
    public final void c(final b b) {
        if (((SQLiteDatabase)b.D).inTransaction()) {
            return;
        }
        Label_0294: {
            ReentrantReadWriteLock$ReadLock lock = null;
            Label_0285: {
                F g = null;
                Label_0063: {
                    try {
                        lock = ((l)this.c).h.readLock();
                        ((Lock)lock).lock();
                        final f f = this;
                        final F f2 = f.g;
                        final int[] array = f2.a();
                        final int[] array3;
                        final int[] array2 = array3 = array;
                        if (array3 == null) {
                            final Lock lock2 = (Lock)lock;
                            lock2.unlock();
                            return;
                        }
                        break Label_0063;
                    }
                    catch (final SQLiteException ex) {
                        break Label_0294;
                    }
                    catch (final IllegalStateException ex2) {
                        break Label_0294;
                    }
                    try {
                        final f f = this;
                        final F f2 = f.g;
                        final int[] array = f2.a();
                        final int[] array3;
                        final int[] array2 = array3 = array;
                        if (array3 == null) {
                            final Lock lock2 = (Lock)lock;
                            lock2.unlock();
                            return;
                        }
                        final int length = array2.length;
                        b.a();
                        int i = 0;
                    Label_0218_Outer:
                        while (i < length) {
                            final int n = array2[i];
                            Label_0212: {
                                if (n == 1) {
                                    break Label_0212;
                                }
                                while (true) {
                                    if (n != 2) {
                                        break Label_0218;
                                    }
                                    try {
                                        final String s = this.b[i];
                                        final StringBuilder sb = new StringBuilder();
                                        final String[] j = u0.f.j;
                                        for (int k = 0; k < 3; ++k) {
                                            final String s2 = j[k];
                                            sb.setLength(0);
                                            sb.append("DROP TRIGGER IF EXISTS ");
                                            sb.append("`");
                                            sb.append("room_table_modification_trigger_");
                                            sb.append(s);
                                            sb.append("_");
                                            sb.append(s2);
                                            sb.append("`");
                                            b.h(sb.toString());
                                        }
                                        ++i;
                                        continue Label_0218_Outer;
                                        this.b(b, i);
                                        continue;
                                    }
                                    finally {
                                        break Label_0063;
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                        b.k();
                        b.g();
                        g = this.g;
                        synchronized (g) {
                            g.D = false;
                            monitorexit(g);
                            ((Lock)lock).unlock();
                        }
                    }
                    finally {
                        break Label_0285;
                    }
                }
                b.g();
                throw g;
            }
            ((Lock)lock).unlock();
            throw b;
        }
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)b);
    }
}
