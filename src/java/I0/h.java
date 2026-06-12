package I0;

import m5.l;
import com.google.android.gms.internal.measurement.L;

public final class h extends g
{
    public final Object a;
    public final int b;
    public final a c;
    
    public h(final Object a, final int b, final a c) {
        n5.h.e("value", a);
        L.p(b, "verificationMode");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object a() {
        return this.a;
    }
    
    @Override
    public final g d(final String s, final l l) {
        final Object a = this.a;
        g g;
        if (l.g(a)) {
            g = this;
        }
        else {
            g = new f(a, s, this.c, this.b);
        }
        return g;
    }
}
