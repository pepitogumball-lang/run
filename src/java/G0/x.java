package G0;

import java.util.regex.Matcher;
import android.content.pm.PackageInfo;
import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
import C3.i;
import F0.w;
import android.os.Build$VERSION;
import java.util.regex.Pattern;

public final class x extends c
{
    public final Pattern d;
    
    public x() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }
    
    @Override
    public final boolean a() {
        return Build$VERSION.SDK_INT >= 33;
    }
    
    @Override
    public final boolean b() {
        final boolean b = super.b();
        if (b) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT < 29) {
                final Uri a = w.a;
                PackageInfo packageInfo;
                if (sdk_INT >= 26) {
                    packageInfo = i.g();
                }
                else {
                    try {
                        packageInfo = w.e();
                    }
                    catch (final ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
                        packageInfo = null;
                    }
                }
                final boolean b2 = false;
                if (packageInfo == null) {
                    return false;
                }
                final Matcher matcher = this.d.matcher((CharSequence)packageInfo.versionName);
                boolean b3 = b2;
                if (matcher.find()) {
                    b3 = b2;
                    if (Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                        b3 = true;
                    }
                }
                return b3;
            }
        }
        return b;
    }
}
