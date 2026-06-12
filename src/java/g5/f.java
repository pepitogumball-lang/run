package g5;

import android.os.Build$VERSION;
import java.lang.reflect.Method;

public final class f
{
    public Method a;
    public Method b;
    public Method c;
    
    public f(final Method a, final Method b, final Method c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static void a() {
        if (Build$VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
