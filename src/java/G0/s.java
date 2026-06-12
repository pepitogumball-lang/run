package G0;

import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;
import J5.a;
import java.util.Objects;
import java.lang.reflect.InvocationHandler;
import J5.b;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import F0.o;
import F0.n;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;

public final class s implements WebMessageBoundaryInterface
{
    public static final String[] D;
    public final n C;
    
    static {
        D = new String[] { "WEB_MESSAGE_ARRAY_BUFFER" };
    }
    
    public s(final n c) {
        this.C = c;
    }
    
    public static n a(final WebMessageBoundaryInterface webMessageBoundaryInterface) {
        final InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        final o[] array = new o[ports.length];
        for (int i = 0; i < ports.length; ++i) {
            array[i] = new u(ports[i]);
        }
        if (!z.u.b()) {
            return new n(webMessageBoundaryInterface.getData(), array);
        }
        final WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface)b.i(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        final int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new n(webMessagePayloadBoundaryInterface.getAsString(), array);
        }
        if (type != 1) {
            return null;
        }
        return new n(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), array);
    }
    
    @Override
    public final String getData() {
        final n c = this.C;
        c.a(0);
        return c.b;
    }
    
    @Override
    public final InvocationHandler getMessagePayload() {
        final n c = this.C;
        final int d = c.d;
        t t;
        if (d != 0) {
            if (d != 1) {
                final StringBuilder sb = new StringBuilder("Unknown web message payload type: ");
                sb.append(d);
                throw new IllegalStateException(sb.toString());
            }
            c.a(1);
            final byte[] c2 = c.c;
            Objects.requireNonNull((Object)c2);
            t = new t(c2);
        }
        else {
            c.a(0);
            t = new t(c.b);
        }
        return (InvocationHandler)new a(t);
    }
    
    @Override
    public final InvocationHandler[] getPorts() {
        final o[] a = this.C.a;
        if (a == null) {
            return null;
        }
        final InvocationHandler[] array = new InvocationHandler[a.length];
        for (int i = 0; i < a.length; ++i) {
            array[i] = Proxy.getInvocationHandler((Object)((u)a[i]).c());
        }
        return array;
    }
    
    @Override
    public final String[] getSupportedFeatures() {
        return s.D;
    }
}
