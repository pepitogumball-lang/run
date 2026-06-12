package P1;

import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.internal.ads.Op;
import com.google.android.gms.internal.ads.Dk;
import com.google.android.gms.internal.ads.Wp;
import com.google.android.gms.internal.ads.V4;
import com.google.android.gms.internal.ads.bf;
import com.google.android.gms.internal.ads.pd;
import android.content.Context;
import com.google.android.gms.internal.ads.Iv;
import com.google.android.gms.internal.ads.yk;
import com.google.android.gms.internal.ads.Dq;
import com.google.android.gms.internal.ads.pm;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.gms.internal.ads.rd;
import com.google.android.gms.internal.ads.xg;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.Yq;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.Xm;
import com.google.android.gms.internal.ads.an;
import com.google.android.gms.internal.ads.z7;
import J1.a;
import com.google.android.gms.internal.ads.Uh;
import android.content.pm.PackageInfo;
import F1.q;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.y7;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.Xg;
import com.google.android.gms.internal.ads.HC;
import com.google.android.gms.internal.ads.bh;
import com.google.android.gms.internal.ads.ag;
import com.google.android.gms.internal.ads.Ue;
import com.google.android.gms.internal.ads.Ve;
import com.google.android.gms.internal.ads.We;
import com.google.android.gms.internal.ads.KC;
import com.google.android.gms.internal.ads.FC;
import com.google.android.gms.internal.ads.GC;

public final class i implements GC
{
    public final int a;
    public final FC b;
    public final GC c;
    public final FC d;
    public final FC e;
    public final FC f;
    public final FC g;
    public final FC h;
    public final FC i;
    public final KC j;
    public final GC k;
    public final KC l;
    public final KC m;
    
    public i(final FC b, final We c, final FC d, final Ve j, final FC e, final FC f, final Ue k, final FC g, final ag l, final bh m, final FC h, final FC i) {
        this.a = 1;
        this.b = b;
        this.c = (GC)c;
        this.d = d;
        this.j = (KC)j;
        this.e = e;
        this.f = f;
        this.k = (GC)k;
        this.g = g;
        this.l = (KC)l;
        this.m = (KC)m;
        this.h = h;
        this.i = i;
    }
    
    public i(final HC j, final We k, final FC b, final FC d, final FC e, final FC f, final FC g, final We c, final H m, final FC h, final FC i, final FC l) {
        this.a = 0;
        this.j = (KC)j;
        this.k = (GC)k;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.c = (GC)c;
        this.m = (KC)m;
        this.h = h;
        this.i = i;
        this.l = (KC)l;
    }
    
    public i(final We k, final FC b, final FC d, final FC e, final FC f, final FC g, final FC h, final FC i, final FC l, final FC j, final H c, final FC m) {
        this.a = 2;
        this.k = (GC)k;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.l = (KC)l;
        this.j = (KC)j;
        this.c = (GC)c;
        this.m = (KC)m;
    }
    
    public Xg a() {
        final xq xq = (xq)this.b.d();
        final a a = ((We)this.c).a();
        final ApplicationInfo applicationInfo = (ApplicationInfo)this.d.d();
        final String packageName = ((Ve)this.j).b.b().getPackageName();
        y7.H((Object)packageName);
        final z7 a2 = D7.a;
        return new Xg(xq, a, applicationInfo, packageName, q.d.a.m(), (PackageInfo)this.e.d(), FC.a((KC)this.f), ((Ue)this.k).a(), (String)this.g.d(), ((ag)this.l).b(), ((bh)this.m).a(), (Uh)this.h.d(), (int)this.i.d());
    }
    
    public an b() {
        final Context b = ((We)this.k).b();
        final xq xq = (xq)this.b.d();
        final Xm xm = (Xm)this.d.d();
        final gh gh = (gh)this.e.d();
        final Yq yq = (Yq)this.f.d();
        final ar ar = (ar)this.g.d();
        final xg xg = (xg)this.h.d();
        final pd a = rd.a;
        y7.H((Object)a);
        return new an(b, xq, xm, gh, yq, ar, xg, (Iv)a, (ScheduledExecutorService)this.i.d(), (pm)((FC)this.l).d(), (Dq)((FC)this.j).d(), ((H)this.c).a(), (yk)((FC)this.m).d());
    }
    
    public final Object d() {
        switch (this.a) {
            default: {
                return this.b();
            }
            case 1: {
                return this.a();
            }
            case 0: {
                final bf bf = (bf)((HC)this.j).a;
                final Context b = ((We)this.k).b();
                final V4 v4 = (V4)this.b.d();
                final Wp wp = (Wp)this.d.d();
                final pd a = rd.a;
                y7.H((Object)a);
                return new zzau(bf, b, v4, wp, a, (ScheduledExecutorService)this.e.d(), (Dk)this.f.d(), (ar)this.g.d(), ((We)this.c).a(), ((H)this.m).b(), (Op)this.h.d(), (A)this.i.d(), (v)((FC)this.l).d());
            }
        }
    }
}
