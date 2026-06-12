package F1;

import com.google.android.gms.internal.ads.La;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.internal.ads.zzbok;
import android.content.Context;

public final class j extends o
{
    public final Context b;
    public final P0 c;
    public final String d;
    public final zzbok e;
    public final n f;
    
    public j(final n f, final Context b, final P0 c, final String d, final zzbok e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final Object a() {
        n.u(this.b, "interstitial");
        return new zzbw();
    }
}
