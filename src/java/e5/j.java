package e5;

import m5.p;
import n5.h;
import java.io.Serializable;

public final class j implements i, Serializable
{
    public static final j C;
    
    static {
        C = (j)new Object();
    }
    
    public final i c(final i i) {
        h.e("context", (Object)i);
        return i;
    }
    
    public final Object f(final Object o, final p p2) {
        return o;
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
    
    public final g i(final e5.h h) {
        h.e("key", (Object)h);
        return null;
    }
    
    public final i l(final e5.h h) {
        h.e("key", (Object)h);
        return (i)this;
    }
    
    @Override
    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
