package n0;

import android.view.InputEvent;
import android.net.Uri;
import m5.p;
import e5.i;
import w5.v;
import w5.C;
import V2.q;
import android.util.Log;
import l0.a;
import android.os.Build$VERSION;
import n5.h;
import android.content.Context;
import p0.b;

public final class d
{
    public final b a;
    
    public d(final b a) {
        this.a = a;
    }
    
    public static final d b(final Context context) {
        h.e("context", (Object)context);
        final StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        final int sdk_INT = Build$VERSION.SDK_INT;
        final a a = l0.a.a;
        final int n = 0;
        int a2;
        if (sdk_INT >= 30) {
            a2 = a.a();
        }
        else {
            a2 = 0;
        }
        sb.append(a2);
        Log.d("MeasurementManager", sb.toString());
        int a3 = n;
        if (sdk_INT >= 30) {
            a3 = a.a();
        }
        d d = null;
        b b;
        if (a3 >= 5) {
            b = new b(context);
        }
        else {
            b = null;
        }
        if (b != null) {
            d = new d(b);
        }
        return d;
    }
    
    public q a(final p0.a a) {
        h.e("deletionRequest", (Object)a);
        throw null;
    }
    
    public q c() {
        return (q)a.a.b(v.b(v.a((i)C.a), (p)new n0.a(this, null)));
    }
    
    public q d(final Uri uri, final InputEvent inputEvent) {
        h.e("attributionSource", (Object)uri);
        return (q)a.a.b(v.b(v.a((i)C.a), (p)new n0.b(this, uri, inputEvent, null)));
    }
    
    public q e(final Uri uri) {
        h.e("trigger", (Object)uri);
        return (q)a.a.b(v.b(v.a((i)C.a), (p)new c(this, uri, null)));
    }
    
    public q f(final p0.c c) {
        h.e("request", (Object)c);
        throw null;
    }
    
    public q g(final p0.d d) {
        h.e("request", (Object)d);
        throw null;
    }
}
