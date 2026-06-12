package y1;

import java.util.Locale;

public final class r
{
    public final int a;
    public final int b;
    public final int c;
    
    public r(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final Locale us = Locale.US;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(".");
        sb.append(this.b);
        sb.append(".");
        sb.append(this.c);
        return sb.toString();
    }
}
