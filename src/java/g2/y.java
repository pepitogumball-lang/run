package g2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import O2.d;
import java.util.Map;
import com.google.android.gms.internal.auth.l;
import h2.A;
import com.google.android.gms.common.api.Status;
import c0.b;
import O2.j;

public final class y extends v
{
    public final k b;
    public final j c;
    public final b d;
    
    public y(final int n, final k b, final j c, final b d) {
        super(n);
        this.c = c;
        this.b = b;
        this.d = d;
        if (n == 2 && b.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
    
    @Override
    public final void a(final Status status) {
        this.d.getClass();
        this.c.c((Exception)h2.A.m(status));
    }
    
    @Override
    public final void b(final RuntimeException ex) {
        this.c.c((Exception)ex);
    }
    
    @Override
    public final void c(l l, final boolean b) {
        final Map map = (Map)l.E;
        final j c = this.c;
        map.put((Object)c, (Object)b);
        l = new l(l, c);
        c.a.k((d)l);
    }
    
    @Override
    public final void d(final o o) {
        final j c = this.c;
        try {
            ((g2.j)((k)this.b.d).d).accept((Object)o.D, (Object)c);
        }
        catch (final RuntimeException ex) {
            c.c((Exception)ex);
        }
        catch (final RemoteException ex2) {
            this.a(A.e(ex2));
        }
        catch (final DeadObjectException ex3) {
            throw ex3;
        }
    }
    
    @Override
    public final e2.d[] f(final o o) {
        return (e2.d[])this.b.a;
    }
    
    @Override
    public final boolean g(final o o) {
        return this.b.b;
    }
}
