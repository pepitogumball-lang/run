package h3;

import n3.Z;
import O.n0;
import G0.g;
import android.os.Build$VERSION;
import android.os.Process;
import n3.D0;
import android.util.Log;
import java.util.Iterator;
import d5.f;
import android.app.ActivityManager$RunningAppProcessInfo;
import d5.d;
import d5.l;
import android.app.ActivityManager;
import java.util.ArrayList;
import android.content.Context;
import n5.h;
import n3.a0;

public final class c
{
    public static final c a;
    public static final c b;
    
    public static a0 a(final c c, final String a, int b, int c2, final int n) {
        if ((n & 0x4) != 0x0) {
            c2 = 0;
        }
        c.getClass();
        h.e("processName", (Object)a);
        final Object o = new Object();
        ((Z)o).a = a;
        ((Z)o).b = b;
        b = (byte)(((Z)o).e | 0x1);
        ((Z)o).c = c2;
        b = (byte)(b | 0x2);
        ((Z)o).d = false;
        ((Z)o).e = (byte)(b | 0x4);
        return ((Z)o).a();
    }
    
    public static ArrayList d(final Context context) {
        h.e("context", (Object)context);
        final int uid = context.getApplicationInfo().uid;
        final String processName = context.getApplicationInfo().processName;
        final Object systemService = context.getSystemService("activity");
        final boolean b = systemService instanceof ActivityManager;
        Object runningAppProcesses = null;
        ActivityManager activityManager;
        if (b) {
            activityManager = (ActivityManager)systemService;
        }
        else {
            activityManager = null;
        }
        if (activityManager != null) {
            runningAppProcesses = activityManager.getRunningAppProcesses();
        }
        Object c;
        if ((c = runningAppProcesses) == null) {
            c = l.C;
        }
        final ArrayList g = d.G((Iterable)c);
        final ArrayList list = new ArrayList();
        for (final Object next : g) {
            if (((ActivityManager$RunningAppProcessInfo)next).uid == uid) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList(f.E((Iterable)list));
        for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : list) {
            final Object o = new Object();
            final String processName2 = activityManager$RunningAppProcessInfo.processName;
            if (processName2 == null) {
                throw new NullPointerException("Null processName");
            }
            ((Z)o).a = processName2;
            ((Z)o).b = activityManager$RunningAppProcessInfo.pid;
            final byte b2 = (byte)(((Z)o).e | 0x1);
            ((Z)o).c = activityManager$RunningAppProcessInfo.importance;
            ((Z)o).e = (byte)(b2 | 0x2);
            ((Z)o).d = h.a((Object)processName2, (Object)processName);
            ((Z)o).e |= 0x4;
            list2.add((Object)((Z)o).a());
        }
        return list2;
    }
    
    public boolean b(final int n) {
        return 4 <= n || Log.isLoggable("FirebaseCrashlytics", n);
    }
    
    public void c(final String s) {
        if (this.b(3)) {
            Log.d("FirebaseCrashlytics", s, (Throwable)null);
        }
    }
    
    public D0 e(final Context context) {
        h.e("context", (Object)context);
        final int myPid = Process.myPid();
        while (true) {
            for (final Object next : d(context)) {
                if (((a0)next).b == myPid) {
                    Object a;
                    if ((a = next) == null) {
                        final int sdk_INT = Build$VERSION.SDK_INT;
                        String s;
                        if (sdk_INT >= 33) {
                            s = g.o();
                            h.d("{\n      Process.myProcessName()\n    }", (Object)s);
                        }
                        else if (sdk_INT < 28 || (s = n0.l()) == null) {
                            s = "";
                        }
                        a = a(this, s, myPid, 0, 12);
                    }
                    return (D0)a;
                }
            }
            Object next = null;
            continue;
        }
    }
    
    public void f(final String s) {
        if (this.b(2)) {
            Log.v("FirebaseCrashlytics", s, (Throwable)null);
        }
    }
    
    public void g(final String s, final Exception ex) {
        if (this.b(5)) {
            Log.w("FirebaseCrashlytics", s, (Throwable)ex);
        }
    }
}
