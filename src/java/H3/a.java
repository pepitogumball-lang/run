package h3;

import c4.f;
import android.util.Log;
import n3.l0;
import Z4.B;
import java.util.concurrent.atomic.AtomicReference;
import e3.m;

public final class a
{
    public static final c c;
    public final m a;
    public final AtomicReference b;
    
    static {
        c = (c)new Object();
    }
    
    public a(final m a) {
        this.b = new AtomicReference((Object)null);
        (this.a = a).a((E3.a)new B((Object)this, 29));
    }
    
    public final c a(final String s) {
        final a a = (a)this.b.get();
        c c;
        if (a == null) {
            c = h3.a.c;
        }
        else {
            c = a.a(s);
        }
        return c;
    }
    
    public final boolean b() {
        final a a = (a)this.b.get();
        return a != null && a.b();
    }
    
    public final boolean c(final String s) {
        final a a = (a)this.b.get();
        return a != null && a.c(s);
    }
    
    public final void d(final String s, final long n, final l0 l0) {
        final String f = m0.a.f("Deferring native open session: ", s);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", f, (Throwable)null);
        }
        this.a.a((E3.a)new f((Object)s, n, (Object)l0));
    }
}
