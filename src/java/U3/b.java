package U3;

import com.google.protobuf.n;
import Z3.p;
import java.io.IOException;
import m0.a;
import Z3.r;
import S3.f;
import Y3.j;
import java.io.OutputStream;

public final class b extends OutputStream
{
    public final OutputStream C;
    public final j D;
    public final f E;
    public long F;
    
    public b(final OutputStream c, final f e, final j d) {
        this.F = -1L;
        this.C = c;
        this.E = e;
        this.D = d;
    }
    
    public final void close() {
        final long f = this.F;
        final f e = this.E;
        if (f != -1L) {
            e.f(f);
        }
        final j d = this.D;
        final long a = d.a();
        final p f2 = e.F;
        ((n)f2).l();
        r.A((r)((n)f2).D, a);
        try {
            this.C.close();
        }
        catch (final IOException ex) {
            m0.a.l(d, e, e);
            throw ex;
        }
    }
    
    public final void flush() {
        try {
            this.C.flush();
        }
        catch (final IOException ex) {
            final long a = this.D.a();
            final f e = this.E;
            e.j(a);
            g.c(e);
            throw ex;
        }
    }
    
    public final void write(final int n) {
        final f e = this.E;
        try {
            this.C.write(n);
            e.f(++this.F);
        }
        catch (final IOException ex) {
            a.l(this.D, e, e);
            throw ex;
        }
    }
    
    public final void write(final byte[] array) {
        final f e = this.E;
        try {
            this.C.write(array);
            e.f(this.F += array.length);
        }
        catch (final IOException ex) {
            a.l(this.D, e, e);
            throw ex;
        }
    }
    
    public final void write(final byte[] array, final int n, final int n2) {
        final f e = this.E;
        try {
            this.C.write(array, n, n2);
            e.f(this.F += n2);
        }
        catch (final IOException ex) {
            a.l(this.D, e, e);
            throw ex;
        }
    }
}
