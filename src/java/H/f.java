package H;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import t.j;
import java.util.concurrent.Future;
import F1.n;
import C2.v;
import java.util.ArrayList;
import L.d;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import L.c;
import V2.o;
import C2.b;
import G.l;
import android.os.Handler;
import android.os.Looper;
import android.graphics.Typeface;
import C2.g0;
import android.content.res.Resources;
import G.e;
import android.content.Context;
import java.lang.reflect.Method;
import android.util.Log;
import android.os.Build$VERSION;
import com.google.android.gms.internal.ads.o1;
import com.google.android.gms.internal.auth.m;

public abstract class f
{
    public static final m a;
    public static final o1 b;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            a = new m();
        }
        else if (sdk_INT >= 28) {
            a = new i();
        }
        else if (sdk_INT >= 26) {
            a = new i();
        }
        else {
            final Method h = H.h.h;
            if (h == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (h != null) {
                a = new m();
            }
            else {
                a = new m();
            }
        }
        b = new o1(16);
    }
    
    public static Typeface a(final Context context, final e e, final Resources resources, final int n, final String s, final int n2, final int n3, g0 d) {
        Typeface typeface3 = null;
        Label_0771: {
            if (e instanceof G.h) {
                final G.h h = (G.h)e;
                final String d2 = h.d;
                final Typeface typeface = null;
                Typeface create = null;
                Label_0069: {
                    if (d2 != null) {
                        if (!d2.isEmpty()) {
                            create = Typeface.create(d2, 0);
                            final Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                            if (create != null && !create.equals((Object)create2)) {
                                break Label_0069;
                            }
                        }
                    }
                    create = null;
                }
                if (create != null) {
                    new Handler(Looper.getMainLooper()).post((Runnable)new l(d, 0, create));
                    return create;
                }
                final boolean b = h.c == 0;
                final int b2 = h.b;
                final Handler handler = new Handler(Looper.getMainLooper());
                final b b3 = new b(12);
                b3.D = d;
                final n a = h.a;
                d = (g0)new com.google.android.gms.internal.auth.l((Object)b3, 14, (Object)handler);
                o1 a2;
                StringBuilder sb;
                String string;
                Typeface typeface2;
                L.e a3;
                c c;
                Future submit;
                long n4;
                L.e e2;
                final InterruptedException ex;
                o1 a4;
                StringBuilder sb2;
                String string2;
                Typeface typeface4;
                d d3;
                Object c2;
                j d4;
                ArrayList list;
                Handler f;
                v v;
                c d5;
                d e3;
                ThreadPoolExecutor b4;
                ArrayList list2;
                Label_0711:Label_0671_Outer:
                while (true) {
                    while (true) {
                        Label_0430: {
                            if (!b) {
                                break Label_0430;
                            }
                            a2 = L.f.a;
                            sb = new StringBuilder();
                            sb.append((String)a.H);
                            sb.append("-");
                            sb.append(n3);
                            string = sb.toString();
                            typeface2 = (Typeface)L.f.a.c((Object)string);
                            if (typeface2 != null) {
                                handler.post((Runnable)new o((Object)b3, 24, (Object)typeface2));
                                typeface3 = typeface2;
                                break Label_0262;
                            }
                            if (b2 == -1) {
                                a3 = L.f.a(string, context, a, n3);
                                ((com.google.android.gms.internal.auth.l)d).q(a3);
                                typeface3 = a3.a;
                                break Label_0711;
                            }
                            c = new c(string, context, a, n3, 0);
                            try {
                                submit = ((ExecutorService)L.f.b).submit((Callable)c);
                                n4 = b2;
                                try {
                                    e2 = (L.e)submit.get(n4, TimeUnit.MILLISECONDS);
                                    ((com.google.android.gms.internal.auth.l)d).q(e2);
                                    typeface3 = e2.a;
                                    break Label_0711;
                                }
                                catch (final InterruptedException ex) {}
                                catch (final ExecutionException ex2) {
                                    throw new RuntimeException((Throwable)ex2);
                                }
                                catch (final TimeoutException ex3) {
                                    throw new InterruptedException("timeout");
                                }
                                throw ex;
                            }
                            catch (final InterruptedException ex4) {
                                ((Handler)((com.google.android.gms.internal.auth.l)d).E).post((Runnable)new C2.h((b)((com.google.android.gms.internal.auth.l)d).D, -3));
                                typeface3 = typeface;
                                break Label_0711;
                            }
                            break Label_0430;
                            break Label_0711;
                        }
                        a4 = L.f.a;
                        sb2 = new StringBuilder();
                        sb2.append((String)a.H);
                        sb2.append("-");
                        sb2.append(n3);
                        string2 = sb2.toString();
                        typeface4 = (Typeface)L.f.a.c((Object)string2);
                        if (typeface4 != null) {
                            handler.post((Runnable)new o((Object)b3, 24, (Object)typeface4));
                            typeface3 = typeface4;
                            continue;
                        }
                        break;
                    }
                    d3 = new d(d, 0);
                    monitorenter(c2 = L.f.c);
                    Label_0579: {
                        try {
                            d4 = L.f.d;
                            list = (ArrayList)d4.getOrDefault((Object)string2, (Object)null);
                            if (list != null) {
                                list.add((Object)d3);
                                monitorexit(c2);
                                typeface3 = typeface;
                                break Label_0711;
                            }
                            break Label_0579;
                        }
                        finally {
                            monitorexit(c2);
                        Label_0671:
                            while (true) {
                                while (true) {
                                    f = new Handler(Looper.getMainLooper());
                                    break Label_0671;
                                    break Label_0771;
                                    v = new v(12);
                                    v.D = d5;
                                    v.E = e3;
                                    v.F = f;
                                    b4.execute((Runnable)v);
                                    typeface3 = typeface;
                                    continue Label_0711;
                                    list2 = new ArrayList();
                                    list2.add((Object)d3);
                                    d4.put((Object)string2, (Object)list2);
                                    monitorexit(c2);
                                    d5 = new c(string2, context, a, n3, 1);
                                    b4 = L.f.b;
                                    e3 = new d(string2, 1);
                                    iftrue(Label_0663:)(Looper.myLooper() != null);
                                    continue Label_0671_Outer;
                                }
                                Label_0663: {
                                    f = new Handler();
                                }
                                continue Label_0671;
                            }
                        }
                    }
                    break;
                }
            }
            typeface3 = f.a.h(context, (G.f)e, resources, n3);
            if (typeface3 != null) {
                new Handler(Looper.getMainLooper()).post((Runnable)new l(d, 0, typeface3));
            }
            else {
                d.a();
            }
        }
        if (typeface3 != null) {
            f.b.e((Object)b(resources, n, s, n2, n3), (Object)typeface3);
        }
        return typeface3;
    }
    
    public static String b(final Resources resources, final int n, final String s, final int n2, final int n3) {
        final StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(n));
        sb.append('-');
        sb.append(s);
        sb.append('-');
        sb.append(n2);
        sb.append('-');
        sb.append(n);
        sb.append('-');
        sb.append(n3);
        return sb.toString();
    }
}
