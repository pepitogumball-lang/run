package y;

import com.google.android.gms.internal.measurement.L;
import x.a;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import x.h;
import x.e;
import x.f;
import v.c;
import java.util.ArrayList;

public final class m
{
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;
    
    public final void a(final ArrayList list) {
        final int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < list.size(); ++i) {
                final m m = (m)list.get(i);
                if (this.e == m.b) {
                    this.c(this.c, m);
                }
            }
        }
        if (size == 0) {
            list.remove((Object)this);
        }
    }
    
    public final int b(final c c, int n) {
        final ArrayList a = this.a;
        final int size = a.size();
        final int n2 = 0;
        if (size == 0) {
            return 0;
        }
        final f f = (f)((e)a.get(0)).S;
        c.t();
        f.b(c, false);
        for (int i = 0; i < a.size(); ++i) {
            ((e)a.get(i)).b(c, false);
        }
        if (n == 0 && f.y0 > 0) {
            h.a(f, c, a, 0);
        }
        if (n == 1 && f.z0 > 0) {
            h.a(f, c, a, 1);
        }
        try {
            c.p();
        }
        catch (final Exception ex) {
            ((Throwable)ex).printStackTrace();
        }
        this.d = new ArrayList();
        for (int j = n2; j < a.size(); ++j) {
            final e e = (e)a.get(j);
            final c0.f f2 = new c0.f(24);
            new WeakReference((Object)e);
            c.n((Object)e.H);
            c.n((Object)e.I);
            c.n((Object)e.J);
            c.n((Object)e.K);
            c.n((Object)e.L);
            this.d.add((Object)f2);
        }
        int n3;
        if (n == 0) {
            n = c.n((Object)f.H);
            n3 = c.n((Object)f.J);
            c.t();
        }
        else {
            n = c.n((Object)f.I);
            n3 = c.n((Object)f.K);
            c.t();
        }
        return n3 - n;
    }
    
    public final void c(final int n, final m m) {
        for (final e e : this.a) {
            final ArrayList a = m.a;
            if (!a.contains((Object)e)) {
                a.add((Object)e);
            }
            final int b = m.b;
            if (n == 0) {
                e.m0 = b;
            }
            else {
                e.n0 = b;
            }
        }
        this.e = m.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final int c = this.c;
        String s;
        if (c == 0) {
            s = "Horizontal";
        }
        else if (c == 1) {
            s = "Vertical";
        }
        else if (c == 2) {
            s = "Both";
        }
        else {
            s = "Unknown";
        }
        sb.append(s);
        sb.append(" [");
        String s2 = x.a.a(sb, this.b, "] <");
        for (final e e : this.a) {
            final StringBuilder c2 = v.e.c(s2, " ");
            c2.append(e.g0);
            s2 = c2.toString();
        }
        return L.i(s2, " >");
    }
}
