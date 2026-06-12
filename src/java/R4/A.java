package r4;

import android.app.Activity;
import O2.t;
import android.net.Uri;
import android.content.Intent;
import O2.d;
import L3.q;
import E4.j;
import com.google.android.gms.internal.measurement.K1;
import P2.g;
import F4.m;
import o.q1;
import n5.h;
import C4.b;
import android.util.Log;
import F4.o;
import io.flutter.embedding.android.FlutterActivity;
import android.content.Context;
import F4.p;
import F4.n;
import B4.c;

public final class a implements c, n, C4.a
{
    public p C;
    public Context D;
    public FlutterActivity E;
    
    public final boolean a(final o o) {
        Log.i("InAppReviewPlugin", "noContextOrActivity: called");
        if (this.D == null) {
            Log.e("InAppReviewPlugin", "noContextOrActivity: Android context not available");
            if (o != null) {
                o.error("error", "Android context not available", (Object)null);
            }
            return true;
        }
        if (this.E == null) {
            Log.e("InAppReviewPlugin", "noContextOrActivity: Android activity not available");
            if (o != null) {
                o.error("error", "Android activity not available", (Object)null);
            }
            return true;
        }
        return false;
    }
    
    public final void onAttachedToActivity(final b b) {
        h.e("binding", b);
        this.E = (FlutterActivity)((q1)b).C;
    }
    
    public final void onAttachedToEngine(final B4.b b) {
        h.e("flutterPluginBinding", b);
        (this.C = new p(b.c, "dev.britannio.in_app_review")).b((n)this);
        this.D = b.a;
    }
    
    public final void onDetachedFromActivity() {
        this.E = null;
    }
    
    public final void onDetachedFromActivityForConfigChanges() {
        this.E = null;
    }
    
    public final void onDetachedFromEngine(final B4.b b) {
        h.e("binding", b);
        final p c = this.C;
        if (c != null) {
            c.b((n)null);
            this.D = null;
            return;
        }
        h.h("channel");
        throw null;
    }
    
    public final void onMethodCall(final m m, final o o) {
        h.e("call", m);
        final StringBuilder sb = new StringBuilder("onMethodCall: ");
        final String a = m.a;
        sb.append(a);
        Log.i("InAppReviewPlugin", sb.toString());
        if (a != null) {
            final int hashCode = a.hashCode();
            if (hashCode != 159262157) {
                if (hashCode != 444517567) {
                    if (hashCode == 1361080007) {
                        if (a.equals((Object)"requestReview")) {
                            Log.i("InAppReviewPlugin", "requestReview: called");
                            if (this.a(o)) {
                                return;
                            }
                            try {
                                Context d = this.D;
                                h.b(d);
                                final Context applicationContext = d.getApplicationContext();
                                if (applicationContext != null) {
                                    d = applicationContext;
                                }
                                final K1 k1 = new K1(new g(d));
                                final t a2 = k1.A();
                                h.d("requestReviewFlow(...)", a2);
                                a2.k((d)new q((Object)this, (Object)k1, (Object)o, 5));
                            }
                            catch (final Exception ex) {
                                Log.e("InAppReviewPlugin", "requestReview: error", (Throwable)ex);
                                ((j)o).error("error", "An error occurred during the request review flow", (Object)null);
                            }
                            return;
                        }
                    }
                }
                else if (a.equals((Object)"isAvailable")) {
                    Log.i("InAppReviewPlugin", "isAvailable: called");
                    if (this.a(null)) {
                        ((j)o).success((Object)Boolean.FALSE);
                        return;
                    }
                    try {
                        Context d2 = this.D;
                        h.b(d2);
                        final Context applicationContext2 = d2.getApplicationContext();
                        if (applicationContext2 != null) {
                            d2 = applicationContext2;
                        }
                        final t a3 = new K1(new g(d2)).A();
                        h.d("requestReviewFlow(...)", a3);
                        a3.k((d)new E4.h((j)o, 5));
                    }
                    catch (final Exception ex2) {
                        Log.e("InAppReviewPlugin", "isAvailable: error", (Throwable)ex2);
                        ((j)o).success((Object)Boolean.FALSE);
                    }
                    return;
                }
            }
            else if (a.equals((Object)"openStoreListing")) {
                Log.i("InAppReviewPlugin", "openStoreListing: called");
                if (this.a(o)) {
                    return;
                }
                try {
                    final Context d3 = this.D;
                    h.b(d3);
                    final String packageName = d3.getPackageName();
                    final Intent intent = new Intent("android.intent.action.VIEW");
                    final StringBuilder sb2 = new StringBuilder("https://play.google.com/store/apps/details?id=");
                    sb2.append(packageName);
                    final Intent setData = intent.setData(Uri.parse(sb2.toString()));
                    h.d("setData(...)", setData);
                    final FlutterActivity e = this.E;
                    h.b(e);
                    ((Activity)e).startActivity(setData);
                    ((j)o).success((Object)null);
                }
                catch (final Exception ex3) {
                    Log.e("InAppReviewPlugin", "openStoreListing: error", (Throwable)ex3);
                    ((j)o).error("error", "An error occurred while opening the play store", (Object)null);
                }
                return;
            }
        }
        ((j)o).notImplemented();
    }
    
    public final void onReattachedToActivityForConfigChanges(final b b) {
        h.e("binding", b);
        this.E = (FlutterActivity)((q1)b).C;
    }
}
