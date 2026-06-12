package W;

import e5.d;
import m5.l;
import g5.h;

public final class f extends h implements l
{
    public int G;
    
    public final Object g(final Object o) {
        final h h = new h(1, (d)o);
        final c5.h a = c5.h.a;
        ((f)h).l(a);
        return a;
    }
    
    public final Object l(final Object o) {
        final int g = this.G;
        if (g == 0) {
            com.google.android.gms.internal.auth.h.z(o);
            this.G = 1;
            throw null;
        }
        if (g == 1) {
            com.google.android.gms.internal.auth.h.z(o);
            return c5.h.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
