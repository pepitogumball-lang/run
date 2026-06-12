package K2;

import android.os.BaseBundle;
import java.util.Iterator;
import t.g;
import android.os.Bundle;
import t.j;
import t.b;

public final class p extends B
{
    public final b D;
    public final b E;
    public long F;
    
    public p(final n0 n0) {
        super(n0);
        this.E = (b)new j();
        this.D = (b)new j();
    }
    
    public final void A(final long n, final Y0 y0) {
        if (y0 == null) {
            this.j().P.f("Not logging ad exposure. No active activity");
            return;
        }
        if (n < 1000L) {
            this.j().P.g("Not logging ad exposure. Less than 1000 ms. exposure", n);
            return;
        }
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_xt", n);
        J1.M(y0, bundle, true);
        this.w().Z("am", "_xa", bundle);
    }
    
    public final void B(final String s, final long n) {
        if (s != null && s.length() != 0) {
            this.l().E((Runnable)new K2.b(this, s, n, 0));
            return;
        }
        this.j().H.f("Ad unit id must be a non-empty string");
    }
    
    public final void C(final String s, final long n, final Y0 y0) {
        if (y0 == null) {
            this.j().P.f("Not logging ad unit exposure. No active activity");
            return;
        }
        if (n < 1000L) {
            this.j().P.g("Not logging ad unit exposure. Less than 1000 ms. exposure", n);
            return;
        }
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("_ai", s);
        ((BaseBundle)bundle).putLong("_xt", n);
        J1.M(y0, bundle, true);
        this.w().Z("am", "_xu", bundle);
    }
    
    public final void D(final long f) {
        final b d = this.D;
        final Iterator iterator = ((g)d.keySet()).iterator();
        while (iterator.hasNext()) {
            ((j)d).put((Object)iterator.next(), (Object)f);
        }
        if (!((j)d).isEmpty()) {
            this.F = f;
        }
    }
    
    public final void E(final String s, final long n) {
        if (s != null && s.length() != 0) {
            this.l().E((Runnable)new K2.b(this, s, n, 1));
            return;
        }
        this.j().H.f("Ad unit id must be a non-empty string");
    }
    
    public final void z(final long n) {
        final Y0 c = this.x().C(false);
        final b d = this.D;
        for (final String s : (g)d.keySet()) {
            this.C(s, n - (long)((j)d).getOrDefault((Object)s, (Object)null), c);
        }
        if (!((j)d).isEmpty()) {
            this.A(n - this.F, c);
        }
        this.D(n);
    }
}
