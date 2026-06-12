package T3;

import Z3.o;

public final class b extends e
{
    public final o a;
    
    public b(final o a) {
        this.a = a;
    }
    
    @Override
    public final boolean a() {
        final o a = this.a;
        return a.D() && (a.z() > 0 || a.y() > 0 || (a.C() && a.B().y()));
    }
}
