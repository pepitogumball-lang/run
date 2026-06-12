package b4;

public final class h extends f
{
    public final int C;
    
    public h(final int c, final String s) {
        super(s);
        this.C = c;
    }
    
    public h(final int c, final String s, final int n) {
        super(s);
        this.C = c;
    }
    
    public h(final int c, final String s, final h h) {
        super(s, (Throwable)h);
        this.C = c;
    }
    
    public h(final String s) {
        super(s);
        this.C = -1;
    }
}
