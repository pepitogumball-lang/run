package c4;

import m0.a;
import b4.j;

public final class r implements j
{
    public final String a;
    public final int b;
    
    public r(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        if (this.b == 0) {
            return false;
        }
        final String trim = this.d().trim();
        if (c4.j.f.matcher((CharSequence)trim).matches()) {
            return true;
        }
        if (c4.j.g.matcher((CharSequence)trim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(m0.a.g("[Value: ", trim, "] cannot be converted to a boolean."));
    }
    
    public final double b() {
        if (this.b == 0) {
            return 0.0;
        }
        final String trim = this.d().trim();
        try {
            return Double.valueOf(trim);
        }
        catch (final NumberFormatException ex) {
            throw new IllegalArgumentException(m0.a.g("[Value: ", trim, "] cannot be converted to a double."), (Throwable)ex);
        }
    }
    
    public final long c() {
        if (this.b == 0) {
            return 0L;
        }
        final String trim = this.d().trim();
        try {
            return Long.valueOf(trim);
        }
        catch (final NumberFormatException ex) {
            throw new IllegalArgumentException(m0.a.g("[Value: ", trim, "] cannot be converted to a long."), (Throwable)ex);
        }
    }
    
    public final String d() {
        if (this.b == 0) {
            return "";
        }
        return this.a;
    }
}
