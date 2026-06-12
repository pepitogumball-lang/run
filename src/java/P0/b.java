package p0;

import android.view.InputEvent;
import android.net.Uri;
import android.os.OutcomeReceiver;
import K.e;
import w5.f;
import n3.u0;
import e5.d;
import E4.a;
import n5.h;
import android.content.Context;
import android.adservices.measurement.MeasurementManager;

public final class b
{
    public final MeasurementManager a;
    
    public b(final Context context) {
        h.e("context", context);
        final Object systemService = context.getSystemService(E4.a.m());
        h.d("context.getSystemService\u2026:class.java\n            )", systemService);
        final MeasurementManager e = E4.a.e(systemService);
        this.a = e;
    }
    
    public Object a(final p0.a a, final d d) {
        new f(1, u0.o(d)).u();
        a.o();
        throw null;
    }
    
    public Object b(final d d) {
        final f f = new f(1, u0.o(d));
        f.u();
        E4.a.r(this.a, new p.a(1), (OutcomeReceiver)new e(f));
        return f.t();
    }
    
    public Object c(final Uri uri, final InputEvent inputEvent, final d d) {
        final f f = new f(1, u0.o(d));
        f.u();
        E4.a.p(this.a, uri, inputEvent, new p.a(1), (OutcomeReceiver)new e(f));
        final Object t = f.t();
        if (t == f5.a.C) {
            return t;
        }
        return c5.h.a;
    }
    
    public Object d(final Uri uri, final d d) {
        final f f = new f(1, u0.o(d));
        f.u();
        E4.a.q(this.a, uri, new p.a(1), (OutcomeReceiver)new e(f));
        final Object t = f.t();
        if (t == f5.a.C) {
            return t;
        }
        return c5.h.a;
    }
    
    public Object e(final c c, final d d) {
        new f(1, u0.o(d)).u();
        E4.a.x();
        throw null;
    }
    
    public Object f(final p0.d d, final d d2) {
        new f(1, u0.o(d2)).u();
        E4.a.z();
        throw null;
    }
}
