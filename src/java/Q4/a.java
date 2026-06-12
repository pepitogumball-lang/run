package q4;

import q3.c;

public final class a implements b5.a
{
    public static final Object E;
    public volatile c C;
    public volatile Object D;
    
    static {
        E = new Object();
    }
    
    public final Object get() {
        final Object d = this.D;
        final Object e = a.E;
        Object d2 = d;
        if (d == e) {
            monitorenter(this);
            Label_0129: {
                try {
                    if ((d2 = this.D) != e) {
                        break Label_0129;
                    }
                    d2 = this.C.get();
                    final Object d3 = this.D;
                    if (d3 != e && d3 != d2) {
                        final StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                        sb.append(d3);
                        sb.append(" & ");
                        sb.append(d2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.D = d2;
                    this.C = null;
                    break Label_0129;
                }
                finally {
                    monitorexit(this);
                    monitorexit(this);
                }
            }
        }
        return d2;
    }
}
