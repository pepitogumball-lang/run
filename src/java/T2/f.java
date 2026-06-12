package T2;

import F3.g;

public final class f implements d
{
    public static final g F;
    public final Object C;
    public volatile d D;
    public Object E;
    
    static {
        F = new g(5);
    }
    
    public f(final d d) {
        this.C = new Object();
        this.D = d;
    }
    
    public final Object get() {
        final d d = this.D;
        final g f = T2.f.F;
        if (d != f) {
            final Object c;
            monitorenter(c = this.C);
            Label_0061: {
                try {
                    if (this.D != f) {
                        final Object value = this.D.get();
                        this.E = value;
                        this.D = (d)f;
                        monitorexit(c);
                        return value;
                    }
                    break Label_0061;
                }
                finally {
                    monitorexit(c);
                    monitorexit(c);
                }
            }
        }
        return this.E;
    }
    
    @Override
    public final String toString() {
        final d d = this.D;
        final StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        Object string = d;
        if (d == f.F) {
            final StringBuilder sb2 = new StringBuilder("<supplier that returned ");
            sb2.append(this.E);
            sb2.append(">");
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
