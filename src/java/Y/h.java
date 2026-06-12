package y;

import x.g;

public final class h extends n
{
    @Override
    public final void a(final d d) {
        final e h = super.h;
        if (!h.c) {
            return;
        }
        if (h.j) {
            return;
        }
        h.d((int)(((e)h.l.get(0)).g * ((g)super.b).p0 + 0.5f));
    }
    
    @Override
    public final void d() {
        final x.e b = super.b;
        final g g = (g)b;
        final int q0 = g.q0;
        final int r0 = g.r0;
        final int t0 = g.t0;
        final e h = super.h;
        if (t0 == 1) {
            if (q0 != -1) {
                h.l.add((Object)b.S.d.h);
                super.b.S.d.h.k.add((Object)h);
                h.f = q0;
            }
            else if (r0 != -1) {
                h.l.add((Object)b.S.d.i);
                super.b.S.d.i.k.add((Object)h);
                h.f = -r0;
            }
            else {
                h.b = true;
                h.l.add((Object)b.S.d.i);
                super.b.S.d.i.k.add((Object)h);
            }
            this.m(super.b.d.h);
            this.m(super.b.d.i);
        }
        else {
            if (q0 != -1) {
                h.l.add((Object)b.S.e.h);
                super.b.S.e.h.k.add((Object)h);
                h.f = q0;
            }
            else if (r0 != -1) {
                h.l.add((Object)b.S.e.i);
                super.b.S.e.i.k.add((Object)h);
                h.f = -r0;
            }
            else {
                h.b = true;
                h.l.add((Object)b.S.e.i);
                super.b.S.e.i.k.add((Object)h);
            }
            this.m(super.b.e.h);
            this.m(super.b.e.i);
        }
    }
    
    @Override
    public final void e() {
        final x.e b = super.b;
        final int t0 = ((g)b).t0;
        final e h = super.h;
        if (t0 == 1) {
            b.X = h.g;
        }
        else {
            b.Y = h.g;
        }
    }
    
    @Override
    public final void f() {
        super.h.c();
    }
    
    @Override
    public final boolean k() {
        return false;
    }
    
    public final void m(final e e) {
        final e h = super.h;
        h.k.add((Object)e);
        e.l.add((Object)h);
    }
}
