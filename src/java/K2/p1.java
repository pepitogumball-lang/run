package K2;

import android.os.BaseBundle;
import com.google.android.gms.internal.ads.C;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.Sb;
import com.google.android.gms.internal.ads.L;
import com.google.android.gms.internal.ads.V;
import android.os.Bundle;
import com.google.android.gms.internal.ads.y7;
import com.google.android.gms.internal.ads.lG;
import com.google.android.gms.internal.ads.L1;

public final class p1 implements L1
{
    public long C;
    public long D;
    public Object E;
    public Object F;
    
    public p1(final long c) {
        y7.Y(this.E == null);
        this.C = c;
        this.D = c + 65536L;
    }
    
    public p1(final String e, final byte[] f, final long c, final long d) {
        this.E = e;
        this.F = f;
        this.C = c;
        this.D = d;
    }
    
    public boolean a(final boolean b, final boolean b2, final long n) {
        final l1 l1 = (l1)this.F;
        l1.v();
        l1.z();
        final n0 n2 = (n0)l1.C;
        if (n2.g()) {
            final a0 t = l1.t();
            n2.P.getClass();
            t.S.b(System.currentTimeMillis());
        }
        long n3 = n - this.C;
        if (!b && n3 < 1000L) {
            l1.j().P.g("Screen exposed for less than 1000 ms. Event not sent. time", n3);
            return false;
        }
        if (!b2) {
            n3 = n - this.D;
            this.D = n;
        }
        l1.j().P.g("Recording user engagement, ms", n3);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_et", n3);
        J1.M(l1.x().C(n2.I.I() ^ true), bundle, true);
        if (!b2) {
            l1.w().Z("auto", "_e", bundle);
        }
        this.C = n;
        final q1 q1 = (q1)this.E;
        q1.a();
        q1.b((long)w.c0.a(null));
        return true;
    }
    
    public V b() {
        y7.Y(this.C != -1L);
        return (V)new L((Object)this.E, this.C, 0);
    }
    
    public void e(final long n) {
        final long[] array = (long[])((Sb)this.F).D;
        this.D = array[co.k(array, n, true)];
    }
    
    public long g(final C c) {
        final long d = this.D;
        if (d >= 0L) {
            this.D = -1L;
            return -(d + 2L);
        }
        return -1L;
    }
}
