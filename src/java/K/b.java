package K;

import n5.h;
import java.util.Locale;
import android.os.Build$VERSION;

public abstract class b
{
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final a a = K.a.a;
        if (sdk_INT >= 30) {
            a.a(30);
        }
        if (sdk_INT >= 30) {
            a.a(31);
        }
        if (sdk_INT >= 30) {
            a.a(33);
        }
        if (sdk_INT >= 30) {
            a.a(1000000);
        }
    }
    
    public static final boolean a(String upperCase, String upperCase2) {
        final boolean equals = "REL".equals(upperCase2);
        boolean b = false;
        if (equals) {
            return false;
        }
        final Locale root = Locale.ROOT;
        upperCase2 = upperCase2.toUpperCase(root);
        h.d("this as java.lang.String).toUpperCase(Locale.ROOT)", (Object)upperCase2);
        upperCase = upperCase.toUpperCase(root);
        h.d("this as java.lang.String).toUpperCase(Locale.ROOT)", (Object)upperCase);
        if (upperCase2.compareTo(upperCase) >= 0) {
            b = true;
        }
        return b;
    }
    
    public static final boolean b() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 31) {
            if (sdk_INT >= 30) {
                final String codename = Build$VERSION.CODENAME;
                h.d("CODENAME", (Object)codename);
                if (a("S", codename)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static final boolean c() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 33) {
            if (sdk_INT >= 32) {
                final String codename = Build$VERSION.CODENAME;
                h.d("CODENAME", (Object)codename);
                if (a("Tiramisu", codename)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
