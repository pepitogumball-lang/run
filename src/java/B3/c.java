package b3;

import android.os.BaseBundle;
import V4.G;
import java.util.HashSet;
import com.google.android.gms.internal.measurement.K1;
import K2.D;
import f2.d;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.e0;
import c3.a;
import android.os.Bundle;
import h2.A;
import java.util.concurrent.ConcurrentHashMap;
import C2.f;

public final class c implements b
{
    public static volatile c c;
    public final f a;
    public final ConcurrentHashMap b;
    
    public c(final f a) {
        A.h((Object)a);
        this.a = a;
        this.b = new ConcurrentHashMap();
    }
    
    public final void a(final String s, final String s2, final Bundle bundle) {
        if (!c3.a.d(s)) {
            return;
        }
        if (!c3.a.a(s2, bundle)) {
            return;
        }
        if (!c3.a.c(s, s2, bundle)) {
            return;
        }
        if ("clx".equals((Object)s) && "_ae".equals((Object)s2)) {
            ((BaseBundle)bundle).putLong("_r", 1L);
        }
        final e0 e0 = (e0)this.a.D;
        e0.getClass();
        e0.f((b0)new h0(e0, s, s2, (Object)bundle, true, 2));
    }
    
    public final D b(final String s, final d d) {
        if (!c3.a.d(s)) {
            return null;
        }
        final boolean empty = s.isEmpty();
        final ConcurrentHashMap b = this.b;
        if (!empty && b.containsKey((Object)s) && b.get((Object)s) != null) {
            return null;
        }
        final boolean equals = "fiam".equals((Object)s);
        final f a = this.a;
        K1 k2;
        if (equals) {
            final K1 k1 = new K1(24, false);
            k1.E = d;
            a.n(new c3.b(k1, 0));
            k1.D = new HashSet();
            k2 = k1;
        }
        else if ("clx".equals((Object)s)) {
            final G g = new G(5);
            g.D = d;
            a.n(new c3.b(g, 1));
            k2 = (K1)g;
        }
        else {
            k2 = null;
        }
        if (k2 != null) {
            b.put((Object)s, (Object)k2);
            return new D(29);
        }
        return null;
    }
}
