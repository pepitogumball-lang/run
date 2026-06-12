package c1;

import V2.q;

public final class e implements Runnable
{
    public final j C;
    public final q D;
    
    public e(final j c, final q d) {
        this.C = c;
        this.D = d;
    }
    
    public final void run() {
        if (this.C.C != this) {
            return;
        }
        if (h.H.f((h)this.C, (Object)this, h.g(this.D))) {
            h.d(this.C);
        }
    }
}
