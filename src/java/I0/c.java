package i0;

import com.google.android.gms.internal.ads.Tl;
import c2.d;
import androidx.lifecycle.D;
import t.k;
import c0.b;
import androidx.lifecycle.W;

public final class c extends W
{
    public static final b f;
    public final k d;
    public boolean e;
    
    static {
        f = (b)new Object();
    }
    
    public c() {
        this.d = new k();
        this.e = false;
    }
    
    public final void b() {
        final k d = this.d;
        for (int e = d.E, i = 0; i < e; ++i) {
            final i0.b b = (i0.b)d.D[i];
            final d l = b.l;
            l.a();
            l.c = true;
            final Tl n = b.n;
            if (n != null) {
                b.i((D)n);
            }
            final i0.b a = l.a;
            if (a == null) {
                throw new IllegalStateException("No listener register");
            }
            if (a != b) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            l.a = null;
            if (n != null) {
                final boolean d2 = n.D;
            }
            l.d = true;
            l.b = false;
            l.c = false;
            l.e = false;
        }
        final int e2 = d.E;
        final Object[] d3 = d.D;
        for (int j = 0; j < e2; ++j) {
            d3[j] = null;
        }
        d.E = 0;
    }
}
