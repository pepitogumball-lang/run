package e2;

import android.os.BaseBundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Build$VERSION;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import h2.A;
import android.net.Uri$Builder;
import android.text.TextUtils;
import q2.b;
import android.net.Uri;
import android.content.Intent;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public class f
{
    public static final int a;
    public static final f b;
    
    static {
        final AtomicBoolean a2 = i.a;
        a = 12451000;
        b = (f)new Object();
    }
    
    public static int a(final Context context) {
        final AtomicBoolean a = i.a;
        int versionCode = 0;
        try {
            versionCode = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
        }
        return versionCode;
    }
    
    public Intent b(final int n, final Context context, final String s) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return null;
            }
            final Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String)null);
            final Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        else {
            if (context != null && q2.b.l(context)) {
                final Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
                intent2.setPackage("com.google.android.wearable.app");
                return intent2;
            }
            Object string = new StringBuilder("gcore_");
            ((StringBuilder)string).append(f.a);
            ((StringBuilder)string).append("-");
            if (!TextUtils.isEmpty((CharSequence)s)) {
                ((StringBuilder)string).append(s);
            }
            ((StringBuilder)string).append("-");
            if (context != null) {
                ((StringBuilder)string).append(context.getPackageName());
            }
            ((StringBuilder)string).append("-");
            while (true) {
                if (context == null) {
                    break Label_0174;
                }
                try {
                    ((StringBuilder)string).append(s2.b.a(context).c(0, context.getPackageName()).versionCode);
                    string = ((StringBuilder)string).toString();
                    final Intent intent3 = new Intent("android.intent.action.VIEW");
                    final Uri$Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                    if (!TextUtils.isEmpty((CharSequence)string)) {
                        appendQueryParameter.appendQueryParameter("pcampaignid", (String)string);
                    }
                    intent3.setData(appendQueryParameter.build());
                    intent3.setPackage("com.android.vending");
                    intent3.addFlags(524288);
                    return intent3;
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public int c(final Context context, int a) {
        final AtomicBoolean a2 = i.a;
        try {
            context.getResources().getString(2131689521);
        }
        finally {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        final boolean equals = "com.google.android.gms".equals((Object)context.getPackageName());
        final int n = 1;
        Label_0273: {
            if (!equals) {
                if (!i.d.get()) {
                    final Object a3;
                    monitorenter(a3 = A.a);
                    int c;
                    StringBuilder sb;
                    String packageName;
                    R4.b a4;
                    Bundle metaData;
                    Block_22_Outer:Block_21_Outer:Label_0161_Outer:
                    while (true) {
                        Label_0086: {
                            try {
                                if (A.b) {
                                    monitorexit(a3);
                                    break Label_0164;
                                }
                                break Label_0086;
                            }
                            finally {
                                monitorexit(a3);
                                while (true) {
                                    while (true) {
                                        break Label_0273;
                                        iftrue(Label_0181:)(c != 12451000);
                                        continue Block_21_Outer;
                                    }
                                    Label_0181: {
                                        a = f.a;
                                    }
                                    sb = new StringBuilder(String.valueOf(a).length() + 104 + String.valueOf(c).length() + 194);
                                    sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                                    sb.append(a);
                                    sb.append(" but found ");
                                    sb.append(c);
                                    sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                                    throw new IllegalStateException(sb.toString());
                                    Label_0260:
                                    throw new GooglePlayServicesMissingManifestValueException();
                                    c = A.c;
                                    iftrue(Label_0260:)(c == 0);
                                    continue Label_0161_Outer;
                                }
                                while (true) {
                                    monitorexit(a3);
                                    continue Block_22_Outer;
                                    A.b = true;
                                    packageName = context.getPackageName();
                                    a4 = s2.b.a(context);
                                    try {
                                        metaData = a4.a(128, packageName).metaData;
                                        if (metaData == null) {
                                            monitorexit(a3);
                                            continue Block_22_Outer;
                                        }
                                        ((BaseBundle)metaData).getString("com.google.app.id");
                                        A.c = ((BaseBundle)metaData).getInt("com.google.android.gms.version");
                                    }
                                    catch (final PackageManager$NameNotFoundException ex) {
                                        Log.wtf("MetadataValueReader", "This should never happen.", (Throwable)ex);
                                    }
                                    continue;
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
        boolean b2 = false;
        Label_0343: {
            if (!q2.b.l(context)) {
                if (q2.b.f == null) {
                    boolean b;
                    if (q2.b.h()) {
                        b = context.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
                    }
                    else {
                        b = context.getPackageManager().hasSystemFeature("android.hardware.type.iot");
                    }
                    q2.b.f = b;
                }
                if (!q2.b.f) {
                    b2 = true;
                    break Label_0343;
                }
            }
            b2 = false;
        }
        A.b(a >= 0);
        final String packageName2 = context.getPackageName();
        final PackageManager packageManager = context.getPackageManager();
        final int n2 = 9;
        Label_0444: {
            if (b2) {
                try {
                    int n3;
                    if (Build$VERSION.SDK_INT >= 28) {
                        n3 = 134225984;
                    }
                    else {
                        n3 = 8256;
                    }
                    final PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", n3);
                    break Label_0444;
                }
                catch (final PackageManager$NameNotFoundException ex2) {
                    Log.w("GooglePlayServicesUtil", String.valueOf((Object)packageName2).concat(" requires the Google Play Store, but it is missing."));
                    a = n2;
                    break Label_0444;
                }
            }
            final PackageInfo packageInfo = null;
            while (true) {
                try {
                    int n4;
                    if (Build$VERSION.SDK_INT >= 28) {
                        n4 = 134217792;
                    }
                    else {
                        n4 = 64;
                    }
                    final PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", n4);
                    j.a(context);
                    if (!j.c(packageInfo2, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf((Object)packageName2).concat(" requires Google Play services, but their signature is invalid."));
                        a = n2;
                    }
                    else {
                        if (b2) {
                            A.h((Object)packageInfo);
                            if (!j.c(packageInfo, true)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf((Object)packageName2).concat(" requires Google Play Store, but its signature is invalid."));
                                a = n2;
                                break Label_0444;
                            }
                        }
                        if (b2 && packageInfo != null && !packageInfo.signatures[0].equals((Object)packageInfo2.signatures[0])) {
                            Log.w("GooglePlayServicesUtil", String.valueOf((Object)packageName2).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                            a = n2;
                        }
                        else {
                            final int versionCode = packageInfo2.versionCode;
                            int n5 = -1;
                            int n6;
                            if (versionCode == -1) {
                                n6 = -1;
                            }
                            else {
                                n6 = versionCode / 1000;
                            }
                            if (a != -1) {
                                n5 = a / 1000;
                            }
                            if (n6 < n5) {
                                final StringBuilder sb2 = new StringBuilder(String.valueOf((Object)packageName2).length() + 49 + String.valueOf(a).length() + 11 + String.valueOf(versionCode).length());
                                sb2.append("Google Play services out of date for ");
                                sb2.append(packageName2);
                                sb2.append(".  Requires ");
                                sb2.append(a);
                                sb2.append(" but found ");
                                sb2.append(versionCode);
                                Log.w("GooglePlayServicesUtil", sb2.toString());
                                a = 2;
                            }
                            else {
                                ApplicationInfo applicationInfo = null;
                                Label_0814: {
                                    if ((applicationInfo = packageInfo2.applicationInfo) == null) {
                                        try {
                                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                            break Label_0814;
                                        }
                                        catch (final PackageManager$NameNotFoundException ex3) {
                                            Log.wtf("GooglePlayServicesUtil", String.valueOf((Object)packageName2).concat(" requires Google Play services, but they're missing when getting application info."), (Throwable)ex3);
                                        }
                                        a = 1;
                                        break Label_0444;
                                    }
                                }
                                if (!applicationInfo.enabled) {
                                    a = 3;
                                }
                                else {
                                    a = 0;
                                }
                            }
                        }
                    }
                }
                catch (final PackageManager$NameNotFoundException ex4) {
                    Log.w("GooglePlayServicesUtil", String.valueOf((Object)packageName2).concat(" requires Google Play services, but they are missing."));
                    continue;
                }
                break;
            }
        }
        int n7;
        if (a == 18) {
            n7 = n;
        }
        else {
            n7 = ((a == 1 && i.c(context)) ? 1 : 0);
        }
        if (n7 != 0) {
            return 18;
        }
        return a;
    }
}
