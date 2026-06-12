package t;

public final class e implements Cloneable
{
    public static final Object G;
    public boolean C;
    public long[] D;
    public Object[] E;
    public int F;
    
    static {
        G = new Object();
    }
    
    public e() {
        this.C = false;
        int n = 4;
        int n2;
        while (true) {
            n2 = 80;
            if (n >= 32) {
                break;
            }
            n2 = (1 << n) - 12;
            if (80 <= n2) {
                break;
            }
            ++n;
        }
        final int n3 = n2 / 8;
        this.D = new long[n3];
        this.E = new Object[n3];
    }
    
    public final void a() {
        final int f = this.F;
        final long[] d = this.D;
        final Object[] e = this.E;
        int i = 0;
        int f2 = 0;
        while (i < f) {
            final Object o = e[i];
            int n = f2;
            if (o != t.e.G) {
                if (i != f2) {
                    d[f2] = d[i];
                    e[f2] = o;
                    e[i] = null;
                }
                n = f2 + 1;
            }
            ++i;
            f2 = n;
        }
        this.C = false;
        this.F = f2;
    }
    
    public final void b(final long n, final Object o) {
        final int b = d.b(this.D, this.F, n);
        if (b >= 0) {
            this.E[b] = o;
        }
        else {
            final int n2 = ~b;
            final int f = this.F;
            if (n2 < f) {
                final Object[] e = this.E;
                if (e[n2] == t.e.G) {
                    this.D[n2] = n;
                    e[n2] = o;
                    return;
                }
            }
            int n3 = n2;
            if (this.C) {
                n3 = n2;
                if (f >= this.D.length) {
                    this.a();
                    n3 = ~d.b(this.D, this.F, n);
                }
            }
            final int f2 = this.F;
            if (f2 >= this.D.length) {
                final int n4 = (f2 + 1) * 8;
                int n5 = 4;
                int n6;
                while (true) {
                    n6 = n4;
                    if (n5 >= 32) {
                        break;
                    }
                    n6 = (1 << n5) - 12;
                    if (n4 <= n6) {
                        break;
                    }
                    ++n5;
                }
                final int n7 = n6 / 8;
                final long[] d = new long[n7];
                final Object[] e2 = new Object[n7];
                final long[] d2 = this.D;
                System.arraycopy((Object)d2, 0, (Object)d, 0, d2.length);
                final Object[] e3 = this.E;
                System.arraycopy((Object)e3, 0, (Object)e2, 0, e3.length);
                this.D = d;
                this.E = e2;
            }
            final int n8 = this.F - n3;
            if (n8 != 0) {
                final long[] d3 = this.D;
                final int n9 = n3 + 1;
                System.arraycopy((Object)d3, n3, (Object)d3, n9, n8);
                final Object[] e4 = this.E;
                System.arraycopy((Object)e4, n3, (Object)e4, n9, this.F - n3);
            }
            this.D[n3] = n;
            this.E[n3] = o;
            ++this.F;
        }
    }
    
    public final Object clone() {
        try {
            final e e = (e)super.clone();
            e.D = this.D.clone();
            e.E = this.E.clone();
            return e;
        }
        catch (final CloneNotSupportedException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final String toString() {
        if (this.C) {
            this.a();
        }
        if (this.F <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.F * 28);
        sb.append('{');
        for (int i = 0; i < this.F; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.C) {
                this.a();
            }
            sb.append(this.D[i]);
            sb.append('=');
            if (this.C) {
                this.a();
            }
            final Object o = this.E[i];
            if (o != this) {
                sb.append(o);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
