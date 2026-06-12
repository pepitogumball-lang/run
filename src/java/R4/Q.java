package R4;

import android.app.Activity;
import y1.v;
import io.flutter.embedding.android.FlutterActivity;
import android.util.Log;
import K2.F1;
import com.google.android.gms.internal.ads.fa;
import c2.k;

public final class q extends h
{
    public final k b;
    public fa c;
    
    public q(final int n, final k b, final String s, final m m, final F1 f1) {
        super(n);
        this.b = b;
    }
    
    @Override
    public final void b() {
        this.c = null;
    }
    
    @Override
    public final void d(final boolean b) {
        final fa c = this.c;
        if (c == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
            return;
        }
        c.d(b);
    }
    
    @Override
    public final void e() {
        final fa c = this.c;
        if (c == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
            return;
        }
        final k b = this.b;
        if (b.D == null) {
            Log.e("FltGAMInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
            return;
        }
        c.c((v)new D(super.a, b));
        this.c.e((Activity)b.D);
    }
}
