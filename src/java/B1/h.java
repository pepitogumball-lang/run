package b1;

import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Method;
import android.text.TextUtils;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Process;
import O.n0;
import android.os.Build$VERSION;
import R0.b;
import android.content.Context;
import R0.m;

public abstract class h
{
    public static final String a;
    
    static {
        a = m.h("ProcessUtils");
    }
    
    public static boolean a(final Context context, final b b) {
        Object o = null;
        Label_0163: {
            if (Build$VERSION.SDK_INT >= 28) {
                o = n0.l();
            }
            else {
                try {
                    final Method declaredMethod = Class.forName("android.app.ActivityThread", false, h.class.getClassLoader()).getDeclaredMethod("currentProcessName", (Class<?>[])null);
                    ((AccessibleObject)declaredMethod).setAccessible(true);
                    final Object invoke = declaredMethod.invoke((Object)null, (Object[])null);
                    if (invoke instanceof String) {
                        final String s = (String)invoke;
                        break Label_0163;
                    }
                }
                finally {
                    m.e().c(h.a, "Unable to check ActivityThread for processName", new Throwable[] { (Throwable)o });
                }
                final int myPid = Process.myPid();
                final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
                if (activityManager != null) {
                    final List runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                        for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                            if (activityManager$RunningAppProcessInfo.pid == myPid) {
                                o = activityManager$RunningAppProcessInfo.processName;
                                break Label_0163;
                            }
                        }
                    }
                }
                o = null;
            }
        }
        b.getClass();
        if (!TextUtils.isEmpty((CharSequence)null)) {
            return TextUtils.equals((CharSequence)o, (CharSequence)null);
        }
        return TextUtils.equals((CharSequence)o, (CharSequence)context.getApplicationInfo().processName);
    }
}
