package I1;

import C2.f;
import java.util.Collections;
import java.util.Map;
import com.google.android.gms.internal.ads.ob;
import java.io.UnsupportedEncodingException;
import K2.c0;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.H3;
import com.google.android.gms.internal.auth.l;
import J1.g;
import java.util.HashMap;
import com.google.android.gms.internal.ads.F3;

public final class s extends F3
{
    public final Object O;
    public final t P;
    public final byte[] Q;
    public final HashMap R;
    public final g S;
    
    public s(final int n, final String s, final t p7, final l l, final byte[] q, final HashMap r, final g s2) {
        this.Q = q;
        this.R = r;
        this.S = s2;
        super(n, s, (H3)l);
        this.O = new Object();
        this.P = p7;
    }
    
    public final c0 a(final C3 c3) {
        final byte[] b = c3.b;
        String s4;
        try {
            final Map c4 = c3.c;
            final String s = "ISO-8859-1";
            String s2;
            if (c4 == null) {
                s2 = s;
            }
            else {
                final String s3 = (String)c4.get((Object)"Content-Type");
                s2 = s;
                if (s3 != null) {
                    final String[] split = s3.split(";", 0);
                    int n = 1;
                    while (true) {
                        s2 = s;
                        if (n >= split.length) {
                            break;
                        }
                        final String[] split2 = split[n].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals((Object)"charset")) {
                            s2 = split2[1];
                            break;
                        }
                        ++n;
                    }
                }
            }
            s4 = new String(b, s2);
        }
        catch (final UnsupportedEncodingException ex) {
            s4 = new String(b);
        }
        return new c0(s4, ob.i(c3));
    }
    
    public final Map c() {
        Object o;
        if ((o = this.R) == null) {
            o = Collections.emptyMap();
        }
        return (Map)o;
    }
    
    public final void e(final Object o) {
        final String s = (String)o;
        final g s2 = this.S;
        if (g.c()) {
            if (s != null) {
                s2.d("onNetworkResponseBody", (J1.f)new f((Object)s.getBytes(), 15));
            }
        }
        final Object o2 = this.O;
        synchronized (o2) {
            final t p = this.P;
            monitorexit(o2);
            p.c((Object)s);
        }
    }
    
    public final byte[] k() {
        byte[] q;
        if ((q = this.Q) == null) {
            q = null;
        }
        return q;
    }
}
