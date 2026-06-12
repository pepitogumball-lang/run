package W;

import n5.h;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class p extends OutputStream
{
    public final FileOutputStream C;
    
    public p(final FileOutputStream c) {
        this.C = c;
    }
    
    public final void close() {
    }
    
    public final void flush() {
        ((OutputStream)this.C).flush();
    }
    
    public final void write(final int n) {
        this.C.write(n);
    }
    
    public final void write(final byte[] array) {
        h.e("b", (Object)array);
        this.C.write(array);
    }
    
    public final void write(final byte[] array, final int n, final int n2) {
        h.e("bytes", (Object)array);
        this.C.write(array, n, n2);
    }
}
