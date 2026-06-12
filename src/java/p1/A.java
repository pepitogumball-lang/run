package p1;

public final class a implements b5.a
{
    public static final Object E;
    public volatile b C;
    public volatile Object D;
    
    static {
        E = new Object();
    }
    
    public static b5.a a(final b c) {
        if (c instanceof a) {
            return (b5.a)c;
        }
        final Object o = new Object();
        ((a)o).D = a.E;
        ((a)o).C = c;
        return (b5.a)o;
    }
    
    public final Object get() {
        final Object d = this.D;
        final Object e = a.E;
        Object d2 = d;
        if (d == e) {
            monitorenter(this);
            Label_0131: {
                try {
                    if ((d2 = this.D) != e) {
                        break Label_0131;
                    }
                    d2 = ((b5.a)this.C).get();
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
                    break Label_0131;
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
