package v4;

import java.util.concurrent.atomic.AtomicLong;

public final class u
{
    public static final AtomicLong b;
    public final long a;
    
    static {
        b = new AtomicLong(0L);
    }
    
    public u(final long a) {
        this.a = a;
    }
}
