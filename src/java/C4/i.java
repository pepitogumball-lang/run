package c4;

import java.util.Iterator;
import java.util.Map$Entry;
import O2.a;
import F3.d;
import android.text.format.DateUtils;
import n3.u0;
import O2.t;
import java.net.HttpURLConnection;
import java.util.Map;
import com.google.android.gms.internal.measurement.e0;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Random;
import java.util.concurrent.Executor;
import E3.b;
import F3.e;

public final class i
{
    public static final long i;
    public static final int[] j;
    public final e a;
    public final b b;
    public final Executor c;
    public final Random d;
    public final c e;
    public final ConfigFetchHttpClient f;
    public final l g;
    public final HashMap h;
    
    static {
        i = TimeUnit.HOURS.toSeconds(12L);
        j = new int[] { 2, 4, 8, 16, 32, 64, 128, 256 };
    }
    
    public i(final e a, final b b, final Executor c, final Random d, final c e, final ConfigFetchHttpClient f, final l g, final HashMap h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final h a(String concat, final String s, final Date date, final HashMap hashMap) {
        Label_0188: {
            try {
                final HttpURLConnection b = this.f.b();
                final ConfigFetchHttpClient f = this.f;
                final HashMap d = this.d();
                final String string = this.g.a.getString("last_fetch_etag", (String)null);
                final b3.b b2 = (b3.b)this.b.get();
                Long n;
                if (b2 == null) {
                    n = null;
                }
                else {
                    n = (Long)((e0)((b3.c)b2).a.D).e((String)null, (String)null, true).get((Object)"_fot");
                }
                final h fetch = f.fetch(b, concat, s, (Map)d, string, (Map)hashMap, n, date);
                final c4.e b3 = fetch.b;
                if (b3 == null) {
                    break Label_0188;
                }
                final l g = this.g;
                final long f2 = b3.f;
                final Object b4 = g.b;
                synchronized (b4) {
                    g.a.edit().putLong("last_template_version", f2).apply();
                }
            }
            catch (final b4.h h) {
                final int c = h.C;
                final l g2 = this.g;
                if (c == 429 || c == 502 || c == 503 || c == 504) {
                    final int n2 = g2.a().a + 1;
                    final TimeUnit minutes = TimeUnit.MINUTES;
                    final int[] j = c4.i.j;
                    final long millis = minutes.toMillis((long)j[Math.min(n2, j.length) - 1]);
                    g2.c(n2, new Date(date.getTime() + (millis / 2L + this.d.nextInt((int)millis))));
                }
                final k a = g2.a();
                final int c2 = h.C;
                if (a.a <= 1 && c2 != 429) {
                    if (c2 != 401) {
                        if (c2 != 403) {
                            if (c2 == 429) {
                                throw new X2.h("The throttled response from the server was not handled correctly by the FRC SDK.");
                            }
                            if (c2 != 500) {
                                switch (c2) {
                                    default: {
                                        concat = "The server returned an unexpected error.";
                                        break;
                                    }
                                    case 502:
                                    case 503:
                                    case 504: {
                                        concat = "The server is unavailable. Please try again later.";
                                        break;
                                    }
                                }
                            }
                            else {
                                concat = "There was an internal server error.";
                            }
                        }
                        else {
                            concat = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                        }
                    }
                    else {
                        concat = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                    }
                    concat = "Fetch failed: ".concat(concat);
                    throw new b4.h(h.C, concat, h);
                }
                a.b.getTime();
                throw new X2.h("Fetch was throttled.");
                final h fetch;
            Label_0252:
                while (true) {
                    final l g3 = this.g;
                    final Object b5 = g3.b;
                    synchronized (b5) {
                        final String c3;
                        g3.a.edit().putString("last_fetch_etag", c3).apply();
                    }
                    break Label_0252;
                    final String c3 = fetch.c;
                    iftrue(Label_0252:)(c3 == null);
                    continue;
                }
                this.g.c(0, l.f);
                return fetch;
            }
        }
    }
    
    public final t b(final O2.i i, long time, final HashMap hashMap) {
        final Date date = new Date(System.currentTimeMillis());
        final boolean j = i.j();
        final l g = this.g;
        Date date2 = null;
        if (j) {
            final Date date3 = new Date(g.a.getLong("last_fetch_time_in_millis", -1L));
            if (!date3.equals((Object)l.e) && date.before(new Date(TimeUnit.SECONDS.toMillis(time) + date3.getTime()))) {
                return u0.m((Object)new h(2, null, null));
            }
        }
        final Date b = g.a().b;
        if (date.before(b)) {
            date2 = b;
        }
        final Executor c = this.c;
        t t;
        if (date2 != null) {
            final long time2 = date2.getTime();
            time = date.getTime();
            final String formatElapsedTime = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(time2 - time));
            final StringBuilder sb = new StringBuilder("Fetch is throttled. Please wait before calling fetch again: ");
            sb.append(formatElapsedTime);
            final String string = sb.toString();
            date2.getTime();
            t = u0.l((Exception)new X2.h(string));
        }
        else {
            final d d = (d)this.a;
            final t c2 = d.c();
            final t d2 = d.d();
            t = u0.B(new O2.i[] { (O2.i)c2, (O2.i)d2 }).e(c, (a)new g(this, c2, d2, date, hashMap));
        }
        return t.e(c, (a)new L3.g((Object)this, 9, (Object)date));
    }
    
    public final t c(final int n) {
        final HashMap hashMap = new HashMap((Map)this.h);
        final StringBuilder sb = new StringBuilder();
        sb.append("REALTIME");
        sb.append("/");
        sb.append(n);
        hashMap.put((Object)"X-Firebase-RC-Fetch-Type", (Object)sb.toString());
        return this.e.b().e(this.c, (a)new L3.g((Object)this, 8, (Object)hashMap));
    }
    
    public final HashMap d() {
        final HashMap hashMap = new HashMap();
        final b3.b b = (b3.b)this.b.get();
        if (b == null) {
            return hashMap;
        }
        for (final Map$Entry map$Entry : ((e0)((b3.c)b).a.D).e((String)null, (String)null, false).entrySet()) {
            hashMap.put((Object)map$Entry.getKey(), (Object)map$Entry.getValue().toString());
        }
        return hashMap;
    }
}
