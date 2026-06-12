package F1;

import android.os.BaseBundle;
import J1.e;
import android.os.Bundle;
import com.google.android.gms.internal.ads.o8;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.D7;
import u2.d;
import e2.f;
import android.content.Context;
import android.os.IInterface;
import B2.a;
import J1.j;
import android.os.IBinder;

public abstract class o
{
    public static final N a;
    
    static {
        Object a2 = null;
        try {
            final Object instance = n.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor((Class[])null).newInstance((Object[])null);
            if (!(instance instanceof IBinder)) {
                j.i("ClientApi class is not an instance of IBinder.");
            }
            else {
                final IBinder binder = (IBinder)instance;
                if (binder != null) {
                    final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof N) {
                        a2 = queryLocalInterface;
                    }
                    else {
                        a2 = new a(binder, "com.google.android.gms.ads.internal.client.IClientApi", 1);
                    }
                }
            }
        }
        catch (final Exception ex) {
            j.i("Failed to instantiate ClientApi class.");
        }
        a = (N)a2;
    }
    
    public abstract Object a();
    
    public abstract Object b();
    
    public abstract Object c();
    
    public final Object d(final Context context, final boolean b) {
        boolean b2 = b;
        if (!b) {
            final e a = p.f.a;
            if (f.b.c(context, 12451000) == 0) {
                b2 = b;
            }
            else {
                j.d("Google Play Services is not available.");
                b2 = true;
            }
        }
        final int a2 = d.a(context, "com.google.android.gms.ads.dynamite");
        final int n = 0;
        final boolean b3 = a2 <= d.d(context, "com.google.android.gms.ads.dynamite", false);
        D7.a(context);
        int n3;
        int n4;
        if (b8.a.p()) {
            final int n2 = 0;
            n3 = n;
            n4 = n2;
        }
        else if (b8.b.p()) {
            n4 = 1;
            n3 = 1;
        }
        else {
            n3 = ((b2 | (b3 ^ true)) ? 1 : 0);
            n4 = 0;
        }
        final N a3 = o.a;
        final Object o = null;
        Object o2;
        if (n3 != 0) {
            Object b4 = null;
            Label_0181: {
                if (a3 != null) {
                    try {
                        b4 = this.b();
                        break Label_0181;
                    }
                    catch (final RemoteException ex) {
                        j.j("Cannot invoke local loader using ClientApi class.", (Throwable)ex);
                    }
                }
                else {
                    j.i("ClientApi class cannot be loaded.");
                }
                b4 = null;
            }
            o2 = b4;
            if (b4 == null) {
                o2 = b4;
                if (n4 == 0) {
                    try {
                        o2 = this.c();
                    }
                    catch (final RemoteException ex2) {
                        j.j("Cannot invoke remote loader.", (Throwable)ex2);
                        o2 = o;
                    }
                }
            }
        }
        else {
            Object c;
            try {
                c = this.c();
            }
            catch (final RemoteException ex3) {
                j.j("Cannot invoke remote loader.", (Throwable)ex3);
                c = null;
            }
            if (c == null) {
                final int intValue = ((Long)o8.a.p()).intValue();
                final p f = p.f;
                if (f.e.nextInt(intValue) == 0) {
                    final Bundle bundle = new Bundle();
                    ((BaseBundle)bundle).putString("action", "dynamite_load");
                    ((BaseBundle)bundle).putInt("is_missing", 1);
                    final String c2 = f.d.C;
                    final e a4 = f.a;
                    a4.getClass();
                    e.n(context, c2, bundle, (J1.d)new C3.f(a4));
                }
            }
            if (c == null) {
                if (a3 != null) {
                    try {
                        o2 = this.b();
                    }
                    catch (final RemoteException ex4) {
                        j.j("Cannot invoke local loader using ClientApi class.", (Throwable)ex4);
                        o2 = o;
                    }
                }
                else {
                    j.i("ClientApi class cannot be loaded.");
                    o2 = o;
                }
            }
            else {
                o2 = c;
            }
        }
        Object a5;
        if ((a5 = o2) == null) {
            a5 = this.a();
        }
        return a5;
    }
}
