package b4;

public final class i
{
    public long a;
    public long b;
    
    public i(final int n) {
        switch (n) {
            default: {
                this.a = 60L;
                this.b = c4.i.i;
                return;
            }
            case 2: {
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
            }
        }
    }
    
    public i(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public i(final i i) {
        this.a = i.a;
        this.b = i.b;
    }
    
    public void a(final long b) {
        if (b >= 0L) {
            this.b = b;
            return;
        }
        final StringBuilder sb = new StringBuilder("Minimum interval between fetches has to be a non-negative number. ");
        sb.append(b);
        sb.append(" is an invalid argument");
        throw new IllegalArgumentException(sb.toString());
    }
}
