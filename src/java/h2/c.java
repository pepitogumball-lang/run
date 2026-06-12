package h2;

import android.os.BaseBundle;
import android.content.ContentProviderClient;
import e2.b;
import android.app.PendingIntent;
import android.util.Log;
import android.os.RemoteException;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.net.Uri$Builder;
import android.net.Uri;

public abstract class C
{
    public static final Uri a;
    
    static {
        a = new Uri$Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }
    
    public static Intent a(final Context context, final J j) {
        final String a = j.a;
        if (a == null) {
            return new Intent().setComponent(j.c);
        }
        Object acquireUnstableContentProviderClient = null;
        final Intent intent = null;
        if (j.d) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("serviceActionBundleKey", a);
            final Bundle bundle3;
            Label_0133: {
                Label_0116: {
                    try {
                        acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(C.a);
                        if (acquireUnstableContentProviderClient != null) {
                            final Object o = acquireUnstableContentProviderClient;
                            final String s = "serviceIntentCall";
                            final String s2 = null;
                            final Bundle bundle2 = bundle;
                            ((ContentProviderClient)o).call(s, s2, bundle2);
                            break Label_0133;
                        }
                        throw new RemoteException("Failed to acquire ContentProviderClient");
                    }
                    catch (final IllegalArgumentException ex) {
                        break Label_0116;
                    }
                    catch (final RemoteException ex2) {
                        break Label_0116;
                    }
                    try {
                        final Object o = acquireUnstableContentProviderClient;
                        final String s = "serviceIntentCall";
                        final String s2 = null;
                        final Bundle bundle2 = bundle;
                        ((ContentProviderClient)o).call(s, s2, bundle2);
                        break Label_0133;
                    }
                    finally {
                        ((ContentProviderClient)acquireUnstableContentProviderClient).release();
                    }
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(bundle3.toString()));
                bundle3 = null;
            }
            ContentProviderClient contentProviderClient;
            if (bundle3 == null) {
                contentProviderClient = (ContentProviderClient)intent;
            }
            else {
                final Intent intent2 = (Intent)bundle3.getParcelable("serviceResponseIntentKey");
                if (intent2 != null) {
                    contentProviderClient = (ContentProviderClient)intent2;
                }
                else {
                    final PendingIntent pendingIntent = (PendingIntent)bundle3.getParcelable("serviceMissingResolutionIntentKey");
                    if (pendingIntent != null) {
                        final StringBuilder sb = new StringBuilder(a.length() + 72);
                        sb.append("Dynamic lookup for intent failed for action ");
                        sb.append(a);
                        sb.append(" but has possible resolution");
                        Log.w("ServiceBindIntentUtils", sb.toString());
                        throw new B(new b(25, pendingIntent));
                    }
                    contentProviderClient = (ContentProviderClient)intent;
                }
            }
            acquireUnstableContentProviderClient = contentProviderClient;
            if (contentProviderClient == null) {
                Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(a));
                acquireUnstableContentProviderClient = contentProviderClient;
            }
        }
        if (acquireUnstableContentProviderClient == null) {
            return new Intent(a).setPackage(j.b);
        }
        return (Intent)acquireUnstableContentProviderClient;
    }
}
