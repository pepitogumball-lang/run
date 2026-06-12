package i4;

import android.util.Log;
import q2.b;
import O.n0;
import android.os.Build$VERSION;
import n5.h;
import W.a;
import m5.l;
import n5.i;

public final class g extends i implements l
{
    public static final g D;
    
    static {
        D = (g)new i(1);
    }
    
    public final Object g(final Object o) {
        final a a = (a)o;
        h.e("ex", (Object)a);
        final StringBuilder sb = new StringBuilder("CorruptionException in settings DataStore in ");
        final int sdk_INT = Build$VERSION.SDK_INT;
        String s = null;
        Label_0076: {
            if (sdk_INT >= 33) {
                s = G0.g.o();
                h.d("myProcessName()", (Object)s);
            }
            else {
                if (sdk_INT >= 28) {
                    s = n0.l();
                    if (s != null) {
                        break Label_0076;
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
        Log.w("SessionsSettings", sb.toString(), (Throwable)a);
        return new Z.b(true);
    }
}
