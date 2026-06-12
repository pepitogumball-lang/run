package L0;

import android.graphics.Rect;
import n5.h;
import O.t0;
import I0.b;

public final class m
{
    public final b a;
    public final t0 b;
    
    public m(final b a, final t0 b) {
        h.e("_windowInsetsCompat", (Object)b);
        this.a = a;
        this.b = b;
    }
    
    public m(final Rect rect, final t0 t0) {
        h.e("insets", (Object)t0);
        this(new b(rect), t0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!m.class.equals(class1)) {
            return false;
        }
        h.c("null cannot be cast to non-null type androidx.window.layout.WindowMetrics", o);
        final m m = (m)o;
        return h.a((Object)this.a, (Object)m.a) && h.a((Object)this.b, (Object)m.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("WindowMetrics( bounds=");
        sb.append((Object)this.a);
        sb.append(", windowInsetsCompat=");
        sb.append((Object)this.b);
        sb.append(')');
        return sb.toString();
    }
}
