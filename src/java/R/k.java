package r;

import android.os.BaseBundle;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.os.IBinder;
import android.os.Bundle;
import android.app.ActivityOptions;
import java.util.ArrayList;
import c0.f;
import android.content.Intent;

public final class k
{
    public final Intent a;
    public final f b;
    public ArrayList c;
    public ActivityOptions d;
    public Bundle e;
    public int f;
    public boolean g;
    
    public k() {
        this.a = new Intent("android.intent.action.VIEW");
        this.b = new f(11);
        this.f = 0;
        this.g = true;
    }
    
    public k(final r r) {
        final Intent a = new Intent("android.intent.action.VIEW");
        this.a = a;
        this.b = new f(11);
        this.f = 0;
        this.g = true;
        if (r != null) {
            a.setPackage(r.d.getPackageName());
            final r.f c = r.c;
            final Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder)c);
            a.putExtras(bundle);
        }
    }
    
    public final l a() {
        final Intent a = this.a;
        final boolean hasExtra = a.hasExtra("android.support.customtabs.extra.SESSION");
        final Bundle bundle = null;
        if (!hasExtra) {
            final Bundle bundle2 = new Bundle();
            bundle2.putBinder("android.support.customtabs.extra.SESSION", (IBinder)null);
            a.putExtras(bundle2);
        }
        final ArrayList c = this.c;
        if (c != null) {
            a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", c);
        }
        a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.g);
        this.b.getClass();
        a.putExtras(new Bundle());
        final Bundle e = this.e;
        if (e != null) {
            a.putExtras(e);
        }
        a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final String a2 = i.a();
        if (!TextUtils.isEmpty((CharSequence)a2)) {
            Bundle bundleExtra;
            if (a.hasExtra("com.android.browser.headers")) {
                bundleExtra = a.getBundleExtra("com.android.browser.headers");
            }
            else {
                bundleExtra = new Bundle();
            }
            if (!((BaseBundle)bundleExtra).containsKey("Accept-Language")) {
                ((BaseBundle)bundleExtra).putString("Accept-Language", a2);
                a.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (sdk_INT >= 34) {
            if (this.d == null) {
                this.d = h.a();
            }
            j.a(this.d, false);
        }
        final ActivityOptions d = this.d;
        Bundle bundle3 = bundle;
        if (d != null) {
            bundle3 = d.toBundle();
        }
        return new l(a, bundle3);
    }
    
    public final void b(final int f) {
        if (f >= 0 && f <= 2) {
            this.f = f;
            final Intent a = this.a;
            if (f == 1) {
                a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            }
            else if (f == 2) {
                a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            }
            else {
                a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return;
        }
        throw new IllegalArgumentException("Invalid value for the shareState argument");
    }
}
