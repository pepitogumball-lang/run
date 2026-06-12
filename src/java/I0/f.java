package I0;

import android.util.Log;
import v.e;
import java.util.Collection;
import java.util.ArrayList;
import d5.c;
import d5.l;
import com.google.android.gms.internal.measurement.L;
import n5.h;

public final class f extends g
{
    public final Object a;
    public final String b;
    public final int c;
    public final j d;
    
    public f(Object a, final String b, final a a2, int i) {
        h.e("value", a);
        L.p(i, "verificationMode");
        this.a = a;
        this.b = b;
        this.c = i;
        final String b2 = g.b(b, a);
        h.e("message", (Object)b2);
        final Exception d = new Exception(b2);
        final StackTraceElement[] stackTrace = ((Throwable)d).getStackTrace();
        h.d("stackTrace", (Object)stackTrace);
        if ((i = stackTrace.length - 2) < 0) {
            i = 0;
        }
        if (i >= 0) {
            if (i == 0) {
                a = l.C;
            }
            else {
                final int length = stackTrace.length;
                if (i >= length) {
                    a = d5.c.H((Object[])stackTrace);
                }
                else if (i == 1) {
                    a = com.google.android.gms.internal.auth.h.t((Object)stackTrace[length - 1]);
                }
                else {
                    a = new ArrayList(i);
                    for (i = length - i; i < length; ++i) {
                        ((ArrayList)a).add((Object)stackTrace[i]);
                    }
                }
            }
            ((Throwable)d).setStackTrace((StackTraceElement[])((Collection)a).toArray((Object[])new StackTraceElement[0]));
            this.d = (j)d;
            return;
        }
        throw new IllegalArgumentException(Y3.a.j(i, "Requested element count ", " is less than zero.").toString());
    }
    
    @Override
    public final Object a() {
        final int d = e.d(this.c);
        if (d != 0) {
            if (d != 1) {
                if (d != 2) {
                    throw new RuntimeException();
                }
            }
            else {
                final String b = g.b(this.b, this.a);
                h.e("message", (Object)b);
                Log.d("f", b);
            }
            return null;
        }
        throw this.d;
    }
    
    @Override
    public final g d(final String s, final m5.l l) {
        return this;
    }
}
