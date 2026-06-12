package K2;

import android.os.BaseBundle;
import android.content.pm.ApplicationInfo;
import s2.b;
import android.content.pm.PackageManager$NameNotFoundException;
import java.lang.reflect.InvocationTargetException;
import android.os.Bundle;
import h2.A;
import android.text.TextUtils;
import C.u;

public final class d extends u
{
    public Boolean D;
    public String E;
    public e F;
    public Boolean G;
    
    public final int A(String c, final F f) {
        if (TextUtils.isEmpty((CharSequence)c)) {
            return (int)f.a(null);
        }
        c = this.F.c(c, f.a);
        if (TextUtils.isEmpty((CharSequence)c)) {
            return (int)f.a(null);
        }
        try {
            return (int)f.a(Integer.parseInt(c));
        }
        catch (final NumberFormatException ex) {
            return (int)f.a(null);
        }
    }
    
    public final long B(String c, final F f) {
        if (TextUtils.isEmpty((CharSequence)c)) {
            return (long)f.a(null);
        }
        c = this.F.c(c, f.a);
        if (TextUtils.isEmpty((CharSequence)c)) {
            return (long)f.a(null);
        }
        try {
            return (long)f.a(Long.parseLong(c));
        }
        catch (final NumberFormatException ex) {
            return (long)f.a(null);
        }
    }
    
    public final B0 C(final String s, final boolean b) {
        A.e(s);
        final Bundle z = this.z();
        Object value;
        if (z == null) {
            this.j().H.f("Failed to load metadata: Metadata bundle is null");
            value = null;
        }
        else {
            value = ((BaseBundle)z).get(s);
        }
        final B0 d = B0.D;
        if (value == null) {
            return d;
        }
        if (Boolean.TRUE.equals(value)) {
            return B0.G;
        }
        if (Boolean.FALSE.equals(value)) {
            return B0.F;
        }
        if (b && "eu_consent_policy".equals(value)) {
            return B0.E;
        }
        this.j().K.g("Invalid manifest metadata for", s);
        return d;
    }
    
    public final String D(final String s, final F f) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return (String)f.a(null);
        }
        return (String)f.a(this.F.c(s, f.a));
    }
    
    public final Boolean E(final String s) {
        A.e(s);
        final Bundle z = this.z();
        if (z == null) {
            this.j().H.f("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!((BaseBundle)z).containsKey(s)) {
            return null;
        }
        return ((BaseBundle)z).getBoolean(s);
    }
    
    public final boolean F(final String s, final F f) {
        return this.G(s, f);
    }
    
    public final boolean G(String c, final F f) {
        if (TextUtils.isEmpty((CharSequence)c)) {
            return (boolean)f.a(null);
        }
        c = this.F.c(c, f.a);
        if (TextUtils.isEmpty((CharSequence)c)) {
            return (boolean)f.a(null);
        }
        return (boolean)f.a("1".equals((Object)c));
    }
    
    public final boolean H(final String s) {
        return "1".equals((Object)this.F.c(s, "measurement.event_sampling_enabled"));
    }
    
    public final boolean I() {
        final Boolean e = this.E("google_analytics_automatic_screen_reporting_enabled");
        return e == null || e;
    }
    
    public final boolean J() {
        if (this.D == null && (this.D = this.E("app_measurement_lite")) == null) {
            this.D = Boolean.FALSE;
        }
        return this.D || !((n0)super.C).G;
    }
    
    public final double w(String c, final F f) {
        if (TextUtils.isEmpty((CharSequence)c)) {
            return (double)f.a(null);
        }
        c = this.F.c(c, f.a);
        if (TextUtils.isEmpty((CharSequence)c)) {
            return (double)f.a(null);
        }
        try {
            return (double)f.a(Double.parseDouble(c));
        }
        catch (final NumberFormatException ex) {
            return (double)f.a(null);
        }
    }
    
    public final String x(String s) {
        Label_0115: {
            Label_0099: {
                Label_0083: {
                    try {
                        s = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke((Object)null, new Object[] { s, "" });
                        A.h((Object)s);
                        return s;
                    }
                    catch (final InvocationTargetException ex) {}
                    catch (final IllegalAccessException ex2) {
                        break Label_0083;
                    }
                    catch (final NoSuchMethodException ex3) {
                        break Label_0099;
                    }
                    catch (final ClassNotFoundException ex4) {
                        break Label_0115;
                    }
                    final InvocationTargetException ex;
                    this.j().H.g("SystemProperties.get() threw an exception", ex);
                    return "";
                }
                final IllegalAccessException ex2;
                this.j().H.g("Could not access SystemProperties.get()", ex2);
                return "";
            }
            final NoSuchMethodException ex3;
            this.j().H.g("Could not find SystemProperties.get() method", ex3);
            return "";
        }
        final ClassNotFoundException ex4;
        this.j().H.g("Could not find SystemProperties class", ex4);
        return "";
    }
    
    public final boolean y(final F f) {
        return this.G(null, f);
    }
    
    public final Bundle z() {
        final n0 n0 = (n0)super.C;
        Label_0083: {
            try {
                if (n0.C.getPackageManager() == null) {
                    this.j().H.f("Failed to load metadata: PackageManager is null");
                    return null;
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                break Label_0083;
            }
            final ApplicationInfo a = b.a(n0.C).a(128, n0.C.getPackageName());
            if (a == null) {
                this.j().H.f("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return a.metaData;
        }
        final PackageManager$NameNotFoundException ex;
        this.j().H.g("Failed to load metadata: Package name not found", ex);
        return null;
    }
}
