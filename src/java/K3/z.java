package k3;

import h3.c;
import java.util.Objects;
import n3.u0;
import java.util.concurrent.TimeUnit;
import F3.d;
import F3.a;
import android.os.Looper;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import android.content.SharedPreferences;
import F3.e;
import android.content.Context;
import B5.w;
import java.util.regex.Pattern;

public final class z
{
    public static final Pattern g;
    public static final String h;
    public final w a;
    public final Context b;
    public final String c;
    public final e d;
    public final v e;
    public b f;
    
    static {
        g = Pattern.compile("[^\\p{Alnum}]");
        h = Pattern.quote("/");
    }
    
    public z(final Context b, final String c, final e d, final v e) {
        if (b == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (c != null) {
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.a = new w(5);
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }
    
    public final String a(final SharedPreferences sharedPreferences, final String s) {
        synchronized (this) {
            final String lowerCase = z.g.matcher((CharSequence)UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
            final StringBuilder sb = new StringBuilder("Created new Crashlytics installation ID: ");
            sb.append(lowerCase);
            sb.append(" for FID: ");
            sb.append(s);
            final String string = sb.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", string, (Throwable)null);
            }
            sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", s).apply();
            return lowerCase;
        }
    }
    
    public final y b(final boolean b) {
        final boolean currentThread = Looper.getMainLooper().isCurrentThread();
        String s = null;
        if (currentThread) {
            final StringBuilder sb = new StringBuilder("Must not be called on a main thread, was called on ");
            sb.append(Thread.currentThread().getName());
            sb.append('.');
            final String string = sb.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string, (Throwable)null);
            }
        }
        final e d = this.d;
        String a = null;
        Label_0113: {
            if (b) {
                try {
                    a = ((a)u0.d(((d)d).d(), 10000L, TimeUnit.MILLISECONDS)).a;
                    break Label_0113;
                }
                catch (final Exception ex) {
                    Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", (Throwable)ex);
                }
            }
            a = null;
            try {
                s = (String)u0.d(((d)d).c(), 10000L, TimeUnit.MILLISECONDS);
            }
            catch (final Exception ex2) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", (Throwable)ex2);
            }
        }
        return new y(s, a);
    }
    
    public final b c() {
        monitorenter(this);
        Label_0048: {
            try {
                final b f = this.f;
                if (f != null && (f.b != null || !this.e.f())) {
                    final b f2 = this.f;
                    monitorexit(this);
                    return f2;
                }
                break Label_0048;
            }
            finally {
                monitorexit(this);
                Label_0255: {
                    final SharedPreferences sharedPreferences;
                    final y y;
                    this.f = new b(this.a(sharedPreferences, y.a), y.a, y.b);
                }
            Label_0200_Outer:
                while (true) {
                    break Label_0382;
                    String string2 = null;
                    Label_0198:
                    String string = string2;
                    SharedPreferences sharedPreferences = null;
                    y y = null;
                    Block_10: {
                    Block_7_Outer:
                        while (true) {
                            break Label_0200;
                            Label_0291:
                            iftrue(Label_0334:)(string2 == null || !string2.startsWith("SYN_"));
                        Block_8:
                            while (true) {
                                Block_12: {
                                    break Block_12;
                                    final y b = this.b(false);
                                    final StringBuilder sb = new StringBuilder("Fetched Firebase Installation ID: ");
                                    sb.append(b.a);
                                    final c a;
                                    a.f(sb.toString());
                                    y = b;
                                    iftrue(Label_0208:)(b.a != null);
                                    break Block_8;
                                }
                                this.f = new b(sharedPreferences.getString("crashlytics.installation.id", (String)null), null, null);
                                break Label_0382;
                                y = new y(string, null);
                                Label_0208:
                                iftrue(Label_0255:)(!Objects.equals((Object)y.a, (Object)string2));
                                break Block_10;
                                final StringBuilder sb2 = new StringBuilder("Install IDs: ");
                                sb2.append((Object)this.f);
                                final c a;
                                a.f(sb2.toString());
                                final b f3 = this.f;
                                monitorexit(this);
                                return f3;
                                a = h3.c.a;
                                a.f("Determining Crashlytics installation ID...");
                                sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
                                string2 = sharedPreferences.getString("firebase.installation.id", (String)null);
                                final StringBuilder sb3 = new StringBuilder("Cached Firebase Installation ID: ");
                                sb3.append(string2);
                                a.f(sb3.toString());
                                iftrue(Label_0291:)(!this.e.f());
                                continue;
                            }
                            iftrue(Label_0198:)(string2 != null);
                            Block_9: {
                                break Block_9;
                                Label_0334:
                                final StringBuilder sb4 = new StringBuilder("SYN_");
                                sb4.append(UUID.randomUUID().toString());
                                this.f = new b(this.a(sharedPreferences, sb4.toString()), null, null);
                                continue Label_0200_Outer;
                            }
                            final StringBuilder sb5 = new StringBuilder("SYN_");
                            sb5.append(UUID.randomUUID().toString());
                            string = sb5.toString();
                            continue Block_7_Outer;
                        }
                    }
                    this.f = new b(sharedPreferences.getString("crashlytics.installation.id", (String)null), y.a, y.b);
                    continue Label_0200_Outer;
                }
            }
        }
    }
    
    public final String d() {
        final w a = this.a;
        final Context b = this.b;
        final w w;
        monitorenter(w = a);
        Label_0055: {
            try {
                if (a.b == null) {
                    String installerPackageName;
                    if ((installerPackageName = b.getPackageManager().getInstallerPackageName(b.getPackageName())) == null) {
                        installerPackageName = "";
                    }
                    a.b = installerPackageName;
                }
                break Label_0055;
            }
            finally {
                monitorexit(w);
                String b2 = null;
                Label_0077: {
                    while (true) {
                        b2 = null;
                        break Label_0077;
                        iftrue(Label_0072:)(!"".equals((Object)a.b));
                        continue;
                    }
                    Label_0072: {
                        b2 = a.b;
                    }
                }
                monitorexit(w);
                return b2;
            }
        }
    }
}
