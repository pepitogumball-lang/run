package I1;

import com.google.android.gms.internal.ads.gv;
import com.google.android.gms.internal.ads.sd;
import android.os.Handler;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import android.net.Uri;
import com.google.android.gms.internal.ads.z7;
import org.json.JSONException;
import org.json.JSONObject;
import android.text.TextUtils;
import android.net.Uri$Builder;
import C2.b;
import F1.e0;
import com.google.android.gms.internal.ads.bl;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import E1.o;
import java.util.HashMap;
import J1.j;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.cl;

public final class m
{
    public final Object a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public String f;
    public cl g;
    
    public m() {
        this.a = new Object();
        this.b = "";
        this.c = "";
        this.d = false;
        this.e = false;
        this.f = "";
    }
    
    public static void e(final Context context, final String s, final boolean b, final boolean b2) {
        if (!(context instanceof Activity)) {
            j.h("Can not create dialog without Activity Context");
            return;
        }
        ((Handler)M.l).post((Runnable)new l(context, s, b, b2));
    }
    
    public static final String j(Context a, final String s, String s2) {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"User-Agent", (Object)o.B.c.x(a, s2));
        new v(a);
        a = (Context)v.a(0, s, hashMap, null);
        Label_0137: {
            Label_0115: {
                try {
                    s2 = (String)((gv)((sd)a).C).get((long)(int)q.d.c.a(D7.K4), TimeUnit.MILLISECONDS);
                    return s2;
                }
                catch (final Exception ex) {}
                catch (final InterruptedException ex2) {
                    break Label_0115;
                }
                catch (final TimeoutException ex3) {
                    break Label_0137;
                }
                final Exception ex;
                j.g("Error retrieving a response from: ".concat(String.valueOf((Object)s)), (Throwable)ex);
                return null;
            }
            final InterruptedException ex2;
            j.g("Interrupted while retrieving a response from: ".concat(String.valueOf((Object)s)), (Throwable)ex2);
            ((sd)a).cancel(true);
            return null;
        }
        final TimeoutException ex3;
        j.g("Timeout while retrieving a response from: ".concat(String.valueOf((Object)s)), (Throwable)ex3);
        ((sd)a).cancel(true);
        return null;
    }
    
    public final void a(final Context context) {
        if (q.d.c.a(D7.V8)) {
            final cl g = this.g;
            if (g != null) {
                g.d((e0)new k(this, context), bl.F);
            }
        }
    }
    
    public final void b(final Context context, final String s, final String s2) {
        final M c = o.B.c;
        M.q(context, this.k(context, (String)q.d.c.a(D7.G4), s, s2));
    }
    
    public final void c(final Context context, final String s, final String s2, final String s3) {
        final Uri$Builder buildUpon = this.k(context, (String)q.d.c.a(D7.J4), s3, s).buildUpon();
        buildUpon.appendQueryParameter("debugData", s2);
        final M c = o.B.c;
        new y(context, s, buildUpon.build().toString(), null).r();
    }
    
    public final void d(final boolean e) {
        final Object a;
        monitorenter(a = this.a);
        Label_0117: {
            try {
                this.e = e;
                if (!(boolean)q.d.c.a(D7.V8)) {
                    break Label_0117;
                }
                o.B.g.d().r(e);
                final cl g = this.g;
                if (g == null) {
                    break Label_0117;
                }
                Label_0099: {
                    if (!g.u) {
                        if (!e) {
                            break Label_0099;
                        }
                        g.h();
                    }
                    else if (!e) {
                        break Label_0099;
                    }
                    if (!g.s) {
                        g.m();
                        break Label_0117;
                    }
                }
                if (!g.f()) {
                    g.l();
                }
                break Label_0117;
            }
            finally {
                monitorexit(a);
                monitorexit(a);
            }
        }
    }
    
    public final boolean f(final Context context, String s, final String s2) {
        final z7 i4 = D7.I4;
        final q d = q.d;
        final String j = j(context, this.k(context, (String)d.c.a(i4), s, s2).toString(), s2);
        if (TextUtils.isEmpty((CharSequence)j)) {
            J1.j.d("Not linked for debug signals.");
            return false;
        }
        final String trim = j.trim();
        try {
            final boolean equals = "1".equals((Object)new JSONObject(trim).optString("debug_mode"));
            this.d(equals);
            if (d.c.a(D7.V8)) {
                final J d2 = o.B.g.d();
                if (!equals) {
                    s = "";
                }
                d2.q(s);
            }
            return equals;
        }
        catch (final JSONException ex) {
            J1.j.j("Fail to get debug mode response json.", (Throwable)ex);
            return false;
        }
    }
    
    public final boolean g() {
        final Object a = this.a;
        synchronized (a) {
            return this.e;
        }
    }
    
    public final boolean h() {
        final Object a = this.a;
        synchronized (a) {
            return this.d;
        }
    }
    
    public final boolean i(final Context context, final String s, final String s2, final String s3) {
        if (!TextUtils.isEmpty((CharSequence)s2) && this.h()) {
            j.d("Sending troubleshooting signals to the server.");
            this.c(context, s, s2, s3);
            return true;
        }
        return false;
    }
    
    public final Uri k(Context context, String string, final String s, final String s2) {
        final Uri$Builder buildUpon = Uri.parse(string).buildUpon();
        final Object a;
        monitorenter(a = this.a);
        while (true) {
            Label_0165: {
                try {
                    if (TextUtils.isEmpty((CharSequence)this.b)) {
                        final M c = o.B.c;
                        final Context context2 = context;
                        final String s3 = "debug_signals_id.txt";
                        final FileInputStream fileInputStream = context2.openFileInput(s3);
                        final String s4 = new(java.lang.String.class)();
                        string = s4;
                        final ByteArrayOutputStream byteArrayOutputStream = new(java.io.ByteArrayOutputStream.class)();
                        final ByteArrayOutputStream byteArrayOutputStream3;
                        final ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream3 = byteArrayOutputStream;
                        new ByteArrayOutputStream();
                        final Object o = fileInputStream;
                        final Object o2 = byteArrayOutputStream2;
                        final boolean b = true;
                        q2.b.e((InputStream)o, (OutputStream)o2, b);
                        final String s5 = string;
                        final ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream2;
                        final byte[] array = byteArrayOutputStream4.toByteArray();
                        final String s6 = "UTF-8";
                        new String(array, s6);
                        break Label_0099;
                    }
                    break Label_0165;
                }
                finally {
                    final Context context3;
                    context = context3;
                    monitorexit(a);
                    while (true) {
                        final M c2 = o.B.c;
                        string = UUID.randomUUID().toString();
                        this.b = string;
                        try {
                            final FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                            openFileOutput.write(string.getBytes("UTF-8"));
                            openFileOutput.close();
                        }
                        catch (final Exception ex) {
                            j.g("Error writing to file in internal storage.", (Throwable)ex);
                        }
                        final String b2 = this.b;
                        monitorexit(a);
                        buildUpon.appendQueryParameter("linkedDeviceId", b2);
                        buildUpon.appendQueryParameter("adSlotPath", s);
                        buildUpon.appendQueryParameter("afmaVersion", s2);
                        return buildUpon.build();
                        this.b = string;
                        iftrue(Label_0165:)(!TextUtils.isEmpty((CharSequence)string));
                        continue;
                    }
                }
            }
            try {
                final Context context2 = context;
                final String s3 = "debug_signals_id.txt";
                final FileInputStream fileInputStream = context2.openFileInput(s3);
                final String s4 = new(java.lang.String.class)();
                string = s4;
                final ByteArrayOutputStream byteArrayOutputStream = new(java.io.ByteArrayOutputStream.class)();
                final ByteArrayOutputStream byteArrayOutputStream3;
                final ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream3 = byteArrayOutputStream;
                new ByteArrayOutputStream();
                final Object o = fileInputStream;
                final Object o2 = byteArrayOutputStream2;
                final boolean b = true;
                q2.b.e((InputStream)o, (OutputStream)o2, b);
                final String s5 = string;
                final ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream2;
                final byte[] array = byteArrayOutputStream4.toByteArray();
                final String s6 = "UTF-8";
                new String(array, s6);
                continue;
            }
            catch (final IOException ex2) {}
            break;
        }
    }
}
