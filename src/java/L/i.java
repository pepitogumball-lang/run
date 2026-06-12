package L;

import java.util.concurrent.ThreadFactory;

public final class i implements ThreadFactory
{
    public String a;
    public int b;
    
    public final Thread newThread(final Runnable runnable) {
        return new h(runnable, this.a, this.b);
    }
}
