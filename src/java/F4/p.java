package F4;

import com.google.android.gms.internal.measurement.K1;
import java.nio.ByteBuffer;
import c0.b;

public final class p
{
    public final f a;
    public final String b;
    public final q c;
    public final b d;
    
    public p(final f f, final String s) {
        this(f, s, v.b, null);
    }
    
    public p(final f a, final String b, final q c, final b d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final String s, final Object o, final o o2) {
        final ByteBuffer f = this.c.f(new m(s, o));
        e e;
        if (o2 == null) {
            e = null;
        }
        else {
            e = new a(this, 1, o2);
        }
        this.a.j(this.b, f, e);
    }
    
    public final void b(final n n) {
        final d d = null;
        final d d2 = null;
        final String b = this.b;
        final f a = this.a;
        final b d3 = this.d;
        if (d3 != null) {
            Object o;
            if (n == null) {
                o = d2;
            }
            else {
                o = new K1(9, (Object)this, (Object)n, false);
            }
            a.l(b, (d)o, d3);
        }
        else {
            Object o2;
            if (n == null) {
                o2 = d;
            }
            else {
                o2 = new K1(9, (Object)this, (Object)n, false);
            }
            a.f(b, (d)o2);
        }
    }
}
