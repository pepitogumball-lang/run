package F0;

import java.util.Objects;

public final class n
{
    public final o[] a;
    public final String b;
    public final byte[] c;
    public final int d;
    
    public n(final String b, final o[] a) {
        this.b = b;
        this.c = null;
        this.a = a;
        this.d = 0;
    }
    
    public n(final byte[] c, final o[] a) {
        Objects.requireNonNull((Object)c);
        this.c = c;
        this.b = null;
        this.a = a;
        this.d = 1;
    }
    
    public final void a(final int n) {
        final int d = this.d;
        if (n == d) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        final String s = "String";
        String s2;
        if (d != 0) {
            if (d != 1) {
                s2 = "Unknown";
            }
            else {
                s2 = "ArrayBuffer";
            }
        }
        else {
            s2 = "String";
        }
        sb.append(s2);
        sb.append(" expected, but got ");
        String s3 = s;
        if (n != 0) {
            if (n != 1) {
                s3 = "Unknown";
            }
            else {
                s3 = "ArrayBuffer";
            }
        }
        sb.append(s3);
        throw new IllegalStateException(sb.toString());
    }
}
