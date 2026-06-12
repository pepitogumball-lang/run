package G0;

import android.webkit.WebResourceResponse;
import android.webkit.WebResourceRequest;
import F0.h;
import android.webkit.ServiceWorkerClient;

public final class i extends ServiceWorkerClient
{
    public final h a;
    
    public i(final h a) {
        this.a = a;
    }
    
    public final WebResourceResponse shouldInterceptRequest(final WebResourceRequest webResourceRequest) {
        return this.a.shouldInterceptRequest(webResourceRequest);
    }
}
