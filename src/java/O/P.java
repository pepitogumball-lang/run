package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.Log;
import android.graphics.ColorFilter;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import C2.m;
import android.graphics.PorterDuff$Mode;

public final class p
{
    public static final PorterDuff$Mode b;
    public static p c;
    public K0 a;
    
    static {
        b = PorterDuff$Mode.SRC_IN;
    }
    
    public static p a() {
        final Class<p> clazz;
        monitorenter(clazz = p.class);
        Label_0021: {
            try {
                if (p.c == null) {
                    c();
                }
                break Label_0021;
            }
            finally {
                monitorexit(clazz);
                final p c = p.c;
                monitorexit(clazz);
                return c;
            }
        }
    }
    
    public static void c() {
        final Class<p> clazz;
        monitorenter(clazz = p.class);
        Label_0068: {
            try {
                if (p.c != null) {
                    break Label_0068;
                }
                (p.c = (p)new Object()).a = K0.b();
                final K0 a = p.c.a;
                final m e = new m();
                synchronized (a) {
                    a.e = e;
                }
            }
            finally {
                monitorexit(clazz);
                monitorexit(clazz);
            }
        }
    }
    
    public static void d(final Drawable drawable, final d1 d1, final int[] array) {
        final PorterDuff$Mode f = K0.f;
        final int[] state = drawable.getState();
        final int[] a = l0.a;
        if (drawable.mutate() == drawable) {
            if (drawable instanceof LayerDrawable && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            final boolean d2 = d1.d;
            if (!d2 && !d1.c) {
                drawable.clearColorFilter();
            }
            else {
                final ColorFilter colorFilter = null;
                ColorStateList a2;
                if (d2) {
                    a2 = d1.a;
                }
                else {
                    a2 = null;
                }
                PorterDuff$Mode porterDuff$Mode;
                if (d1.c) {
                    porterDuff$Mode = d1.b;
                }
                else {
                    porterDuff$Mode = K0.f;
                }
                Object e = colorFilter;
                if (a2 != null) {
                    if (porterDuff$Mode == null) {
                        e = colorFilter;
                    }
                    else {
                        e = K0.e(a2.getColorForState(array, 0), porterDuff$Mode);
                    }
                }
                drawable.setColorFilter((ColorFilter)e);
            }
        }
        else {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
        }
    }
    
    public final Drawable b(final Context context, final int n) {
        synchronized (this) {
            return this.a.c(context, n);
        }
    }
}
