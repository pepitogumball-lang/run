package B2;

import java.util.Objects;
import J5.b;

public final class g extends f
{
    public static final g G;
    public final transient Object[] E;
    public final transient int F;
    
    static {
        G = new g(0, new Object[0]);
    }
    
    public g(final int f, final Object[] e) {
        this.E = e;
        this.F = f;
    }
    
    @Override
    public final Object[] c() {
        return this.E;
    }
    
    public final Object get(final int n) {
        J5.b.c0(n, this.F);
        final Object o = this.E[n];
        Objects.requireNonNull(o);
        return o;
    }
    
    @Override
    public final int h() {
        return 0;
    }
    
    @Override
    public final int i() {
        return this.F;
    }
    
    @Override
    public final int p(final Object[] array) {
        final Object[] e = this.E;
        final int f = this.F;
        System.arraycopy((Object)e, 0, (Object)array, 0, f);
        return f;
    }
    
    public final int size() {
        return this.F;
    }
}
