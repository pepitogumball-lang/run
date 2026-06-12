package Y0;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import d1.a;
import android.content.Context;
import R0.m;
import I1.E;

public abstract class c extends d
{
    public static final String h;
    public final E g;
    
    static {
        h = m.h("BrdcstRcvrCnstrntTrckr");
    }
    
    public c(final Context context, final a a) {
        super(context, a);
        this.g = new E((Object)this, 4);
    }
    
    @Override
    public final void d() {
        m.e().c(c.h, this.getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        super.b.registerReceiver((BroadcastReceiver)this.g, this.f());
    }
    
    @Override
    public final void e() {
        m.e().c(c.h, this.getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        super.b.unregisterReceiver((BroadcastReceiver)this.g);
    }
    
    public abstract IntentFilter f();
    
    public abstract void g(final Intent p0);
}
