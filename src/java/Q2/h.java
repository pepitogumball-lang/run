package Q2;

import h1.b;
import com.google.android.gms.internal.play_billing.W1;
import P2.e;
import m5.p;
import w5.u;
import e5.d;
import g4.T;
import w5.v;
import e5.i;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Messenger;
import android.util.Log;
import java.util.concurrent.LinkedBlockingDeque;
import L3.A;
import java.util.Objects;
import h1.C;
import com.google.android.gms.internal.play_billing.zzau;
import h1.z;
import com.google.android.gms.internal.play_billing.q0;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class h implements ServiceConnection
{
    public final int C;
    public final Object D;
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        switch (this.C) {
            default: {
                q0.f("BillingClientTesting", "Billing Override Service connected.");
                ((z)this.D).H = zzau.zzc(binder);
                ((z)this.D).G = 2;
                final z z = (z)this.D;
                z.getClass();
                final W1 d = h1.C.d(26);
                Objects.requireNonNull((Object)d, "ApiSuccess should not be null");
                ((b)z).g.m(d);
                return;
            }
            case 1: {
                final StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                final A a = (A)this.D;
                sb.append(((LinkedBlockingDeque)a.F).size());
                Log.d("SessionLifecycleClient", sb.toString());
                a.E = new Messenger(binder);
                final ArrayList list = new ArrayList();
                ((LinkedBlockingDeque)a.F).drainTo((Collection)list);
                v.i((u)v.a((i)a.D), (p)new T(a, list, (d)null));
                return;
            }
            case 0: {
                final Q2.i i = (Q2.i)this.D;
                i.b.e("ServiceConnectionImpl.onServiceConnected(%s)", new Object[] { componentName });
                i.a().post((Runnable)new e(this, binder));
            }
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        switch (this.C) {
            default: {
                q0.g("BillingClientTesting", "Billing Override Service disconnected.");
                ((z)this.D).H = null;
                ((z)this.D).G = 0;
                return;
            }
            case 1: {
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                final A a = (A)this.D;
                a.E = null;
                a.getClass();
                return;
            }
            case 0: {
                final Q2.i i = (Q2.i)this.D;
                i.b.e("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[] { componentName });
                i.a().post((Runnable)new g(this, 1));
            }
        }
    }
}
