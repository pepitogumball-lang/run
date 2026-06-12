package v4;

import java.nio.Buffer;
import android.view.InputEvent;
import android.os.BaseBundle;
import java.util.Map;
import w5.s;
import android.view.ViewGroup;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.ViewStructure;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import android.view.MotionEvent;
import java.util.concurrent.CancellationException;
import w5.Q;
import com.google.android.gms.internal.ads.g0;
import android.text.Selection;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.content.res.Configuration;
import java.util.concurrent.Executor;
import w5.K;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import w5.t;
import w5.C;
import L3.v;
import e5.d;
import C2.u;
import java.util.List;
import android.view.Window;
import android.app.Activity;
import android.view.DisplayCutout;
import android.graphics.Insets;
import java.util.Collections;
import java.util.Collection;
import C2.d0;
import android.hardware.display.DisplayManager;
import O.n0;
import K2.G0;
import com.google.android.gms.internal.ads.po;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeProvider;
import android.graphics.Rect;
import java.util.ArrayList;
import android.view.ViewConfiguration;
import android.view.KeyEvent;
import w2.e;
import android.util.DisplayMetrics;
import java.util.concurrent.ConcurrentLinkedQueue;
import android.text.format.DateFormat;
import android.provider.Settings$System;
import android.view.textservice.SpellCheckerInfo;
import io.flutter.plugin.platform.x;
import L3.A;
import F4.o;
import java.util.Arrays;
import java.io.Serializable;
import java.util.Map$Entry;
import E4.p;
import E4.n;
import java.util.HashMap;
import android.os.Build$VERSION;
import android.view.textservice.SpellCheckerSession;
import android.view.accessibility.AccessibilityManager;
import android.view.Surface;
import io.flutter.plugin.platform.q;
import android.util.SparseArray;
import io.flutter.plugin.platform.r;
import java.util.Iterator;
import io.flutter.embedding.engine.FlutterJNI;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;
import android.util.Log;
import A4.b;
import android.database.ContentObserver;
import java.util.Objects;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.content.Context;
import io.flutter.embedding.android.FlutterActivity;
import V4.G;
import io.flutter.embedding.engine.renderer.i;
import android.view.textservice.TextServicesManager;
import c2.k;
import G4.a;
import io.flutter.plugin.editing.g;
import com.google.android.gms.internal.measurement.K1;
import w4.c;
import java.util.HashSet;
import android.view.View;
import android.widget.FrameLayout;

public final class l extends FrameLayout
{
    public final h C;
    public final j D;
    public f E;
    public View F;
    public View G;
    public final HashSet H;
    public boolean I;
    public c J;
    public final HashSet K;
    public K1 L;
    public io.flutter.plugin.editing.j M;
    public g N;
    public a O;
    public k P;
    public v4.a Q;
    public io.flutter.view.g R;
    public TextServicesManager S;
    public X.a T;
    public final i U;
    public final G V;
    public final U.a W;
    public final io.flutter.embedding.engine.renderer.a a0;
    public L0.i b0;
    public m c0;
    
    public l(final FlutterActivity flutterActivity, final h h) {
        super((Context)flutterActivity, (AttributeSet)null);
        this.H = new HashSet();
        this.K = new HashSet();
        this.U = new i();
        this.V = new G((Object)this, 22);
        this.W = new U.a((Object)this, new Handler(Looper.getMainLooper()), 5);
        this.a0 = new io.flutter.embedding.engine.renderer.a((Object)this, 2);
        this.c0 = (m)new Object();
        this.C = h;
        this.F = (View)h;
        this.b();
    }
    
    public l(final FlutterActivity flutterActivity, final j j) {
        super((Context)flutterActivity, (AttributeSet)null);
        this.H = new HashSet();
        this.K = new HashSet();
        this.U = new i();
        this.V = new G((Object)this, 22);
        this.W = new U.a((Object)this, new Handler(Looper.getMainLooper()), 5);
        this.a0 = new io.flutter.embedding.engine.renderer.a((Object)this, 2);
        this.c0 = (m)new Object();
        this.D = j;
        this.F = (View)j;
        this.b();
    }
    
