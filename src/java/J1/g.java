package J1;

import java.net.URLConnection;
import java.io.Writer;
import java.io.StringWriter;
import F1.c0;
import java.io.IOException;
import h1.w;
import com.google.android.gms.internal.ads.Rc;
import java.util.HashMap;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import android.util.JsonWriter;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public final class g
{
    public static final Object b;
    public static boolean c;
    public static boolean d;
    public static final HashSet e;
    public final List a;
    
    static {
        b = new Object();
        e = new HashSet((Collection)Arrays.asList((Object[])new String[0]));
    }
    
    public g() {
        Object list;
        if (!c()) {
            list = new ArrayList();
        }
        else {
            list = Arrays.asList((Object[])new String[] { "network_request_".concat(String.valueOf((Object)UUID.randomUUID().toString())) });
        }
        this.a = (List)list;
    }
    
    public static boolean c() {
        final Object b;
        monitorenter(b = g.b);
        Label_0039: {
            try {
                final boolean c = g.c;
                boolean b2 = false;
                if (!c) {
                    break Label_0039;
                }
                b2 = b2;
                if (g.d) {
                    b2 = true;
                }
                break Label_0039;
            }
            finally {
                monitorexit(b);
                monitorexit(b);
                return;
            }
        }
    }
    
    public static void e(final JsonWriter jsonWriter, final Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s = (String)map$Entry.getKey();
            if (!g.e.contains((Object)s)) {
                if (map$Entry.getValue() instanceof List) {
                    for (final String s2 : (List)map$Entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(s);
                        jsonWriter.name("value").value(s2);
                        jsonWriter.endObject();
                    }
                }
                else {
                    if (!(map$Entry.getValue() instanceof String)) {
                        j.f("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(s);
                    jsonWriter.name("value").value((String)map$Entry.getValue());
                    jsonWriter.endObject();
                }
            }
        }
        jsonWriter.endArray();
    }
    
    public final void a(final HttpURLConnection httpURLConnection, final byte[] array) {
        if (!c()) {
            return;
        }
        Object o;
        if (((URLConnection)httpURLConnection).getRequestProperties() == null) {
            o = null;
        }
        else {
            o = new HashMap(((URLConnection)httpURLConnection).getRequestProperties());
        }
        this.d("onNetworkRequest", (f)new Rc((Object)new String(((URLConnection)httpURLConnection).getURL().toString()), (Object)new String(httpURLConnection.getRequestMethod()), o, (Object)array, 2));
    }
    
    public final void b(final HttpURLConnection httpURLConnection, final int n) {
        if (c()) {
            final Map headerFields = ((URLConnection)httpURLConnection).getHeaderFields();
            final String s = null;
            Object o;
            if (headerFields == null) {
                o = null;
            }
            else {
                o = new HashMap(((URLConnection)httpURLConnection).getHeaderFields());
            }
            this.d("onNetworkResponse", (f)new w(n, o));
            if (n >= 200) {
                if (n < 300) {
                    return;
                }
            }
            String responseMessage;
            try {
                responseMessage = httpURLConnection.getResponseMessage();
            }
            catch (final IOException ex) {
                j.i("Can not get error message from error HttpURLConnection\n".concat(String.valueOf((Object)((Throwable)ex).getMessage())));
                responseMessage = s;
            }
            this.d("onNetworkRequestError", (f)new c0(responseMessage, 1));
        }
    }
    
    public final void d(String string, final f f) {
        final StringWriter stringWriter = new StringWriter();
        final JsonWriter jsonWriter = new JsonWriter((Writer)stringWriter);
        Label_0143: {
            Label_0137: {
                try {
                    jsonWriter.beginObject();
                    jsonWriter.name("timestamp").value(System.currentTimeMillis());
                    jsonWriter.name("event").value(string);
                    jsonWriter.name("components").beginArray();
                    final Iterator iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        jsonWriter.value((String)iterator.next());
                    }
                }
                catch (final IOException ex) {
                    break Label_0137;
                }
                jsonWriter.endArray();
                f.e(jsonWriter);
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
                break Label_0143;
            }
            final IOException ex;
            j.g("unable to log", (Throwable)ex);
        }
        string = stringWriter.toString();
        final Class<g> clazz;
        monitorenter(clazz = g.class);
        Label_0213: {
            try {
                j.h("GMA Debug BEGIN");
                int n;
                for (int i = 0; i < string.length(); i = n) {
                    n = i + 4000;
                    j.h("GMA Debug CONTENT ".concat(String.valueOf((Object)string.substring(i, Math.min(n, string.length())))));
                }
                break Label_0213;
            }
            finally {
                monitorexit(clazz);
                j.h("GMA Debug FINISH");
                monitorexit(clazz);
            }
        }
    }
}
