package J1;

import android.os.BaseBundle;
import com.google.android.gms.internal.ads.kt;
import com.google.android.gms.internal.ads.lt;
import android.util.Log;
import u2.c;
import u2.d;
import android.content.Context;
import java.util.Iterator;
import h2.A;
import java.lang.reflect.Array;
import android.os.Bundle;
import com.google.android.gms.internal.ads.qi;
import com.google.android.gms.internal.ads.bp;

public abstract class j
{
    public static final bp a;
    
    static {
        a = new bp((Object)new qi(28, (byte)0), 5);
    }
    
    public static boolean a(final Bundle bundle, final Bundle bundle2) {
        Object value = bundle;
        Object value2 = bundle2;
        if (bundle != null) {
            value = bundle;
            if ((value2 = bundle2) != null) {
                if (((BaseBundle)bundle).size() != ((BaseBundle)bundle2).size()) {
                    return false;
                }
                for (final String s : ((BaseBundle)bundle).keySet()) {
                    if (!((BaseBundle)bundle2).containsKey(s)) {
                        return false;
                    }
                    value = ((BaseBundle)bundle).get(s);
                    value2 = ((BaseBundle)bundle2).get(s);
                    if (value == null || value2 == null) {
                        return value == null && value2 == null;
                    }
                    if (value instanceof Bundle) {
                        if (!(value2 instanceof Bundle) || !a((Bundle)value, (Bundle)value2)) {
                            return false;
                        }
                        continue;
                    }
                    else if (((Bundle)value).getClass().isArray()) {
                        final int length = Array.getLength(value);
                        if (!((Bundle)value2).getClass().isArray() || length != Array.getLength(value2)) {
                            return false;
                        }
                        for (int i = 0; i < length; ++i) {
                            if (!A.l(Array.get(value, i), Array.get(value2, i))) {
                                return false;
                            }
                        }
                    }
                    else {
                        if (!value.equals(value2)) {
                            return false;
                        }
                        continue;
                    }
                }
                return true;
            }
        }
        return value == null && value2 == null;
    }
    
    public static d b(final Context context) {
        try {
            return d.c(context, (c)d.b, "com.google.android.gms.ads.dynamite");
        }
        catch (final Exception ex) {
            throw new Exception((Throwable)ex);
        }
    }
    
    public static String c(final String s) {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String string = s;
        if (stackTrace.length >= 4) {
            final int lineNumber = stackTrace[3].getLineNumber();
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(" @");
            sb.append(lineNumber);
            string = sb.toString();
        }
        return string;
    }
    
    public static void d(final String s) {
        if (l(3)) {
            if (s.length() <= 4000) {
                Log.d("Ads", s);
                return;
            }
            final bp a = j.a;
            final Iterator b = ((lt)a.D).b(a, (CharSequence)s);
            int n = 1;
            while (true) {
                final kt kt = (kt)b;
                if (!kt.hasNext()) {
                    break;
                }
                final String s2 = (String)kt.next();
                if (n != 0) {
                    Log.d("Ads", s2);
                }
                else {
                    Log.d("Ads-cont", s2);
                }
                n = 0;
            }
        }
    }
    
    public static void e(final String s, final Throwable t) {
        if (l(3)) {
            Log.d("Ads", s, t);
        }
    }
    
    public static void f(final String s) {
        if (l(6)) {
            if (s != null && s.length() > 4000) {
                final bp a = j.a;
                final Iterator b = ((lt)a.D).b(a, (CharSequence)s);
                int n = 1;
                while (true) {
                    final kt kt = (kt)b;
                    if (!kt.hasNext()) {
                        break;
                    }
                    final String s2 = (String)kt.next();
                    if (n != 0) {
                        Log.e("Ads", s2);
                    }
                    else {
                        Log.e("Ads-cont", s2);
                    }
                    n = 0;
                }
            }
            else {
                Log.e("Ads", s);
            }
        }
    }
    
    public static void g(final String s, final Throwable t) {
        if (l(6)) {
            Log.e("Ads", s, t);
        }
    }
    
    public static void h(final String s) {
        if (l(4)) {
            if (s != null && s.length() > 4000) {
                final bp a = j.a;
                final Iterator b = ((lt)a.D).b(a, (CharSequence)s);
                int n = 1;
                while (true) {
                    final kt kt = (kt)b;
                    if (!kt.hasNext()) {
                        break;
                    }
                    final String s2 = (String)kt.next();
                    if (n != 0) {
                        Log.i("Ads", s2);
                    }
                    else {
                        Log.i("Ads-cont", s2);
                    }
                    n = 0;
                }
            }
            else {
                Log.i("Ads", s);
            }
        }
    }
    
    public static void i(final String s) {
        if (l(5)) {
            if (s != null && s.length() > 4000) {
                final bp a = j.a;
                final Iterator b = ((lt)a.D).b(a, (CharSequence)s);
                int n = 1;
                while (true) {
                    final kt kt = (kt)b;
                    if (!kt.hasNext()) {
                        break;
                    }
                    final String s2 = (String)kt.next();
                    if (n != 0) {
                        Log.w("Ads", s2);
                    }
                    else {
                        Log.w("Ads-cont", s2);
                    }
                    n = 0;
                }
            }
            else {
                Log.w("Ads", s);
            }
        }
    }
    
    public static void j(final String s, final Throwable t) {
        if (l(5)) {
            Log.w("Ads", s, t);
        }
    }
    
    public static void k(final String s, final Exception ex) {
        if (l(5)) {
            if (ex != null) {
                j(c(s), (Throwable)ex);
                return;
            }
            i(c(s));
        }
    }
    
    public static boolean l(final int n) {
        return n >= 5 || Log.isLoggable("Ads", n);
    }
}
