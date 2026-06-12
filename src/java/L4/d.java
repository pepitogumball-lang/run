package L4;

import E4.b;
import android.content.Context;
import java.util.HashMap;
import B4.c;

public class d implements c, j, i
{
    public static final HashMap E;
    public Context C;
    public boolean D;
    
    static {
        E = new HashMap();
    }
    
    public d() {
        this.D = false;
    }
    
    public static l c(final X2.i i) {
        final String a = i.a;
        String e = i.e;
        if (e == null) {
            e = null;
        }
        String g = i.g;
        if (g == null) {
            g = null;
        }
        final Object o = new Object();
        if (a == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        ((l)o).a = a;
        final String b = i.b;
        if (b == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        ((l)o).b = b;
        if (e == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        ((l)o).c = e;
        if (g != null) {
            ((l)o).d = g;
            ((l)o).e = null;
            ((l)o).f = i.c;
            ((l)o).g = i.f;
            ((l)o).h = null;
            ((l)o).i = i.d;
            ((l)o).j = null;
            ((l)o).k = null;
            ((l)o).l = null;
            ((l)o).m = null;
            ((l)o).n = null;
            return (l)o;
        }
        throw new IllegalStateException("Nonnull field \"projectId\" is null.");
    }
    
    public static void d(final O2.j j, final n n) {
        j.a.k((O2.d)new b((Object)n, 5));
    }
    
    public final void onAttachedToEngine(final B4.b b) {
        j.a(b.c, this);
        i.b(b.c, this);
        this.C = b.a;
    }
    
    public final void onDetachedFromEngine(final B4.b b) {
        this.C = null;
        j.a(b.c, null);
        i.b(b.c, null);
    }
}
