package c3;

import android.os.BaseBundle;
import android.os.Bundle;
import U2.b;
import java.util.Arrays;
import K2.C0;
import u2.f;
import U2.d;
import U2.g;
import U2.e;

public abstract class a
{
    public static final e a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    
    static {
        final int e2 = U2.e.E;
        final Object[] array = new Object[15];
        array[0] = "_in";
        array[1] = "_xa";
        array[2] = "_xu";
        array[3] = "_aq";
        array[4] = "_aa";
        array[5] = "_ai";
        System.arraycopy((Object)new String[] { "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire" }, 0, (Object)array, 6, 9);
        a = U2.e.t(15, array);
        final b d2 = U2.d.D;
        final Object[] array2 = { "_e", "_f", "_iap", "_s", "_au", "_ui", "_cd" };
        u2.f.c(7, array2);
        b = U2.d.r(7, array2);
        final Object[] array3 = { "auto", "app", "am" };
        u2.f.c(3, array3);
        c = U2.d.r(3, array3);
        final Object[] array4 = { "_r", "_dbg" };
        u2.f.c(2, array4);
        d = U2.d.r(2, array4);
        Object[] array5 = new Object[4];
        final String[] e3 = C0.e;
        u2.f.c(15, (Object[])e3);
        final int d3 = s2.a.d(4, 15);
        if (d3 > 4) {
            array5 = Arrays.copyOf(array5, d3);
        }
        System.arraycopy((Object)e3, 0, (Object)array5, 0, 15);
        final String[] f2 = C0.f;
        u2.f.c(15, (Object[])f2);
        final int d4 = s2.a.d(array5.length, 30);
        if (d4 > array5.length) {
            array5 = Arrays.copyOf(array5, d4);
        }
        System.arraycopy((Object)f2, 0, (Object)array5, 15, 15);
        e = U2.d.r(30, array5);
        final Object[] array6 = { "^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$" };
        u2.f.c(2, array6);
        f = U2.d.r(2, array6);
    }
    
    public static boolean a(final String s, final Bundle bundle) {
        if (((d)c3.a.b).contains((Object)s)) {
            return false;
        }
        if (bundle != null) {
            final g d = c3.a.d;
            final int size = d.size();
            int i = 0;
            while (i < size) {
                final Object value = d.get(i);
                ++i;
                if (((BaseBundle)bundle).containsKey((String)value)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean b(final String s, final String s2) {
        if ("_ce1".equals((Object)s2) || "_ce2".equals((Object)s2)) {
            return s.equals((Object)"fcm") || s.equals((Object)"frc");
        }
        if ("_ln".equals((Object)s2)) {
            return s.equals((Object)"fcm") || s.equals((Object)"fiam");
        }
        if (((d)c3.a.e).contains((Object)s2)) {
            return false;
        }
        final g f = c3.a.f;
        final int size = f.size();
        int i = 0;
        while (i < size) {
            final Object value = f.get(i);
            ++i;
            if (s2.matches((String)value)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean c(final String s, final String s2, final Bundle bundle) {
        if (!"_cmp".equals((Object)s2)) {
            return true;
        }
        if (!d(s)) {
            return false;
        }
        if (bundle == null) {
            return false;
        }
        final g d = c3.a.d;
        final int size = d.size();
        int i = 0;
        while (i < size) {
            final Object value = d.get(i);
            ++i;
            if (((BaseBundle)bundle).containsKey((String)value)) {
                return false;
            }
        }
        s.getClass();
        int n = -1;
        switch (s.hashCode()) {
            case 3142703: {
                if (!s.equals((Object)"fiam")) {
                    break;
                }
                n = 2;
                break;
            }
            case 101230: {
                if (!s.equals((Object)"fdl")) {
                    break;
                }
                n = 1;
                break;
            }
            case 101200: {
                if (!s.equals((Object)"fcm")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return false;
            }
            case 2: {
                ((BaseBundle)bundle).putString("_cis", "fiam_integration");
                return true;
            }
            case 1: {
                ((BaseBundle)bundle).putString("_cis", "fdl_integration");
                return true;
            }
            case 0: {
                ((BaseBundle)bundle).putString("_cis", "fcm_integration");
                return true;
            }
        }
    }
    
    public static boolean d(final String s) {
        return !((d)c3.a.c).contains((Object)s);
    }
}
