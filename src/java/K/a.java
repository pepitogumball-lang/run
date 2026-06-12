package K;

import android.os.ext.SdkExtensions;

public final class a
{
    public static final a a;
    
    static {
        a = (a)new Object();
    }
    
    public final int a(final int n) {
        return SdkExtensions.getExtensionVersion(n);
    }
}
