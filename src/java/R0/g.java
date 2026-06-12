package r0;

import android.content.pm.PackageManager$PackageInfoFlags;
import android.content.pm.PackageInfo;
import android.content.Context;
import android.content.pm.PackageManager;

public abstract class g
{
    public static PackageInfo a(final PackageManager packageManager, final Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager$PackageInfoFlags.of(0L));
    }
}
