package C;

import android.content.Context;
import android.app.AppOpsManager;

public abstract class i
{
    public static int a(final AppOpsManager appOpsManager, final String s, final int n, final String s2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(s, n, s2);
    }
    
    public static String b(final Context context) {
        return context.getOpPackageName();
    }
    
    public static AppOpsManager c(final Context context) {
        return (AppOpsManager)context.getSystemService((Class)AppOpsManager.class);
    }
}
