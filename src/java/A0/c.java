package a0;

import android.content.pm.Signature;
import android.content.pm.PackageManager;
import K2.D;

public final class c extends D
{
    public final Signature[] d(final PackageManager packageManager, final String s) {
        return packageManager.getPackageInfo(s, 64).signatures;
    }
}
