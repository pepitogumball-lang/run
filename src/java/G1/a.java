package g1;

import r.l;
import android.net.Uri;
import r.k;
import android.app.Activity;
import F4.o;
import F4.m;
import o.q1;
import n5.h;
import android.content.Intent;
import C4.b;
import F4.p;
import androidx.activity.d;
import E4.j;
import F4.r;
import F4.n;
import B4.c;

public final class a implements c, n, C4.a, r
{
    public static j E;
    public static d F;
    public p C;
    public b D;
    
    public final boolean onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == 1001) {
            final j e = a.E;
            if (e != null) {
                e.error("authorization-error/canceled", "The user closed the Custom Tab", (Object)null);
                a.E = null;
                a.F = null;
            }
        }
        return false;
    }
    
    public final void onAttachedToActivity(final b d) {
        h.e("binding", (Object)d);
        this.D = d;
        ((q1)d).b((r)this);
    }
    
    public final void onAttachedToEngine(final B4.b b) {
        h.e("flutterPluginBinding", (Object)b);
        (this.C = new p(b.c, "com.aboutyou.dart_packages.sign_in_with_apple")).b((n)this);
    }
    
    public final void onDetachedFromActivity() {
        final b d = this.D;
        if (d != null) {
            ((q1)d).h((r)this);
        }
        this.D = null;
    }
    
    public final void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }
    
    public final void onDetachedFromEngine(final B4.b b) {
        h.e("binding", (Object)b);
        final p c = this.C;
        if (c != null) {
            c.b((n)null);
        }
        this.C = null;
    }
    
    public final void onMethodCall(final m m, final o o) {
        h.e("call", (Object)m);
        final String a = m.a;
        if (h.a((Object)a, (Object)"isAvailable")) {
            ((j)o).success((Object)Boolean.TRUE);
        }
        else if (h.a((Object)a, (Object)"performAuthorizationRequest")) {
            final b d = this.D;
            Object o2;
            if (d != null) {
                o2 = ((q1)d).C;
            }
            else {
                o2 = null;
            }
            final Object b = m.b;
            if (o2 == null) {
                ((j)o).error("MISSING_ACTIVITY", "Plugin is not attached to an activity", b);
                return;
            }
            final String s = (String)m.a("url");
            if (s == null) {
                ((j)o).error("MISSING_ARG", "Missing 'url' argument", b);
                return;
            }
            final j e = g1.a.E;
            if (e != null) {
                e.error("NEW_REQUEST", "A new request came in while this was still pending. The previous request (this one) was then cancelled.", (Object)null);
            }
            final d f = g1.a.F;
            if (f != null) {
                f.b();
            }
            g1.a.E = (j)o;
            g1.a.F = new d((Activity)o2, 1);
            final l a2 = new k().a();
            final Uri parse = Uri.parse(s);
            final Intent a3 = a2.a;
            a3.setData(parse);
            ((Activity)o2).startActivityForResult(a3, 1001, a2.b);
        }
        else {
            ((j)o).notImplemented();
        }
    }
    
    public final void onReattachedToActivityForConfigChanges(final b b) {
        h.e("binding", (Object)b);
        this.onAttachedToActivity(b);
    }
}
