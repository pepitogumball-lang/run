package G0;

import android.webkit.ServiceWorkerWebSettings;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import android.webkit.ServiceWorkerController;
import F0.j;

public final class p extends j
{
    public ServiceWorkerController a;
    public final ServiceWorkerControllerBoundaryInterface b;
    public final E c;
    
    public p() {
        z.h.getClass();
        final ServiceWorkerController instance = ServiceWorkerController.getInstance();
        this.a = instance;
        if (instance == null) {
            this.a = ServiceWorkerController.getInstance();
        }
        final ServiceWorkerWebSettings serviceWorkerWebSettings = this.a.getServiceWorkerWebSettings();
        final E c = new E();
        c.D = serviceWorkerWebSettings;
        this.c = c;
    }
}
