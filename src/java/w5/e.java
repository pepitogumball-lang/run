package w5;

import c5.h;
import m5.l;

public final class E implements d0, l
{
    public final D C;
    
    public E(final D c) {
        this.C = c;
    }
    
    public final void a(final Throwable t) {
        this.C.dispose();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DisposeOnCancel[");
        sb.append((Object)this.C);
        sb.append(']');
        return sb.toString();
    }
}
