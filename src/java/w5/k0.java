package w5;

import a.a;
import m5.p;
import e5.b;
import e5.j;
import e5.i;
import e5.h;
import e5.g;

public final class k0 implements g, h
{
    public static final k0 C;
    
    static {
        C = (k0)new Object();
    }
    
    public final i c(i i) {
        n5.h.e("context", (Object)i);
        if (i == j.C) {
            i = (i)this;
        }
        else {
            i = (i)i.f((Object)this, (p)new b(1));
        }
        return i;
    }
    
    public final Object f(final Object o, final p p2) {
        return p2.f(o, (Object)this);
    }
    
    public final h getKey() {
        return (h)this;
    }
    
    public final g i(final h h) {
        return a.h((g)this, h);
    }
    
    public final i l(final h h) {
        return a.m((g)this, h);
    }
}
