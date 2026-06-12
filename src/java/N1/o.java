package n1;

import F1.n;
import k1.e;
import k1.c;
import java.util.Set;
import k1.f;

public final class o implements f
{
    public final Set a;
    public final j b;
    public final p c;
    
    public o(final Set a, final j b, final p c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final n a(final String s, final c c, final e e) {
        final Set a = this.a;
        if (a.contains((Object)c)) {
            return new n((Object)this.b, (Object)s, (Object)c, (Object)e, (Object)this.c, 21);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[] { c, a }));
    }
}
