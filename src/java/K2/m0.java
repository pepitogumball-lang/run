package K2;

public final class m0 implements Thread$UncaughtExceptionHandler
{
    public final String a;
    public final k0 b;
    
    public m0(final k0 b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public final void uncaughtException(final Thread thread, final Throwable t) {
        synchronized (this) {
            this.b.j().H.g(this.a, t);
        }
    }
}
