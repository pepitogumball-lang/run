package A3;

import x3.c;
import x3.g;

public final class i implements g
{
    public boolean a;
    public boolean b;
    public c c;
    public final A3.g d;
    
    public i(final A3.g d) {
        this.a = false;
        this.b = false;
        this.d = d;
    }
    
    @Override
    public final g d(final String s) {
        if (!this.a) {
            this.a = true;
            this.d.h(this.c, s, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
    
    @Override
    public final g e(final boolean b) {
        if (!this.a) {
            this.a = true;
            this.d.e(this.c, b ? 1 : 0, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
