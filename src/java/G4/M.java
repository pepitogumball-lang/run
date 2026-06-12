package g4;

import android.content.Context;
import m5.p;
import w5.u;
import e5.d;
import w5.v;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.util.Log;
import e5.i;
import i4.j;
import X2.f;

public final class m
{
    public final f a;
    public final j b;
    
    public m(final f a, final j b, final i i, final V v) {
        this.a = a;
        this.b = b;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        a.a();
        final Context applicationContext = a.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application)applicationContext).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)X.C);
            v.i((u)v.a(i), (p)new l(this, i, v, null));
        }
        else {
            final StringBuilder sb = new StringBuilder("Failed to register lifecycle callbacks, unexpected context ");
            sb.append((Object)((Application)applicationContext).getClass());
            sb.append('.');
            Log.e("FirebaseSessions", sb.toString());
        }
    }
}
