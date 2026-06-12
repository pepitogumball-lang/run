package io.flutter.plugin.platform;

import android.app.Dialog;
import android.view.ViewGroup;
import android.view.MotionEvent$PointerProperties;
import android.view.MotionEvent$PointerCoords;
import java.util.ArrayList;
import java.util.List;
import v4.u;
import android.view.MotionEvent;
import java.util.Iterator;
import android.view.View$OnFocusChangeListener;
import android.os.Handler;
import android.hardware.display.VirtualDisplay$Callback;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import java.nio.ByteBuffer;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import io.flutter.view.g;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import com.google.android.gms.internal.ads.em;
import android.os.Build$VERSION;
import E4.f;
import android.view.SurfaceView;
import f2.d;
import java.util.HashSet;
import android.util.SparseArray;
import java.util.HashMap;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.FlutterJNI;
import v4.l;
import android.app.Activity;
import v4.a;

public final class r implements k
{
    public static final Class[] Z;
    public final o C;
    public a D;
    public Activity E;
    public l F;
    public FlutterJNI G;
    public j H;
    public io.flutter.plugin.editing.j I;
    public com.google.android.gms.internal.auth.l J;
    public final io.flutter.plugin.platform.a K;
    public final HashMap L;
    public final HashMap M;
    public final SparseArray N;
    public final SparseArray O;
    public final SparseArray P;
    public final SparseArray Q;
    public int R;
    public boolean S;
    public boolean T;
    public final HashSet U;
    public final HashSet V;
    public final d W;
    public boolean X;
    public final o Y;
    
    static {
        Z = new Class[] { SurfaceView.class };
    }
    
    public r() {
        this.G = null;
        this.R = 0;
        this.S = false;
        this.T = true;
        this.X = false;
        this.Y = new o(this, 0);
        this.C = new o(2);
        this.L = new HashMap();
        this.K = (io.flutter.plugin.platform.a)new Object();
        this.M = new HashMap();
        this.P = new SparseArray();
        this.U = new HashSet();
        this.V = new HashSet();
        this.Q = new SparseArray();
        this.N = new SparseArray();
        this.O = new SparseArray();
        if (d.F == null) {
            d.F = new d();
        }
        this.W = d.F;
    }
    
    public static void e(final r r, final f f) {
        r.getClass();
        final int g = f.g;
        if (g != 0 && g != 1) {
            final StringBuilder sb = new StringBuilder("Trying to create a view with unknown direction value: ");
            sb.append(g);
            sb.append("(view id: ");
            throw new IllegalStateException(x.a.a(sb, f.a, ")"));
        }
    }
    
