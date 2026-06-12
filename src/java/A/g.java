package A;

import java.util.List;
import android.content.pm.PackageManager;
import android.content.Intent;
import android.util.Log;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import s2.b;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import java.util.ArrayList;
import android.content.res.XmlResourceParser;
import android.content.Context;
import C2.p;

public final class g
{
    public int a = a;
    public int b = b;
    public final Object c = c;
    
    public g(final Context c) {
        this.b = 0;
        this.c = c;
    }
    
    public g(final Context context, final XmlResourceParser xmlResourceParser) {
        this.c = new ArrayList();
        this.b = -1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet((XmlPullParser)xmlResourceParser), s.h);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            }
            else if (index == 1) {
                final int resourceId = obtainStyledAttributes.getResourceId(index, this.b);
                this.b = resourceId;
                final String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals((Object)resourceTypeName)) {
                    new o().a(context, resourceId);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    public int a() {
        monitorenter(this);
        while (true) {
            while (true) {
                try {
                    if (this.a == 0) {
                        final g g = this;
                        final Object o = g.c;
                        final Context context = (Context)o;
                        final R4.b b = s2.b.a(context);
                        final int n = 0;
                        final String s = "com.google.android.gms";
                        final PackageInfo packageInfo = b.c(n, s);
                        break Label_0053;
                    }
                    break Label_0065;
                }
                finally {
                    monitorexit(this);
                    final PackageInfo packageInfo;
                    iftrue(Label_0065:)(packageInfo == null);
                    Block_7: {
                        break Block_7;
                        final int a = this.a;
                        monitorexit(this);
                        return a;
                    }
                    this.a = packageInfo.versionCode;
                    continue;
                }
                break;
            }
            try {
                final g g = this;
                final Object o = g.c;
                final Context context = (Context)o;
                final R4.b b = s2.b.a(context);
                final int n = 0;
                final String s = "com.google.android.gms";
                final PackageInfo packageInfo = b.c(n, s);
                continue;
            }
            catch (final PackageManager$NameNotFoundException ex) {}
            break;
        }
    }
    
    public int b() {
        monitorenter(this);
        Label_0075: {
            try {
                final int b = this.b;
                if (b != 0) {
                    monitorexit(this);
                    return b;
                }
                final Context context = (Context)this.c;
                final PackageManager packageManager = context.getPackageManager();
                if (s2.b.a(context).C.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("Metadata", "Google Play services missing or without correct permission.");
                    monitorexit(this);
                    return 0;
                }
                break Label_0075;
            }
            finally {
                monitorexit(this);
                while (true) {
                    int n = 0;
                    Block_11: {
                        while (true) {
                            int b2 = 0;
                            this.b = b2;
                            monitorexit(this);
                            return b2;
                            Label_0192: {
                                Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                            }
                            iftrue(Label_0212:)(q2.b.h());
                            break Block_11;
                            Label_0135:
                            final Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                            intent.setPackage("com.google.android.gms");
                            final PackageManager packageManager;
                            final List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                            iftrue(Label_0192:)(queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty());
                            Block_10: {
                                break Block_10;
                                final boolean h = q2.b.h();
                                n = 1;
                                b2 = 1;
                                iftrue(Label_0135:)(h);
                                Block_6: {
                                    break Block_6;
                                    final int b3;
                                    this.b = b3;
                                    monitorexit(this);
                                    return b3;
                                }
                                final Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                                intent2.setPackage("com.google.android.gms");
                                final List queryIntentServices = packageManager.queryIntentServices(intent2, 0);
                                iftrue(Label_0135:)(queryIntentServices == null || queryIntentServices.isEmpty());
                                continue;
                            }
                            b2 = 2;
                            continue;
                        }
                        Label_0212: {
                            final int b3 = 2;
                        }
                        continue;
                    }
                    final int b3 = n;
                    continue;
                }
            }
        }
    }
}
