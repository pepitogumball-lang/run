package o;

import android.graphics.PorterDuff$Mode;
import android.graphics.Insets;
import java.lang.reflect.InvocationTargetException;
import I.h;
import I.g;
import io.flutter.plugin.platform.p;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;

public abstract class l0
{
    public static final int[] a;
    public static final int[] b;
    public static final Rect c;
    
    static {
        a = new int[] { 16842912 };
        b = new int[0];
        c = new Rect();
    }
    
    public static void a(final Drawable drawable) {
        final String name = drawable.getClass().getName();
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29 && sdk_INT < 31 && "android.graphics.drawable.ColorStateListDrawable".equals((Object)name)) {
            final int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(l0.b);
            }
            else {
                drawable.setState(l0.a);
            }
            drawable.setState(state);
        }
    }
    
    public static Rect b(final Drawable drawable) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            final Insets a = k0.a(drawable);
            return new Rect(p.a(a), p.k(a), p.m(a), p.o(a));
        }
        Drawable drawable2 = drawable;
        if (drawable instanceof g) {
            ((h)drawable).getClass();
            drawable2 = null;
        }
        Label_0125: {
            if (sdk_INT >= 29) {
                break Label_0125;
            }
            Label_0129: {
                if (!j0.a) {
                    break Label_0129;
                }
                try {
                    final Object invoke = j0.b.invoke((Object)drawable2, (Object[])null);
                    if (invoke != null) {
                        return new Rect(j0.c.getInt(invoke), j0.d.getInt(invoke), j0.e.getInt(invoke), j0.f.getInt(invoke));
                    }
                    return l0.c;
                    final boolean a2 = j0.a;
                    return l0.c;
                }
                catch (final IllegalAccessException | InvocationTargetException ex) {
                    return l0.c;
                }
            }
        }
    }
    
    public static PorterDuff$Mode c(final int n, final PorterDuff$Mode porterDuff$Mode) {
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
        }
    }
}
