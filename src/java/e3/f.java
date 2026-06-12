package e3;

public final class f
{
    public final o a;
    public final boolean b;
    
    public f(final o a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof f;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final f f = (f)o;
            b3 = b2;
            if (f.a.equals(this.a)) {
                b3 = b2;
                if (f.b == this.b) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Boolean.valueOf(this.b).hashCode();
    }
}
