package c4;

import b4.a;
import b4.f;
import b4.b;

public final class n implements b
{
    public final o a;
    
    public n(final o a) {
        this.a = a;
    }
    
    public final void a(final f f) {
        final o a = this.a;
        synchronized (a) {
            a.d = true;
            monitorexit(a);
            this.a.g(f);
        }
    }
    
    public final void b(final a a) {
    }
}
