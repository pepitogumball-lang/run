package g5;

import e5.i;
import e5.d;

public final class b implements d
{
    public static final b C;
    
    static {
        C = (b)new Object();
    }
    
    public final i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }
    
    public final void h(final Object o) {
        throw new IllegalStateException("This continuation is already complete");
    }
    
    @Override
    public final String toString() {
        return "This continuation is already complete";
    }
}
