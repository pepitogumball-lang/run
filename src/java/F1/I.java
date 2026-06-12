package F1;

import com.google.android.gms.internal.ads.La;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.ads.internal.client.zzbw;
import android.content.Context;

public final class i extends o
{
    public final Context b;
    public final P0 c;
    public final String d;
    public final n e;
    
    public i(final n e, final Context b, final P0 c, final String d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Object a() {
        n.u(this.b, "search");
        return new zzbw();
    }
}
