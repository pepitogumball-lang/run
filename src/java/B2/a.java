package b2;

import com.google.android.gms.common.api.internal.BasePendingResult;
import u2.d;
import e2.e;
import f2.o;
import g2.q;
import C2.x;
import f2.k;
import com.google.android.gms.internal.auth.m;
import c0.f;
import c2.i;
import c2.h;
import f2.l;
import f2.n;
import h2.A;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import c2.c;
import O2.t;
import android.content.Context;
import f2.b;
import c2.j;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.content.Intent;
import K2.C;
import f2.g;

public final class a extends g
{
    public static final C N;
    public static int O = 1;
    
    static {
        N = new C(29);
    }
    
    public final Intent e() {
        final int h = this.h();
        final int n = h - 1;
        if (h == 0) {
            throw null;
        }
        final b g = super.G;
        final Context c = super.C;
        if (n == 2) {
            final GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions)g;
            j.a.g("getFallbackSignInIntent()", new Object[0]);
            final Intent a = j.a(c, googleSignInOptions);
            a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a;
        }
        if (n != 3) {
            final GoogleSignInOptions googleSignInOptions2 = (GoogleSignInOptions)g;
            j.a.g("getNoImplementationSignInIntent()", new Object[0]);
            final Intent a2 = j.a(c, googleSignInOptions2);
            a2.setAction("com.google.android.gms.auth.NO_IMPL");
            return a2;
        }
        return j.a(c, (GoogleSignInOptions)g);
    }
    
    public final t f() {
        final boolean b = this.h() == 3;
        j.a.g("Revoking access", new Object[0]);
        final Context c = super.C;
        final String f = c2.b.a(c).f("refreshToken");
        j.b(c);
        Object d;
        if (b) {
            if (f == null) {
                final x e = c2.c.E;
                final Status status = new Status(4, (String)null, (PendingIntent)null, (e2.b)null);
                A.a("Status code must not be SUCCESS", true ^ status.h());
                d = new n(status);
                ((BasePendingResult)d).K((l)status);
            }
            else {
                final c c2 = new c(f);
                new Thread((Runnable)c2).start();
                d = c2.D;
            }
        }
        else {
            final q k = super.K;
            d = new h(k, 1);
            k.b.b(1, (i)d);
        }
        final f f2 = new f(3);
        final O2.j j = new O2.j();
        ((BasePendingResult)d).G((k)new h2.t((m)d, j, (h2.m)f2));
        return j.a;
    }
    
    public final t g() {
        final boolean b = this.h() == 3;
        j.a.g("Signing out", new Object[0]);
        j.b(super.C);
        final q k = super.K;
        Object o;
        if (b) {
            final Status g = Status.G;
            o = new o(k, 1);
            ((BasePendingResult)o).K((l)g);
        }
        else {
            o = new h(k, 0);
            k.b.b(1, (i)o);
        }
        final f f = new f(3);
        final O2.j j = new O2.j();
        ((BasePendingResult)o).G((k)new h2.t((m)o, j, (h2.m)f));
        return j.a;
    }
    
    public final int h() {
        monitorenter(this);
        while (true) {
            Label_0052: {
                try {
                    int o;
                    if ((o = a.O) != 1) {
                        break Label_0088;
                    }
                    final Context c = super.C;
                    final e d = e.d;
                    final int c2 = ((e2.f)d).c(c, 12451000);
                    if (c2 == 0) {
                        o = 4;
                        a.O = 4;
                        break Label_0088;
                    }
                    break Label_0052;
                }
                finally {
                    monitorexit(this);
                    monitorexit(this);
                    return 0;
                    final Context c;
                    final e d;
                    final int c2;
                    iftrue(Label_0082:)(((e2.f)d).b(c2, c, (String)null) != null || u2.d.a(c, "com.google.android.gms.auth.api.fallback") == 0);
                    Block_7: {
                        break Block_7;
                        Label_0082: {
                            o = 2;
                        }
                        a.O = 2;
                        continue;
                    }
                    o = 3;
                    a.O = 3;
                    continue;
                }
            }
            break;
        }
    }
}
