package m3;

import x.a;

public final class h
{
    public static final h c;
    public final int a;
    public final int b;
    
    static {
        c = new h(0, 0);
    }
    
    public h(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.a);
        sb.append(", length = ");
        return x.a.a(sb, this.b, "]");
    }
}
