package n5;

import com.google.android.gms.internal.measurement.L;
import s5.a;

public abstract class g extends c implements f, a, c5.a
{
    public final int I;
    public final int J;
    
    public g(final int n, final Class clazz, final String s, final String s2, final int n2) {
        this(n, b.C, clazz, s, s2, n2);
    }
    
    public g(final int i, final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, (n & 0x1) == 0x1);
        this.I = i;
        this.J = 0;
    }
    
    @Override
    public final a a() {
        p.a.getClass();
        return this;
    }
    
    @Override
    public final int c() {
        return this.I;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof g) {
            final g g = (g)o;
            if (!super.F.equals((Object)g.F) || !super.G.equals((Object)g.G) || this.J != g.J || this.I != g.I || !h.a(super.D, g.D) || !this.d().equals(g.d())) {
                b = false;
            }
            return b;
        }
        if (o instanceof g) {
            a c;
            if ((c = super.C) == null) {
                this.a();
                super.C = this;
                c = this;
            }
            return o.equals(c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        this.d();
        return super.G.hashCode() + L.g(this.d().hashCode() * 31, super.F, 31);
    }
    
    @Override
    public final String toString() {
        a c;
        if ((c = super.C) == null) {
            this.a();
            super.C = this;
            c = this;
        }
        if (c != this) {
            return c.toString();
        }
        final String f = super.F;
        String g;
        if ("<init>".equals((Object)f)) {
            g = "constructor (Kotlin reflection is not available)";
        }
        else {
            g = m0.a.g("function ", f, " (Kotlin reflection is not available)");
        }
        return g;
    }
}
