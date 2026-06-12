package e5;

import m5.p;
import n5.h;
import java.io.Serializable;

public final class c implements i, Serializable
{
    public final i C;
    public final g D;
    
    public c(final i c, final g d) {
        h.e("left", (Object)c);
        h.e("element", (Object)d);
        this.C = c;
        this.D = d;
    }
    
    public final i c(i i) {
        h.e("context", (Object)i);
        if (i == j.C) {
            i = (i)this;
        }
        else {
            i = (i)i.f((Object)this, (p)new b(1));
        }
        return i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            final boolean b = o instanceof c;
            boolean b3;
            final boolean b2 = b3 = false;
            if (!b) {
                return b3;
            }
            final c c = (c)o;
            c.getClass();
            int n = 2;
            c c2 = c;
            int n2 = 2;
            while (true) {
                final i c3 = c2.C;
                if (c3 instanceof c) {
                    c2 = (c)c3;
                }
                else {
                    c2 = null;
                }
                if (c2 == null) {
                    break;
                }
                ++n2;
            }
            c c4 = this;
            while (true) {
                final i c5 = c4.C;
                if (c5 instanceof c) {
                    c4 = (c)c5;
                }
                else {
                    c4 = null;
                }
                if (c4 == null) {
                    break;
                }
                ++n;
            }
            b3 = b2;
            if (n2 != n) {
                return b3;
            }
            c c6 = this;
            boolean a;
            while (true) {
                final g d = c6.D;
                if (!h.a((Object)c.i(d.getKey()), (Object)d)) {
                    a = false;
                    break;
                }
                final i c7 = c6.C;
                if (!(c7 instanceof c)) {
                    h.c("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", (Object)c7);
                    final g g = (g)c7;
                    a = h.a((Object)c.i(g.getKey()), (Object)g);
                    break;
                }
                c6 = (c)c7;
            }
            b3 = b2;
            if (!a) {
                return b3;
            }
        }
        return true;
    }
    
    public final Object f(final Object o, final p p2) {
        return p2.f(this.C.f(o, p2), (Object)this.D);
    }
    
    @Override
    public final int hashCode() {
        return this.D.hashCode() + this.C.hashCode();
    }
    
    public final g i(final e5.h h) {
        h.e("key", (Object)h);
        c c = this;
        while (true) {
            final g i = ((i)c.D).i(h);
            if (i != null) {
                return i;
            }
            final i c2 = c.C;
            if (!(c2 instanceof c)) {
                return c2.i(h);
            }
            c = (c)c2;
        }
    }
    
    public final i l(final e5.h h) {
        h.e("key", (Object)h);
        final g d = this.D;
        final g i = ((i)d).i(h);
        final i c = this.C;
        if (i != null) {
            return c;
        }
        final i l = c.l(h);
        Object o;
        if (l == c) {
            o = this;
        }
        else if (l == j.C) {
            o = d;
        }
        else {
            o = new c(l, d);
        }
        return (i)o;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append((String)this.f("", (p)new b(0)));
        sb.append(']');
        return sb.toString();
    }
}
