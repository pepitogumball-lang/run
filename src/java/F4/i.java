package F4;

public final class i extends RuntimeException
{
    public final String C;
    public final Object D;
    
    public i(final String c, final String s, final Object d) {
        super(s);
        this.C = c;
        this.D = d;
    }
}
