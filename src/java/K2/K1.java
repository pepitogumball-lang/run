package K2;

import C1.a;
import android.content.pm.PackageManager$NameNotFoundException;
import C1.b;
import android.os.SystemClock;
import android.util.Pair;
import java.security.MessageDigest;
import java.math.BigInteger;
import java.util.Locale;
import java.util.HashMap;

public final class k1 extends u1
{
    public final HashMap F;
    public final b0 G;
    public final b0 H;
    public final b0 I;
    public final b0 J;
    public final b0 K;
    public final b0 L;
    
    public k1(final y1 y1) {
        super(y1);
        this.F = new HashMap();
        this.G = new b0(this.t(), "last_delete_stale", 0L);
        this.H = new b0(this.t(), "last_delete_stale_batch", 0L);
        this.I = new b0(this.t(), "backoff", 0L);
        this.J = new b0(this.t(), "last_upload", 0L);
        this.K = new b0(this.t(), "last_upload_attempt", 0L);
        this.L = new b0(this.t(), "midnight_offset", 0L);
    }
    
    @Override
    public final boolean B() {
        return false;
    }
    
    public final String C(String s, final boolean b) {
        this.v();
        if (b) {
            s = (String)this.D(s).first;
        }
        else {
            s = "00000000-0000-0000-0000-000000000000";
        }
        final MessageDigest h0 = J1.H0();
        if (h0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, h0.digest(s.getBytes())) });
    }
    
    public final Pair D(final String s) {
        this.v();
        final n0 n0 = (n0)super.C;
        n0.P.getClass();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final HashMap f = this.F;
        final j1 j1 = (j1)f.get((Object)s);
        if (j1 != null && elapsedRealtime < j1.c) {
            return new Pair((Object)j1.a, (Object)j1.b);
        }
        final d i = n0.I;
        i.getClass();
        final long n2 = i.B(s, w.b) + elapsedRealtime;
        a a = null;
        try {
            try {
                a = b.a(n0.C);
            }
            catch (final Exception ex) {}
        }
        catch (final PackageManager$NameNotFoundException ex2) {
            if (j1 != null && elapsedRealtime < j1.c + i.B(s, w.c)) {
                return new Pair((Object)j1.a, (Object)j1.b);
            }
            a = null;
        }
        if (a == null) {
            return new Pair((Object)"00000000-0000-0000-0000-000000000000", (Object)Boolean.FALSE);
        }
        final String a2 = a.a;
        final boolean b = a.b;
        j1 j2 = null;
        Label_0279: {
            if (a2 != null) {
                j2 = new j1(n2, a2, b);
                break Label_0279;
            }
            j2 = new j1(n2, "", b);
            break Label_0279;
            final Exception ex;
            this.j().O.g("Unable to get advertising id", ex);
            j2 = new j1(n2, "", false);
        }
        f.put((Object)s, (Object)j2);
        return new Pair((Object)j2.a, (Object)j2.b);
    }
}
