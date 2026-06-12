package B2;

import java.util.List;
import J5.b;
import java.util.Objects;

public final class e extends f
{
    public final transient int E;
    public final transient int F;
    public final f G;
    
    public e(final f g, final int e, final int f) {
        Objects.requireNonNull((Object)g);
        this.G = g;
        this.E = e;
        this.F = f;
    }
    
    @Override
    public final Object[] c() {
        return this.G.c();
    }
    
    public final Object get(final int n) {
        J5.b.c0(n, this.F);
        return ((List)this.G).get(n + this.E);
    }
    
    @Override
    public final int h() {
        return this.G.h() + this.E;
    }
    
    @Override
    public final int i() {
        return this.G.h() + this.E + this.F;
    }
    
    public final int size() {
        return this.F;
    }
    
    @Override
    public final f t(final int n, final int n2) {
        J5.b.f0(n, n2, this.F);
        final int e = this.E;
        return this.G.t(n + e, n2 + e);
    }
}
