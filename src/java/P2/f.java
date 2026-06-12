package P2;

import android.os.Binder;
import android.os.IInterface;
import O2.j;
import B5.w;
import com.google.android.play.core.review.internal.zzg;

public final class f extends zzg
{
    public final w C;
    public final j D;
    public final g E;
    
    public f(final g e, final j d) {
        final w c = new w("OnRequestInstallCallback", 2);
        this.E = e;
        ((Binder)this).attachInterface((IInterface)this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.C = c;
        this.D = d;
    }
}
