package u;

import java.util.concurrent.CancellationException;

public final class a
{
    public static final a c;
    public static final a d;
    public final boolean a;
    public final CancellationException b;
    
    static {
        if (g.F) {
            d = null;
            c = null;
        }
        else {
            d = new a(false, null);
            c = new a(true, null);
        }
    }
    
    public a(final boolean a, final CancellationException b) {
        this.a = a;
        this.b = b;
    }
}
