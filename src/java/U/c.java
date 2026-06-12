package u;

import java.util.concurrent.Executor;

public final class c
{
    public static final c d;
    public final Runnable a;
    public final Executor b;
    public c c;
    
    static {
        d = new c(null, null);
    }
    
    public c(final Runnable a, final Executor b) {
        this.a = a;
        this.b = b;
    }
}
