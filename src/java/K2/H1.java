package K2;

import V2.o;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.IBinder;
import android.content.ComponentName;
import android.os.DeadObjectException;
import h2.A;
import h2.b;
import h2.a;
import android.content.ServiceConnection;

public final class h1 implements ServiceConnection, a, b
{
    public volatile boolean C;
    public volatile M D;
    public final b1 E;
    
    public h1(final b1 e) {
        this.E = e;
    }
    
    public final void Q(final int n) {
        A.d("MeasurementServiceConnection.onConnectionSuspended");
        final b1 e = this.E;
        e.j().O.f("Service connection suspended");
        e.l().E((Runnable)new i1(this, 1));
    }
    
    public final void T() {
        A.d("MeasurementServiceConnection.onConnected");
        monitorenter(this);
        try {
            try {
                A.h((Object)this.D);
                this.E.l().E((Runnable)new g1(this, (H)this.D.m(), 1));
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
        catch (final DeadObjectException | IllegalStateException ex) {}
    }
    
    public final void e0(final e2.b b) {
        A.d("MeasurementServiceConnection.onConnectionFailed");
        P k = ((n0)this.E.C).K;
        if (k == null || !k.D) {
            k = null;
        }
        if (k != null) {
            k.K.g("Service connection failed", b);
        }
        synchronized (this) {
            this.C = false;
            this.D = null;
            monitorexit(this);
            this.E.l().E((Runnable)new i1(this, 0));
        }
    }
    
    public final void onServiceConnected(ComponentName componentName, final IBinder binder) {
        A.d("MeasurementServiceConnection.onServiceConnected");
        monitorenter(this);
        Label_0042: {
            if (binder != null) {
                break Label_0042;
            }
            try {
                this.C = false;
                this.E.j().H.f("Service connected with null binder");
                monitorexit(this);
            }
            finally {
                while (true) {
                    Label_0246: {
                        break Label_0246;
                        this.C = false;
                        try {
                            final p2.a b = p2.a.b();
                            final b1 e = this.E;
                            b.c(((n0)e.C).C, (ServiceConnection)e.E);
                            monitorexit(this);
                            return;
                            monitorexit(this);
                            Label_0218: {
                                this.E.l().E((Runnable)new g1(this, (H)componentName, 0));
                            }
                        }
                        catch (final IllegalArgumentException ex) {}
                    }
                    final ComponentName componentName2 = null;
                    final ComponentName componentName3 = componentName = null;
                    try {
                        final String interfaceDescriptor = binder.getInterfaceDescriptor();
                        componentName = componentName3;
                        if ("com.google.android.gms.measurement.internal.IMeasurementService".equals((Object)interfaceDescriptor)) {
                            componentName = componentName3;
                            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                            componentName = componentName3;
                            Object o;
                            if (queryLocalInterface instanceof H) {
                                componentName = componentName3;
                                o = queryLocalInterface;
                            }
                            else {
                                componentName = componentName3;
                                o = new I(binder);
                            }
                            componentName = (ComponentName)o;
                            this.E.j().P.f("Bound to IMeasurementService interface");
                            componentName = (ComponentName)o;
                        }
                        else {
                            componentName = componentName3;
                            this.E.j().H.g("Got binder with a wrong descriptor", interfaceDescriptor);
                            componentName = componentName2;
                        }
                    }
                    catch (final RemoteException ex2) {
                        this.E.j().H.f("Service connect failed to get IMeasurementService");
                    }
                    iftrue(Label_0218:)(componentName != null);
                    continue;
                }
            }
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        A.d("MeasurementServiceConnection.onServiceDisconnected");
        final b1 e = this.E;
        e.j().O.f("Service disconnected");
        e.l().E((Runnable)new o(22, (Object)this, (Object)componentName, false));
    }
}
