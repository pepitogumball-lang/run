package u0;

import java.util.Iterator;
import android.database.sqlite.SQLiteProgram;
import z0.b;
import java.util.Map$Entry;
import java.util.TreeMap;
import java.io.Closeable;
import y0.c;

public final class m implements c, Closeable
{
    public static final TreeMap K;
    public volatile String C;
    public final long[] D;
    public final double[] E;
    public final String[] F;
    public final byte[][] G;
    public final int[] H;
    public final int I;
    public int J;
    
    static {
        K = new TreeMap();
    }
    
    public m(int i) {
        this.I = i;
        ++i;
        this.H = new int[i];
        this.D = new long[i];
        this.E = new double[i];
        this.F = new String[i];
        this.G = new byte[i][];
    }
    
    public static m c(final int n, final String s) {
        final TreeMap k = m.K;
        final TreeMap treeMap;
        monitorenter(treeMap = k);
        Label_0062: {
            try {
                final Map$Entry ceilingEntry = k.ceilingEntry((Object)n);
                if (ceilingEntry != null) {
                    k.remove(ceilingEntry.getKey());
                    final m m = (m)ceilingEntry.getValue();
                    m.C = s;
                    m.J = n;
                    monitorexit(treeMap);
                    return m;
                }
                break Label_0062;
            }
            finally {
                monitorexit(treeMap);
                monitorexit(treeMap);
                final m i = new m(n);
                i.C = s;
                i.J = n;
                return i;
            }
        }
    }
    
    public final String a() {
        return this.C;
    }
    
    public final void b(final b b) {
        for (int i = 1; i <= this.J; ++i) {
            final int n = this.H[i];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n == 5) {
                                b.b(i, this.G[i]);
                            }
                        }
                        else {
                            b.f(i, this.F[i]);
                        }
                    }
                    else {
                        ((SQLiteProgram)b.D).bindDouble(i, this.E[i]);
                    }
                }
                else {
                    b.c(this.D[i], i);
                }
            }
            else {
                b.d(i);
            }
        }
    }
    
    public final void close() {
    }
    
    public final void d(final long n, final int n2) {
        this.H[n2] = 2;
        this.D[n2] = n;
    }
    
    public final void f(final int n) {
        this.H[n] = 1;
    }
    
    public final void g(final int n, final String s) {
        this.H[n] = 4;
        this.F[n] = s;
    }
    
    public final void h() {
        final TreeMap k = m.K;
        synchronized (k) {
            k.put((Object)this.I, (Object)this);
            if (k.size() > 15) {
                int i = k.size() - 10;
                final Iterator iterator = k.descendingKeySet().iterator();
                while (i > 0) {
                    iterator.next();
                    iterator.remove();
                    --i;
                }
            }
        }
    }
}
