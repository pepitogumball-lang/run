package g4;

import android.util.Base64;
import u5.a;
import q2.b;
import O.n0;
import n5.h;
import G0.g;
import android.os.Build$VERSION;

public abstract class u
{
    public static final String a;
    public static final String b;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        String s = null;
        Label_0054: {
            if (sdk_INT >= 33) {
                s = g.o();
                h.d("myProcessName()", (Object)s);
            }
            else {
                if (sdk_INT >= 28) {
                    s = n0.l();
                    if (s != null) {
                        break Label_0054;
                    }
                }
                s = q2.b.f();
                if (s == null) {
                    s = "";
                }
            }
        }
        final byte[] bytes = s.getBytes(u5.a.a);
        h.d("getBytes(...)", (Object)bytes);
        final String encodeToString = Base64.encodeToString(bytes, 10);
        a = m0.a.g("firebase_session_", encodeToString, "_data");
        b = m0.a.g("firebase_session_", encodeToString, "_settings");
    }
}
