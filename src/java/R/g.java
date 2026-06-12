package r;

import android.os.RemoteException;
import b.c;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.os.Build$VERSION;
import java.util.Collection;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import android.content.ServiceConnection;
import android.text.TextUtils;
import android.content.Intent;
import android.content.Context;
import android.content.ComponentName;
import b.d;

public abstract class g
{
    public final d a;
    public final ComponentName b;
    
    public g(final d a, final ComponentName b) {
        this.a = a;
        this.b = b;
    }
    
    public static boolean a(final Context context, final String package1, final n n) {
        n.setApplicationContext(context.getApplicationContext());
        final Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty((CharSequence)package1)) {
            intent.setPackage(package1);
        }
        return context.bindService(intent, (ServiceConnection)n, 33);
    }
    
    public static String b(final Context context, final List list, final boolean b) {
        final PackageManager packageManager = context.getPackageManager();
        Object o;
        if (list == null) {
            o = new ArrayList();
        }
        else {
            o = list;
        }
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        Object o2 = o;
        if (!b) {
            final ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            o2 = o;
            if (resolveActivity != null) {
                final String packageName = resolveActivity.activityInfo.packageName;
                o2 = new ArrayList(((List)o).size() + 1);
                ((ArrayList)o2).add((Object)packageName);
                if (list != null) {
                    ((ArrayList)o2).addAll((Collection)list);
                }
            }
        }
        final Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (final String package1 : o2) {
            intent2.setPackage(package1);
            if (packageManager.resolveService(intent2, 0) != null) {
                return package1;
            }
        }
        if (Build$VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        }
        return null;
    }
    
    public final r c(a a) {
        final f f = new f(a);
        final d a2 = this.a;
        a = null;
        try {
            if (((c)a2).e5(f)) {
                a = (a)new r(a2, f, this.b);
            }
            return (r)a;
        }
        catch (final RemoteException ex) {
            return (r)a;
        }
    }
}
