package y;

import java.util.ArrayList;

public final class k
{
    public n a;
    public ArrayList b;
    
    public static long a(e h, long n) {
        final n d = h.d;
        if (d instanceof i) {
            return n;
        }
        final ArrayList k = h.k;
        final int size = k.size();
        int i = 0;
        long n2 = n;
        while (i < size) {
            final d d2 = (d)k.get(i);
            long min = n2;
            if (d2 instanceof e) {
                final e e = (e)d2;
                if (e.d == d) {
                    min = n2;
                }
                else {
                    min = Math.min(n2, a(e, e.f + n));
                }
            }
            ++i;
            n2 = min;
        }
        long min2 = n2;
        if (h == d.i) {
            final long j = d.j();
            h = d.h;
            n -= j;
            min2 = Math.min(Math.min(n2, a(h, n)), n - h.f);
        }
        return min2;
    }
    
    public static long b(e i, long n) {
        final n d = i.d;
        if (d instanceof i) {
            return n;
        }
        final ArrayList k = i.k;
        final int size = k.size();
        int j = 0;
        long n2 = n;
        while (j < size) {
            final d d2 = (d)k.get(j);
            long max = n2;
            if (d2 instanceof e) {
                final e e = (e)d2;
                if (e.d == d) {
                    max = n2;
                }
                else {
                    max = Math.max(n2, b(e, e.f + n));
                }
            }
            ++j;
            n2 = max;
        }
        long max2 = n2;
        if (i == d.h) {
            final long l = d.j();
            i = d.i;
            n += l;
            max2 = Math.max(Math.max(n2, b(i, n)), n - i.f);
        }
        return max2;
    }
}
