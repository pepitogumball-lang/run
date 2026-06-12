package t5;

import java.util.Iterator;

public final class e implements b
{
    public final Iterator a;
    
    public e(final Iterator a) {
        this.a = a;
    }
    
    @Override
    public final Iterator iterator() {
        return this.a;
    }
}
