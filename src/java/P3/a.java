package P3;

import android.os.BaseBundle;
import Y3.f;
import Y3.e;
import com.google.firebase.perf.config.RemoteConfigManager;

public final class a
{
    public static final R3.a d;
    public static volatile a e;
    public final RemoteConfigManager a;
    public e b;
    public final v c;
    
    static {
        d = R3.a.d();
    }
    
    public a() {
        this.a = RemoteConfigManager.getInstance();
        this.b = new e();
        this.c = v.b();
    }
    
    public static a e() {
        final Class<a> clazz;
        monitorenter(clazz = a.class);
        Label_0030: {
            try {
                if (a.e == null) {
                    a.e = new a();
                }
                break Label_0030;
            }
            finally {
                monitorexit(clazz);
                final a e = a.e;
                monitorexit(clazz);
                return e;
            }
        }
    }
    
    public static boolean m(final long n) {
        return n >= 0L;
    }
    
    public static boolean n(final String s) {
        if (s.trim().isEmpty()) {
            return false;
        }
        final String[] split = s.split(";");
        for (int length = split.length, i = 0; i < length; ++i) {
            if (split[i].trim().equals((Object)"21.0.3")) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean o(final long n) {
        return n >= 0L;
    }
    
    public static boolean q(final double n) {
        return 0.0 <= n && n <= 1.0;
    }
    
    public final f a(final a.a a) {
        final v c = this.c;
        final String i = a.i();
        f f;
        if (i == null) {
            c.getClass();
            v.c.a("Key is null when getting boolean value on device cache.");
            f = new f();
        }
        else {
            if (c.a == null) {
                c.c(v.a());
                if (c.a == null) {
                    f = new f();
                    return f;
                }
            }
            if (!c.a.contains(i)) {
                f = new f();
            }
            else {
                try {
                    f = new f((Object)c.a.getBoolean(i, false));
                }
                catch (final ClassCastException ex) {
                    v.c.b("Key %s from sharedPreferences has type other than long: %s", i, ((Throwable)ex).getMessage());
                    f = new f();
                }
            }
        }
        return f;
    }
    
    public final f b(final a.a a) {
        final v c = this.c;
        final String i = a.i();
        f f;
        if (i == null) {
            c.getClass();
            v.c.a("Key is null when getting double value on device cache.");
            f = new f();
        }
        else {
            if (c.a == null) {
                c.c(v.a());
                if (c.a == null) {
                    f = new f();
                    return f;
                }
            }
            if (!c.a.contains(i)) {
                f = new f();
            }
            else {
                try {
                    f = new f((Object)Double.longBitsToDouble(c.a.getLong(i, 0L)));
                }
                catch (final ClassCastException ex) {
                    try {
                        f = new f((Object)(double)c.a.getFloat(i, 0.0f));
                    }
                    catch (final ClassCastException ex2) {
                        v.c.b("Key %s from sharedPreferences has type other than double: %s", i, ((Throwable)ex2).getMessage());
                        f = new f();
                    }
                }
            }
        }
        return f;
    }
    
    public final f c(final a.a a) {
        final v c = this.c;
        final String i = a.i();
        f f;
        if (i == null) {
            c.getClass();
            v.c.a("Key is null when getting long value on device cache.");
            f = new f();
        }
        else {
            if (c.a == null) {
                c.c(v.a());
                if (c.a == null) {
                    f = new f();
                    return f;
                }
            }
            if (!c.a.contains(i)) {
                f = new f();
            }
            else {
                try {
                    f = new f((Object)c.a.getLong(i, 0L));
                }
                catch (final ClassCastException ex) {
                    v.c.b("Key %s from sharedPreferences has type other than long: %s", i, ((Throwable)ex).getMessage());
                    f = new f();
                }
            }
        }
        return f;
    }
    
    public final f d(final a.a a) {
        final v c = this.c;
        final String i = a.i();
        f f;
        if (i == null) {
            c.getClass();
            v.c.a("Key is null when getting String value on device cache.");
            f = new f();
        }
        else {
            if (c.a == null) {
                c.c(v.a());
                if (c.a == null) {
                    f = new f();
                    return f;
                }
            }
            if (!c.a.contains(i)) {
                f = new f();
            }
            else {
                try {
                    f = new f((Object)c.a.getString(i, ""));
                }
                catch (final ClassCastException ex) {
                    v.c.b("Key %s from sharedPreferences has type other than String: %s", i, ((Throwable)ex).getMessage());
                    f = new f();
                }
            }
        }
        return f;
    }
    
    public final boolean f() {
        final d f = P3.d.F();
        final f i = this.i(f);
        if (i.b()) {
            return (boolean)i.a();
        }
        final f boolean1 = this.a.getBoolean("fpr_experiment_app_start_ttid");
        if (boolean1.b()) {
            this.c.g("com.google.firebase.perf.ExperimentTTID", (boolean)boolean1.a());
            return (boolean)boolean1.a();
        }
        final f a = this.a(f);
        return a.b() && (boolean)a.a();
    }
    
    public final Boolean g() {
        final Class<b> clazz;
        monitorenter(clazz = b.class);
        Label_0030: {
            try {
                if (P3.b.f == null) {
                    P3.b.f = (b)new Object();
                }
                break Label_0030;
            }
            finally {
                monitorexit(clazz);
                final f i;
                return (Boolean)i.a();
                Label_0057: {
                    return Boolean.FALSE;
                }
                final b f = P3.b.f;
                monitorexit(clazz);
                i = this.i(f);
                iftrue(Label_0057:)(!i.b());
                return (Boolean)i.a();
            }
        }
    }
    
    public final Boolean h() {
        if (this.g()) {
            return Boolean.FALSE;
        }
        final c f = P3.c.F();
        final f a = this.a(f);
        if (a.b()) {
            return (Boolean)a.a();
        }
        final f i = this.i(f);
        if (i.b()) {
            return (Boolean)i.a();
        }
        return null;
    }
    
    public final f i(final a.a a) {
        final e b = this.b;
        final String k = a.k();
        boolean b2 = false;
        Label_0040: {
            if (k != null) {
                if (((BaseBundle)b.a).containsKey(k)) {
                    b2 = true;
                    break Label_0040;
                }
            }
            else {
                b.getClass();
            }
            b2 = false;
        }
        f f;
        if (!b2) {
            f = new f();
        }
        else {
            try {
                final Boolean b3 = (Boolean)((BaseBundle)b.a).get(k);
                if (b3 == null) {
                    f = new f();
                }
                else {
                    f = new f((Object)b3);
                }
            }
            catch (final ClassCastException ex) {
                Y3.e.b.b("Metadata key %s contains type other than boolean: %s", k, ((Throwable)ex).getMessage());
                f = new f();
            }
        }
        return f;
    }
    
    public final f j(final a.a a) {
        final e b = this.b;
        final String k = a.k();
        boolean b2 = false;
        Label_0037: {
            if (k != null) {
                if (((BaseBundle)b.a).containsKey(k)) {
                    b2 = true;
                    break Label_0037;
                }
            }
            else {
                b.getClass();
            }
            b2 = false;
        }
        f f;
        if (!b2) {
            f = new f();
        }
        else {
            final Object value = ((BaseBundle)b.a).get(k);
            if (value == null) {
                f = new f();
            }
            else if (value instanceof Float) {
                f = new f((Object)(double)value);
            }
            else if (value instanceof Double) {
                f = new f((Object)value);
            }
            else {
                Y3.e.b.b("Metadata key %s contains type other than double: %s", k);
                f = new f();
            }
        }
        return f;
    }
    
    public final f k(final a.a a) {
        final e b = this.b;
        final String k = a.k();
        boolean b2 = false;
        Label_0040: {
            if (k != null) {
                if (((BaseBundle)b.a).containsKey(k)) {
                    b2 = true;
                    break Label_0040;
                }
            }
            else {
                b.getClass();
            }
            b2 = false;
        }
        f f;
        if (!b2) {
            f = new f();
        }
        else {
            try {
                final Integer n = (Integer)((BaseBundle)b.a).get(k);
                if (n == null) {
                    f = new f();
                }
                else {
                    f = new f((Object)n);
                }
            }
            catch (final ClassCastException ex) {
                Y3.e.b.b("Metadata key %s contains type other than int: %s", k, ((Throwable)ex).getMessage());
                f = new f();
            }
        }
        f f2;
        if (f.b()) {
            f2 = new f((Object)(long)(int)f.a());
        }
        else {
            f2 = new f();
        }
        return f2;
    }
    
    public final long l() {
        final Class<j> clazz;
        monitorenter(clazz = j.class);
        Label_0031: {
            try {
                if (j.f == null) {
                    j.f = (j)new Object();
                }
                break Label_0031;
            }
            finally {
                monitorexit(clazz);
                final j f = j.f;
                monitorexit(clazz);
                final RemoteConfigManager a = this.a;
                f.getClass();
                final f long1 = a.getLong("fpr_rl_time_limit_sec");
                iftrue(Label_0108:)(!long1.b() || (long)long1.a() <= 0L);
                Block_6: {
                    break Block_6;
                    final f c;
                    Label_0108: {
                        c = this.c(f);
                    }
                    iftrue(Label_0147:)(!c.b() || (long)c.a() <= 0L);
                    return (long)c.a();
                    Label_0147:
                    return 600L;
                }
                this.c.e("com.google.firebase.perf.TimeLimitSec", (long)long1.a());
                return (long)long1.a();
            }
        }
    }
    
    public final boolean p() {
        final Boolean h = this.h();
        final boolean b = false;
        if (h != null) {
            final boolean b2 = b;
            if (!h) {
                return b2;
            }
        }
        final Class<l> clazz;
        monitorenter(clazz = l.class);
        Label_0060: {
            try {
                if (l.f == null) {
                    l.f = (l)new Object();
                }
                break Label_0060;
            }
            finally {
                monitorexit(clazz);
                final l f = l.f;
                monitorexit(clazz);
                f.getClass();
                final f boolean1 = this.a.getBoolean("fpr_enabled");
                iftrue(Label_0145:)(!boolean1.b());
                boolean b2;
                boolean booleanValue;
                Class<k> clazz2;
                k f2;
                f d;
                boolean b3;
                f string;
                boolean b4 = false;
                RemoteConfigManager a;
                f a2;
                Label_0178:Block_9_Outer:
                while (true) {
                    Label_0343: {
                    Label_0341:
                        while (true) {
                            while (true) {
                                Block_6: {
                                    break Block_6;
                                    booleanValue = false;
                                    break Label_0178;
                                    monitorenter(clazz2 = k.class);
                                    Label_0218: {
                                        try {
                                            if (k.f == null) {
                                                k.f = (k)new Object();
                                            }
                                            break Label_0218;
                                        }
                                        finally {
                                            monitorexit(clazz2);
                                            Label_0289: {
                                                d = this.d(f2);
                                            }
                                            iftrue(Label_0320:)(!d.b());
                                        Block_15_Outer:
                                            while (true) {
                                                while (true) {
                                                    Block_17: {
                                                        Block_16: {
                                                            break Block_16;
                                                            iftrue(Label_0341:)(b3);
                                                            break Block_17;
                                                            this.c.f("com.google.firebase.perf.SdkDisabledVersions", (String)string.a());
                                                            b3 = n((String)string.a());
                                                            continue Block_15_Outer;
                                                        }
                                                        b3 = n((String)d.a());
                                                        continue Block_15_Outer;
                                                    }
                                                    b4 = true;
                                                    break Label_0343;
                                                    f2 = k.f;
                                                    monitorexit(clazz2);
                                                    a = this.a;
                                                    f2.getClass();
                                                    string = a.getString("fpr_disabled_android_versions");
                                                    iftrue(Label_0289:)(!string.b());
                                                    continue;
                                                }
                                                Label_0320:
                                                b3 = n("");
                                                continue Block_15_Outer;
                                            }
                                        }
                                    }
                                    break Label_0341;
                                    b2 = true;
                                    Label_0351: {
                                        return b2;
                                    }
                                    Label_0145:
                                    a2 = this.a(f);
                                    booleanValue = (!a2.b() || (boolean)a2.a());
                                    break Label_0178;
                                }
                                iftrue(Label_0109:)(!this.a.isLastFetchFailed());
                                continue Block_9_Outer;
                            }
                            iftrue(Label_0341:)(!booleanValue);
                            continue;
                        }
                        b4 = false;
                    }
                    b2 = b;
                    iftrue(Label_0351:)(!b4);
                    return true;
                    Label_0109: {
                        this.c.g("com.google.firebase.perf.SdkEnabled", (boolean)boolean1.a());
                    }
                    booleanValue = (boolean)boolean1.a();
                    continue Label_0178;
                }
            }
        }
    }
}
