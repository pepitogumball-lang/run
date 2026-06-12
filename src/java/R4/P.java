package R4;

import com.google.android.gms.internal.ads.fa;
import java.lang.ref.Reference;
import c2.k;
import F1.D;
import F1.i0;
import y1.n;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.internal.measurement.K1;
import android.os.RemoteException;
import J1.j;
import F1.L;
import com.google.android.gms.internal.ads.zzayl;
import y1.l;
import java.lang.ref.WeakReference;
import z1.d;
import y1.v;

public final class p extends v implements d
{
    public final WeakReference E;
    
    public p(final q q) {
        this.E = new WeakReference((Object)q);
    }
    
    public final void B(final String s, final String s2) {
        final WeakReference e = this.E;
        if (((Reference)e).get() != null) {
            final q q = (q)((Reference)e).get();
            q.b.x(q.a, s, s2);
        }
    }
    
    public final void e(final l l) {
        final WeakReference e = this.E;
        if (((Reference)e).get() != null) {
            final q q = (q)((Reference)e).get();
            q.getClass();
            q.b.v(q.a, new g(l));
        }
    }
    
    public final void h(Object c) {
        c = c;
        final WeakReference e = this.E;
        if (((Reference)e).get() != null) {
            final q q = (q)((Reference)e).get();
            q.c = (fa)c;
            final p p = new p(q);
            c.getClass();
            final D c2 = ((fa)c).c;
            if (c2 != null) {
                try {
                    c2.h3((L)new zzayl((d)p));
                }
                catch (final RemoteException ex) {
                    j.k("#007 Could not call remote method.", (Exception)ex);
                }
            }
            final k b = q.b;
            final K1 k1 = new K1((Object)b, 16, (Object)q);
            if (c2 != null) {
                try {
                    c2.y1((i0)new zzfp((n)k1));
                }
                catch (final RemoteException ex2) {
                    j.k("#007 Could not call remote method.", (Exception)ex2);
                }
            }
            b.w(q.a, ((fa)c).a());
        }
    }
}
