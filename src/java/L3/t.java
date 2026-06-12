package L3;

import android.os.BaseBundle;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.SharedPreferences;
import android.content.Context;
import X2.f;
import android.content.pm.PackageManager$NameNotFoundException;
import B3.b;
import java.util.concurrent.Executor;
import e3.i;
import B3.d;
import com.google.firebase.messaging.FirebaseMessaging;

public final class t
{
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;
    public final Object e;
    
    public t(final FirebaseMessaging e, final d b) {
        this.e = e;
        this.b = b;
    }
    
    public t(String s, final String s2, final String s3, final String e, final boolean a) {
        String b = s;
        if (s == null) {
            b = "libapp.so";
        }
        this.b = b;
        if ((s = s2) == null) {
            s = "flutter_assets";
        }
        this.c = s;
        this.e = e;
        if ((s = s3) == null) {
            s = "";
        }
        this.d = s;
        this.a = a;
    }
    
    public void a() {
        monitorenter(this);
        Label_0073: {
            try {
                if (this.a) {
                    monitorexit(this);
                    return;
                }
                if ((this.d = this.c()) == null) {
                    final s c = new s(this);
                    this.c = c;
                    final i i = (i)this.b;
                    i.b((Executor)i.c, (b)c);
                }
                break Label_0073;
            }
            finally {
                monitorexit(this);
                this.a = true;
                monitorexit(this);
            }
        }
    }
    
    public boolean b() {
        monitorenter(this);
        Label_0032: {
            try {
                this.a();
                final Boolean b = (Boolean)this.d;
                if (b != null) {
                    final boolean b2 = b;
                    break Label_0032;
                }
                break Label_0032;
            }
            finally {
                monitorexit(this);
                final boolean b2 = ((FirebaseMessaging)this.e).a.k();
                monitorexit(this);
                return b2;
            }
        }
    }
    
    public Boolean c() {
        final f a = ((FirebaseMessaging)this.e).a;
        a.a();
        final Context a2 = a.a;
        final SharedPreferences sharedPreferences = a2.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return sharedPreferences.getBoolean("auto_init", false);
        }
        try {
            final PackageManager packageManager = a2.getPackageManager();
            if (packageManager != null) {
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a2.getPackageName(), 128);
                if (applicationInfo != null) {
                    final Bundle metaData = applicationInfo.metaData;
                    if (metaData != null && ((BaseBundle)metaData).containsKey("firebase_messaging_auto_init_enabled")) {
                        return ((BaseBundle)applicationInfo.metaData).getBoolean("firebase_messaging_auto_init_enabled");
                    }
                }
            }
            return null;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
}
