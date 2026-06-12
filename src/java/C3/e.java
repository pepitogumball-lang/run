package C3;

import java.util.concurrent.Callable;
import n3.u0;
import K.l;
import O2.t;
import java.util.concurrent.Executor;
import java.util.Set;
import E3.b;
import android.content.Context;

public final class e implements g, h
{
    public final c a;
    public final Context b;
    public final b c;
    public final Set d;
    public final Executor e;
    
    public e(final Context b, final String s, final Set d, final b c, final Executor e) {
        final c a = new c(b, 0, s);
        this.a = a;
        this.d = d;
        this.e = e;
        this.c = c;
        this.b = b;
    }
    
    public final t a() {
        if (!l.a(this.b)) {
            return u0.m((Object)"");
        }
        return u0.f(this.e, (Callable)new d(this, 0));
    }
    
    public final void b() {
        if (this.d.size() <= 0) {
            u0.m((Object)null);
            return;
        }
        if (!l.a(this.b)) {
            u0.m((Object)null);
            return;
        }
        u0.f(this.e, (Callable)new d(this, 1));
    }
}
