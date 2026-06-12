package g4;

import android.content.Context;
import X2.f;
import java.util.Iterator;
import android.content.ServiceConnection;
import android.os.Parcelable;
import android.os.Process;
import android.content.Intent;
import com.google.firebase.sessions.SessionLifecycleService;
import android.os.Handler;
import android.os.Messenger;
import com.google.android.gms.internal.ads.HE;
import L3.A;
import android.util.Log;
import k3.j;
import java.util.Collection;
import java.util.Map;
import h4.c;
import f5.a;
import e5.d;
import e5.i;
import m5.p;
import g5.h;

public final class l extends h implements p
{
    public int G;
    public final m H;
    public final i I;
    public final V J;
    
    public l(final m h, final i i, final V j, final d d) {
        this.H = h;
        this.I = i;
        this.J = j;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((l)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object o) {
        return (d)new l(this.H, this.I, this.J, d);
    }
    
    public final Object l(Object b) {
        final a c = a.C;
        final int g = this.G;
        final m h = this.H;
        Label_0180: {
            if (g != 0) {
                if (g != 1) {
                    if (g == 2) {
                        com.google.android.gms.internal.auth.h.z(b);
                        break Label_0180;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    com.google.android.gms.internal.auth.h.z(b);
                }
            }
            else {
                com.google.android.gms.internal.auth.h.z(b);
                final c a = h4.c.a;
                this.G = 1;
                if ((b = a.b((g5.c)this)) == c) {
                    return c;
                }
            }
            final Iterable iterable = (Iterable)((Map)b).values();
            if (!(iterable instanceof Collection) || !((Collection)iterable).isEmpty()) {
                final Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    if (((j)iterator.next()).a.f()) {
                        final i4.j b2 = h.b;
                        this.G = 2;
                        if (b2.b((g5.c)this) == c) {
                            return c;
                        }
                        break Label_0180;
                    }
                }
            }
            Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
            return c5.h.a;
        }
        final i4.j b3 = h.b;
        final Boolean g2 = b3.a.g();
        boolean booleanValue;
        if (g2 != null) {
            booleanValue = g2;
        }
        else {
            final Boolean a2 = b3.b.a();
            booleanValue = (a2 == null || a2);
        }
        if (!booleanValue) {
            Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
        }
        else {
            final i i = this.I;
            b = new A(i);
            final V j = this.J;
            final Messenger messenger = new Messenger((Handler)new HE(i));
            final W w = (W)j;
            final Q2.h h2 = (Q2.h)((A)b).G;
            n5.h.e("serviceConnection", (Object)h2);
            final f a3 = w.a;
            a3.a();
            final Context applicationContext = a3.a.getApplicationContext();
            n5.h.d("firebaseApp.applicationContext.applicationContext", (Object)applicationContext);
            final Intent intent = new Intent(applicationContext, (Class)SessionLifecycleService.class);
            Log.d("LifecycleServiceBinder", "Binding service to application.");
            intent.setAction(String.valueOf(Process.myPid()));
            intent.putExtra("ClientCallbackMessenger", (Parcelable)messenger);
            intent.setPackage(applicationContext.getPackageName());
            boolean bindService;
            try {
                bindService = applicationContext.bindService(intent, (ServiceConnection)h2, 65);
            }
            catch (final SecurityException ex) {
                Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", (Throwable)ex);
                bindService = false;
            }
            if (!bindService) {
                try {
                    applicationContext.unbindService((ServiceConnection)h2);
                }
                catch (final IllegalArgumentException ex2) {
                    Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", (Throwable)ex2);
                }
                Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
            }
            X.E = (A)b;
            if (X.D) {
                X.D = false;
                ((A)b).i(1);
            }
            final f a4 = h.a;
            b = new Object();
            a4.a();
            a4.j.add(b);
        }
        return c5.h.a;
    }
}
