package P1;

import I1.I;
import com.google.android.gms.internal.ads.rd;
import android.os.Looper;
import I1.M;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ti;

public final class q implements ti
{
    public final j C;
    public final int D;
    public final String E;
    
    public q(final j c, final int d, final String e) {
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public final void H(final String s) {
    }
    
    public final void a(final p p) {
        if (p != null && this.D == 2) {
            if (!TextUtils.isEmpty((CharSequence)this.E)) {
                final O2.p p2 = new O2.p(this, 4, p);
                final I l = M.l;
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    p2.run();
                }
                else {
                    rd.a.execute((Runnable)p2);
                }
            }
        }
    }
}
