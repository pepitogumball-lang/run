package B5;

import org.json.JSONObject;
import h1.e;
import com.google.android.gms.internal.measurement.L;
import java.util.IllegalFormatException;
import m0.a;
import android.util.Log;
import java.util.Locale;
import android.text.TextUtils;
import java.util.HashMap;
import s3.c;
import c2.k;
import c0.b;
import android.os.Process;
import F1.E0;

public final class w
{
    public final int a;
    public String b = e0.a;
    
    public w(final String b, int myUid) {
        switch (this.a = myUid) {
            default: {
                this.b = b;
                return;
            }
            case 2: {
                myUid = Process.myUid();
                final int myPid = Process.myPid();
                final StringBuilder sb = new StringBuilder("UID: [");
                sb.append(myUid);
                sb.append("]  PID: [");
                sb.append(myPid);
                sb.append("] ");
                this.b = sb.toString().concat(b);
            }
        }
    }
    
    public w(final String b, final b b2) {
        this.a = 6;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
    
    public static void a(final k k, final c c) {
        b(k, "X-CRASHLYTICS-GOOGLE-APP-ID", c.a);
        b(k, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(k, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.3.0");
        b(k, "Accept", "application/json");
        b(k, "X-CRASHLYTICS-DEVICE-MODEL", c.b);
        b(k, "X-CRASHLYTICS-OS-BUILD-VERSION", c.c);
        b(k, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c.d);
        b(k, "X-CRASHLYTICS-INSTALLATION-ID", c.e.c().a);
    }
    
    public static void b(final k k, final String s, final String s2) {
        if (s2 != null) {
            ((HashMap)k.F).put((Object)s, (Object)s2);
        }
    }
    
    public static HashMap c(final c c) {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"build_version", (Object)c.h);
        hashMap.put((Object)"display_version", (Object)c.g);
        hashMap.put((Object)"source", (Object)Integer.toString(c.i));
        final String f = c.f;
        if (!TextUtils.isEmpty((CharSequence)f)) {
            hashMap.put((Object)"instance", (Object)f);
        }
        return hashMap;
    }
    
    public static String g(final String s, final String s2, final Object... array) {
        String s3 = s2;
        if (array.length > 0) {
            try {
                s3 = String.format(Locale.US, s2, array);
            }
            catch (final IllegalFormatException ex) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf((Object)s2)), (Throwable)ex);
                s3 = a.h(s2, " [", TextUtils.join((CharSequence)", ", array), "]");
            }
        }
        return L.j(s, " : ", s3);
    }
    
    public JSONObject d(final e e) {
        final StringBuilder sb = new StringBuilder("Settings response code was: ");
        final int a = e.a;
        sb.append(a);
        final String string = sb.toString();
        final h3.c a2 = h3.c.a;
        a2.f(string);
        final String b = this.b;
        final JSONObject jsonObject = null;
        JSONObject jsonObject2;
        if (a != 200 && a != 201 && a != 202 && a != 203) {
            final StringBuilder sb2 = new StringBuilder("Settings request failed; (status: ");
            sb2.append(a);
            sb2.append(") from ");
            sb2.append(b);
            final String string2 = sb2.toString();
            jsonObject2 = jsonObject;
            if (a2.b(6)) {
                Log.e("FirebaseCrashlytics", string2, (Throwable)null);
                jsonObject2 = jsonObject;
            }
        }
        else {
            final String b2 = e.b;
            try {
                jsonObject2 = new JSONObject(b2);
            }
            catch (final Exception ex) {
                final StringBuilder sb3 = new StringBuilder("Failed to parse settings JSON from ");
                sb3.append(b);
                a2.g(sb3.toString(), ex);
                final StringBuilder sb4 = new StringBuilder("Settings response ");
                sb4.append(b2);
                a2.g(sb4.toString(), (Exception)null);
                jsonObject2 = jsonObject;
            }
        }
        return jsonObject2;
    }
    
    public void e(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", g(this.b, s, array));
        }
    }
    
    public void f(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", g(this.b, s, array));
        }
    }
    
    @Override
    public String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 0: {
                final StringBuilder sb = new StringBuilder("<");
                sb.append(this.b);
                sb.append('>');
                return sb.toString();
            }
        }
    }
}
