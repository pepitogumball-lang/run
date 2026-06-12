package E5;

import e5.i;
import java.util.concurrent.atomic.AtomicReferenceArray;
import B5.u;

public final class k extends u
{
    public final AtomicReferenceArray G;
    
    public k(final long n, final k k, final int n2) {
        super(n, k, n2);
        this.G = new AtomicReferenceArray(j.f);
    }
    
    @Override
    public final int f() {
        return j.f;
    }
    
    @Override
    public final void g(final int n, final i i) {
        this.G.set(n, (Object)j.e);
        this.h();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SemaphoreSegment[id=");
        sb.append(super.E);
        sb.append(", hashCode=");
        sb.append(this.hashCode());
        sb.append(']');
        return sb.toString();
    }
}
