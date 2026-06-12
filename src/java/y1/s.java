package y1;

import F1.q0;

public final class s
{
    public final Object a;
    public q0 b;
    
    public s() {
        this.a = new Object();
    }
    
    public final void a(final q0 b) {
        final Object a = this.a;
        synchronized (a) {
            this.b = b;
        }
    }
}
