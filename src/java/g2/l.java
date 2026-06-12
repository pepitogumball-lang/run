package g2;

import android.os.BaseBundle;
import android.content.DialogInterface;
import android.app.PendingIntent;
import android.os.Bundle;
import h2.A;
import android.app.Activity;
import android.os.Looper;
import t.c;
import e2.e;
import A2.b;
import java.util.concurrent.atomic.AtomicReference;
import android.content.DialogInterface$OnCancelListener;

public final class l implements DialogInterface$OnCancelListener
{
    public final Object C;
    public volatile boolean D;
    public final AtomicReference E;
    public final b F;
    public final e G;
    public final c H;
    public final g2.e I;
    
    public l(final g c, final g2.e i) {
        final e d = e.d;
        this.C = c;
        this.E = new AtomicReference((Object)null);
        this.F = new b(Looper.getMainLooper(), 5);
        this.G = d;
        this.H = new c(0);
        this.I = i;
        c.b(this);
    }
    
    public final Activity a() {
        final Activity c = ((g)this.C).c();
        A.h((Object)c);
        return c;
    }
    
    public final void b(final Bundle bundle) {
        if (bundle != null) {
            final AtomicReference e = this.E;
            B b;
            if (((BaseBundle)bundle).getBoolean("resolving_error", false)) {
                b = new B(new e2.b(((BaseBundle)bundle).getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution")), ((BaseBundle)bundle).getInt("failed_client_id", -1));
            }
            else {
                b = null;
            }
            e.set((Object)b);
        }
    }
    
    public final void c() {
        this.D = false;
        final g2.e i = this.I;
        i.getClass();
        final Object t;
        monitorenter(t = g2.e.T);
        Label_0050: {
            try {
                if (i.M == this) {
                    i.M = null;
                    i.N.clear();
                }
                break Label_0050;
            }
            finally {
                monitorexit(t);
                monitorexit(t);
            }
        }
    }
    
    public final void d() {
        if (!this.H.isEmpty()) {
            this.I.d(this);
        }
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final e2.b b = new e2.b(13, null);
        final AtomicReference e = this.E;
        final B b2 = (B)e.get();
        int a;
        if (b2 == null) {
            a = -1;
        }
        else {
            a = b2.a;
        }
        e.set((Object)null);
        this.I.g(b, a);
    }
}
