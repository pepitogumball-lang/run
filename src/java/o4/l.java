package o4;

import C2.x;
import java.util.Iterator;
import C2.B;
import java.util.Map$Entry;
import java.io.File;
import android.os.Build$VERSION;
import F4.o;
import F4.f;
import F4.q;
import F4.v;
import B4.b;
import E4.j;
import F4.m;
import android.util.Log;
import F4.p;
import android.content.Context;
import java.util.HashMap;
import F4.n;
import B4.c;

public class l implements c, n
{
    public static final HashMap E;
    public static final HashMap F;
    public static final Object G;
    public static final Object H;
    public static int I;
    public static String J;
    public static int K;
    public static int L;
    public static int M;
    public static h N;
    public Context C;
    public p D;
    
    static {
        E = new HashMap();
        F = new HashMap();
        G = new Object();
        H = new Object();
        l.I = 0;
        l.K = 0;
        l.L = 1;
        l.M = 0;
    }
    
    public static void a(final l l, final e e) {
        l.getClass();
        Label_0104: {
            Label_0063: {
                try {
                    if (a.a(e.d)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(e.h());
                        sb.append("closing database ");
                        Log.d("Sqflite", sb.toString());
                    }
                }
                catch (final Exception ex) {
                    break Label_0063;
                }
                e.a();
                break Label_0104;
            }
            final StringBuilder sb2 = new StringBuilder("error ");
            final Exception ex;
            sb2.append((Object)ex);
            sb2.append(" while closing database ");
            sb2.append(l.M);
            Log.e("Sqflite", sb2.toString());
        }
        final Object g;
        monitorenter(g = l.G);
        while (true) {
            Label_0178: {
                try {
                    if (!l.F.isEmpty() || l.N == null) {
                        break Label_0190;
                    }
                    if (a.a(e.d)) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append(e.h());
                        sb3.append("stopping thread");
                        Log.d("Sqflite", sb3.toString());
                    }
                    break Label_0178;
                }
                finally {
                    monitorexit(g);
                    monitorexit(g);
                    return;
                    l.N.a();
                    l.N = null;
                    continue;
                }
            }
            break;
        }
    }
    
    public static e b(final m m, final j j) {
        final Integer n = (Integer)m.a("id");
        final int intValue = n;
        final e e = (e)l.F.get((Object)n);
        if (e != null) {
            return e;
        }
        final StringBuilder sb = new StringBuilder("database_closed ");
        sb.append(intValue);
        j.error("sqlite_error", sb.toString(), (Object)null);
        return null;
    }
    
    public static HashMap c(final int n, final boolean b, final boolean b2) {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"id", (Object)n);
        if (b) {
            hashMap.put((Object)"recovered", (Object)Boolean.TRUE);
        }
        if (b2) {
            hashMap.put((Object)"recoveredInTransaction", (Object)Boolean.TRUE);
        }
        return hashMap;
    }
    
    public final void onAttachedToEngine(final b b) {
        this.C = b.a;
        final v b2 = v.b;
        final f c = b.c;
        (this.D = new p(c, "com.tekartik.sqflite", (q)b2, c.e())).b((n)this);
    }
    
    public final void onDetachedFromEngine(final b b) {
        this.C = null;
        this.D.b((n)null);
        this.D = null;
    }
    
    public final void onMethodCall(m c, o o) {
        final String a = c.a;
        a.getClass();
        boolean b = false;
        int n = -1;
        switch (a.hashCode()) {
            case 1863829223: {
                if (!a.equals((Object)"getDatabasesPath")) {
                    break;
                }
                n = 15;
                break;
            }
            case 1385449135: {
                if (!a.equals((Object)"getPlatformVersion")) {
                    break;
                }
                n = 14;
                break;
            }
            case 1193546321: {
                if (!a.equals((Object)"queryCursorNext")) {
                    break;
                }
                n = 13;
                break;
            }
            case 956410295: {
                if (!a.equals((Object)"databaseExists")) {
                    break;
                }
                n = 12;
                break;
            }
            case 107944136: {
                if (!a.equals((Object)"query")) {
                    break;
                }
                n = 11;
                break;
            }
            case 95458899: {
                if (!a.equals((Object)"debug")) {
                    break;
                }
                n = 10;
                break;
            }
            case 93509434: {
                if (!a.equals((Object)"batch")) {
                    break;
                }
                n = 9;
                break;
            }
            case -17190427: {
                if (!a.equals((Object)"openDatabase")) {
                    break;
                }
                n = 8;
                break;
            }
            case -198450538: {
                if (!a.equals((Object)"debugMode")) {
                    break;
                }
                n = 7;
                break;
            }
            case -263511994: {
                if (!a.equals((Object)"deleteDatabase")) {
                    break;
                }
                n = 6;
                break;
            }
            case -396289107: {
                if (!a.equals((Object)"androidSetLocale")) {
                    break;
                }
                n = 5;
                break;
            }
            case -838846263: {
                if (!a.equals((Object)"update")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1183792455: {
                if (!a.equals((Object)"insert")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1249474914: {
                if (!a.equals((Object)"options")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1253581933: {
                if (!a.equals((Object)"closeDatabase")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1319569547: {
                if (!a.equals((Object)"execute")) {
                    break;
                }
                n = 0;
                break;
            }
        }
    Label_2592_Outer:
        while (true) {
            Label_2400: {
                switch (n) {
                    default: {
                        ((j)o).notImplemented();
                        return;
                    }
                    case 15: {
                        if (l.J == null) {
                            l.J = this.C.getDatabasePath("tekartik_sqflite.db").getParent();
                        }
                        ((j)o).success((Object)l.J);
                        return;
                    }
                    case 14: {
                        final StringBuilder sb = new StringBuilder("Android ");
                        sb.append(Build$VERSION.RELEASE);
                        ((j)o).success((Object)sb.toString());
                        return;
                    }
                    case 13: {
                        o = o;
                        final e b2 = b(c, (j)o);
                        if (b2 == null) {
                            return;
                        }
                        l.N.c(b2, (Runnable)new o4.j(c, (j)o, b2, 0));
                        return;
                    }
                    case 11: {
                        break Label_2592_Outer;
                    }
                    case 10: {
                        break Label_2592_Outer;
                    }
                    case 9: {
                        break Label_2592_Outer;
                    }
                    case 8: {
                        break Label_2592_Outer;
                    }
                    case 7: {
                        break Label_1782;
                    }
                    case 6: {
                        break Label_2400;
                    }
                    case 5: {
                        break Label_2400;
                    }
                    case 4: {
                        break Label_2400;
                    }
                    case 3: {
                        break Label_2400;
                    }
                    case 2: {
                        break Label_2400;
                    }
                    case 1: {
                        break Label_2400;
                    }
                    case 12:
                    case 0: {
                    Label_0696_Outer:
                        while (true) {
                            break Label_2592;
                            final String s = (String)c.a("path");
                        Block_25_Outer:
                            while (true) {
                                try {
                                    b = new File(s).exists();
                                    ((j)o).success((Object)b);
                                    return;
                                    final j j = (j)o;
                                    o = (o)b(c, j);
                                    iftrue(Label_0731:)(o != null);
                                    return;
                                Label_0806_Outer:
                                    while (true) {
                                        Iterator iterator = null;
                                        Label_0840: {
                                            while (true) {
                                                h n2;
                                                HashMap hashMap;
                                                HashMap f;
                                                Map$Entry map$Entry;
                                                HashMap hashMap2;
                                                j i;
                                                Integer n3 = null;
                                                String s2;
                                                Object g;
                                                StringBuilder sb2;
                                                h n4;
                                                e e;
                                                StringBuilder sb3;
                                                e e2;
                                                String s3;
                                                Integer n5;
                                                HashMap f2;
                                                HashMap e3;
                                                Object a2;
                                                Integer n6;
                                                int intValue;
                                                e b3;
                                                int d;
                                                e b4;
                                                e b5;
                                                HashMap hashMap3 = null;
                                                Object a3;
                                                j k;
                                                e e4;
                                                Object g2;
                                                StringBuilder sb4;
                                                String s4 = null;
                                                Integer n7;
                                                e e5;
                                                String s5;
                                                Object o2 = null;
                                                StringBuilder sb5;
                                                StringBuilder sb6;
                                                j l;
                                                String b6;
                                                Object g3;
                                                Object g4;
                                                int n8;
                                                boolean b7 = false;
                                                e e6;
                                                int m;
                                                int k2;
                                                Object n9;
                                                StringBuilder sb7;
                                                StringBuilder sb8;
                                                String s6;
                                                int i2 = 0;
                                                Label_1817_Outer:Label_2389_Outer:
                                                while (true) {
                                                    o4.l.I = 1;
                                                    Block_35: {
                                                    Block_22:
                                                        while (true) {
                                                            Label_0971: {
                                                                while (true) {
                                                                    Block_45: {
                                                                        Block_44_Outer:Block_24_Outer:
                                                                        while (true) {
                                                                            break Label_1817;
                                                                            Block_26_Outer:Block_41_Outer:Label_1368_Outer:
                                                                            while (true) {
                                                                                while (true) {
                                                                                    while (true) {
                                                                                    Label_2307_Outer:
                                                                                        while (true) {
                                                                                            n2.a();
                                                                                            o4.l.N = null;
                                                                                            Block_43: {
                                                                                                while (true) {
                                                                                                    Label_2094_Outer:Block_73_Outer:Label_2027_Outer:
                                                                                                    while (true) {
                                                                                                        Label_2367: {
                                                                                                            break Label_2367;
                                                                                                            b = Boolean.TRUE.equals(c.b);
                                                                                                            iftrue(Label_1813:)(!b);
                                                                                                            break Block_35;
                                                                                                            hashMap = new HashMap();
                                                                                                            iterator = f.entrySet().iterator();
                                                                                                            break Label_0840;
                                                                                                            hashMap.put((Object)((Integer)map$Entry.getKey()).toString(), (Object)hashMap2);
                                                                                                            break Label_0840;
                                                                                                            Label_2214: {
                                                                                                                o4.l.N.c((e)o, (Runnable)new o4.j(c, i, (e)o, 5));
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        n3 = (Integer)c.a("logLevel");
                                                                                                        iftrue(Label_2389:)(n3 == null);
                                                                                                        break Block_45;
                                                                                                        s2 = (String)c.a("path");
                                                                                                        monitorenter(g = o4.l.G);
                                                                                                        Label_1914: {
                                                                                                            try {
                                                                                                                if (o4.a.b(o4.l.I)) {
                                                                                                                    sb2 = new StringBuilder("Look for ");
                                                                                                                    sb2.append(s2);
                                                                                                                    sb2.append(" in ");
                                                                                                                    sb2.append((Object)o4.l.E.keySet());
                                                                                                                    Log.d("Sqflite", sb2.toString());
                                                                                                                }
                                                                                                                break Label_1914;
                                                                                                            }
                                                                                                            finally {
                                                                                                                monitorexit(g);
                                                                                                            Block_71_Outer:
                                                                                                                while (true) {
                                                                                                                    while (true) {
                                                                                                                        Block_75: {
                                                                                                                            while (true) {
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                        n4.c(e, (Runnable)o);
                                                                                                                                        return;
                                                                                                                                        monitorexit(g);
                                                                                                                                        o = (o)new A1.b((Object)this, (Object)e, (Object)s2, (Object)o, 20, false);
                                                                                                                                        n4 = o4.l.N;
                                                                                                                                        iftrue(Label_2138:)(n4 == null);
                                                                                                                                        continue Label_2094_Outer;
                                                                                                                                    }
                                                                                                                                    iftrue(Label_2070:)(!o4.a.b(o4.l.I));
                                                                                                                                    sb3 = new StringBuilder();
                                                                                                                                    sb3.append(e2.h());
                                                                                                                                    sb3.append("found single instance ");
                                                                                                                                    iftrue(Label_2023:)(!e2.j());
                                                                                                                                    break Block_75;
                                                                                                                                    Label_2092: {
                                                                                                                                        e = null;
                                                                                                                                    }
                                                                                                                                    continue Block_73_Outer;
                                                                                                                                    sb3.append(s3);
                                                                                                                                    sb3.append((Object)n5);
                                                                                                                                    sb3.append(" ");
                                                                                                                                    sb3.append(s2);
                                                                                                                                    Log.d("Sqflite", sb3.toString());
                                                                                                                                    Label_2070:
                                                                                                                                    f2.remove((Object)n5);
                                                                                                                                    e3.remove((Object)s2);
                                                                                                                                    e = e2;
                                                                                                                                    continue Block_73_Outer;
                                                                                                                                }
                                                                                                                                f2 = o4.l.F;
                                                                                                                                e2 = (e)f2.get((Object)n5);
                                                                                                                                iftrue(Label_2092:)(e2 == null || !e2.i.isOpen());
                                                                                                                                continue Label_2027_Outer;
                                                                                                                            }
                                                                                                                            Label_2138: {
                                                                                                                                ((A1.b)o).run();
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        s3 = "(in transaction) ";
                                                                                                                        continue Block_71_Outer;
                                                                                                                        e3 = o4.l.E;
                                                                                                                        n5 = (Integer)e3.get((Object)s2);
                                                                                                                        iftrue(Label_2092:)(n5 == null);
                                                                                                                        continue Label_2307_Outer;
                                                                                                                    }
                                                                                                                    Label_2023: {
                                                                                                                        s3 = "";
                                                                                                                    }
                                                                                                                    continue Block_71_Outer;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        break Label_2400;
                                                                                                        Label_0731: {
                                                                                                            o4.l.N.c((e)o, (Runnable)new o4.j(c, j, (e)o, 2));
                                                                                                        }
                                                                                                        return;
                                                                                                        a2 = c.a("androidThreadCount");
                                                                                                        iftrue(Label_2367:)(a2 == null || a2.equals(o4.l.L));
                                                                                                        break Block_43;
                                                                                                        n6 = (Integer)c.a("id");
                                                                                                        intValue = n6;
                                                                                                        o = o;
                                                                                                        b3 = b(c, (j)o);
                                                                                                        iftrue(Label_2437:)(b3 != null);
                                                                                                        return;
                                                                                                        hashMap2.put((Object)"logLevel", (Object)d);
                                                                                                        continue Label_2307_Outer;
                                                                                                    }
                                                                                                    o = o;
                                                                                                    b4 = b(c, (j)o);
                                                                                                    iftrue(Label_1002:)(b4 != null);
                                                                                                    return;
                                                                                                    Label_2170: {
                                                                                                        o4.l.N.c(b5, (Runnable)new o4.j(c, b5, (j)o));
                                                                                                    }
                                                                                                    return;
                                                                                                    Label_0961:
                                                                                                    hashMap3.put((Object)"databases", (Object)hashMap);
                                                                                                    break Label_0971;
                                                                                                    o4.l.K = (int)a3;
                                                                                                    continue Block_26_Outer;
                                                                                                }
                                                                                                k = (j)o;
                                                                                                o = (o)b(c, k);
                                                                                                iftrue(Label_2258:)(o != null);
                                                                                                return;
                                                                                                o = o;
                                                                                                b5 = b(c, (j)o);
                                                                                                iftrue(Label_2170:)(b5 != null);
                                                                                                return;
                                                                                            }
                                                                                            o4.l.L = (int)a2;
                                                                                            n2 = o4.l.N;
                                                                                            iftrue(Label_2367:)(n2 == null);
                                                                                            continue Block_24_Outer;
                                                                                        }
                                                                                        ((j)o).success((Object)null);
                                                                                        return;
                                                                                        Label_2437: {
                                                                                            iftrue(Label_2508:)(!o4.a.a(b3.d));
                                                                                        }
                                                                                        break Block_26_Outer;
                                                                                        map$Entry = (Map$Entry)iterator.next();
                                                                                        e4 = (e)map$Entry.getValue();
                                                                                        hashMap2 = new HashMap();
                                                                                        hashMap2.put((Object)"path", (Object)e4.b);
                                                                                        hashMap2.put((Object)"singleInstance", (Object)e4.a);
                                                                                        d = e4.d;
                                                                                        iftrue(Label_0937:)(d <= 0);
                                                                                        continue Block_41_Outer;
                                                                                    }
                                                                                    ((j)o).success((Object)null);
                                                                                    return;
                                                                                    a3 = c.a("androidThreadPriority");
                                                                                    iftrue(Label_2307:)(a3 == null);
                                                                                    continue Label_2389_Outer;
                                                                                }
                                                                                monitorenter(g2 = o4.l.G);
                                                                                Label_1193: {
                                                                                    try {
                                                                                        if (o4.a.b(o4.l.I)) {
                                                                                            sb4 = new StringBuilder("Look for ");
                                                                                            sb4.append(s4);
                                                                                            sb4.append(" in ");
                                                                                            sb4.append((Object)o4.l.E.keySet());
                                                                                            Log.d("Sqflite", sb4.toString());
                                                                                        }
                                                                                        break Label_1193;
                                                                                    }
                                                                                    finally {
                                                                                        monitorexit(g2);
                                                                                        while (true) {
                                                                                        Label_1368:
                                                                                            while (true) {
                                                                                            Block_53_Outer:
                                                                                                while (true) {
                                                                                                    iftrue(Label_1440:)(!o4.a.b(o4.l.I));
                                                                                                    Block_54: {
                                                                                                    Label_1411:
                                                                                                        while (true) {
                                                                                                            Block_56: {
                                                                                                                break Block_56;
                                                                                                                e5 = (e)o4.l.F.get((Object)n7);
                                                                                                                iftrue(Label_1440:)(e5 == null);
                                                                                                                break Block_54;
                                                                                                                Label_1364: {
                                                                                                                    s5 = "";
                                                                                                                }
                                                                                                                break Label_1368;
                                                                                                                o2 = new StringBuilder();
                                                                                                                ((StringBuilder)o2).append(e5.h());
                                                                                                                ((StringBuilder)o2).append("re-opened single instance ");
                                                                                                                iftrue(Label_1364:)(!e5.j());
                                                                                                                break Block_53_Outer;
                                                                                                            }
                                                                                                            sb5 = new StringBuilder();
                                                                                                            sb5.append(e5.h());
                                                                                                            sb5.append("single instance database of ");
                                                                                                            sb5.append(s4);
                                                                                                            sb5.append(" not opened");
                                                                                                            Log.d("Sqflite", sb5.toString());
                                                                                                            Label_1440: {
                                                                                                                monitorexit(g2);
                                                                                                            }
                                                                                                            break Block_44_Outer;
                                                                                                            ((StringBuilder)o2).append(s5);
                                                                                                            ((StringBuilder)o2).append((Object)n7);
                                                                                                            ((StringBuilder)o2).append(" ");
                                                                                                            ((StringBuilder)o2).append(s4);
                                                                                                            Log.d("Sqflite", ((StringBuilder)o2).toString());
                                                                                                            break Label_1411;
                                                                                                            n7 = (Integer)o4.l.E.get((Object)s4);
                                                                                                            iftrue(Label_1440:)(n7 == null);
                                                                                                            continue Label_1368_Outer;
                                                                                                        }
                                                                                                        c = (m)c(n7, true, e5.j());
                                                                                                        ((j)o).success((Object)c);
                                                                                                        monitorexit(g2);
                                                                                                        return;
                                                                                                    }
                                                                                                    iftrue(Label_1310:)(e5.i.isOpen());
                                                                                                    continue Block_53_Outer;
                                                                                                }
                                                                                                s5 = "(in transaction) ";
                                                                                                continue Label_1368;
                                                                                            }
                                                                                            Label_1310: {
                                                                                                iftrue(Label_1411:)(!o4.a.b(o4.l.I));
                                                                                            }
                                                                                            continue Label_0806_Outer;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break Block_44_Outer;
                                                                                Label_2258: {
                                                                                    o4.l.N.c((e)o, (Runnable)new o4.j(c, k, (e)o, 1));
                                                                                }
                                                                                return;
                                                                                i = (j)o;
                                                                                o = (o)b(c, i);
                                                                                iftrue(Label_2214:)(o != null);
                                                                                return;
                                                                                f = o4.l.F;
                                                                                iftrue(Label_0971:)(f.isEmpty());
                                                                                continue Block_26_Outer;
                                                                            }
                                                                            sb6 = new StringBuilder();
                                                                            sb6.append(b3.h());
                                                                            sb6.append("closing ");
                                                                            sb6.append(intValue);
                                                                            sb6.append(" ");
                                                                            sb6.append(b3.b);
                                                                            Log.d("Sqflite", sb6.toString());
                                                                            Label_2508: {
                                                                                break Label_2508;
                                                                                l = (j)o;
                                                                                o = (o)b(c, l);
                                                                                iftrue(Label_2612:)(o != null);
                                                                                return;
                                                                            }
                                                                            b6 = b3.b;
                                                                            monitorenter(g3 = o4.l.G);
                                                                            Label_2557: {
                                                                                try {
                                                                                    o4.l.F.remove((Object)n6);
                                                                                    if (b3.a) {
                                                                                        o4.l.E.remove((Object)b6);
                                                                                    }
                                                                                    break Label_2557;
                                                                                }
                                                                                finally {
                                                                                    monitorexit(g3);
                                                                                    monitorexit(g3);
                                                                                    o4.l.N.c(b3, (Runnable)new C2.v((Object)this, (Object)b3, (Object)o, 27, false));
                                                                                    return;
                                                                                }
                                                                            }
                                                                            continue Label_0696_Outer;
                                                                            Label_2612: {
                                                                                o4.l.N.c((e)o, (Runnable)new o4.j(c, l, (e)o, 4));
                                                                            }
                                                                            return;
                                                                            Label_1002:
                                                                            o4.l.N.c(b4, (Runnable)new o4.j(b4, c, (j)o));
                                                                            return;
                                                                            Label_1813:
                                                                            o4.l.I = 0;
                                                                            continue Block_44_Outer;
                                                                        }
                                                                        g4 = o4.l.G;
                                                                        synchronized (g4) {
                                                                            n8 = ++o4.l.M;
                                                                            monitorexit(g4);
                                                                            e6 = new e(this.C, s4, n8, b7, o4.l.I);
                                                                            monitorenter(g4);
                                                                            Label_1637: {
                                                                                try {
                                                                                    if (o4.l.N != null) {
                                                                                        break Label_1637;
                                                                                    }
                                                                                    m = o4.l.L;
                                                                                    k2 = o4.l.K;
                                                                                    if (m == 1) {
                                                                                        n9 = new Object();
                                                                                        ((x)n9).b = k2;
                                                                                    }
                                                                                    else {
                                                                                        n9 = new B(m, k2);
                                                                                    }
                                                                                    (o4.l.N = (h)n9).start();
                                                                                    if (o4.a.a(e6.d)) {
                                                                                        sb7 = new StringBuilder();
                                                                                        sb7.append(e6.h());
                                                                                        sb7.append("starting worker pool with priority ");
                                                                                        sb7.append(o4.l.K);
                                                                                        Log.d("Sqflite", sb7.toString());
                                                                                    }
                                                                                    break Label_1637;
                                                                                }
                                                                                finally {
                                                                                    monitorexit(g4);
                                                                                    sb8 = new StringBuilder();
                                                                                    sb8.append(e6.h());
                                                                                    sb8.append("opened ");
                                                                                    sb8.append(n8);
                                                                                    sb8.append(" ");
                                                                                    sb8.append(s4);
                                                                                    Log.d("Sqflite", sb8.toString());
                                                                                    Label_1722: {
                                                                                        o4.l.N.c(e6, (Runnable)new k(b, s4, (j)o, (Boolean)o2, e6, c, b7, n8));
                                                                                    }
                                                                                    return;
                                                                                    e6.h = o4.l.N;
                                                                                    iftrue(Label_1722:)(!o4.a.a(e6.d));
                                                                                }
                                                                            }
                                                                        }
                                                                        continue Label_2592_Outer;
                                                                    }
                                                                    o4.l.I = n3;
                                                                    continue Block_25_Outer;
                                                                }
                                                            }
                                                            ((j)o).success((Object)hashMap3);
                                                            return;
                                                            s6 = (String)c.a("cmd");
                                                            hashMap3 = new HashMap();
                                                            iftrue(Label_0971:)(!"get".equals((Object)s6));
                                                            break Block_22;
                                                            s4 = (String)c.a("path");
                                                            o2 = c.a("readOnly");
                                                            b = (s4 == null || s4.equals((Object)":memory:"));
                                                            b7 = (!Boolean.FALSE.equals(c.a("singleInstance")) && !b);
                                                            iftrue(Label_1451:)(!b7);
                                                            continue Label_0806_Outer;
                                                        }
                                                        i2 = o4.l.I;
                                                        iftrue(Label_0806:)(i2 <= 0);
                                                        break Label_1817_Outer;
                                                    }
                                                    iftrue(Label_1817:)(!b);
                                                    continue Label_1817_Outer;
                                                }
                                                hashMap3.put((Object)"logLevel", (Object)i2);
                                                continue;
                                            }
                                        }
                                        iftrue(Label_0961:)(!iterator.hasNext());
                                        continue;
                                    }
                                }
                                catch (final Exception ex) {
                                    continue;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            break;
        }
    }
}
