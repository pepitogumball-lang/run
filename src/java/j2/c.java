package j2;

import android.os.BaseBundle;
import android.os.Bundle;
import z2.b;
import e2.d;
import android.os.IInterface;
import android.os.IBinder;
import f2.i;
import f2.h;
import g2.o;
import C2.m;
import android.os.Looper;
import android.content.Context;
import h2.q;
import h2.g;

public final class c extends g
{
    public final q A;
    
    public c(final Context context, final Looper looper, final m m, final q a, final o o, final o o2) {
        super(context, looper, 270, m, (h)o, (i)o2);
        this.A = a;
    }
    
    public final int b() {
        return 203400000;
    }
    
    public final IInterface e(final IBinder binder) {
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
            if (queryLocalInterface instanceof a) {
                o = queryLocalInterface;
            }
            else {
                o = new B2.a(binder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 6);
            }
        }
        return (IInterface)o;
    }
    
    public final d[] h() {
        return b.b;
    }
    
    public final Bundle j() {
        final q a = this.A;
        a.getClass();
        final Bundle bundle = new Bundle();
        final String c = a.C;
        if (c != null) {
            ((BaseBundle)bundle).putString("api", c);
        }
        return bundle;
    }
    
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }
    
    public final String o() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
    
    public final boolean p() {
        return true;
    }
}
