package V2;

import java.util.concurrent.Executor;

public final class d
{
    public static final d d;
    public final Runnable a;
    public final Executor b;
    public d c;
    
    static {
        d = new d();
    }
    
    public d() {
        this.a = null;
        this.b = null;
    }
    
    public d(final Runnable a, final Executor b) {
        this.a = a;
        this.b = b;
    }
}
