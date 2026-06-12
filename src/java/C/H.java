package C;

import android.app.AppOpsManager;
import android.content.Context;

public abstract class h
{
    public static <T> T a(final Context context, final Class<T> clazz) {
        return (T)context.getSystemService((Class)clazz);
    }
    
    public static int b(final AppOpsManager appOpsManager, final String s, final String s2) {
        return appOpsManager.noteProxyOp(s, s2);
    }
    
    public static int c(final AppOpsManager appOpsManager, final String s, final String s2) {
        return appOpsManager.noteProxyOpNoThrow(s, s2);
    }
    
    public static String d(final String s) {
        return AppOpsManager.permissionToOp(s);
    }
}
