package o;

import java.net.URLConnection;
import java.util.Set;
import C2.G;
import android.os.Handler;
import C2.I;
import C2.H;
import C2.a;
import android.app.Application;
import java.util.Iterator;
import O2.j;
import java.util.HashMap;
import java.io.IOException;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.android.gms.internal.measurement.L;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import b4.f;
import b4.h;
import F4.r;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import c4.n;
import java.util.LinkedHashSet;
import c4.i;
import java.net.HttpURLConnection;
import m3.g;
import java.util.concurrent.atomic.AtomicMarkableReference;
import h1.w;
import q3.c;
import androidx.lifecycle.o;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashSet;
import androidx.lifecycle.v;
import io.flutter.embedding.android.FlutterActivity;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.Rect;
import android.view.WindowManager$LayoutParams;
import android.content.Context;
import w2.e;
import C2.c0;
import C2.V;
import C4.b;
import C2.W;

public final class q1 implements W, b
{
    public final Object C;
    public final Object D;
    public Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    
    public q1(final C2.b c, final V d, final V e, final V f, final c0 g, final e h, final V i) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public q1(final Context c) {
        final WindowManager$LayoutParams f = new WindowManager$LayoutParams();
        this.F = f;
        this.G = new Rect();
        this.H = new int[2];
        this.I = new int[2];
        this.C = c;
        final View inflate = LayoutInflater.from(c).inflate(2131427355, (ViewGroup)null);
        this.D = inflate;
        this.E = inflate.findViewById(2131230944);
        f.setTitle((CharSequence)q1.class.getSimpleName());
        f.packageName = c.getPackageName();
        f.type = 1002;
        f.width = -2;
        f.height = -2;
        f.format = -3;
        f.windowAnimations = 2131755012;
        f.flags = 24;
    }
    
    public q1(final FlutterActivity c, final v v) {
        this.E = new HashSet();
        this.F = new HashSet();
        this.G = new HashSet();
        this.H = new HashSet();
        new HashSet();
        this.I = new HashSet();
        this.C = c;
        this.D = new HiddenLifecycleReference((o)v);
    }
    
    public q1(final String e, final c c, final l3.c d) {
        this.F = new K2.c0(this, false);
        this.G = new K2.c0(this, true);
        this.H = new w(13, (byte)0);
        this.I = new AtomicMarkableReference((Object)null, false);
        this.E = e;
        this.C = new g(c);
        this.D = d;
    }
    
    public q1(final HttpURLConnection d, final i e, final c4.c f, final LinkedHashSet c, final n g, final ScheduledExecutorService h) {
        this.D = d;
        this.E = e;
        this.F = f;
        this.C = c;
        this.G = g;
        this.H = h;
        this.I = new Random();
    }
    
    public void b(final r r) {
        ((HashSet)this.F).add((Object)r);
    }
    
    public void c(long n, final int n2) {
        if (n2 == 0) {
            this.g((f)new h("Unable to fetch the latest version of the template."));
            return;
        }
        final int nextInt = ((Random)this.I).nextInt(4);
        final c4.b b = new c4.b((Object)this, n2, n, 0);
        n = nextInt;
        ((ScheduledExecutorService)this.H).schedule((Runnable)b, n, TimeUnit.SECONDS);
    }
    
    public void d(final InputStream inputStream) {
        final BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(inputStream, "utf-8"));
        String s = "";
        while (true) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            final String s2 = s = L.i(s, line);
            if (!line.contains((CharSequence)"}")) {
                continue;
            }
            final int index = s2.indexOf(123);
            final int lastIndex = s2.lastIndexOf(125);
            final String s3 = s = "";
            if (index >= 0) {
                if (lastIndex < 0) {
                    s = s3;
                }
                else if (index >= lastIndex) {
                    s = s3;
                }
                else {
                    s = s2.substring(index, lastIndex + 1);
                }
            }
            if (s.isEmpty()) {
                continue;
            }
            Label_0329: {
                Label_0298: {
                    JSONObject jsonObject;
                    try {
                        jsonObject = new JSONObject(s);
                        if (jsonObject.has("featureDisabled") && jsonObject.getBoolean("featureDisabled")) {
                            ((n)this.G).a((f)new h("The server is temporarily unavailable. Try again in a few minutes."));
                            break;
                        }
                    }
                    catch (final JSONException ex) {
                        break Label_0298;
                    }
                    synchronized (this) {
                        final boolean empty = ((Set)this.C).isEmpty();
                        monitorexit(this);
                        if (empty) {
                            break;
                        }
                        if (!jsonObject.has("latestTemplateVersionNumber")) {
                            break Label_0329;
                        }
                        final long long1 = ((i)this.E).g.a.getLong("last_template_version", 0L);
                        final long long2 = jsonObject.getLong("latestTemplateVersionNumber");
                        if (long2 > long1) {
                            this.c(long2, 3);
                        }
                        break Label_0329;
                    }
                }
                final JSONException ex;
                this.g((f)new X2.h("Unable to parse config update message.", ((Throwable)ex).getCause()));
                Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", (Throwable)ex);
            }
            s = "";
        }
        bufferedReader.close();
        inputStream.close();
    }
    
    public void e() {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)this.D;
        if (httpURLConnection == null) {
            return;
        }
        while (true) {
            try {
                try {
                    final InputStream inputStream = ((URLConnection)httpURLConnection).getInputStream();
                    this.d(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                }
                finally {}
            }
            catch (final IOException ex) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", (Throwable)ex);
                continue;
            }
            break;
        }
        return;
        httpURLConnection.disconnect();
    }
    
    public boolean f(final int[] array, final int n) {
        final Iterator iterator = ((HashSet)this.E).iterator();
        boolean b = false;
    Label_0012:
        while (true) {
            b = false;
            while (iterator.hasNext()) {
                final O4.f f = (O4.f)iterator.next();
                Label_0132: {
                    if (f.b && n == 240) {
                        final L3.g a = f.a;
                        if (a != null) {
                            f.b = false;
                            int n2;
                            if (array.length > 0 && array[0] == 0) {
                                n2 = 1;
                            }
                            else {
                                n2 = 0;
                            }
                            final HashMap hashMap = (HashMap)a.D;
                            hashMap.put((Object)"authorizationStatus", (Object)n2);
                            ((j)a.E).b((Object)hashMap);
                            break Label_0132;
                        }
                    }
                    if (!b) {
                        continue Label_0012;
                    }
                }
                b = true;
            }
            break;
        }
        return b;
    }
    
    public void g(final f f) {
        monitorenter(this);
        Label_0048: {
            try {
                final Iterator iterator = ((Set)this.C).iterator();
                while (iterator.hasNext()) {
                    ((b4.b)iterator.next()).a(f);
                }
                break Label_0048;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
    }
    
    public void h(final r r) {
        ((HashSet)this.F).remove((Object)r);
    }
    
    public C2.c i() {
        final Application application = (Application)((C2.b)this.C).D;
        final a a = (a)((V)this.D).a();
        final Handler a2 = C2.H.a;
        C2.I.c((Object)a2);
        final G b = C2.H.b;
        C2.I.c((Object)b);
        return new C2.c((Object)application, (Object)a2, (Object)b, (Object)((V)this.E).a(), (Object)((V)this.F).a(), (Object)((c0)this.G).b(), (Object)((e)this.H).Q(), (Object)((V)this.I).a());
    }
}
