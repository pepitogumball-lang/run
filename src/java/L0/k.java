package L0;

import g5.c;
import android.content.Context;
import y5.o;
import f5.a;
import e5.d;
import android.app.Activity;
import m5.p;
import g5.h;

public final class k extends h implements p
{
    public int G;
    public Object H;
    public final b I;
    public final Activity J;
    
    public k(final b i, final Activity j, final d d) {
        this.I = i;
        this.J = j;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((k)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object h) {
        final k k = new k(this.I, this.J, d);
        k.H = h;
        return (d)k;
    }
    
    public final Object l(final Object o) {
        final a c = a.C;
        final int g = this.G;
        if (g != 0) {
            if (g != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(o);
        }
        else {
            com.google.android.gms.internal.auth.h.z(o);
            final o o2 = (o)this.H;
            final i i = new i(o2, 0);
            final b j = this.I;
            ((M0.a)j.D).a((Context)this.J, new p.a(1), i);
            final j k = new j(j, 0, i);
            this.G = 1;
            if (y5.i.b(o2, k, (c)this) == c) {
                return c;
            }
        }
        return c5.h.a;
    }
}
