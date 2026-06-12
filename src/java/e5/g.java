package E5;

import java.util.Set;
import W.H;
import w5.f;
import c5.h;
import m5.l;
import n5.i;

public final class g extends i implements l
{
    public final int D;
    public final Object E;
    
    @Override
    public final Object g(Object l) {
        switch (this.D) {
            default: {
                final Throwable t = (Throwable)l;
                final h a = h.a;
                ((w5.f)this.E).h((Object)a);
                return a;
            }
            case 1: {
                final Throwable t2 = (Throwable)l;
                if (t2 != null) {
                    ((H)this.E).H.c((Object)new W.i(t2));
                }
                l = H.L;
                final H h = (H)this.E;
                synchronized (l) {
                    ((Set)H.K).remove((Object)h.c().getAbsolutePath());
                    return c5.h.a;
                }
            }
            case 0: {
                final Throwable t3 = (Throwable)l;
                ((E5.i)this.E).b();
                return h.a;
            }
        }
    }
}