    public final void a() {
        Objects.toString((Object)this.J);
        if (!this.c()) {
            return;
        }
        final Iterator iterator = this.K.iterator();
        if (!iterator.hasNext()) {
            ((View)this).getContext().getContentResolver().unregisterContentObserver((ContentObserver)this.W);
            final r s = this.J.s;
            int n = 0;
            while (true) {
                final SparseArray q = s.Q;
                if (n >= q.size()) {
                    break;
                }
                ((ViewGroup)s.F).removeView((View)q.valueAt(n));
                ++n;
            }
            int n2 = 0;
            while (true) {
                final SparseArray o = s.O;
                if (n2 >= o.size()) {
                    break;
                }
                ((ViewGroup)s.F).removeView((View)o.valueAt(n2));
                ++n2;
            }
            s.g();
            if (s.F == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            }
            else {
                int n3 = 0;
                SparseArray p;
                while (true) {
                    p = s.P;
                    if (n3 >= p.size()) {
                        break;
                    }
                    ((ViewGroup)s.F).removeView((View)p.valueAt(n3));
                    ++n3;
                }
                p.clear();
            }
            s.F = null;
            s.S = false;
            int n4 = 0;
            while (true) {
                final SparseArray n5 = s.N;
                if (n4 >= n5.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.f)n5.valueAt(n4)).onFlutterViewDetached();
                ++n4;
            }
            final q t = this.J.t;
            int n6 = 0;
            while (true) {
                final SparseArray l = t.L;
                if (n6 >= l.size()) {
                    break;
                }
                ((ViewGroup)t.F).removeView((View)l.valueAt(n6));
                ++n6;
            }
            final Surface p2 = t.P;
            if (p2 != null) {
                p2.release();
                t.P = null;
                t.Q = null;
            }
            t.F = null;
            int n7 = 0;
            while (true) {
                final SparseArray k = t.K;
                if (n7 >= k.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.f)k.valueAt(n7)).onFlutterViewDetached();
                ++n7;
            }
            this.J.s.d();
            this.J.t.d();
            final io.flutter.view.g r = this.R;
            r.u = true;
            r.e.d();
            r.s = null;
            final AccessibilityManager c = r.c;
            c.removeAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)r.w);
            c.removeTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)r.x);
            r.f.unregisterContentObserver((ContentObserver)r.y);
            final k b = r.b;
            b.F = null;
            ((FlutterJNI)b.E).setAccessibilityDelegate((w4.i)null);
            this.R = null;
            this.M.b.restartInput((View)this);
            this.M.c();
            final int size = ((HashSet)this.P.E).size();
            if (size > 0) {
                final StringBuilder sb = new StringBuilder("A KeyboardManager was destroyed with ");
                sb.append(size);
                sb.append(" unhandled redispatch event(s).");
                Log.w("KeyboardManager", sb.toString());
            }
            final g n8 = this.N;
            if (n8 != null) {
                n8.a.D = null;
                final SpellCheckerSession c2 = n8.c;
                if (c2 != null) {
                    c2.close();
                }
            }
            final K1 i = this.L;
            if (i != null) {
                ((b1.f)i.E).D = null;
            }
            final io.flutter.embedding.engine.renderer.j b2 = this.J.b;
            this.I = false;
            b2.g((io.flutter.embedding.engine.renderer.k)this.a0);
            b2.j();
            b2.a.setSemanticsEnabled(false);
            final View g = this.G;
            if (g != null && this.F == this.E) {
                this.F = g;
            }
            ((io.flutter.embedding.engine.renderer.l)this.F).a();
            final f e = this.E;
            if (e != null) {
                e.C.close();
                ((ViewGroup)this).removeView((View)this.E);
                this.E = null;
            }
            this.G = null;
            this.J = null;
            return;
        }
        iterator.next().getClass();
        throw new ClassCastException();
    }
    
    public final void autofill(final SparseArray sparseArray) {
        final io.flutter.plugin.editing.j m = this.M;
        if (Build$VERSION.SDK_INT < 26) {
            m.getClass();
        }
        else {
            final n f = m.f;
            if (f != null && m.g != null) {
                final A j = f.j;
                if (j != null) {
                    final HashMap hashMap = new HashMap();
                    for (int i = 0; i < sparseArray.size(); ++i) {
                        final n n = (n)m.g.get(sparseArray.keyAt(i));
                        if (n != null) {
                            final A k = n.j;
                            if (k != null) {
                                final String string = io.flutter.plugin.editing.i.g(M.b.m(sparseArray.valueAt(i))).toString();
                                final p p = new p(string, string.length(), string.length(), -1, -1);
                                final String s = (String)j.D;
                                final String s2 = (String)k.D;
                                if (s2.equals((Object)s)) {
                                    m.h.f(p);
                                }
                                else {
                                    hashMap.put((Object)s2, (Object)p);
                                }
                            }
                        }
                    }
                    final int c = m.e.c;
                    final K1 d = m.d;
                    d.getClass();
                    hashMap.size();
                    final HashMap hashMap2 = new HashMap();
                    for (final Map$Entry map$Entry : hashMap.entrySet()) {
                        final p p2 = (p)map$Entry.getValue();
                        hashMap2.put((Object)map$Entry.getKey(), (Object)K1.f(p2.a, p2.b, p2.c, -1, -1));
                    }
                    ((F4.p)d.D).a("TextInputClient.updateEditingStateWithTag", (Object)Arrays.asList((Object[])new Serializable[] { (Serializable)c, (Serializable)hashMap2 }), (o)null);
                }
            }
        }
    }
    
    public final void b() {
        final h c = this.C;
        if (c != null) {
            ((ViewGroup)this).addView((View)c);
        }
        else {
            final j d = this.D;
            if (d != null) {
                ((ViewGroup)this).addView((View)d);
            }
            else {
                ((ViewGroup)this).addView((View)this.E);
            }
        }
        ((View)this).setFocusable(true);
        ((View)this).setFocusableInTouchMode(true);
        if (Build$VERSION.SDK_INT >= 26) {
            io.flutter.plugin.editing.i.r(this);
        }
    }
    
    public final boolean c() {
        final c j = this.J;
        return j != null && j.b == ((io.flutter.embedding.engine.renderer.l)this.F).getAttachedRenderer();
    }
    
    public final boolean checkInputConnectionProxy(final View view) {
        final c j = this.J;
        boolean checkInputConnectionProxy;
        if (j != null) {
            final r s = j.s;
            checkInputConnectionProxy = false;
            if (view == null) {
                s.getClass();
            }
            else {
                final HashMap m = s.M;
                if (m.containsKey((Object)view.getContext())) {
                    final View view2 = (View)m.get((Object)view.getContext());
                    checkInputConnectionProxy = (view2 == view || view2.checkInputConnectionProxy(view));
                }
            }
        }
        else {
            checkInputConnectionProxy = super.checkInputConnectionProxy(view);
        }
        return checkInputConnectionProxy;
    }
    
    public final void d() {
        final int uiMode = ((View)this).getResources().getConfiguration().uiMode;
        final int n = 1;
        int n2;
        if ((uiMode & 0x30) == 0x20) {
            n2 = 2;
        }
        else {
            n2 = 1;
        }
        final TextServicesManager s = this.S;
        boolean b2 = false;
        Label_0122: {
            Label_0119: {
                if (s != null) {
                    Label_0113: {
                        if (Build$VERSION.SDK_INT >= 31) {
                            final Iterator iterator = x.c(s).iterator();
                            while (true) {
                                while (iterator.hasNext()) {
                                    if (((SpellCheckerInfo)iterator.next()).getPackageName().equals((Object)"com.google.android.inputmethod.latin")) {
                                        final boolean b = true;
                                        if (x.e(this.S) && b) {
                                            break Label_0113;
                                        }
                                        break Label_0119;
                                    }
                                }
                                final boolean b = false;
                                continue;
                            }
                        }
                    }
                    b2 = true;
                    break Label_0122;
                }
            }
            b2 = false;
        }
        final Y0.h a = this.J.o.a;
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"textScaleFactor", (Object)((View)this).getResources().getConfiguration().fontScale);
        final DisplayMetrics displayMetrics = ((View)this).getResources().getDisplayMetrics();
        hashMap.put((Object)"nativeSpellCheckServiceDefined", (Object)b2);
        hashMap.put((Object)"brieflyShowPassword", (Object)(Settings$System.getInt(((View)this).getContext().getContentResolver(), "show_password", 1) == 1));
        hashMap.put((Object)"alwaysUse24HourFormat", (Object)DateFormat.is24HourFormat(((View)this).getContext()));
        String s2;
        if (n2 != 1) {
            if (n2 != 2) {
                throw null;
            }
            s2 = "dark";
        }
        else {
            s2 = "light";
        }
        hashMap.put((Object)"platformBrightness", (Object)s2);
        Objects.toString(hashMap.get((Object)"textScaleFactor"));
        Objects.toString(hashMap.get((Object)"alwaysUse24HourFormat"));
        Objects.toString(hashMap.get((Object)"platformBrightness"));
        int n3;
        if (Build$VERSION.SDK_INT >= 34) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        Object o = null;
        if (n3 != 0 && displayMetrics != null) {
            final E4.l f = new E4.l(displayMetrics);
            final e b3 = E4.m.b;
            ((ConcurrentLinkedQueue)b3.D).add((Object)f);
            final E4.l l = (E4.l)b3.F;
            b3.F = f;
            if (l != null) {
                o = new com.google.android.gms.internal.auth.l(6, (Object)b3, (Object)l, false);
            }
            hashMap.put((Object)"configurationId", (Object)f.a);
            a.t((Object)hashMap, (F4.c)o);
        }
        else {
            a.t((Object)hashMap, (F4.c)null);
        }
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final int action = keyEvent.getAction();
        final boolean b = true;
        if (action == 0 && keyEvent.getRepeatCount() == 0) {
            ((View)this).getKeyDispatcherState().startTracking(keyEvent, (Object)this);
        }
        else if (keyEvent.getAction() == 1) {
            ((View)this).getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if (this.c()) {
            final boolean b2 = b;
            if (this.P.r(keyEvent)) {
                return b2;
            }
        }
        return super.dispatchKeyEvent(keyEvent) && b;
    }
    
    public final void e() {
        if (!this.c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        final float density = ((View)this).getResources().getDisplayMetrics().density;
        final i u = this.U;
        u.a = density;
        u.p = ViewConfiguration.get(((View)this).getContext()).getScaledTouchSlop();
        final io.flutter.embedding.engine.renderer.j b = this.J.b;
        b.getClass();
        if (u.b > 0 && u.c > 0 && u.a > 0.0f) {
            final ArrayList q = u.q;
            q.size();
            final ArrayList r = u.r;
            r.size();
            final int n = r.size() + q.size();
            final int[] array = new int[n * 4];
            final int[] array2 = new int[n];
            final int[] array3 = new int[n];
            final int n2 = 0;
            for (int i = 0; i < q.size(); ++i) {
                final io.flutter.embedding.engine.renderer.b b2 = (io.flutter.embedding.engine.renderer.b)q.get(i);
                final int n3 = i * 4;
                final Rect a = b2.a;
                array[n3] = a.left;
                array[n3 + 1] = a.top;
                array[n3 + 2] = a.right;
                array[n3 + 3] = a.bottom;
                array2[i] = v.e.d(b2.b);
                array3[i] = v.e.d(b2.c);
            }
            final int size = q.size();
            for (int j = n2; j < r.size(); ++j) {
                final io.flutter.embedding.engine.renderer.b b3 = (io.flutter.embedding.engine.renderer.b)r.get(j);
                final int n4 = j * 4 + size * 4;
                final Rect a2 = b3.a;
                array[n4] = a2.left;
                array[n4 + 1] = a2.top;
                array[n4 + 2] = a2.right;
                array[n4 + 3] = a2.bottom;
                array2[q.size() + j] = v.e.d(b3.b);
                array3[q.size() + j] = v.e.d(b3.c);
            }
            b.a.setViewportMetrics(u.a, u.b, u.c, u.d, u.e, u.f, u.g, u.h, u.i, u.j, u.k, u.l, u.m, u.n, u.o, u.p, array, array2, array3);
        }
    }
    
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        final io.flutter.view.g r = this.R;
        if (r != null && r.c.isEnabled()) {
            return (AccessibilityNodeProvider)this.R;
        }
        return null;
    }
    
    public c getAttachedFlutterEngine() {
        return this.J;
    }
    
    public F4.f getBinaryMessenger() {
        return (F4.f)this.J.c;
    }
    
    public f getCurrentImageSurface() {
        return this.E;
    }
    
    public i getViewportMetrics() {
        return this.U;
    }
    
    public final WindowInsets onApplyWindowInsets(WindowInsets rootWindowInsets) {
        final WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(rootWindowInsets);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final i u = this.U;
        if (sdk_INT == 29) {
            final Insets b = G0.f.B(rootWindowInsets);
            u.l = io.flutter.plugin.platform.p.k(b);
            u.m = io.flutter.plugin.platform.p.m(b);
            u.n = io.flutter.plugin.platform.p.o(b);
            u.o = io.flutter.plugin.platform.p.a(b);
        }
        final boolean b2 = (((View)this).getWindowSystemUiVisibility() & 0x4) == 0x0;
        final boolean b3 = (((View)this).getWindowSystemUiVisibility() & 0x2) == 0x0;
        if (sdk_INT >= 30) {
            final Insets u2 = po.u(rootWindowInsets, po.r());
            u.d = io.flutter.plugin.platform.p.k(u2);
            u.e = io.flutter.plugin.platform.p.m(u2);
            u.f = io.flutter.plugin.platform.p.o(u2);
            u.g = io.flutter.plugin.platform.p.a(u2);
            final Insets u3 = po.u(rootWindowInsets, G0.w());
            u.h = io.flutter.plugin.platform.p.k(u3);
            u.i = io.flutter.plugin.platform.p.m(u3);
            u.j = io.flutter.plugin.platform.p.o(u3);
            u.k = io.flutter.plugin.platform.p.a(u3);
            final Insets u4 = po.u(rootWindowInsets, G0.y());
            u.l = io.flutter.plugin.platform.p.k(u4);
            u.m = io.flutter.plugin.platform.p.m(u4);
            u.n = io.flutter.plugin.platform.p.o(u4);
            u.o = io.flutter.plugin.platform.p.a(u4);
            final DisplayCutout h = n0.h(rootWindowInsets);
            if (h != null) {
                final Insets f = po.f(h);
                u.d = Math.max(Math.max(u.d, io.flutter.plugin.platform.p.k(f)), n0.a(h));
                u.e = Math.max(Math.max(u.e, io.flutter.plugin.platform.p.m(f)), n0.D(h));
                u.f = Math.max(Math.max(u.f, io.flutter.plugin.platform.p.o(f)), n0.C(h));
                u.g = Math.max(Math.max(u.g, io.flutter.plugin.platform.p.a(f)), n0.y(h));
            }
        }
        else {
            int n = 0;
            Label_0464: {
                if (!b3) {
                    final Context context = ((View)this).getContext();
                    if (context.getResources().getConfiguration().orientation == 2) {
                        final int rotation = ((DisplayManager)context.getSystemService("display")).getDisplay(0).getRotation();
                        if (rotation == 1) {
                            n = 3;
                            break Label_0464;
                        }
                        if (rotation == 3) {
                            n = 2;
                            break Label_0464;
                        }
                        if (rotation == 0 || rotation == 2) {
                            n = 4;
                            break Label_0464;
                        }
                    }
                }
                n = 1;
            }
            int systemWindowInsetTop;
            if (b2) {
                systemWindowInsetTop = rootWindowInsets.getSystemWindowInsetTop();
            }
            else {
                systemWindowInsetTop = 0;
            }
            u.d = systemWindowInsetTop;
            int systemWindowInsetRight;
            if (n != 3 && n != 4) {
                systemWindowInsetRight = rootWindowInsets.getSystemWindowInsetRight();
            }
            else {
                systemWindowInsetRight = 0;
            }
            u.e = systemWindowInsetRight;
            int systemWindowInsetBottom2 = 0;
            Label_0571: {
                if (b3) {
                    int systemWindowInsetBottom;
                    if (rootWindowInsets.getSystemWindowInsetBottom() < ((View)this).getRootView().getHeight() * 0.18) {
                        systemWindowInsetBottom = 0;
                    }
                    else {
                        systemWindowInsetBottom = rootWindowInsets.getSystemWindowInsetBottom();
                    }
                    if (systemWindowInsetBottom == 0) {
                        systemWindowInsetBottom2 = rootWindowInsets.getSystemWindowInsetBottom();
                        break Label_0571;
                    }
                }
                systemWindowInsetBottom2 = 0;
            }
            u.f = systemWindowInsetBottom2;
            int systemWindowInsetLeft;
            if (n != 2 && n != 4) {
                systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
            }
            else {
                systemWindowInsetLeft = 0;
            }
            u.g = systemWindowInsetLeft;
            u.h = 0;
            u.i = 0;
            int systemWindowInsetBottom3;
            if (rootWindowInsets.getSystemWindowInsetBottom() < ((View)this).getRootView().getHeight() * 0.18) {
                systemWindowInsetBottom3 = 0;
            }
            else {
                systemWindowInsetBottom3 = rootWindowInsets.getSystemWindowInsetBottom();
            }
            u.j = systemWindowInsetBottom3;
            u.k = 0;
        }
        final ArrayList list = new ArrayList();
        if (sdk_INT >= 28) {
            final DisplayCutout h2 = n0.h(rootWindowInsets);
            if (h2 != null) {
                for (final Rect rect : d0.t(h2)) {
                    rect.toString();
                    list.add((Object)new io.flutter.embedding.engine.renderer.b(rect, 4, 1));
                }
            }
        }
        final ArrayList r = u.r;
        r.clear();
        r.addAll((Collection)list);
        if (Build$VERSION.SDK_INT >= 35) {
            final m c0 = this.c0;
            final Context context2 = ((View)this).getContext();
            c0.getClass();
            final Activity a = J5.b.A(context2);
            rootWindowInsets = null;
            if (a != null) {
                final Window window = a.getWindow();
                if (window != null) {
                    rootWindowInsets = window.getDecorView().getRootWindowInsets();
                }
            }
            List list2;
            if (rootWindowInsets == null) {
                list2 = Collections.emptyList();
            }
            else {
                list2 = J4.a.c(rootWindowInsets, G0.u());
            }
            int d = u.d;
            final Iterator iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                d = Math.max(d, ((Rect)iterator2.next()).bottom);
            }
            u.d = d;
        }
        this.e();
        return onApplyWindowInsets;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        X.a t;
        try {
            final L0.g c = L0.h.c;
            final Context context = ((View)this).getContext();
            c.getClass();
            t = new X.a((Object)new K1(L0.g.a(context)), 23);
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            t = null;
        }
        this.T = t;
        final Activity a = J5.b.A(((View)this).getContext());
        final X.a t2 = this.T;
        if (t2 != null && a != null) {
            this.b0 = new L0.i((Object)this, 1);
            final Context context2 = ((View)this).getContext();
            Object a2;
            if (Build$VERSION.SDK_INT >= 28) {
                a2 = E.e.a(context2);
            }
            else {
                a2 = new u(new Handler(context2.getMainLooper()), 1);
            }
            final L0.i b0 = this.b0;
            final K1 k1 = (K1)t2.D;
            n5.h.e("executor", a2);
            n5.h.e("consumer", b0);
            final L0.b b2 = (L0.b)k1.D;
            b2.getClass();
            final L0.k i = new L0.k(b2, a, (d)null);
            final e5.j c2 = e5.j.C;
            v v = new v(i, (e5.i)c2, -2, 1);
            final D5.d a3 = w5.C.a;
            final x5.c a4 = B5.o.a;
            if (((s)a4).i((e5.h)w5.t.D) != null) {
                final StringBuilder sb = new StringBuilder("Flow context cannot contain job in it. Had ");
                sb.append((Object)a4);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            if (!a4.equals(c2)) {
                final e5.i c3 = ((e5.a)a4).c((e5.i)c2);
                if (!n5.h.a(c3, c2)) {
                    v = new v((L0.k)v.H, c3, -2, 1);
                }
            }
            final com.google.android.gms.internal.auth.l l = (com.google.android.gms.internal.auth.l)k1.E;
            l.getClass();
            final ReentrantLock reentrantLock = (ReentrantLock)l.D;
            reentrantLock.lock();
            final LinkedHashMap linkedHashMap = (LinkedHashMap)l.E;
            Label_0392: {
                try {
                    if (linkedHashMap.get((Object)b0) == null) {
                        ((Map)linkedHashMap).put((Object)b0, (Object)w5.v.i((w5.u)w5.v.a((e5.i)new K((Executor)a2)), (m5.p)new J0.b((z5.c)v, b0, (d)null)));
                    }
                }
                finally {
                    break Label_0392;
                }
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.J != null) {
            this.O.b(configuration);
            this.d();
            J5.b.b(((View)this).getContext(), (a5.b)this.J);
        }
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        if (!this.c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        final io.flutter.plugin.editing.j m = this.M;
        final k p = this.P;
        final g0 e = m.e;
        final int b = e.b;
        final InputConnection inputConnection = null;
        Object j;
        if (b == 1) {
            m.j = null;
            j = inputConnection;
        }
        else {
            int inputType = 4;
            if (b == 4) {
                j = inputConnection;
            }
            else if (b == 3) {
                if (m.p) {
                    j = m.j;
                }
                else {
                    j = m.k.c(e.c).onCreateInputConnection(editorInfo);
                    m.j = (InputConnection)j;
                }
            }
            else {
                final n f = m.f;
                final E4.o g = f.g;
                final int n = 2;
                final int a = g.a;
                if (a != 2) {
                    if (a == 5) {
                        inputType = n;
                        if (g.b) {
                            inputType = 4098;
                        }
                        if (g.c) {
                            inputType |= 0x2000;
                        }
                    }
                    else if (a == 6) {
                        inputType = 3;
                    }
                    else if (a == 11) {
                        inputType = 0;
                    }
                    else {
                        int n2;
                        if (a == 7) {
                            n2 = 131073;
                        }
                        else if (a != 8 && a != 13) {
                            if (a != 9 && a != 12) {
                                if (a == 10) {
                                    n2 = 145;
                                }
                                else if (a == 3) {
                                    n2 = 97;
                                }
                                else if (a == 4) {
                                    n2 = 113;
                                }
                                else {
                                    n2 = 1;
                                }
                            }
                            else {
                                n2 = 17;
                            }
                        }
                        else {
                            n2 = 33;
                        }
                        int n5 = 0;
                        Label_0376: {
                            int n3;
                            if (f.a) {
                                n3 = 524416;
                            }
                            else {
                                int n4 = n2;
                                if (f.b) {
                                    n4 = (n2 | 0x8000);
                                }
                                n5 = n4;
                                if (f.c) {
                                    break Label_0376;
                                }
                                final int n6 = 524432;
                                n2 = n4;
                                n3 = n6;
                            }
                            n5 = (n2 | n3);
                        }
                        final int f2 = f.f;
                        if (f2 == 1) {
                            inputType = (n5 | 0x1000);
                        }
                        else if (f2 == 2) {
                            inputType = (n5 | 0x2000);
                        }
                        else {
                            inputType = n5;
                            if (f2 == 3) {
                                inputType = (n5 | 0x4000);
                            }
                        }
                    }
                }
                editorInfo.inputType = inputType;
                editorInfo.imeOptions = 33554432;
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 26 && !f.d) {
                    editorInfo.imeOptions = 50331648;
                }
                final int intValue = f.h;
                final n f3 = m.f;
                final String i = f3.i;
                if (i != null) {
                    editorInfo.actionLabel = (CharSequence)i;
                    editorInfo.actionId = intValue;
                }
                editorInfo.imeOptions |= intValue;
                if (f3.m != null) {
                    editorInfo.hintLocales = new LocaleList(m.f.m);
                }
                final String[] k = m.f.k;
                if (k != null) {
                    S.c.a(editorInfo, k);
                }
                if (sdk_INT >= 34) {
                    if (editorInfo.extras == null) {
                        editorInfo.extras = new Bundle();
                    }
                    ((BaseBundle)editorInfo.extras).putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
                }
                final io.flutter.plugin.editing.c l = new io.flutter.plugin.editing.c(this, m.e.c, m.d, p, m.h, editorInfo);
                final io.flutter.plugin.editing.f h = m.h;
                h.getClass();
                editorInfo.initialSelStart = Selection.getSelectionStart((CharSequence)h);
                final io.flutter.plugin.editing.f h2 = m.h;
                h2.getClass();
                editorInfo.initialSelEnd = Selection.getSelectionEnd((CharSequence)h2);
                m.j = (InputConnection)l;
                j = l;
            }
        }
        return (InputConnection)j;
    }
    
    public final void onDetachedFromWindow() {
        final X.a t = this.T;
        if (t != null) {
            final L0.i b0 = this.b0;
            if (b0 != null) {
                final com.google.android.gms.internal.auth.l l = (com.google.android.gms.internal.auth.l)((K1)t.D).E;
                l.getClass();
                final ReentrantLock reentrantLock = (ReentrantLock)l.D;
                reentrantLock.lock();
                final LinkedHashMap linkedHashMap = (LinkedHashMap)l.E;
                try {
                    final Q q = (Q)linkedHashMap.get((Object)b0);
                    if (q != null) {
                        q.b((CancellationException)null);
                    }
                    final Q q2 = (Q)((Map)linkedHashMap).remove((Object)b0);
                }
                finally {
                    reentrantLock.unlock();
                }
            }
        }
        this.b0 = null;
        this.T = null;
        super.onDetachedFromWindow();
    }
    
    public final boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        if (this.c()) {
            final v4.a q = this.Q;
            final Context context = ((View)this).getContext();
            q.getClass();
            final boolean fromSource = ((InputEvent)motionEvent).isFromSource(2);
            final int actionMasked = motionEvent.getActionMasked();
            final boolean onGenericMotionEvent = true;
            final boolean b = actionMasked == 7 || motionEvent.getActionMasked() == 8;
            if (fromSource && b) {
                final int b2 = v4.a.b(motionEvent.getActionMasked());
                final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                q.a(motionEvent, motionEvent.getActionIndex(), b2, 0, v4.a.f, allocateDirect, context);
                if (((Buffer)allocateDirect).position() % 288 == 0) {
                    q.a.a.dispatchPointerDataPacket(allocateDirect, ((Buffer)allocateDirect).position());
                    return onGenericMotionEvent;
                }
                throw new AssertionError((Object)"Packet position is not on field boundary.");
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }
    
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        if (!this.c()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.R.f(motionEvent, false);
    }
    
    public final void onProvideAutofillVirtualStructure(final ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        final io.flutter.plugin.editing.j m = this.M;
        if (Build$VERSION.SDK_INT >= 26) {
            if (m.g != null) {
                final String s = (String)m.f.j.D;
                final AutofillId autofillId = viewStructure.getAutofillId();
                int key;
                A j;
                ViewStructure child;
                String[] autofillHints;
                String hint;
                Rect k;
                for (i = 0; i < m.g.size(); ++i) {
                    key = m.g.keyAt(i);
                    j = ((n)m.g.valueAt(i)).j;
                    if (j != null) {
                        viewStructure.addChildCount(1);
                        child = viewStructure.newChild(i);
                        child.setAutofillId(autofillId, key);
                        autofillHints = (String[])j.E;
                        if (autofillHints.length > 0) {
                            child.setAutofillHints(autofillHints);
                        }
                        child.setAutofillType(1);
                        child.setVisibility(0);
                        hint = (String)j.G;
                        if (hint != null) {
                            child.setHint((CharSequence)hint);
                        }
                        if (s.hashCode() == key) {
                            k = m.m;
                            if (k != null) {
                                child.setDimens(k.left, k.top, 0, 0, k.width(), m.m.height());
                                child.setAutofillValue(AutofillValue.forText((CharSequence)m.h));
                                continue;
                            }
                        }
                        child.setDimens(0, 0, 0, 0, 1, 1);
                        child.setAutofillValue(AutofillValue.forText((CharSequence)((p)j.F).a));
                    }
                }
            }
        }
        else {
            m.getClass();
        }
    }
    
    public final void onSizeChanged(final int b, final int c, final int n, final int n2) {
        super.onSizeChanged(b, c, n, n2);
        final i u = this.U;
        u.b = b;
        u.c = c;
        this.e();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.c()) {
            return super.onTouchEvent(motionEvent);
        }
        ((View)this).requestUnbufferedDispatch(motionEvent);
        this.Q.d(motionEvent, v4.a.f);
        return true;
    }
    
    public void setDelegate(final m c0) {
        this.c0 = c0;
    }
    
    public void setVisibility(final int n) {
        super.setVisibility(n);
        final View f = this.F;
        if (f instanceof h) {
            ((View)f).setVisibility(n);
        }
    }
    
    public void setWindowInfoListenerDisplayFeatures(final L0.l l) {
        final Object a = l.a;
        final ArrayList list = new ArrayList();
        for (final L0.c c : a) {
            c.a.c().toString();
            final I0.b a2 = c.a;
            final int b = a2.b();
            final L0.b f = L0.b.F;
            L0.b e;
            if (b != 0 && a2.a() != 0) {
                e = f;
            }
            else {
                e = L0.b.E;
            }
            int n = 2;
            int n2;
            if (e == f) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final L0.b g = L0.b.G;
            final L0.b c2 = c.c;
            if (c2 != g) {
                if (c2 == L0.b.H) {
                    n = 3;
                }
                else {
                    n = 1;
                }
            }
            list.add((Object)new io.flutter.embedding.engine.renderer.b(a2.c(), n2, n));
        }
        final ArrayList q = this.U.q;
        q.clear();
        q.addAll((Collection)list);
        this.e();
    }
}
