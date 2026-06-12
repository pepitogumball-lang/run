package c2;

import android.os.IInterface;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import android.util.Base64;
import x2.a;
import b2.b;
import f2.i;
import f2.h;
import g2.o;
import C2.m;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import h2.g;

public final class e extends g
{
    public final GoogleSignInOptions A;
    
    public e(final Context context, final Looper looper, final m m, final GoogleSignInOptions googleSignInOptions, final o o, final o o2) {
        super(context, looper, 91, m, (h)o, (i)o2);
        b b;
        if (googleSignInOptions != null) {
            b = new b(googleSignInOptions);
        }
        else {
            b = new b();
        }
        final byte[] array = new byte[16];
        a.a.nextBytes(array);
        b.i = Base64.encodeToString(array, 11);
        final Set set = (Set)m.H;
        if (!set.isEmpty()) {
            for (final Scope scope : set) {
                final HashSet a = b.a;
                a.add((Object)scope);
                ((Set)a).addAll((Collection)Arrays.asList((Object[])new Scope[0]));
            }
        }
        this.A = b.a();
    }
    
    public final int b() {
        return 12451000;
    }
    
    public final IInterface e(final IBinder binder) {
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            if (queryLocalInterface instanceof c2.m) {
                o = queryLocalInterface;
            }
            else {
                o = new B2.a(binder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 5);
            }
        }
        return (IInterface)o;
    }
    
    public final String n() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }
    
    public final String o() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
