package e3;

import X2.b;
import B3.a;
import java.util.Set;
import B3.c;

public final class p implements c
{
    public final Set a;
    public final c b;
    
    public p(final Set a, final c b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final a a) {
        if (this.a.contains((Object)b.class)) {
            this.b.a(a);
            return;
        }
        final StringBuilder sb = new StringBuilder("Attempting to publish an undeclared event ");
        sb.append((Object)a);
        sb.append(".");
        throw new RuntimeException(sb.toString());
    }
}
