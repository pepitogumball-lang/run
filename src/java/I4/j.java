package i4;

import android.os.BaseBundle;
import g5.c;
import android.os.Bundle;
import android.content.Context;
import c2.k;
import g4.I;
import F3.e;
import e5.i;
import X2.f;
import m5.l;
import X.a;
import g4.u;
import X4.C;
import Y.b;

public final class j
{
    public static final h c;
    public static final b d;
    public final C a;
    public final d b;
    
    static {
        c = (h)new Object();
        d = J5.b.E(u.b, new a((l)g.D), 12);
    }
    
    public j(final f f, final i i, final i j, final e e) {
        f.a();
        final Context a = f.a;
        n5.h.d("firebaseApp.applicationContext", (Object)a);
        final I a2 = I.a;
        final g4.b a3 = I.a(f);
        final C a4 = new C(a);
        final k k = new k(a3, i);
        j.c.getClass();
        final d b = new d(j, e, a3, k, (W.h)j.d.a((Object)a, h.a[0]));
        this.a = a4;
        this.b = b;
    }
    
    public final double a() {
        final Bundle bundle = (Bundle)this.a.D;
        Object value;
        if (((BaseBundle)bundle).containsKey("firebase_sessions_sampling_rate")) {
            value = ((BaseBundle)bundle).getDouble("firebase_sessions_sampling_rate");
        }
        else {
            value = null;
        }
        if (value != null) {
            final double doubleValue = ((Number)value).doubleValue();
            if (0.0 <= doubleValue && doubleValue <= 1.0) {
                return doubleValue;
            }
        }
        final i4.f b = this.b.b().b;
        if (b != null) {
            final Double b2 = b.b;
            if (b2 != null) {
                final double doubleValue2 = ((Number)b2).doubleValue();
                if (0.0 <= doubleValue2 && doubleValue2 <= 1.0) {
                    return doubleValue2;
                }
            }
            return 1.0;
        }
        n5.h.h("sessionConfigs");
        throw null;
    }
    
    public final Object b(final c c) {
        i4.i k = null;
        Label_0047: {
            if (c instanceof i4.i) {
                final i4.i i = (i4.i)c;
                final int j = i.I;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    i.I = j + Integer.MIN_VALUE;
                    k = i;
                    break Label_0047;
                }
            }
            k = new i4.i(this, c);
        }
        final Object g = k.G;
        final f5.a c2 = f5.a.C;
        final int l = k.I;
        final c5.h a = c5.h.a;
        j f;
        if (l != 0) {
            if (l != 1) {
                if (l == 2) {
                    com.google.android.gms.internal.auth.h.z(g);
                    return a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                f = k.F;
                com.google.android.gms.internal.auth.h.z(g);
            }
        }
        else {
            com.google.android.gms.internal.auth.h.z(g);
            k.F = this;
            k.I = 1;
            this.a.getClass();
            if (a == c2) {
                return c2;
            }
            f = this;
        }
        final d b = f.b;
        k.F = null;
        k.I = 2;
        if (b.d((e5.d)k) == c2) {
            return c2;
        }
        return a;
    }
}
