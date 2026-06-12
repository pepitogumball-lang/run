package P3;

import java.util.concurrent.Executor;
import G.l;
import java.util.concurrent.Executors;
import X2.f;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import android.content.SharedPreferences;
import R3.a;

public final class v
{
    public static final a c;
    public static v d;
    public volatile SharedPreferences a;
    public final ExecutorService b;
    
    static {
        c = a.d();
    }
    
    public v(final ExecutorService b) {
        this.b = b;
    }
    
    public static Context a() {
        try {
            f.e();
            final f e = f.e();
            e.a();
            return e.a;
        }
        catch (final IllegalStateException ex) {
            return null;
        }
    }
    
    public static v b() {
        final Class<v> clazz;
        monitorenter(clazz = v.class);
        Label_0033: {
            try {
                if (v.d == null) {
                    v.d = new v(Executors.newSingleThreadExecutor());
                }
                break Label_0033;
            }
            finally {
                monitorexit(clazz);
                final v d = v.d;
                monitorexit(clazz);
                return d;
            }
        }
    }
    
    public final void c(final Context context) {
        monitorenter(this);
        Label_0047: {
            try {
                if (this.a == null && context != null) {
                    ((Executor)this.b).execute((Runnable)new l((Object)this, 7, (Object)context));
                }
                break Label_0047;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
    }
    
    public final void d(final String s, final double n) {
        if (this.a == null) {
            this.c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(s, Double.doubleToRawLongBits(n)).apply();
    }
    
    public final void e(final String s, final long n) {
        if (this.a == null) {
            this.c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(s, n).apply();
    }
    
    public final void f(final String s, final String s2) {
        if (this.a == null) {
            this.c(a());
            if (this.a == null) {
                return;
            }
        }
        if (s2 == null) {
            this.a.edit().remove(s).apply();
            return;
        }
        this.a.edit().putString(s, s2).apply();
    }
    
    public final void g(final String s, final boolean b) {
        if (this.a == null) {
            this.c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putBoolean(s, b).apply();
    }
}
