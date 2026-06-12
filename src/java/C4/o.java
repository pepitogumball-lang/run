package c4;

import java.io.OutputStream;
import java.util.Set;
import java.net.URLConnection;
import o.q1;
import java.io.BufferedOutputStream;
import java.util.Map;
import org.json.JSONObject;
import java.util.HashMap;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import java.util.Date;
import java.util.Iterator;
import b4.b;
import java.util.concurrent.TimeUnit;
import C2.h;
import java.util.regex.Matcher;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import q2.a;
import java.util.Random;
import android.content.Context;
import F3.e;
import X2.f;
import java.util.concurrent.ScheduledExecutorService;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

public final class o
{
    public static final int[] p;
    public static final Pattern q;
    public final LinkedHashSet a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public final ScheduledExecutorService f;
    public final i g;
    public final f h;
    public final e i;
    public final c j;
    public final Context k;
    public final String l;
    public final Random m;
    public final a n;
    public final l o;
    
    static {
        p = new int[] { 2, 4, 8, 16, 32, 64, 128, 256 };
        q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    }
    
    public o(final f h, final e i, final i g, final c j, final Context k, final String l, final LinkedHashSet a, final l o, final ScheduledExecutorService f) {
        this.a = a;
        this.b = false;
        this.f = f;
        this.m = new Random();
        this.c = Math.max(8 - o.b().a, 1);
        this.n = q2.a.a;
        this.h = h;
        this.g = g;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.o = o;
        this.d = false;
        this.e = false;
    }
    
    public static void b(final HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        httpURLConnection.disconnect();
        try {
            ((URLConnection)httpURLConnection).getInputStream().close();
            if (httpURLConnection.getErrorStream() != null) {
                httpURLConnection.getErrorStream().close();
            }
        }
        catch (final IOException ex) {}
    }
    
    public static boolean d(final int n) {
        return n == 408 || n == 429 || n == 502 || n == 503 || n == 504;
    }
    
    public static String f(final InputStream inputStream) {
        final StringBuilder sb = new StringBuilder();
        try {
            final BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(inputStream));
            while (true) {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        }
        catch (final IOException ex) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }
    
    public final boolean a() {
        monitorenter(this);
        Label_0048: {
            try {
                if (!((Set)this.a).isEmpty() && !this.b && !this.d && !this.e) {
                    final boolean b = true;
                    break Label_0048;
                }
                break Label_0048;
            }
            finally {
                monitorexit(this);
                final boolean b = false;
                monitorexit(this);
                return b;
            }
        }
    }
    
    public final String c(final String s) {
        final f h = this.h;
        h.a();
        final Matcher matcher = c4.o.q.matcher((CharSequence)h.c.b);
        String group;
        if (matcher.matches()) {
            group = matcher.group(1);
        }
        else {
            group = null;
        }
        return m0.a.i("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", group, "/namespaces/", s, ":streamFetchInvalidations");
    }
    
    public final void e(final long n) {
        monitorenter(this);
        while (true) {
            Label_0077: {
                try {
                    if (!this.a()) {
                        monitorexit(this);
                        return;
                    }
                    final int c = this.c;
                    if (c > 0) {
                        this.c = c - 1;
                        this.f.schedule((Runnable)new h((Object)this, 26), n, TimeUnit.MILLISECONDS);
                        break Label_0102;
                    }
                    break Label_0077;
                }
                finally {
                    monitorexit(this);
                    monitorexit(this);
                    return;
                    iftrue(Label_0102:)(this.e);
                    this.g((b4.f)new X2.h("Unable to connect to the server. Check your connection and try again."));
                    continue;
                }
            }
            break;
        }
    }
    
    public final void g(final b4.f f) {
        monitorenter(this);
        Label_0045: {
            try {
                final Iterator iterator = ((Set)this.a).iterator();
                while (iterator.hasNext()) {
                    ((b)iterator.next()).a(f);
                }
                break Label_0045;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
    }
    
    public final void h() {
        synchronized (this) {
            this.n.getClass();
            this.e(Math.max(0L, this.o.b().b.getTime() - new Date(System.currentTimeMillis()).getTime()));
        }
    }
    
    public final void i(final HttpURLConnection httpURLConnection, final String s, String s2) {
        httpURLConnection.setRequestMethod("POST");
        ((URLConnection)httpURLConnection).setRequestProperty("X-Goog-Firebase-Installations-Auth", s2);
        final f h = this.h;
        h.a();
        final X2.i c = h.c;
        ((URLConnection)httpURLConnection).setRequestProperty("X-Goog-Api-Key", c.a);
        final Context k = this.k;
        ((URLConnection)httpURLConnection).setRequestProperty("X-Android-Package", k.getPackageName());
        final String s3 = null;
        while (true) {
            try {
                final byte[] g = q2.b.g(k, k.getPackageName());
                if (g == null) {
                    final StringBuilder sb = new StringBuilder("Could not get fingerprint hash for package: ");
                    sb.append(k.getPackageName());
                    Log.e("FirebaseRemoteConfig", sb.toString());
                    s2 = null;
                }
                else {
                    s2 = q2.b.c(g);
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                final StringBuilder sb2 = new StringBuilder("No such package: ");
                sb2.append(k.getPackageName());
                Log.i("FirebaseRemoteConfig", sb2.toString());
                continue;
            }
            break;
        }
        ((URLConnection)httpURLConnection).setRequestProperty("X-Android-Cert", s2);
        ((URLConnection)httpURLConnection).setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        ((URLConnection)httpURLConnection).setRequestProperty("X-Accept-Response-Streaming", "true");
        ((URLConnection)httpURLConnection).setRequestProperty("Content-Type", "application/json");
        ((URLConnection)httpURLConnection).setRequestProperty("Accept", "application/json");
        final HashMap hashMap = new HashMap();
        h.a();
        s2 = c.b;
        final Matcher matcher = c4.o.q.matcher((CharSequence)s2);
        s2 = s3;
        if (matcher.matches()) {
            s2 = matcher.group(1);
        }
        hashMap.put((Object)"project", (Object)s2);
        hashMap.put((Object)"namespace", (Object)this.l);
        hashMap.put((Object)"lastKnownVersionNumber", (Object)Long.toString(this.g.g.a.getLong("last_template_version", 0L)));
        h.a();
        hashMap.put((Object)"appId", (Object)c.b);
        hashMap.put((Object)"sdkVersion", (Object)"22.0.1");
        hashMap.put((Object)"appInstanceId", (Object)s);
        final byte[] bytes = new JSONObject((Map)hashMap).toString().getBytes("utf-8");
        final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(((URLConnection)httpURLConnection).getOutputStream());
        ((OutputStream)bufferedOutputStream).write(bytes);
        ((OutputStream)bufferedOutputStream).flush();
        ((OutputStream)bufferedOutputStream).close();
    }
    
    public final q1 j(final HttpURLConnection httpURLConnection) {
        synchronized (this) {
            return new q1(httpURLConnection, this.g, this.j, this.a, new n(this), this.f);
        }
    }
    
    public final void k(final Date date) {
        final l o = this.o;
        final int n = o.b().a + 1;
        int n2 = 8;
        if (n < 8) {
            n2 = n;
        }
        final long millis = TimeUnit.MINUTES.toMillis((long)c4.o.p[n2 - 1]);
        o.d(n, new Date(date.getTime() + (millis / 2L + this.m.nextInt((int)millis))));
    }
}
