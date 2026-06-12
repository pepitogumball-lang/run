package m3;

import java.io.InputStream;

public final class i extends InputStream
{
    public int C;
    public int D;
    public final k E;
    
    public i(final k e, final h h) {
        this.E = e;
        this.C = e.l(h.a + 4);
        this.D = h.b;
    }
    
    public final int read() {
        if (this.D == 0) {
            return -1;
        }
        final k e = this.E;
        e.C.seek((long)this.C);
        final int read = e.C.read();
        this.C = e.l(this.C + 1);
        --this.D;
        return read;
    }
    
    public final int read(final byte[] array, final int n, int c) {
        if (array == null) {
            throw new NullPointerException("buffer");
        }
        if ((n | c) < 0 || c > array.length - n) {
            throw new ArrayIndexOutOfBoundsException();
        }
        final int d = this.D;
        if (d > 0) {
            int n2;
            if ((n2 = c) > d) {
                n2 = d;
            }
            c = this.C;
            final k e = this.E;
            e.i(c, n, n2, array);
            this.C = e.l(this.C + n2);
            this.D -= n2;
            return n2;
        }
        return -1;
    }
}
