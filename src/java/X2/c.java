package x2;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IInterface;
import android.os.IBinder;
import android.util.Base64;
import com.google.android.gms.internal.auth.l;
import f2.i;
import f2.h;
import g2.o;
import C2.m;
import android.os.Looper;
import android.content.Context;
import X1.b;
import h2.g;

public final class c extends g
{
    public final b A;
    
    public c(final Context context, final Looper looper, final m m, final b b, final o o, final o o2) {
        super(context, looper, 68, m, (h)o, (i)o2);
        b e = b;
        if (b == null) {
            e = b.E;
        }
        final l l = new l(17, false);
        l.D = Boolean.FALSE;
        final b e2 = b.E;
        e.getClass();
        l.D = e.C;
        l.E = e.D;
        final byte[] array = new byte[16];
        a.a.nextBytes(array);
        l.E = Base64.encodeToString(array, 11);
        this.A = new b(l);
    }
    
    public final int b() {
        return 12800000;
    }
    
    public final IInterface e(final IBinder binder) {
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            if (queryLocalInterface instanceof d) {
                o = queryLocalInterface;
            }
            else {
                o = new B2.a(binder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 5);
            }
        }
        return (IInterface)o;
    }
    
    public final Bundle j() {
        final b a = this.A;
        a.getClass();
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("consumer_package", (String)null);
        ((BaseBundle)bundle).putBoolean("force_save_dialog", a.C);
        ((BaseBundle)bundle).putString("log_session_id", a.D);
        return bundle;
    }
    
    public final String n() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }
    
    public final String o() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
