package R4;

import y1.h;

public class w
{
    public final h a;
    public final int b;
    public final int c;
    
    public w(final h a) {
        this.a = a;
        this.b = a.a;
        this.c = a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof w)) {
            return false;
        }
        final w w = (w)o;
        if (this.b != w.b) {
            return false;
        }
        if (this.c != w.c) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return this.b * 31 + this.c;
    }
}