    public static void h(final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= n) {
            return;
        }
        throw new IllegalStateException(Y3.a.k("Trying to use platform views with API ", ", required API level is: ", sdk_INT, n));
    }
    
    public static i l(final j j) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            int n;
            if (sdk_INT <= 34) {
                n = 2;
            }
            else {
                n = 1;
            }
            final TextureRegistry$SurfaceProducer d = j.d(n);
            final o o = new o(4);
            o.b = d;
            return (i)o;
        }
        if (sdk_INT >= 29) {
            return (i)new em(j.c());
        }
        return (i)new z(j.e());
    }
    
    public final void a(final g a) {
        this.K.a = a;
    }
    
    public final boolean b(final int n) {
        return this.L.containsKey((Object)n);
    }
    
    public final View c(final int n) {
        if (this.b(n)) {
            return ((D)this.L.get((Object)n)).a();
        }
        final io.flutter.plugin.platform.f f = (io.flutter.plugin.platform.f)this.N.get(n);
        if (f == null) {
            return null;
        }
        return f.getView();
    }
    
    public final void d() {
        this.K.a = null;
    }
    
    public final io.flutter.plugin.platform.f f(final f f, final boolean b) {
        final HashMap hashMap = (HashMap)this.C.b;
        final String b2 = f.b;
        final io.flutter.plugin.platform.g g = (io.flutter.plugin.platform.g)hashMap.get((Object)b2);
        if (g == null) {
            final StringBuilder sb = new StringBuilder("Trying to create a platform view of unregistered type: ");
            sb.append(b2);
            throw new IllegalStateException(sb.toString());
        }
        final ByteBuffer i = f.i;
        Object b3;
        if (i != null) {
            b3 = g.getCreateArgsCodec().b(i);
        }
        else {
            b3 = null;
        }
        Object e;
        if (b) {
            e = new MutableContextWrapper((Context)this.E);
        }
        else {
            e = this.E;
        }
        final int a = f.a;
        final io.flutter.plugin.platform.f create = g.create((Context)e, a, b3);
        final View view = create.getView();
        if (view != null) {
            view.setLayoutDirection(f.g);
            this.N.put(a, (Object)create);
            final l f2 = this.F;
            if (f2 != null) {
                create.onFlutterViewAttached((View)f2);
            }
            return create;
        }
        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
    }
    
    public final void g() {
        int n = 0;
        while (true) {
            final SparseArray p = this.P;
            if (n >= p.size()) {
                break;
            }
            final c c = (c)p.valueAt(n);
            c.a();
            c.C.close();
            ++n;
        }
    }
    
    public final void i(boolean b) {
        int n = 0;
        while (true) {
            final SparseArray p = this.P;
            if (n >= p.size()) {
                break;
            }
            final int key = p.keyAt(n);
            final c c = (c)p.valueAt(n);
            if (this.U.contains((Object)key)) {
                final w4.c j = this.F.J;
                if (j != null) {
                    c.c(j.b);
                }
                b &= c.e();
            }
            else {
                if (!this.S) {
                    c.a();
                }
                c.setVisibility(8);
                ((ViewGroup)this.F).removeView((View)c);
            }
            ++n;
        }
        int n2 = 0;
        while (true) {
            final SparseArray o = this.O;
            if (n2 >= o.size()) {
                break;
            }
            final int key2 = o.keyAt(n2);
            final View view = (View)o.get(key2);
            if (this.V.contains((Object)key2) && (b || !this.T)) {
                view.setVisibility(0);
            }
            else {
                view.setVisibility(8);
            }
            ++n2;
        }
    }
    
    public final float j() {
        return ((Context)this.E).getResources().getDisplayMetrics().density;
    }
    
    public final void k() {
        if (this.T && !this.S) {
            final l f = this.F;
            ((io.flutter.embedding.engine.renderer.l)f.F).d();
            final v4.f e = f.E;
            if (e == null) {
                ((ViewGroup)f).addView((View)(f.E = new v4.f(((View)f).getContext(), ((View)f).getWidth(), ((View)f).getHeight(), 1)));
            }
            else {
                e.g(((View)f).getWidth(), ((View)f).getHeight());
            }
            f.G = f.F;
            final v4.f e2 = f.E;
            f.F = e2;
            final w4.c j = f.J;
            if (j != null) {
                e2.c(j.b);
            }
            this.S = true;
        }
    }
    
    public final void m() {
        for (final D d : this.L.values()) {
            final int width = d.f.getWidth();
            final i f = d.f;
            final int height = f.getHeight();
            final boolean focused = d.a().isFocused();
            final w detachState = d.a.detachState();
            d.h.setSurface((Surface)null);
            d.h.release();
            final DisplayManager displayManager = (DisplayManager)((Context)d.b).getSystemService("display");
            final StringBuilder sb = new StringBuilder("flutter-vd#");
            sb.append(d.e);
            d.h = displayManager.createVirtualDisplay(sb.toString(), width, height, d.d, f.getSurface(), 0, (VirtualDisplay$Callback)io.flutter.plugin.platform.D.i, (Handler)null);
            final SingleViewPresentation a = new SingleViewPresentation((Context)d.b, d.h.getDisplay(), d.c, detachState, (View$OnFocusChangeListener)d.g, focused);
            ((Dialog)a).show();
            ((Dialog)d.a).cancel();
            d.a = a;
        }
    }
    
    public final MotionEvent n(final float n, final E4.g g, final boolean b) {
        final MotionEvent l = this.W.l(new u(g.p));
        final List list = (List)g.g;
        final ArrayList list2 = new ArrayList();
        for (final List list3 : list) {
            final MotionEvent$PointerCoords motionEvent$PointerCoords = new MotionEvent$PointerCoords();
            motionEvent$PointerCoords.orientation = (float)(double)list3.get(0);
            motionEvent$PointerCoords.pressure = (float)(double)list3.get(1);
            motionEvent$PointerCoords.size = (float)(double)list3.get(2);
            final double doubleValue = (double)list3.get(3);
            final double n2 = n;
            motionEvent$PointerCoords.toolMajor = (float)(doubleValue * n2);
            motionEvent$PointerCoords.toolMinor = (float)((double)list3.get(4) * n2);
            motionEvent$PointerCoords.touchMajor = (float)((double)list3.get(5) * n2);
            motionEvent$PointerCoords.touchMinor = (float)((double)list3.get(6) * n2);
            motionEvent$PointerCoords.x = (float)((double)list3.get(7) * n2);
            motionEvent$PointerCoords.y = (float)((double)list3.get(8) * n2);
            list2.add((Object)motionEvent$PointerCoords);
        }
        final int e = g.e;
        final MotionEvent$PointerCoords[] array = (MotionEvent$PointerCoords[])list2.toArray((Object[])new MotionEvent$PointerCoords[e]);
        if (!b && l != null) {
            if (array.length >= 1) {
                l.offsetLocation(array[0].x - l.getX(), array[0].y - l.getY());
            }
            return l;
        }
        final List list4 = (List)g.f;
        final ArrayList list5 = new ArrayList();
        for (final List list6 : list4) {
            final MotionEvent$PointerProperties motionEvent$PointerProperties = new MotionEvent$PointerProperties();
            motionEvent$PointerProperties.id = (int)list6.get(0);
            motionEvent$PointerProperties.toolType = (int)list6.get(1);
            list5.add((Object)motionEvent$PointerProperties);
        }
        return MotionEvent.obtain(g.b.longValue(), g.c.longValue(), g.d, g.e, (MotionEvent$PointerProperties[])list5.toArray((Object[])new MotionEvent$PointerProperties[e]), array, g.h, g.i, g.j, g.k, g.l, g.m, g.n, g.o);
    }
    
    public final int o(final double n) {
        return (int)Math.round(n * this.j());
    }
}
