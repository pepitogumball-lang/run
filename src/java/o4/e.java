package o4;

import android.os.BaseBundle;
import java.util.Map;
import android.database.sqlite.SQLiteClosable;
import p4.d;
import p4.b;
import android.content.pm.ApplicationInfo;
import G0.g;
import android.os.Build$VERSION;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import java.util.Iterator;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import java.io.Serializable;
import u2.f;
import android.util.Log;
import java.util.List;
import java.util.Arrays;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.ArrayList;
import android.content.Context;

public final class e
{
    public static Boolean n;
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final Context e;
    public final ArrayList f;
    public final HashMap g;
    public h h;
    public SQLiteDatabase i;
    public int j;
    public int k;
    public Integer l;
    public int m;
    
    public e(final Context e, final String b, final int c, final boolean a, final int d) {
        this.f = new ArrayList();
        this.g = new HashMap();
        this.j = 0;
        this.k = 0;
        this.m = 0;
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public static HashMap c(final Cursor cursor, final Integer n) {
        HashMap hashMap = null;
        List list = null;
        int n2 = 0;
        HashMap hashMap2;
        while (true) {
            hashMap2 = hashMap;
            if (!cursor.moveToNext()) {
                break;
            }
            hashMap2 = hashMap;
            Object o = list;
            int columnCount = n2;
            if (hashMap == null) {
                o = new ArrayList();
                hashMap2 = new HashMap();
                columnCount = cursor.getColumnCount();
                hashMap2.put((Object)"columns", (Object)Arrays.asList((Object[])cursor.getColumnNames()));
                hashMap2.put((Object)"rows", o);
            }
            final ArrayList list2 = new ArrayList(columnCount);
            for (int i = 0; i < columnCount; ++i) {
                final int type = cursor.getType(i);
                Object o2;
                if (type != 1) {
                    if (type != 2) {
                        if (type != 3) {
                            if (type != 4) {
                                o2 = null;
                            }
                            else {
                                o2 = cursor.getBlob(i);
                            }
                        }
                        else {
                            o2 = cursor.getString(i);
                        }
                    }
                    else {
                        o2 = cursor.getDouble(i);
                    }
                }
                else {
                    o2 = cursor.getLong(i);
                }
                list2.add(o2);
            }
            ((List)o).add((Object)list2);
            hashMap = hashMap2;
            list = (List)o;
            n2 = columnCount;
            if (n == null) {
                continue;
            }
            hashMap = hashMap2;
            list = (List)o;
            n2 = columnCount;
            if (((List)o).size() >= n) {
                break;
            }
        }
        HashMap hashMap3;
        if ((hashMap3 = hashMap2) == null) {
            hashMap3 = new HashMap();
        }
        return hashMap3;
    }
    
    public final void a() {
        final HashMap g = this.g;
        if (!g.isEmpty() && o4.a.a(this.d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.h());
            sb.append(g.size());
            sb.append(" cursor(s) are left opened");
            Log.d("Sqflite", sb.toString());
        }
        ((SQLiteClosable)this.i).close();
    }
    
    public final void b(final i i) {
        try {
            final int a = i.a;
            if (o4.a.b(this.d)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.h());
                sb.append("closing cursor ");
                sb.append(a);
                Log.d("Sqflite", sb.toString());
            }
            this.g.remove((Object)a);
            i.c.close();
        }
        catch (final Exception ex) {}
    }
    
