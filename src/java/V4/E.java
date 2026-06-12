package v4;

import android.view.View;
import android.os.BaseBundle;
import android.app.Activity;
import io.flutter.plugin.platform.q;
import android.util.SparseArray;
import java.util.Iterator;
import h1.F;
import x4.j;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Collection;
import java.util.HashSet;
import C2.b;
import android.os.Trace;
import java.util.HashMap;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.net.Uri;
import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Intent;
import android.util.Log;
import java.util.List;
import c2.k;
import com.google.android.gms.internal.ads.vo;
import io.flutter.embedding.engine.renderer.a;
import C2.x;
import I1.r;
import w4.c;
import io.flutter.embedding.android.FlutterActivity;

public final class e
{
    public FlutterActivity a;
    public c b;
    public l c;
    public r d;
    public x e;
    public d f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public Integer k;
    public final a l;
    
    public e(final FlutterActivity a) {
        this.l = new a((Object)this, 1);
        this.a = a;
        this.i = false;
    }
    
    public final void a(final vo vo) {
        final String a = this.a.a();
        String s = null;
        Label_0040: {
            if (a != null) {
                s = a;
                if (!a.isEmpty()) {
                    break Label_0040;
                }
            }
            s = (String)((z4.d)c2.k.t().D).d.c;
        }
        final x4.a h = new x4.a(s, this.a.d());
        String f;
        if ((f = this.a.e()) == null) {
            final FlutterActivity a2 = this.a;
            a2.getClass();
            if ((f = this.d(((Activity)a2).getIntent())) == null) {
                f = "/";
            }
        }
        vo.H = h;
        vo.F = f;
        vo.G = ((Activity)this.a).getIntent().getSerializableExtra("dart_entrypoint_args");
    }
    
    public final void b() {
        if (!this.a.h()) {
            final FlutterActivity a = this.a;
            a.getClass();
            final StringBuilder sb = new StringBuilder("FlutterActivity ");
            sb.append((Object)a);
            sb.append(" connection to the engine ");
            sb.append((Object)a.D.b);
            sb.append(" evicted by another attaching activity");
            Log.w("FlutterActivity", sb.toString());
            final e d = a.D;
            if (d != null) {
                d.e();
                a.D.f();
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder("The internal FlutterEngine created by ");
        sb2.append((Object)this.a);
        sb2.append(" has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        throw new AssertionError((Object)sb2.toString());
    }
    
    public final void c() {
        if (this.a != null) {
            return;
        }
        throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }
    
    public final String d(final Intent intent) {
        final FlutterActivity a = this.a;
        a.getClass();
        boolean b;
        try {
            final Bundle f = a.f();
            b = (f == null || !((BaseBundle)f).containsKey("flutter_deeplinking_enabled") || ((BaseBundle)f).getBoolean("flutter_deeplinking_enabled"));
        }
        catch (final PackageManager$NameNotFoundException ex) {
            b = false;
        }
        if (b) {
            final Uri data = intent.getData();
            if (data != null) {
                return data.toString();
            }
        }
        return null;
    }
    
    public final void e() {
        this.c();
        if (this.f != null) {
            ((View)this.c).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.f);
            this.f = null;
        }
        final l c = this.c;
        if (c != null) {
            c.a();
            this.c.H.remove((Object)this.l);
        }
    }
    
    public final void f() {
        if (!this.j) {
            return;
        }
        this.c();
        this.a.getClass();
        this.a.getClass();
        final FlutterActivity a = this.a;
        a.getClass();
        Label_0163: {
            if (((Activity)a).isChangingConfigurations()) {
                final F d = this.b.d;
                if (d.f()) {
                    a5.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    Label_0116: {
                        try {
                            d.a = true;
                            final Iterator iterator = ((HashMap)d.e).values().iterator();
                            while (iterator.hasNext()) {
                                ((C4.a)iterator.next()).onDetachedFromActivityForConfigChanges();
                            }
                            break Label_0116;
                        }
                        finally {
                            try {
                                Trace.endSection();
                            }
                            finally {
                                final Throwable t;
                                final Throwable t2;
                                t.addSuppressed(t2);
                            }
                            d.d();
                            Trace.endSection();
                            break Label_0163;
                        }
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            }
            else {
                this.b.d.c();
            }
        }
        final r d2 = this.d;
        if (d2 != null) {
            ((com.google.android.gms.internal.auth.l)d2.c).E = null;
            this.d = null;
        }
        final x e = this.e;
        if (e != null) {
            ((b)e.c).D = null;
            e.a = null;
            this.e = null;
        }
        this.a.getClass();
        final c b = this.b;
        if (b != null) {
            final E4.c g = b.g;
            g.a(1, g.c);
        }
        if (this.a.h()) {
            final c b2 = this.b;
            final Iterator iterator2 = b2.v.iterator();
            while (iterator2.hasNext()) {
                ((w4.b)iterator2.next()).a();
            }
            final F d3 = b2.d;
            d3.e();
            final HashMap hashMap = (HashMap)d3.b;
            for (final Class clazz : new HashSet((Collection)hashMap.keySet())) {
                final B4.c c = (B4.c)hashMap.get((Object)clazz);
                if (c == null) {
                    continue;
                }
                a5.a.b("FlutterEngineConnectionRegistry#remove ".concat(clazz.getSimpleName()));
                Label_0422: {
                    try {
                        if (!(c instanceof C4.a)) {
                            break Label_0422;
                        }
                        if (d3.f()) {
                            ((C4.a)c).onDetachedFromActivity();
                        }
                        break Label_0422;
                    }
                    finally {
                        try {
                            Trace.endSection();
                        }
                        finally {
                            ((Throwable)b2).addSuppressed((Throwable)hashMap);
                        }
                        ((HashMap)d3.e).remove((Object)clazz);
                        c.onDetachedFromEngine((B4.b)d3.d);
                        hashMap.remove((Object)clazz);
                        Trace.endSection();
                        continue;
                    }
                }
                break;
            }
            hashMap.clear();
            while (true) {
                final io.flutter.plugin.platform.r s = b2.s;
                final SparseArray n = s.N;
                if (n.size() <= 0) {
                    break;
                }
                s.Y.g(n.keyAt(0));
            }
            while (true) {
                final q t3 = b2.t;
                final SparseArray k = t3.K;
                if (k.size() <= 0) {
                    break;
                }
                t3.R.g(k.keyAt(0));
            }
            ((FlutterJNI)b2.c.E).setPlatformMessageHandler((j)null);
            final FlutterJNI a2 = b2.a;
            a2.removeEngineLifecycleListener((w4.b)b2.x);
            a2.setDeferredComponentManager((y4.a)null);
            a2.detachFromNativeAndReleaseResources();
            c2.k.t().getClass();
            w4.c.z.remove((Object)b2.w);
            if (this.a.c() != null) {
                if (u0.k.b == null) {
                    u0.k.b = new u0.k();
                }
                u0.k.b.a.remove((Object)this.a.c());
            }
            this.b = null;
        }
        this.j = false;
    }
}
