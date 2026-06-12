package L0;

import n5.h;
import I0.b;

public final class c
{
    public final b a;
    public final L0.b b;
    public final L0.b c;
    
    public c(final b a, final L0.b b, final L0.b c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a.b() == 0 && a.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (a.a != 0 && a.b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
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
        if (!c.class.equals(class1)) {
            return false;
        }
        h.c("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature", o);
        final c c = (c)o;
        return h.a((Object)this.a, (Object)c.a) && h.a((Object)this.b, (Object)c.b) && h.a((Object)this.c, (Object)c.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(c.class.getSimpleName());
        sb.append(" { ");
        sb.append((Object)this.a);
        sb.append(", type=");
        sb.append((Object)this.b);
        sb.append(", state=");
        sb.append((Object)this.c);
        sb.append(" }");
        return sb.toString();
    }
}