    public final boolean d(f f) {
        if (!this.g(f)) {
            return false;
        }
        final boolean k = f.k();
        Object o = null;
        if (k) {
            f.h(null);
            return true;
        }
        Label_0474: {
            Object rawQuery = null;
            Label_0449: {
                try {
                    rawQuery = this.i.rawQuery("SELECT changes(), last_insert_rowid()", (String[])null);
                    Label_0354: {
                        if (rawQuery != null) {
                            Object o2 = rawQuery;
                            int d = 0;
                            Label_0236: {
                                try {
                                    try {
                                        if (((Cursor)rawQuery).getCount() <= 0) {
                                            break Label_0354;
                                        }
                                        o2 = rawQuery;
                                        if (!((Cursor)rawQuery).moveToFirst()) {
                                            break Label_0354;
                                        }
                                        o2 = rawQuery;
                                        final int int1 = ((Cursor)rawQuery).getInt(0);
                                        d = this.d;
                                        if (int1 != 0) {
                                            break Label_0236;
                                        }
                                        o2 = rawQuery;
                                        if (o4.a.a(d)) {
                                            o2 = rawQuery;
                                            o2 = rawQuery;
                                            o = new StringBuilder();
                                            o2 = rawQuery;
                                            ((StringBuilder)o).append(this.h());
                                            o2 = rawQuery;
                                            ((StringBuilder)o).append("no changes (id was ");
                                            o2 = rawQuery;
                                            ((StringBuilder)o).append(((Cursor)rawQuery).getLong(1));
                                            o2 = rawQuery;
                                            ((StringBuilder)o).append(")");
                                            o2 = rawQuery;
                                            Log.d("Sqflite", ((StringBuilder)o).toString());
                                        }
                                    }
                                    finally {
                                        f = (f)o2;
                                    }
                                }
                                catch (final Exception o) {
                                    break Label_0449;
                                }
                                f.h(null);
                                ((Cursor)rawQuery).close();
                                return true;
                            }
                            final long long1 = ((Cursor)rawQuery).getLong(1);
                            if (o4.a.a(d)) {
                                o = new StringBuilder();
                                ((StringBuilder)o).append(this.h());
                                ((StringBuilder)o).append("inserted ");
                                ((StringBuilder)o).append(long1);
                                Log.d("Sqflite", ((StringBuilder)o).toString());
                            }
                            f.h((Serializable)long1);
                            ((Cursor)rawQuery).close();
                            return true;
                        }
                    }
                    o = new StringBuilder();
                    ((StringBuilder)o).append(this.h());
                    ((StringBuilder)o).append("fail to read changes for Insert");
                    Log.e("Sqflite", ((StringBuilder)o).toString());
                    f.h(null);
                    if (rawQuery != null) {
                        ((Cursor)rawQuery).close();
                    }
                    return true;
                }
                catch (final Exception o) {
                    rawQuery = null;
                }
                finally {
                    f = (f)o;
                    break Label_0474;
                }
            }
            this.i((Exception)o, f);
            if (rawQuery != null) {
                ((Cursor)rawQuery).close();
            }
            return false;
        }
        if (f != null) {
            ((Cursor)f).close();
        }
    }
    
    public final boolean e(final f f) {
        final Integer n = (Integer)f.g("cursorPageSize");
        final String s = (String)f.g("sql");
        final m m = new m(s, (List)f.g("arguments"));
        if (o4.a.a(this.d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.h());
            sb.append((Object)m);
            Log.d("Sqflite", sb.toString());
        }
        final i i = null;
        final i j = null;
        i k = null;
        Object o = null;
        Exception ex = null;
        Cursor cursor3 = null;
        Label_0459: {
            Label_0408: {
                try {
                    Object o2 = this.i;
                    Cursor rawQueryWithFactory;
                    final Cursor cursor = rawQueryWithFactory = ((SQLiteDatabase)o2).rawQueryWithFactory((SQLiteDatabase$CursorFactory)new c(m), s, o4.a.a, (String)null);
                    o = ex;
                    i l = i;
                    Cursor cursor2 = null;
                    Label_0365: {
                        try {
                            try {
                                o2 = c(cursor, n);
                                k = j;
                                if (n == null) {
                                    break Label_0365;
                                }
                                rawQueryWithFactory = cursor;
                                o = ex;
                                l = i;
                                k = j;
                                if (cursor.isLast()) {
                                    break Label_0365;
                                }
                                rawQueryWithFactory = cursor;
                                o = ex;
                                l = i;
                                k = j;
                                if (!cursor.isAfterLast()) {
                                    rawQueryWithFactory = cursor;
                                    o = ex;
                                    l = i;
                                    final int m2 = this.m + 1;
                                    rawQueryWithFactory = cursor;
                                    o = ex;
                                    l = i;
                                    this.m = m2;
                                    rawQueryWithFactory = cursor;
                                    o = ex;
                                    l = i;
                                    ((Map)o2).put((Object)"cursorId", (Object)m2);
                                    rawQueryWithFactory = cursor;
                                    o = ex;
                                    l = i;
                                    k = new(o4.i.class)();
                                    rawQueryWithFactory = cursor;
                                    o = ex;
                                    l = i;
                                    new i(m2, n, cursor);
                                    while (true) {
                                        try {
                                            this.g.put((Object)m2, (Object)k);
                                            break Label_0365;
                                            break Label_0408;
                                        }
                                        catch (final Exception ex2) {}
                                        final Exception ex2;
                                        ex = ex2;
                                        continue;
                                    }
                                }
                            }
                            finally {
                                cursor2 = rawQueryWithFactory;
                            }
                        }
                        catch (final Exception ex) {
                            k = l;
                            break Label_0408;
                        }
                    }
                    o = k;
                    f.h((Serializable)o2);
                    if (k == null) {
                        cursor2.close();
                    }
                    return true;
                }
                catch (final Exception ex) {
                    cursor3 = null;
                }
                finally {
                    cursor3 = null;
                    break Label_0459;
                }
            }
            this.i(ex, f);
            if (k != null) {
                this.b(k);
            }
            if (k == null && cursor3 != null) {
                cursor3.close();
            }
            return false;
        }
        if (o == null && cursor3 != null) {
            cursor3.close();
        }
    }
    
