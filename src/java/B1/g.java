package b1;

import android.content.pm.PackageManager;
import com.google.android.gms.internal.measurement.L;
import android.content.ComponentName;
import android.content.Context;
import R0.m;

public abstract class g
{
    public static final String a;
    
    static {
        a = m.h("PackageManagerHelper");
    }
    
    public static void a(final Context context, final Class clazz, final boolean b) {
        final String s = "disabled";
        final String a = g.a;
        try {
            final PackageManager packageManager = context.getPackageManager();
            final ComponentName componentName = new ComponentName(context, clazz.getName());
            int n;
            if (b) {
                n = 1;
            }
            else {
                n = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, n, 1);
            final m e = m.e();
            final String name = clazz.getName();
            String s2;
            if (b) {
                s2 = "enabled";
            }
            else {
                s2 = "disabled";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(" ");
            sb.append(s2);
            e.c(a, sb.toString(), new Throwable[0]);
        }
        catch (final Exception ex) {
            final m e2 = m.e();
            final String name2 = clazz.getName();
            String s3 = s;
            if (b) {
                s3 = "enabled";
            }
            e2.c(a, L.j(name2, " could not be ", s3), new Throwable[] { (Throwable)ex });
        }
    }
}
