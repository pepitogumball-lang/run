package Z4;

import android.webkit.JavascriptInterface;
import G.l;

public final class u
{
    public final String a;
    public final r b;
    
    public u(final String a, final r b) {
        this.a = a;
        this.b = b;
    }
    
    @JavascriptInterface
    public void postMessage(final String s) {
        this.b.a.h((Runnable)new l((Object)this, 13, (Object)s));
    }
}