    public final boolean f(final f f) {
        if (!this.g(f)) {
            return false;
        }
        final boolean k = f.k();
        final StringBuilder sb = null;
        Object o = null;
        if (k) {
            f.h(null);
            return true;
        }
        Label_0263: {
            Object rawQuery;
            try {
                try {
                    rawQuery = this.i.rawQuery("SELECT changes()", (String[])null);
                    Label_0169: {
                        if (rawQuery != null) {
                            int int1 = 0;
                            try {
                                if (((Cursor)rawQuery).getCount() <= 0 || !((Cursor)rawQuery).moveToFirst()) {
                                    break Label_0169;
                                }
                                int1 = ((Cursor)rawQuery).getInt(0);
                                if (o4.a.a(this.d)) {
                                    o = new StringBuilder();
                                    ((StringBuilder)o).append(this.h());
                                    ((StringBuilder)o).append("changed ");
                                    ((StringBuilder)o).append(int1);
                                    Log.d("Sqflite", ((StringBuilder)o).toString());
                                }
                            }
                            catch (final Exception ex) {}
                            finally {
                                o = rawQuery;
                                break Label_0263;
                            }
                            f.h((Serializable)int1);
                            ((Cursor)rawQuery).close();
                            return true;
                        }
                    }
                    o = new StringBuilder();
                    ((StringBuilder)o).append(this.h());
                    ((StringBuilder)o).append("fail to read changes for Update/Delete");
                    Log.e("Sqflite", ((StringBuilder)o).toString());
                    f.h(null);
                    if (rawQuery != null) {
                        ((Cursor)rawQuery).close();
                    }
                    return true;
                }
                finally {}
            }
            catch (final Exception ex) {
                rawQuery = sb;
            }
            final Exception ex;
            this.i(ex, f);
            if (rawQuery != null) {
                ((Cursor)rawQuery).close();
            }
            return false;
        }
        if (o != null) {
            ((Cursor)o).close();
        }
    }
    
    public final boolean g(final f f) {
        final String s = (String)f.g("sql");
        final m m = new m(s, (List)f.g("arguments"));
        if (o4.a.a(this.d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.h());
            sb.append((Object)m);
            Log.d("Sqflite", sb.toString());
        }
        final Object g = f.g("inTransaction");
        Boolean b;
        if (g instanceof Boolean) {
            b = (Boolean)g;
        }
        else {
            b = null;
        }
        try {
            final SQLiteDatabase i = this.i;
            final ArrayList list = new ArrayList();
            final List b2 = m.b;
            if (b2 != null) {
                final Iterator iterator = b2.iterator();
                while (iterator.hasNext()) {
                    list.add(o4.m.a(iterator.next()));
                }
            }
            i.execSQL(s, list.toArray(new Object[0]));
            monitorenter(this);
            Label_0212: {
                try {
                    if (Boolean.TRUE.equals((Object)b)) {
                        ++this.j;
                        break Label_0212;
                    }
                    break Label_0212;
                }
                finally {
                    monitorexit(this);
                    monitorexit(this);
                    return true;
                    iftrue(Label_0232:)(!Boolean.FALSE.equals((Object)b));
                    --this.j;
                }
            }
        }
        catch (final Exception ex) {
            this.i(ex, f);
            return false;
        }
    }
    
