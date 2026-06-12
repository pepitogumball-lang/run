package J1;

import java.net.URLConnection;
import java.net.URISyntaxException;
import java.io.IOException;
import F1.p;
import java.net.HttpURLConnection;
import java.net.URI;

public final class m implements d
{
    public final String C;
    
    public m(final String c) {
        this.C = c;
    }
    
    public final l p(final String s) {
        final l e = l.E;
        Object o;
        Object message;
        Object c = message = (o = l.D);
        try {
            o = c;
            message = c;
            final StringBuilder sb = new StringBuilder("Pinging URL: ");
            o = c;
            message = c;
            sb.append(s);
            o = c;
            message = c;
            j.d(sb.toString());
            o = c;
            message = c;
            o = c;
            message = c;
            final URI uri = new URI(s);
            o = c;
            message = c;
            final HttpURLConnection httpURLConnection = (HttpURLConnection)uri.toURL().openConnection();
            Label_0158: {
                try {
                    o = p.f.a;
                    o = this.C;
                    ((URLConnection)httpURLConnection).setConnectTimeout(60000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    ((URLConnection)httpURLConnection).setReadTimeout(60000);
                    if (o != null) {
                        ((URLConnection)httpURLConnection).setRequestProperty("User-Agent", (String)o);
                    }
                    break Label_0158;
                }
                finally {
                    httpURLConnection.disconnect();
                    Label_0276: {
                    Label_0213:
                        while (true) {
                            c = e;
                            break Label_0276;
                            ((URLConnection)httpURLConnection).setUseCaches(false);
                            o = new g();
                            ((g)o).a(httpURLConnection, null);
                            final int responseCode = httpURLConnection.getResponseCode();
                            ((g)o).b(httpURLConnection, responseCode);
                            iftrue(Label_0224:)(responseCode < 200 || responseCode >= 300);
                            break Label_0213;
                            Label_0224: {
                                o = new StringBuilder("Received non-success response code ");
                            }
                            ((StringBuilder)o).append(responseCode);
                            ((StringBuilder)o).append(" from pinging URL: ");
                            ((StringBuilder)o).append(s);
                            j.i(((StringBuilder)o).toString());
                            iftrue(Label_0276:)(responseCode != 502);
                            continue;
                        }
                        o = (c = l.C);
                        break Label_0276;
                    }
                    o = c;
                    message = c;
                    httpURLConnection.disconnect();
                }
            }
        }
        catch (final RuntimeException ex) {}
        catch (final IOException ex2) {}
        catch (final URISyntaxException ex3) {}
        catch (final IndexOutOfBoundsException ex4) {}
        throw;
        message = ((Throwable)c).getMessage();
        final StringBuilder sb2 = new StringBuilder("Error while parsing ping URL: ");
        sb2.append(s2);
        sb2.append(". ");
        sb2.append((String)message);
        j.i(sb2.toString());
        c = o;
        return (l)c;
        final String message2 = ((Throwable)c).getMessage();
        final StringBuilder sb3 = new StringBuilder("Error while pinging URL: ");
        sb3.append(s2);
        sb3.append(". ");
        sb3.append(message2);
        j.i(sb3.toString());
        c = e;
        return (l)c;
    }
}
