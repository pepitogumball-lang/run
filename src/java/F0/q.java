package F0;

import android.util.Log;
import android.os.Build$VERSION;
import J5.b;
import G0.A;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import G0.E;
import android.webkit.WebSettings;

public abstract class q
{
    public static E a(final WebSettings webSettings) {
        try {
            return new E((Object)b.i((Class)WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface)A.a.D).convertSettings(webSettings)), 5);
        }
        catch (final ClassCastException ex) {
            if (Build$VERSION.SDK_INT == 30 && "android.webkit.WebSettingsWrapper".equals((Object)webSettings.getClass().getCanonicalName())) {
                Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", (Throwable)ex);
                return new E((Object)null, 5);
            }
            throw ex;
        }
    }
}
