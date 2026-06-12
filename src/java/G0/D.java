package G0;

import F0.n;
import F0.o;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebMessagePort$WebMessageCallback;

public final class d extends WebMessagePort$WebMessageCallback
{
    public final F0.d a;
    
    public d(final F0.d a) {
        this.a = a;
    }
    
    public final void onMessage(final WebMessagePort webMessagePort, final WebMessage webMessage) {
        final u u = new u(webMessagePort);
        final String data = webMessage.getData();
        final WebMessagePort[] ports = webMessage.getPorts();
        o[] array;
        if (ports == null) {
            array = null;
        }
        else {
            array = new o[ports.length];
            for (int i = 0; i < ports.length; ++i) {
                array[i] = new u(ports[i]);
            }
        }
        this.a.onMessage((o)u, new n(data, array));
    }
}
