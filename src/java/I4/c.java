package i4;

import android.util.Log;
import e5.d;
import m5.p;
import g5.h;

public final class c extends h implements p
{
    public Object G;
    
    public final Object f(final Object o, final Object o2) {
        final c c = (c)this.i((d)o2, o);
        final c5.h a = c5.h.a;
        c.l(a);
        return a;
    }
    
    public final d i(final d d, final Object g) {
        final h h = new h(2, d);
        ((c)h).G = g;
        return (d)h;
    }
    
    public final Object l(final Object o) {
        com.google.android.gms.internal.auth.h.z(o);
        final String s = (String)this.G;
        final StringBuilder sb = new StringBuilder("Error failing to fetch the remote configs: ");
        sb.append(s);
        Log.e("SessionConfigFetcher", sb.toString());
        return c5.h.a;
    }
}
