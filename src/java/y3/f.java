package Y3;

import java.util.NoSuchElementException;

public final class f
{
    public final Object a;
    
    public f() {
        this.a = null;
    }
    
    public f(final Object a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
    
    public final Object a() {
        final Object a = this.a;
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException("No value present");
    }
    
    public final boolean b() {
        return this.a != null;
    }
}
