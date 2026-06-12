package o1;

import v.e;

public final class a
{
    public final int a;
    public final long b;
    
    public a(final long b, final int a) {
        if (a != 0) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null status");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            if (!e.a(this.a, a.a) || this.b != a.b) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int d = e.d(this.a);
        final long b = this.b;
        return (d ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("BackendResponse{status=");
        final int a = this.a;
        String s;
        if (a != 1) {
            if (a != 2) {
                if (a != 3) {
                    if (a != 4) {
                        s = "null";
                    }
                    else {
                        s = "INVALID_PAYLOAD";
                    }
                }
                else {
                    s = "FATAL_ERROR";
                }
            }
            else {
                s = "TRANSIENT_ERROR";
            }
        }
        else {
            s = "OK";
        }
        sb.append(s);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
