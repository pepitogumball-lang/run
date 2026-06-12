package F0;

import java.util.Collection;
import java.util.ArrayList;

public final class k
{
    public final int a;
    public final ArrayList b;
    public final int c;
    
    public k(final ArrayList list, final int a, final int c) {
        final ArrayList b = new ArrayList();
        this.b = b;
        this.a = a;
        b.addAll((Collection)list);
        this.c = c;
    }
}
