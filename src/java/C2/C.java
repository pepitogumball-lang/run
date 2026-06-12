package c2;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.URLConnection;
import f2.l;
import java.io.IOException;
import android.util.Log;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.android.gms.common.api.Status;
import g2.q;
import h2.A;
import f2.o;
import C2.x;

public final class c implements Runnable
{
    public static final x E;
    public final String C;
    public final o D;
    
    static {
        E = new x("RevokeAccessOperation", new String[0]);
    }
    
    public c(final String c) {
        A.e(c);
        this.C = c;
        this.D = new o((q)null, 1);
    }
    
    public final void run() {
        final x e = c.E;
        Object i;
        Object o;
        Object g = o = (i = Status.I);
        Label_0309: {
            Label_0271: {
                try {
                    i = g;
                    o = g;
                    final String c = this.C;
                    i = g;
                    o = g;
                    i = g;
                    o = g;
                    final StringBuilder sb = new StringBuilder("https://accounts.google.com/o/oauth2/revoke?token=");
                    i = g;
                    o = g;
                    sb.append(c);
                    i = g;
                    o = g;
                    final URL url = new URL(sb.toString());
                    i = g;
                    o = g;
                    final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                    i = g;
                    o = g;
                    ((URLConnection)httpURLConnection).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    i = g;
                    o = g;
                    final int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        i = g;
                        o = g;
                        g = Status.G;
                    }
                    else {
                        i = g;
                        o = g;
                        Log.e((String)e.a, e.h("Unable to revoke access!", new Object[0]));
                    }
                    i = g;
                    o = g;
                    i = g;
                    o = g;
                    final StringBuilder sb2 = new StringBuilder("Response Code: ");
                    i = g;
                    o = g;
                    sb2.append(responseCode);
                    i = g;
                    o = g;
                    e.g(sb2.toString(), new Object[0]);
                    break Label_0309;
                }
                catch (final Exception ex) {}
                catch (final IOException ex2) {
                    break Label_0271;
                }
                final Exception ex;
                Log.e((String)e.a, e.h("Exception when revoking access: ".concat(String.valueOf((Object)ex.toString())), new Object[0]));
                g = i;
                break Label_0309;
            }
            final IOException ex2;
            Log.e((String)e.a, e.h("IOException when revoking access: ".concat(String.valueOf((Object)ex2.toString())), new Object[0]));
            g = o;
        }
        ((BasePendingResult)this.D).K((l)g);
    }
}
