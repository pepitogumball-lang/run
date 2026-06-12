package g4;

import android.util.Log;
import q2.b;
import O.n0;
import G0.g;
import android.os.Build$VERSION;
import n5.h;
import W.a;
import m5.l;
import n5.i;

public final class x extends i implements l
{
    public static final x D;
    
    static {
        D = (x)new i(1);
    }
    
    public final Object g(final Object o) {
        final a a = (a)o;
        h.e("ex", (Object)a);
        final StringBuilder sb = new StringBuilder("CorruptionException in sessions DataStore in ");
        final int sdk_INT = Build$VERSION.SDK_INT;
        String s = null;
        Label_0077: {
            if (sdk_INT >= 33) {
                s = g.o();
                h.d("myProcessName()", (Object)s);
            }
            else {
                if (sdk_INT >= 28) {
                    s = n0.l();
                    if (s != null) {
                        break Label_0077;
                    }
                }
                s = b.f();
                if (s == null) {
                    s = "";
                }
            }
        }
        sb.append(s);
        sb.append('.');
        Log.w("FirebaseSessionsRepo", sb.toString(), (Throwable)a);
        return new Z.b(true);
    }
}
