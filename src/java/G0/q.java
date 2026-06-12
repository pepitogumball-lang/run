package G0;

import android.content.pm.PackageManager$ComponentInfoFlags;
import android.os.BaseBundle;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.content.ComponentName;
import F0.w;
import android.content.Context;
import java.util.HashSet;

public final class q
{
    public static final HashSet d;
    public final String a;
    public final String b;
    public final int c;
    
    static {
        d = new HashSet();
    }
    
    public q(final int c, final String a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
        q.d.add((Object)this);
    }
    
    public final boolean a(final Context context) {
        Label_0114: {
            if (this.b()) {
                break Label_0114;
            }
            final PackageInfo d = w.d(context);
            final BaseBundle baseBundle = null;
            while (true) {
                if (d == null) {
                    final Object o = baseBundle;
                    break Label_0090;
                }
                final ComponentName componentName = new ComponentName(d.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
                Label_0074: {
                    if (Build$VERSION.SDK_INT < 33) {
                        break Label_0074;
                    }
                    final PackageManager$ComponentInfoFlags c = g.c();
                    try {
                        Object o = g.e(context.getPackageManager(), componentName, c).metaData;
                        boolean b = false;
                        if (o != null && ((BaseBundle)o).containsKey(this.b)) {
                            b = true;
                        }
                        return b;
                        o = context.getPackageManager().getServiceInfo(componentName, 640).metaData;
                        continue;
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        final Object o = baseBundle;
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public final boolean b() {
        switch (this.c) {
            default: {
                return Build$VERSION.SDK_INT >= 28;
            }
            case 0: {
                return false;
            }
        }
    }
}
