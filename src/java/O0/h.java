package O0;

import I0.g;
import android.text.TextUtils;
import I0.i;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarInterface;
import android.content.Context;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import android.os.IBinder;
import android.app.Activity;

public abstract class h
{
    public static IBinder a(final Activity activity) {
        if (activity != null) {
            final Window window = activity.getWindow();
            if (window != null) {
                final WindowManager$LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    return attributes.token;
                }
            }
        }
        return null;
    }
    
    public static SidecarInterface b(final Context context) {
        n5.h.e("context", (Object)context);
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }
    
    public static i c() {
        final i i = null;
        try {
            final String apiVersion = SidecarProvider.getApiVersion();
            i c = i;
            if (!TextUtils.isEmpty((CharSequence)apiVersion)) {
                final i h = I0.i.H;
                c = g.c(apiVersion);
            }
            return c;
        }
        catch (final NoClassDefFoundError | UnsupportedOperationException ex) {
            return i;
        }
    }
}
