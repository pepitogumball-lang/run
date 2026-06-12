package s4;

import android.content.pm.PackageManager;
import android.content.Context;
import F4.f;
import F4.n;
import h1.m;
import android.app.ActivityManager;
import n5.h;
import B4.b;
import F4.p;
import B4.c;

public final class a implements c
{
    public p C;
    
    public final void onAttachedToEngine(final b b) {
        h.e("binding", b);
        final f c = b.c;
        h.d("getBinaryMessenger(...)", c);
        final Context a = b.a;
        h.d("getApplicationContext(...)", a);
        this.C = new p(c, "dev.fluttercommunity.plus/device_info");
        final PackageManager packageManager = a.getPackageManager();
        h.d("getPackageManager(...)", packageManager);
        final Object systemService = a.getSystemService("activity");
        h.c("null cannot be cast to non-null type android.app.ActivityManager", systemService);
        final m m = new m(10, (Object)packageManager, (Object)systemService, false);
        final p c2 = this.C;
        if (c2 != null) {
            c2.b((n)m);
            return;
        }
        h.h("methodChannel");
        throw null;
    }
    
    public final void onDetachedFromEngine(final b b) {
        h.e("binding", b);
        final p c = this.C;
        if (c != null) {
            c.b((n)null);
            return;
        }
        h.h("methodChannel");
        throw null;
    }
}
