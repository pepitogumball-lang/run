package R4;

import J1.e;
import y1.h;
import K2.D;
import android.content.Context;

public final class s extends w
{
    public final String d;
    
    public s(final Context context, final D d, final String d2, final int n) {
        h h;
        if (d2 == null) {
            final h i = y1.h.i;
            h = e.g(context, n, 0);
            h.d = true;
        }
        else if (d2.equals((Object)"portrait")) {
            final h j = y1.h.i;
            h = e.g(context, n, 1);
            h.d = true;
        }
        else {
            if (!d2.equals((Object)"landscape")) {
                throw new IllegalArgumentException("Unexpected value for orientation: ".concat(d2));
            }
            final h k = y1.h.i;
            h = e.g(context, n, 2);
            h.d = true;
        }
        super(h);
        this.d = d2;
    }
}
