package L;

import h1.w;
import android.content.pm.PackageManager$NameNotFoundException;
import android.graphics.Typeface;
import F1.n;
import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import t.j;
import java.util.concurrent.ThreadPoolExecutor;
import com.google.android.gms.internal.ads.o1;

public abstract class f
{
    public static final o1 a;
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final j d;
    
    static {
        a = new o1(16);
        final Object o = new Object();
        ((i)o).a = "fonts-androidx";
        ((i)o).b = 10;
        final ThreadPoolExecutor b2 = new ThreadPoolExecutor(0, 1, (long)10000, TimeUnit.MILLISECONDS, (BlockingQueue)new LinkedBlockingDeque(), (ThreadFactory)o);
        b2.allowCoreThreadTimeOut(true);
        b = b2;
        c = new Object();
        d = new j();
    }
    
    public static e a(final String s, final Context context, final n n, final int n2) {
        final o1 a = f.a;
        final Typeface typeface = (Typeface)a.c((Object)s);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            final w a2 = L.b.a(n, context);
            final int n3 = 1;
            final g[] array = (g[])a2.D;
            final int c = a2.C;
            int e = 0;
            Label_0156: {
                if (c != 0) {
                    if (c == 1) {
                        e = -2;
                        break Label_0156;
                    }
                }
                else {
                    e = n3;
                    if (array == null) {
                        break Label_0156;
                    }
                    if (array.length == 0) {
                        e = n3;
                        break Label_0156;
                    }
                    final int length = array.length;
                    final int n4 = 0;
                    int n5 = 0;
                    while (true) {
                        e = n4;
                        if (n5 >= length) {
                            break Label_0156;
                        }
                        e = array[n5].e;
                        if (e != 0) {
                            if (e < 0) {
                                break;
                            }
                            break Label_0156;
                        }
                        else {
                            ++n5;
                        }
                    }
                }
                e = -3;
            }
            if (e != 0) {
                return new e(e);
            }
            final Typeface i = H.f.a.i(context, array, n2);
            if (i != null) {
                a.e((Object)s, (Object)i);
                return new e(i);
            }
            return new e(-3);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return new e(-1);
        }
    }
}
