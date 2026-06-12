package R4;

import J1.j;
import J1.e;
import y1.h;
import android.content.Context;
import K2.D;

public final class u extends w
{
    public final Integer d;
    public final Integer e;
    
    public u(final D d, final Context context, final int n, final Integer d2, final Integer e) {
        h h;
        if (d2 != null) {
            if (d2 == 0) {
                final h i = y1.h.i;
                final int e2 = J1.e.e(context, 1);
                h = new h(n, 0);
                if (e2 == -1) {
                    h = y1.h.l;
                }
                else {
                    h.f = e2;
                    h.e = true;
                }
            }
            else {
                final h j = y1.h.i;
                final int e3 = J1.e.e(context, 2);
                h = new h(n, 0);
                if (e3 == -1) {
                    h = y1.h.l;
                }
                else {
                    h.f = e3;
                    h.e = true;
                }
            }
        }
        else if (e != null) {
            final int intValue = e;
            final h h2 = new h(n, 0);
            h2.f = intValue;
            h2.e = true;
            h = h2;
            if (intValue < 32) {
                final StringBuilder sb = new StringBuilder("The maximum height set for the inline adaptive ad size was ");
                sb.append(intValue);
                sb.append(" dp, which is below the minimum recommended value of 32 dp.");
                j.i(sb.toString());
                h = h2;
            }
        }
        else {
            final h k = y1.h.i;
            final int e4 = J1.e.e(context, 0);
            if (e4 == -1) {
                h = y1.h.l;
            }
            else {
                h = new h(n, 0);
                h.f = e4;
                h.e = true;
            }
        }
        super(h);
        this.d = d2;
        this.e = e;
    }
}
