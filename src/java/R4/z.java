package R4;

import com.google.android.gms.internal.ads.c6;
import java.lang.ref.Reference;
import F1.n0;
import c2.k;
import y1.q;
import android.os.RemoteException;
import J1.j;
import F1.i0;
import y1.n;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.ads.a6;
import y1.l;
import java.lang.ref.WeakReference;
import A1.a;

public final class z extends a
{
    public final WeakReference E;
    
    public z(final A a) {
        this.E = new WeakReference((Object)a);
    }
    
    public final void e(final l l) {
        final WeakReference e = this.E;
        if (((Reference)e).get() != null) {
            final A a = (A)((Reference)e).get();
            a.getClass();
            a.b.v(a.a, new g(l));
        }
    }
    
    public final void h(Object a) {
        final a6 c = (a6)a;
        final WeakReference e = this.E;
        if (((Reference)e).get() != null) {
            final A a2 = (A)((Reference)e).get();
            a2.c = c;
            final k b = a2.b;
            final K1 k1 = new K1((Object)b, 16, (Object)a2);
            c.getClass();
            a = c.a;
            try {
                ((c6)a).a2((i0)new zzfp((n)k1));
            }
            catch (final RemoteException ex) {
                j.k("#007 Could not call remote method.", (Exception)ex);
            }
            n0 c2;
            try {
                c2 = ((c6)a).c();
            }
            catch (final RemoteException ex2) {
                j.k("#007 Could not call remote method.", (Exception)ex2);
                c2 = null;
            }
            a = new q(c2);
            b.w(a2.a, (q)a);
        }
    }
}
