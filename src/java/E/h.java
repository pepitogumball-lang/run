package E;

import android.os.Handler;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.app.AppOpsManager;
import android.os.Binder;
import C.i;
import java.util.Objects;
import android.os.Process;
import C.D;
import C.E;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.content.Context;

public abstract class h
{
    public static final Object a;
    
    public static int a(final Context context, final String s) {
        if (s == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build$VERSION.SDK_INT < 33 && TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)s)) {
            int n;
            if (D.a(new E(context).a)) {
                n = 0;
            }
            else {
                n = -1;
            }
            return n;
        }
        return context.checkPermission(s, Process.myPid(), Process.myUid());
    }
    
    public static int b(final Context context, String s) {
        final int myPid = Process.myPid();
        final int myUid = Process.myUid();
        final String packageName = context.getPackageName();
        final int checkPermission = context.checkPermission(s, myPid, myUid);
        final int n = -1;
        int n2;
        if (checkPermission == -1) {
            n2 = n;
        }
        else {
            final String d = C.h.d(s);
            if (d != null) {
                if ((s = packageName) == null) {
                    final String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    n2 = n;
                    if (packagesForUid == null) {
                        return n2;
                    }
                    if (packagesForUid.length <= 0) {
                        n2 = n;
                        return n2;
                    }
                    s = packagesForUid[0];
                }
                final int myUid2 = Process.myUid();
                final String packageName2 = context.getPackageName();
                int n3;
                if (myUid2 == myUid && Objects.equals((Object)packageName2, (Object)s)) {
                    if (Build$VERSION.SDK_INT >= 29) {
                        final AppOpsManager c = i.c(context);
                        n3 = i.a(c, d, Binder.getCallingUid(), s);
                        if (n3 == 0) {
                            n3 = i.a(c, d, myUid, i.b(context));
                        }
                    }
                    else {
                        n3 = C.h.c(C.h.a(context, AppOpsManager.class), d, s);
                    }
                }
                else {
                    n3 = C.h.c(C.h.a(context, AppOpsManager.class), d, s);
                }
                if (n3 != 0) {
                    n2 = -2;
                    return n2;
                }
            }
            n2 = 0;
        }
        return n2;
    }
    
    public static void c(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 33) {
            g.a(context, broadcastReceiver, intentFilter, null, null, 2);
        }
        else if (sdk_INT >= 26) {
            d.a(context, broadcastReceiver, intentFilter, null, null, 2);
        }
        else {
            context.registerReceiver(broadcastReceiver, intentFilter, (String)null, (Handler)null);
        }
    }
}
