package F1;

import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.internal.ads.La;
import android.content.Context;

public final class g extends o
{
    public final Context b;
    public final P0 c;
    public final String d;
    public final La e;
    public final n f;
    
    public g(final n f, final Context b, final P0 c, final String d, final La e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final Object a() {
        n.u(this.b, "banner");
        return new zzbw();
    }
}
