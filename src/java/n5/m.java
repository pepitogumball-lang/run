package n5;

import com.google.android.gms.internal.measurement.L;
import s5.a;

public abstract class m extends c implements s5.c
{
    public final boolean I;
    
    public m(final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, (n & 0x1) == 0x1);
        this.I = false;
    }
    
    public final a e() {
        a c;
        if (this.I) {
            c = this;
        }
        else if ((c = super.C) == null) {
            c = this.a();
            super.C = c;
        }
        return c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof m) {
            final m m = (m)o;
            if (!this.d().equals(m.d()) || !super.F.equals((Object)m.F) || !super.G.equals((Object)m.G) || !h.a(super.D, m.D)) {
                b = false;
            }
            return b;
        }
        return o instanceof s5.c && o.equals(this.e());
    }
    
    @Override
    public final int hashCode() {
        return super.G.hashCode() + L.g(this.d().hashCode() * 31, super.F, 31);
    }
    
    @Override
    public final String toString() {
        final a e = this.e();
        if (e != this) {
            return e.toString();
        }
        return x.a.b(new StringBuilder("property "), super.F, " (Kotlin reflection is not available)");
    }
}
