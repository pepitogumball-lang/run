package j;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import t.j;

public final class B
{
    public static final Class[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final String[] g;
    public static final j h;
    public final Object[] a;
    
    static {
        b = new Class[] { Context.class, AttributeSet.class };
        c = new int[] { 16843375 };
        d = new int[] { 16844160 };
        e = new int[] { 16844156 };
        f = new int[] { 16844148 };
        g = new String[] { "android.widget.", "android.view.", "android.webkit." };
        h = new j();
    }
    
    public B() {
        this.a = new Object[2];
    }
    
    public final View a(final Context context, final String s, String concat) {
        final j h = B.h;
        Label_0072: {
            Constructor constructor;
            if ((constructor = (Constructor)h.getOrDefault((Object)s, (Object)null)) != null) {
                break Label_0072;
            }
            Label_0039: {
                if (concat == null) {
                    break Label_0039;
                }
                try {
                    concat = concat.concat(s);
                    while (true) {
                        constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor((Class<?>[])B.b);
                        h.put((Object)s, (Object)constructor);
                        ((AccessibleObject)constructor).setAccessible(true);
                        return (View)constructor.newInstance(this.a);
                        concat = s;
                        continue;
                    }
                }
                catch (final Exception ex) {
                    return null;
                }
            }
        }
    }
}
