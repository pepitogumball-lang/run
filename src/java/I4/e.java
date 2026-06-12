package i4;

import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.io.InputStream;
import java.util.Iterator;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import java.util.Map$Entry;
import f5.a;
import e5.d;
import java.util.LinkedHashMap;
import c2.k;
import m5.p;
import g5.h;

public final class e extends h implements p
{
    public int G;
    public final k H;
    public final LinkedHashMap I;
    public final b J;
    public final c K;
    
    public e(final k h, final LinkedHashMap i, final b j, final c k, final d d) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((e)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object o) {
        return (d)new e(this.H, this.I, this.J, this.K, d);
    }
    
    public final Object l(Object o) {
        final a c = a.C;
        final int g = this.G;
        final c k = this.K;
        final c5.h a = c5.h.a;
        Label_0069: {
            if (g == 0) {
                break Label_0069;
            }
            if (g != 1 && g != 2) {
                if (g == 3) {
                    com.google.android.gms.internal.auth.h.z(o);
                    return a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                com.google.android.gms.internal.auth.h.z(o);
            }
            catch (final Exception ex) {
                String s;
                if ((s = ((Throwable)ex).getMessage()) == null) {
                    s = ex.toString();
                }
                this.G = 3;
                k.f(s, this);
                if (a == c) {
                    return c;
                }
                return a;
                Label_0280: {
                    o = new StringBuilder();
                }
                ((StringBuilder)o).append("Bad response code: ");
                int responseCode = 0;
                ((StringBuilder)o).append(responseCode);
                final String string = ((StringBuilder)o).toString();
                this.G = 2;
                k.f(string, this);
                iftrue(Label_0370:)(a != c);
                return c;
            Label_0214_Outer:
                while (true) {
                    final Iterator iterator;
                    final Map$Entry map$Entry = (Map$Entry)iterator.next();
                    final HttpsURLConnection httpsURLConnection;
                    ((URLConnection)httpsURLConnection).setRequestProperty((String)map$Entry.getKey(), (String)map$Entry.getValue());
                    Label_0123: {
                        break Label_0123;
                        Label_0235:
                        ((BufferedReader)o).close();
                        InputStream inputStream = null;
                        inputStream.close();
                        StringBuilder sb = null;
                        o = new JSONObject(sb.toString());
                        final b j = this.J;
                        this.G = 1;
                        iftrue(Label_0370:)(j.f(o, this) != c);
                        return c;
                        com.google.android.gms.internal.auth.h.z(o);
                        final URLConnection openConnection = c2.k.b(this.H).openConnection();
                        n5.h.c("null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection", (Object)openConnection);
                        httpsURLConnection = (HttpsURLConnection)openConnection;
                        ((HttpURLConnection)httpsURLConnection).setRequestMethod("GET");
                        ((URLConnection)httpsURLConnection).setRequestProperty("Accept", "application/json");
                        iterator = this.I.entrySet().iterator();
                        break Label_0123;
                    Label_0214:
                        while (true) {
                            while (true) {
                                inputStream = ((URLConnection)httpsURLConnection).getInputStream();
                                o = new BufferedReader((Reader)new InputStreamReader(inputStream));
                                sb = new StringBuilder();
                                break Label_0214;
                                Label_0169:
                                responseCode = ((HttpURLConnection)httpsURLConnection).getResponseCode();
                                iftrue(Label_0280:)(responseCode != 200);
                                continue Label_0214_Outer;
                            }
                            final String line = ((BufferedReader)o).readLine();
                            iftrue(Label_0235:)(line == null);
                            sb.append(line);
                            continue Label_0214;
                        }
                    }
                    iftrue(Label_0169:)(!iterator.hasNext());
                    continue;
                }
            }
        }
        Label_0370: {
            return a;
        }
    }
}
