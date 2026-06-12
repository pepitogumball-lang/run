package S2;

import android.os.BaseBundle;
import com.google.android.gms.internal.ads.OA;
import android.os.Bundle;
import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.Ie;
import com.google.android.gms.internal.ads.r7;
import C2.x;
import com.google.android.gms.internal.ads.t6;

public final class a implements t6, s.a
{
    public final boolean C = c;
    public final int D = x.b;
    
    public void b(final r7 r7) {
        final int e0 = Ie.E0;
        final f7 y = g7.y();
        final boolean z = ((g7)((OA)y).D).z();
        final boolean c = this.C;
        if (z != c) {
            ((OA)y).e();
            g7.A((g7)((OA)y).D, c);
        }
        ((OA)y).e();
        g7.B((g7)((OA)y).D, this.D);
        final g7 g7 = (g7)((OA)y).b();
        ((OA)r7).e();
        s7.E((s7)((OA)r7).D, g7);
    }
    
    public Bundle n() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
        ((BaseBundle)bundle).putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.C);
        ((BaseBundle)bundle).putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.D);
        return bundle;
    }
}
