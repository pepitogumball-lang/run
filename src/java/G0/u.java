package G0;

import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;
import J5.a;
import android.webkit.WebMessage;
import F0.n;
import J5.b;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import android.webkit.WebMessagePort;
import F0.o;

public final class u extends o
{
    public WebMessagePort a;
    public WebMessagePortBoundaryInterface b;
    
    public u(final WebMessagePort a) {
        this.a = a;
    }
    
    public u(final InvocationHandler invocationHandler) {
        this.b = (WebMessagePortBoundaryInterface)J5.b.i(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
    
    public static WebMessage b(final n n) {
        int i = 0;
        n.a(0);
        final o[] a = n.a;
        WebMessagePort[] array;
        if (a == null) {
            array = null;
        }
        else {
            final int length = a.length;
            array = new WebMessagePort[length];
            while (i < length) {
                array[i] = ((u)a[i]).d();
                ++i;
            }
        }
        return new WebMessage(n.b, array);
    }
    
    public final void a(final n n) {
        final G0.b s = z.s;
        s.getClass();
        final int d = n.d;
        if (d == 0) {
            this.d().postMessage(b(n));
        }
        else {
            if (!s.b() || (d != 0 && (d != 1 || !z.u.b()))) {
                throw z.a();
            }
            this.c().postMessage((InvocationHandler)new a(new s(n)));
        }
    }
    
    public final WebMessagePortBoundaryInterface c() {
        if (this.b == null) {
            this.b = (WebMessagePortBoundaryInterface)J5.b.i(WebMessagePortBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface)A.a.D).convertWebMessagePort((Object)this.a));
        }
        return this.b;
    }
    
    public final WebMessagePort d() {
        if (this.a == null) {
            this.a = (WebMessagePort)((WebkitToCompatConverterBoundaryInterface)A.a.D).convertWebMessagePort(Proxy.getInvocationHandler((Object)this.b));
        }
        return this.a;
    }
}
