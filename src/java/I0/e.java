package I0;

import androidx.window.extensions.WindowExtensionsProvider;
import n5.p;

public abstract class e
{
    static {
        p.a((Class)e.class).b();
    }
    
    public static int a() {
        int vendorApiLevel = 0;
        try {
            vendorApiLevel = WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
            return vendorApiLevel;
        }
        catch (final NoClassDefFoundError | UnsupportedOperationException ex) {
            return vendorApiLevel;
        }
    }
}
