package C2;

import android.util.Log;
import com.google.android.gms.internal.auth.l;
import c2.k;
import b1.f;
import S2.g;
import S2.h;
import java.util.concurrent.atomic.AtomicReference;

public final class o
{
    public final b a;
    public final G b;
    public final AtomicReference c;
    public final AtomicReference d;
    
    public o(final b a, final G b) {
        this.c = new AtomicReference();
        this.d = new AtomicReference();
        this.a = a;
        this.b = b;
    }
    
    public final void a(final h h, final g g) {
        H.a();
        final p p2 = (p)this.c.get();
        if (p2 == null) {
            g.b(new Z(3, "No available form can be built.").a());
            return;
        }
        final d d = (d)this.a.a();
        d.getClass();
        final c a = d.a;
        final V b = V.b(new b(a.D, 2));
        final b b2 = new b(p2, 3);
        final f f = new f(4, false);
        final b b3 = (b)a.D;
        final V v = (V)a.H;
        final k k = (k)a.J;
        final V v2 = (V)a.E;
        final V b4 = V.b(new m(b3, (V)a.F, b, v2, b2, new l((Object)b, 2, (Object)new m(b3, b, v, k, f, v2))));
        if (f.D == null) {
            f.D = b4;
            ((C2.l)f.a()).b(h, g);
            return;
        }
        throw new IllegalStateException();
    }
    
    public final void b() {
        final p p = (p)this.c.get();
        if (p == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final d d = (d)this.a.a();
        d.getClass();
        final c a = d.a;
        final V b = V.b(new b(a.D, 2));
        final b b2 = new b(p, 3);
        final f f = new f(4, false);
        final b b3 = (b)a.D;
        final V v = (V)a.H;
        final k k = (k)a.J;
        final V v2 = (V)a.E;
        final V b4 = V.b(new m(b3, (V)a.F, b, v2, b2, new l((Object)b, 2, (Object)new m(b3, b, v, k, f, v2))));
        if (f.D == null) {
            f.D = b4;
            final C2.l l = (C2.l)f.a();
            l.l = true;
            H.a.post((Runnable)new V2.o((Object)this, 5, (Object)l));
            return;
        }
        throw new IllegalStateException();
    }
}
