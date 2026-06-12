package h2;

import android.os.Handler;
import f2.e;
import com.google.android.gms.common.api.Status;
import android.text.TextUtils;
import android.os.Looper;
import A2.b;

public abstract class A
{
    public static final Object a;
    public static boolean b;
    public static int c;
    
    static {
        a = new Object();
    }
    
    public static void a(final String s, final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static void b(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void c(final b b) {
        final Looper myLooper = Looper.myLooper();
        if (myLooper != ((Handler)b).getLooper()) {
            String name;
            if (myLooper != null) {
                name = myLooper.getThread().getName();
            }
            else {
                name = "null current looper";
            }
            final String name2 = ((Handler)b).getLooper().getThread().getName();
            final StringBuilder sb = new StringBuilder(String.valueOf((Object)name).length() + (String.valueOf((Object)name2).length() + 35) + 1);
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static void d(final String s) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void e(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }
    
    public static void f(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        throw new IllegalArgumentException(s2);
    }
    
    public static void g(final String s) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void h(final Object o) {
        if (o != null) {
            return;
        }
        throw new NullPointerException("null reference");
    }
    
    public static void i(final String s, final Object o) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    public static void j(final String s, final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf((Object)s));
    }
    
    public static void k(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static boolean l(final Object o, final Object obj) {
        boolean b = true;
        if (o != obj) {
            if (o != null) {
                if (!o.equals(obj)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public static e m(final Status status) {
        if (status.E != null) {
            return new e(status);
        }
        return new e(status);
    }
}
