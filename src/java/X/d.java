package x;

import java.util.Iterator;
import y.g;
import y.m;
import java.util.ArrayList;
import v.f;
import java.util.HashSet;

public final class d
{
    public HashSet a;
    public int b;
    public boolean c;
    public final e d;
    public final int e;
    public d f;
    public int g;
    public int h;
    public f i;
    
    public d(final e d, final int e) {
        this.a = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final d f, final int g, final int h) {
        if (f == null) {
            this.g();
            return;
        }
        this.f = f;
        if (f.a == null) {
            f.a = new HashSet();
        }
        final HashSet a = this.f.a;
        if (a != null) {
            a.add((Object)this);
        }
        this.g = g;
        this.h = h;
    }
    
    public final void b(final int n, final ArrayList list, final m m) {
        final HashSet a = this.a;
        if (a != null) {
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                y.g.b(((d)iterator.next()).d, n, list, m);
            }
        }
    }
    
    public final int c() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }
    
    public final int d() {
        if (this.d.f0 == 8) {
            return 0;
        }
        final int h = this.h;
        if (h != Integer.MIN_VALUE) {
            final d f = this.f;
            if (f != null && f.d.f0 == 8) {
                return h;
            }
        }
        return this.g;
    }
    
    public final boolean e() {
        final HashSet a = this.a;
        if (a == null) {
            return false;
        }
        for (final d d : a) {
            final int e = d.e;
            final int d2 = v.e.d(e);
            final e d3 = d.d;
            d d4 = null;
            switch (d2) {
                default: {
                    throw new AssertionError((Object)x.a.c(e));
                }
                case 4: {
                    d4 = d3.I;
                    break;
                }
                case 3: {
                    d4 = d3.H;
                    break;
                }
                case 2: {
                    d4 = d3.K;
                    break;
                }
                case 1: {
                    d4 = d3.J;
                    break;
                }
                case 0:
                case 5:
                case 6:
                case 7:
                case 8: {
                    d4 = null;
                    break;
                }
            }
            if (d4.f()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean f() {
        return this.f != null;
    }
    
    public final void g() {
        final d f = this.f;
        if (f != null) {
            final HashSet a = f.a;
            if (a != null) {
                a.remove((Object)this);
                if (this.f.a.size() == 0) {
                    this.f.a = null;
                }
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }
    
    public final void h() {
        final f i = this.i;
        if (i == null) {
            this.i = new f(1);
        }
        else {
            i.c();
        }
    }
    
    public final void i(final int b) {
        this.b = b;
        this.c = true;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.d.g0);
        sb.append(":");
        sb.append(x.a.c(this.e));
        return sb.toString();
    }
}
