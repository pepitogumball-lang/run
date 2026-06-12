package K2;

import com.google.android.gms.internal.ads.Gp;
import android.media.metrics.MediaMetricsManager;
import com.google.android.gms.internal.ads.y7;
import com.google.android.gms.internal.ads.YD;
import android.media.metrics.LogSessionId;
import com.google.android.gms.internal.ads.XD;
import com.google.android.gms.internal.ads.QD;
import com.google.android.gms.internal.ads.th;
import com.google.android.gms.internal.ads.ZD;
import com.google.android.gms.internal.ads.aE;
import com.google.android.gms.internal.ads.iD;
import android.content.Context;
import i2.a;

public final class e1 implements Runnable
{
    public final int C;
    public final Object D = d;
    public final boolean E = e;
    public final Object F = f;
    public final Object G = g;
    
    public e1(final b1 f, final B1 d, final boolean e, final c g, final c c) {
        this.C = 2;
        this.D = d;
        this.E = e;
        this.G = g;
        this.F = f;
    }
    
    public final void run() {
        switch (this.C) {
            default: {
                final Context context = (Context)this.D;
                final MediaMetricsManager e = O.c.e(context.getSystemService("media_metrics"));
                ZD zd;
                if (e == null) {
                    zd = null;
                }
                else {
                    zd = new ZD(context, O.c.i(e));
                }
                if (zd == null) {
                    th.M("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (this.E) {
                    ((iD)this.G).J1((QD)zd);
                }
                final aE ae = (aE)this.F;
                final LogSessionId a = XD.a(zd.F);
                final aE ae2;
                monitorenter(ae2 = ae);
                try {
                    final Gp b = ae.b;
                    if (b != null) {
                        y7.Y(YD.y((LogSessionId)b.C, (Object)YD.f()));
                        b.C = a;
                        monitorexit(ae2);
                        return;
                    }
                    throw null;
                }
                finally {
                    monitorexit(ae2);
                    throw null;
                }
            }
            case 2: {
                final b1 b2 = (b1)this.F;
                final H f = b2.F;
                if (f == null) {
                    b2.j().H.f("Discarding data. Failed to send conditional user property to service");
                }
                else {
                    final B1 b3 = (B1)this.D;
                    a a2;
                    if (this.E) {
                        a2 = null;
                    }
                    else {
                        a2 = (c)this.G;
                    }
                    b2.D(f, a2, b3);
                    b2.N();
                }
                return;
            }
            case 1: {
                final b1 b4 = (b1)this.F;
                final H f2 = b4.F;
                if (f2 == null) {
                    b4.j().H.f("Discarding data. Failed to send event to service");
                }
                else {
                    v v = (v)this.G;
                    final B1 b5 = (B1)this.D;
                    if (this.E) {
                        v = null;
                    }
                    b4.D(f2, v, b5);
                    b4.N();
                }
                return;
            }
            case 0: {
                final b1 b6 = (b1)this.F;
                final H f3 = b6.F;
                if (f3 == null) {
                    b6.j().H.f("Discarding data. Failed to set user property");
                }
                else {
                    final B1 b7 = (B1)this.D;
                    a a3;
                    if (this.E) {
                        a3 = null;
                    }
                    else {
                        a3 = (G1)this.G;
                    }
                    b6.D(f3, a3, b7);
                    b6.N();
                }
            }
        }
    }
}