    public final String h() {
        final StringBuilder sb = new StringBuilder("[");
        final Thread currentThread = Thread.currentThread();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c);
        sb2.append(",");
        sb2.append(currentThread.getName());
        sb2.append("(");
        sb2.append(currentThread.getId());
        sb2.append(")");
        sb.append(sb2.toString());
        sb.append("] ");
        return sb.toString();
    }
    
    public final void i(final Exception ex, final f f) {
        if (ex instanceof SQLiteCantOpenDatabaseException) {
            final StringBuilder sb = new StringBuilder("open_failed ");
            sb.append(this.b);
            f.j(sb.toString(), null);
            return;
        }
        if (ex instanceof SQLException) {
            final String message = ((Throwable)ex).getMessage();
            final String s = (String)f.g("sql");
            Object o;
            if ((o = f.g("arguments")) == null) {
                o = new ArrayList();
            }
            final HashMap hashMap = new HashMap();
            hashMap.put((Object)"sql", (Object)s);
            hashMap.put((Object)"arguments", o);
            f.j(message, hashMap);
            return;
        }
        final String message2 = ((Throwable)ex).getMessage();
        final String s2 = (String)f.g("sql");
        Object o2;
        if ((o2 = f.g("arguments")) == null) {
            o2 = new ArrayList();
        }
        final HashMap hashMap2 = new HashMap();
        hashMap2.put((Object)"sql", (Object)s2);
        hashMap2.put((Object)"arguments", o2);
        f.j(message2, hashMap2);
    }
    
    public final boolean j() {
        synchronized (this) {
            return this.j > 0;
        }
    }
    
    public final void k() {
        if (o4.e.n == null) {
            final Context e = this.e;
            boolean b = false;
            Label_0094: {
                Label_0089: {
                    ApplicationInfo applicationInfo = null;
                    Label_0067: {
                        String packageName;
                        try {
                            packageName = e.getPackageName();
                            if (Build$VERSION.SDK_INT >= 33) {
                                applicationInfo = G0.g.a(e.getPackageManager(), packageName, G0.g.b());
                                break Label_0067;
                            }
                        }
                        catch (final Exception ex) {
                            break Label_0089;
                        }
                        applicationInfo = e.getPackageManager().getApplicationInfo(packageName, 128);
                    }
                    if (((BaseBundle)applicationInfo.metaData).getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                        b = true;
                    }
                    break Label_0094;
                }
                final Exception ex;
                ((Throwable)ex).printStackTrace();
            }
            o4.e.n = b;
            if (b && o4.a.b(this.d)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.h());
                sb.append("[sqflite] WAL enabled");
                Log.d("Sqflite", sb.toString());
            }
        }
        int n;
        if (o4.e.n) {
            n = 805306368;
        }
        else {
            n = 268435456;
        }
        this.i = SQLiteDatabase.openDatabase(this.b, (SQLiteDatabase$CursorFactory)null, n);
    }
    
    public final void l(final b b, final Runnable runnable) {
        final Integer n = (Integer)b.g("transactionId");
        final Integer l = this.l;
        if (l == null) {
            runnable.run();
        }
        else {
            final ArrayList f = this.f;
            if (n != null && (n.equals((Object)l) || n == -1)) {
                runnable.run();
                if (this.l == null && !f.isEmpty()) {
                    this.h.c(this, (Runnable)new C.a((Object)this, 13));
                }
            }
            else {
                f.add((Object)new d(runnable));
            }
        }
    }
}
