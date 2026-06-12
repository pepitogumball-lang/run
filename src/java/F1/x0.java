package F1;

import android.view.ViewGroup;
import t2.b;
import com.google.android.gms.dynamic.ObjectWrapper;
import android.view.View;
import J1.j;
import V2.o;
import J1.e;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.d8;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.ads.internal.client.zzb;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.internal.ads.La;
import android.os.RemoteException;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import y1.n;
import y1.k;
import y1.t;
import z1.d;
import y1.h;
import y1.c;
import y1.s;
import com.google.android.gms.internal.ads.zzbok;

public final class x0
{
    public final zzbok a;
    public final O0 b;
    public final s c;
    public final w0 d;
    public a e;
    public c f;
    public h[] g;
    public d h;
    public D i;
    public t j;
    public String k;
    public final k l;
    public boolean m;
    public n n;
    
    public x0(final k l) {
        final O0 c = O0.C;
        this.a = new zzbok();
        this.c = new s();
        this.d = new w0(this);
        this.l = l;
        this.b = c;
        this.i = null;
        new AtomicBoolean(false);
    }
    
    public static P0 a(final Context context, final h[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i].equals((Object)h.l)) {
                return new P0("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        final P0 p2 = new P0(context, array);
        p2.L = false;
        return p2;
    }
    
    public final void b(final v0 v0) {
        Label_0552: {
            long currentTimeMillis = 0L;
            k l = null;
            Label_0500: {
                D j = null;
                Label_0171: {
                    Context context;
                    P0 a;
                    try {
                        currentTimeMillis = System.currentTimeMillis();
                        final D i = this.i;
                        l = this.l;
                        if (i != null) {
                            break Label_0500;
                        }
                        if (this.g == null || this.k == null) {
                            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                        }
                        context = ((View)l).getContext();
                        a = a(context, this.g);
                        if ("search_v2".equals((Object)a.C)) {
                            j = (D)new i(p.f.b, context, a, this.k).d(context, false);
                            break Label_0171;
                        }
                    }
                    catch (final RemoteException ex) {
                        break Label_0552;
                    }
                    j = (D)new g(p.f.b, context, a, this.k, (La)this.a).d(context, false);
                }
                (this.i = j).l4((u)new zzg((c)this.d));
                final a e = this.e;
                if (e != null) {
                    this.i.c5((F1.s)new zzb(e));
                }
                final d h = this.h;
                if (h != null) {
                    this.i.h3((L)new zzayl(h));
                }
                final t k = this.j;
                if (k != null) {
                    this.i.Q4(new L0(k));
                }
                this.i.y1((i0)new zzfp(this.n));
                this.i.b5(this.m);
                final D m = this.i;
                if (m == null) {
                    break Label_0500;
                }
                Label_0460: {
                    try {
                        final b n = m.n();
                        if (n != null) {
                            if (!(boolean)d8.f.p() || !(boolean)q.d.c.a(D7.Sa)) {
                                break Label_0460;
                            }
                            J1.e.b.post((Runnable)new o((Object)this, 8, (Object)n));
                        }
                    }
                    catch (final RemoteException ex2) {
                        J1.j.k("#007 Could not call remote method.", (Exception)ex2);
                        break Label_0500;
                        final b n;
                        ((ViewGroup)l).addView((View)ObjectWrapper.unwrap(n));
                    }
                }
                break Label_0500;
            }
            v0.m = currentTimeMillis;
            final D i2 = this.i;
            if (i2 != null) {
                final O0 b = this.b;
                final Context context2 = ((View)l).getContext();
                b.getClass();
                i2.X1(O0.a(context2, v0));
                return;
            }
            throw null;
        }
        final RemoteException ex;
        J1.j.k("#007 Could not call remote method.", (Exception)ex);
    }
    
    public final void c(final a e) {
        Label_0046: {
            D i = null;
            Object o = null;
            Label_0038: {
                try {
                    this.e = e;
                    i = this.i;
                    if (i == null) {
                        return;
                    }
                    if (e != null) {
                        o = new zzb(e);
                        break Label_0038;
                    }
                }
                catch (final RemoteException ex) {
                    break Label_0046;
                }
                o = null;
            }
            i.c5((F1.s)o);
            return;
        }
        final RemoteException ex;
        J1.j.k("#007 Could not call remote method.", (Exception)ex);
    }
    
    public final void d(final h... g) {
        final k l = this.l;
        this.g = g;
        try {
            final D i = this.i;
            if (i != null) {
                i.I4(a(((View)l).getContext(), this.g));
            }
        }
        catch (final RemoteException ex) {
            J1.j.k("#007 Could not call remote method.", (Exception)ex);
        }
        ((View)l).requestLayout();
    }
    
    public final void e(final d h) {
        Label_0046: {
            D i = null;
            Object o = null;
            Label_0038: {
                try {
                    this.h = h;
                    i = this.i;
                    if (i == null) {
                        return;
                    }
                    if (h != null) {
                        o = new zzayl(h);
                        break Label_0038;
                    }
                }
                catch (final RemoteException ex) {
                    break Label_0046;
                }
                o = null;
            }
            i.h3((L)o);
            return;
        }
        final RemoteException ex;
        J1.j.k("#007 Could not call remote method.", (Exception)ex);
    }
}
