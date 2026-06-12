package io.flutter.plugins.firebase.messaging;

import android.os.BaseBundle;
import O4.n;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import android.content.ComponentName;
import android.os.Parcel;
import androidx.lifecycle.B;
import O4.g;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import v.e;
import java.util.Map;
import org.json.JSONObject;
import u2.f;
import L3.C;
import L3.z;
import s2.a;
import android.util.Log;
import android.content.Intent;
import android.content.Context;
import java.util.HashMap;
import android.content.BroadcastReceiver;

public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver
{
    public static final HashMap a;
    
    static {
        a = new HashMap();
    }
    
    public final void onReceive(Context context, final Intent intent) {
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (s2.a.c == null) {
            Context applicationContext;
            if (context.getApplicationContext() != null) {
                applicationContext = context.getApplicationContext();
            }
            else {
                applicationContext = context;
            }
            Log.d("FLTFireContextHolder", "received application context.");
            s2.a.c = applicationContext;
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        final z z = new z(intent.getExtras());
        if (z.p() != null) {
            FlutterFirebaseMessagingReceiver.a.put((Object)z.i(), (Object)z);
            final C c = C.c();
            c.getClass();
            c.d().edit().putString(z.i(), new JSONObject((Map)f.v(z)).toString()).apply();
            final StringBuilder b = e.b(c.d().getString("notification_ids", ""));
            b.append(z.i());
            b.append(",");
            final String string = b.toString();
            final ArrayList list = new ArrayList((Collection)Arrays.asList((Object[])string.split(",")));
            String replace = string;
            if (list.size() > 100) {
                final String s = (String)list.get(0);
                c.d().edit().remove(s).apply();
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(",");
                replace = string.replace((CharSequence)sb.toString(), (CharSequence)"");
            }
            c.d().edit().putString("notification_ids", replace).apply();
        }
        final KeyguardManager keyguardManager = (KeyguardManager)context.getSystemService("keyguard");
        if (keyguardManager == null || !keyguardManager.isKeyguardLocked()) {
            final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
            if (activityManager != null) {
                final List runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    final String packageName = context.getPackageName();
                    for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                        if (activityManager$RunningAppProcessInfo.importance == 100 && activityManager$RunningAppProcessInfo.processName.equals((Object)packageName)) {
                            if (g.l == null) {
                                g.l = (g)new B();
                            }
                            ((B)g.l).h((Object)z);
                            return;
                        }
                    }
                }
            }
        }
        final Intent intent2 = new Intent(context, (Class)FlutterFirebaseMessagingBackgroundService.class);
        final Parcel obtain = Parcel.obtain();
        z.writeToParcel(obtain, 0);
        intent2.putExtra("notification", obtain.marshall());
        final Bundle c2 = z.C;
        String s2;
        if ((s2 = ((BaseBundle)c2).getString("google.original_priority")) == null) {
            s2 = ((BaseBundle)c2).getString("google.priority");
        }
        boolean b2;
        if ("high".equals((Object)s2)) {
            b2 = true;
        }
        else {
            "normal".equals((Object)s2);
            b2 = false;
        }
        final List j = FlutterFirebaseMessagingBackgroundService.J;
        final ComponentName componentName = new ComponentName(context, (Class)FlutterFirebaseMessagingBackgroundService.class);
        final Object h;
        monitorenter(h = io.flutter.plugins.firebase.messaging.a.H);
        while (true) {
            n b3;
            try {
                b3 = io.flutter.plugins.firebase.messaging.a.b(context, componentName, true, 2020, b2);
                b3.b(2020);
                final n n = b3;
                final Intent intent3 = intent2;
                n.a(intent3);
                break Label_0632;
            }
            finally {
                final Context context2;
                context = context2;
                monitorexit(h);
                monitorexit(h);
                return;
                io.flutter.plugins.firebase.messaging.a.b(context, componentName, true, 2020, false).a(intent2);
                continue;
            }
            try {
                final n n = b3;
                final Intent intent3 = intent2;
                n.a(intent3);
                continue;
            }
            catch (final IllegalStateException ex) {}
            break;
        }
    }
}
