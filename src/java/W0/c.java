package w0;

public final class c implements Comparable
{
    public final int C;
    public final int D;
    public final String E;
    public final String F;
    
    public c(final String e, final String f, final int c, final int d) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
    }
    
    public final int compareTo(final Object o) {
        final c c = (c)o;
        int n;
        if ((n = this.C - c.C) == 0) {
            n = this.D - c.D;
        }
        return n;
    }
}
