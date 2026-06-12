package R4;

import y1.g;
import java.util.concurrent.Executor;
import android.view.View;
import F1.q;
import com.google.android.gms.internal.ads.d8;
import com.google.android.gms.internal.ads.D7;
import h2.A;
import y1.h;
import android.view.ViewGroup$LayoutParams;
import io.flutter.plugin.platform.f;
import z1.c;
import java.util.List;
import c2.k;

public class o extends j implements l
{
    public final k b;
    public final String c;
    public final List d;
    public final m e;
    public final b f;
    public c g;
    
    public o(final int n, final k b, final String c, final List d, final m e, final b f) {
        super(n);
        b.getClass();
        c.getClass();
        d.getClass();
        e.getClass();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public void a() {
        final c g = this.g;
        if (g != null) {
            this.b.w(super.a, ((y1.k)g).getResponseInfo());
        }
    }
    
    @Override
    public void b() {
        final c g = this.g;
        if (g != null) {
            ((y1.k)g).a();
            this.g = null;
        }
    }
    
    @Override
    public f c() {
        final c g = this.g;
        if (g == null) {
            return null;
        }
        return new K(g, 0);
    }
    
    public final void d() {
        final c g = new c(this.f.C);
        this.g = g;
        if (this instanceof d) {
            ((View)g).setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
        }
        ((y1.k)this.g).setAdUnitId(this.c);
        this.g.setAppEventListener((z1.d)new n(this));
        final List d = this.d;
        final h[] adSizes = new h[d.size()];
        for (int i = 0; i < d.size(); ++i) {
            adSizes[i] = ((w)d.get(i)).a;
        }
        this.g.setAdSizes(adSizes);
        ((y1.k)this.g).setAdListener((y1.c)new C(super.a, this.b, this));
        final c g2 = this.g;
        final z1.b c = this.e.c();
        g2.getClass();
        A.d("#008 Must be called on the main UI thread.");
        D7.a(((View)g2).getContext());
        if ((boolean)d8.f.p() && (boolean)q.d.c.a(D7.Sa)) {
            ((Executor)J1.c.b).execute((Runnable)new j0.c(6, (Object)g2, (Object)c, false));
        }
        else {
            ((y1.k)g2).C.b(((g)c).a);
        }
    }
}
