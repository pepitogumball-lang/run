package g;

import android.os.Bundle;
import java.util.HashMap;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import h.a;
import androidx.lifecycle.r;

public final class d implements r
{
    public final String C;
    public final b D;
    public final a E;
    public final h F;
    
    public d(final h f, final String c, final b d, final a e) {
        this.F = f;
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public final void d(final t t, final m obj) {
        final boolean equals = m.ON_START.equals(obj);
        final String c = this.C;
        final h f = this.F;
        if (equals) {
            final HashMap e = f.e;
            final b d = this.D;
            final a e2 = this.E;
            e.put((Object)c, (Object)new f(e2, d));
            final HashMap f2 = f.f;
            if (f2.containsKey((Object)c)) {
                final Object value = f2.get((Object)c);
                f2.remove((Object)c);
                d.b(value);
            }
            final Bundle g = f.g;
            final g.a a = (g.a)g.getParcelable(c);
            if (a != null) {
                g.remove(c);
                d.b(e2.c(a.D, a.C));
            }
        }
        else if (m.ON_STOP.equals(obj)) {
            f.e.remove((Object)c);
        }
        else if (m.ON_DESTROY.equals(obj)) {
            f.e(c);
        }
    }
}
