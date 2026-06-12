package o;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.util.Log;
import i.a;
import android.view.View;
import android.content.Context;

public abstract class b1
{
    public static final ThreadLocal a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    
    static {
        a = new ThreadLocal();
        b = new int[] { -16842910 };
        c = new int[] { 16842908 };
        d = new int[] { 16842919 };
        e = new int[] { 16842912 };
        f = new int[0];
        g = new int[1];
    }
    
    public static void a(Context obtainStyledAttributes, final View view) {
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(i.a.j);
        Label_0065: {
            try {
                if (!((TypedArray)obtainStyledAttributes).hasValue(117)) {
                    final StringBuilder sb = new StringBuilder("View ");
                    sb.append((Object)view.getClass());
                    sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                    Log.e("ThemeUtils", sb.toString());
                }
            }
            finally {
                break Label_0065;
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            return;
        }
        ((TypedArray)obtainStyledAttributes).recycle();
    }
    
    public static int b(final Context context, int a) {
        final ColorStateList d = d(context, a);
        if (d != null && d.isStateful()) {
            return d.getColorForState(b1.b, d.getDefaultColor());
        }
        final ThreadLocal a2 = b1.a;
        TypedValue typedValue;
        if ((typedValue = (TypedValue)a2.get()) == null) {
            typedValue = new TypedValue();
            a2.set((Object)typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        final float float1 = typedValue.getFloat();
        final int c = c(context, a);
        final int round = Math.round(Color.alpha(c) * float1);
        a = H.a.a;
        if (round >= 0 && round <= 255) {
            return (c & 0xFFFFFF) | round << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
    
    public static int c(final Context context, int color) {
        final int[] g = b1.g;
        g[0] = color;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, g);
        try {
            color = obtainStyledAttributes.getColor(0, 0);
            return color;
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public static ColorStateList d(final Context context, int resourceId) {
        final int[] g = b1.g;
        g[0] = resourceId;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, g);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    final ColorStateList list = s2.a.e(context, resourceId);
                    if (list != null) {
                        return list;
                    }
                }
            }
            return obtainStyledAttributes.getColorStateList(0);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
}
