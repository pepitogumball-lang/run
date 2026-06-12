package G0;

import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import android.webkit.SafeBrowsingResponse;
import F0.f;

public final class n extends f
{
    public SafeBrowsingResponse a;
    public SafeBrowsingResponseBoundaryInterface b;
    
    public final void a(final boolean b) {
        final b r = z.r;
        if (r.a()) {
            e.j(this.c(), b);
        }
        else {
            if (!r.b()) {
                throw z.a();
            }
            this.b().showInterstitial(b);
        }
    }
    
    public final SafeBrowsingResponseBoundaryInterface b() {
        if (this.b == null) {
            this.b = (SafeBrowsingResponseBoundaryInterface)J5.b.i(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface)A.a.D).convertSafeBrowsingResponse((Object)this.a));
        }
        return this.b;
    }
    
    public final SafeBrowsingResponse c() {
        if (this.a == null) {
            this.a = e.b(((WebkitToCompatConverterBoundaryInterface)A.a.D).convertSafeBrowsingResponse(Proxy.getInvocationHandler((Object)this.b)));
        }
        return this.a;
    }
}
