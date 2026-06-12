package t;

public final class k implements Cloneable
{
    public static final Object F;
    public int[] C;
    public Object[] D;
    public int E;
    
    static {
        F = new Object();
    }
    
    public k() {
        int n = 4;
        int n2;
        while (true) {
            n2 = 40;
            if (n >= 32) {
                break;
            }
            n2 = (1 << n) - 12;
            if (40 <= n2) {
                break;
            }
            ++n;
        }
        final int n3 = n2 / 4;
        this.C = new int[n3];
        this.D = new Object[n3];
    }
    
    public final void a(final int n, final Object o) {
        final int e = this.E;
        if (e != 0 && n <= this.C[e - 1]) {
            this.d(n, o);
            return;
        }
        if (e >= this.C.length) {
            final int n2 = (e + 1) * 4;
            int n3 = 4;
            int n4;
            while (true) {
                n4 = n2;
                if (n3 >= 32) {
                    break;
                }
                n4 = (1 << n3) - 12;
                if (n2 <= n4) {
                    break;
                }
                ++n3;
            }
            final int n5 = n4 / 4;
            final int[] c = new int[n5];
            final Object[] d = new Object[n5];
            final int[] c2 = this.C;
            System.arraycopy((Object)c2, 0, (Object)c, 0, c2.length);
            final Object[] d2 = this.D;
            System.arraycopy((Object)d2, 0, (Object)d, 0, d2.length);
            this.C = c;
            this.D = d;
        }
        this.C[e] = n;
        this.D[e] = o;
        this.E = e + 1;
    }
    
    public final Object b(int a, final Integer n) {
        a = d.a(this.E, a, this.C);
        if (a >= 0) {
            final Object o = this.D[a];
            if (o != k.F) {
                return o;
            }
        }
        return n;
    }
    
    public final Object clone() {
        try {
            final k k = (k)super.clone();
            k.C = this.C.clone();
            k.D = this.D.clone();
            return k;
        }
        catch (final CloneNotSupportedException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final void d(final int n, final Object o) {
        final int a = d.a(this.E, n, this.C);
        if (a >= 0) {
            this.D[a] = o;
        }
        else {
            final int n2 = ~a;
            final int e = this.E;
            if (n2 < e) {
                final Object[] d = this.D;
                if (d[n2] == k.F) {
                    this.C[n2] = n;
                    d[n2] = o;
                    return;
                }
            }
            if (e >= this.C.length) {
                final int n3 = (e + 1) * 4;
                int n4 = 4;
                int n5;
                while (true) {
                    n5 = n3;
                    if (n4 >= 32) {
                        break;
                    }
                    n5 = (1 << n4) - 12;
                    if (n3 <= n5) {
                        break;
                    }
                    ++n4;
                }
                final int n6 = n5 / 4;
                final int[] c = new int[n6];
                final Object[] d2 = new Object[n6];
                final int[] c2 = this.C;
                System.arraycopy((Object)c2, 0, (Object)c, 0, c2.length);
                final Object[] d3 = this.D;
                System.arraycopy((Object)d3, 0, (Object)d2, 0, d3.length);
                this.C = c;
                this.D = d2;
            }
            final int n7 = this.E - n2;
            if (n7 != 0) {
                final int[] c3 = this.C;
                final int n8 = n2 + 1;
                System.arraycopy((Object)c3, n2, (Object)c3, n8, n7);
                final Object[] d4 = this.D;
                System.arraycopy((Object)d4, n2, (Object)d4, n8, this.E - n2);
            }
            this.C[n2] = n;
            this.D[n2] = o;
            ++this.E;
        }
    }
    
    @Override
    public final String toString() {
        final int e = this.E;
        if (e <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(e * 28);
        sb.append('{');
        for (int i = 0; i < this.E; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.C[i]);
            sb.append('=');
            final Object o = this.D[i];
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
