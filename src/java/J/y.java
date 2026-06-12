package j;

import android.os.BaseBundle;
import java.lang.reflect.AccessibleObject;
import m.f;
import android.view.ViewManager;
import android.widget.AdapterView;
import android.widget.AbsListView;
import java.util.Set;
import android.location.LocationManager;
import com.google.android.gms.internal.ads.vd;
import java.lang.reflect.Method;
import android.text.TextUtils;
import o.g0;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.reflect.InvocationTargetException;
import o.t1;
import O.J;
import android.media.AudioManager;
import android.graphics.drawable.Drawable;
import O.E;
import android.view.View$OnClickListener;
import o.z;
import o.X;
import o.O;
import o.f0;
import androidx.appcompat.widget.AppCompatButton;
import o.r1;
import java.lang.reflect.Field;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import androidx.lifecycle.n;
import android.util.LongSparseArray;
import android.content.res.Resources;
import n3.u0;
import android.util.DisplayMetrics;
import android.os.Handler;
import android.content.ComponentName;
import O.H;
import O.e0;
import androidx.appcompat.widget.ViewStubCompat;
import android.util.AttributeSet;
import h1.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import android.content.pm.PackageManager$NameNotFoundException;
import android.view.MenuItem;
import android.util.Log;
import android.view.LayoutInflater;
import android.util.AndroidRuntimeException;
import android.os.Bundle;
import android.view.KeyCharacterMap;
import o.m1;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import android.view.ViewParent;
import n.l;
import android.content.res.TypedArray;
import android.content.res.Resources$Theme;
import android.view.Window$Callback;
import android.view.WindowManager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import n.g;
import androidx.appcompat.view.menu.ExpandedMenuView;
import m.e;
import android.util.TypedValue;
import android.view.WindowManager;
import android.view.Menu;
import android.view.KeyEvent;
import android.app.UiModeManager;
import java.util.WeakHashMap;
import O.V;
import android.app.Activity;
import K.h;
import java.util.Locale;
import java.util.LinkedHashSet;
import android.os.Build$VERSION;
import K.i;
import android.content.ContextWrapper;
import android.app.Dialog;
import android.os.Build;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import O.d0;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import m.b;
import X4.C;
import o.h0;
import android.view.Window;
import android.content.Context;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import android.graphics.Rect;
import android.view.LayoutInflater$Factory2;
import n.j;

public final class y extends o implements j, LayoutInflater$Factory2
{
    public static final t.j J0;
    public static final int[] K0;
    public static final boolean L0;
    public static final boolean M0;
    public boolean A0;
    public int B0;
    public final p C0;
    public boolean D0;
    public Rect E0;
    public Rect F0;
    public B G0;
    public OnBackInvokedDispatcher H0;
    public OnBackInvokedCallback I0;
    public final Object L;
    public final Context M;
    public Window N;
    public u O;
    public final Object P;
    public a Q;
    public m.j R;
    public CharSequence S;
    public h0 T;
    public C U;
    public q V;
    public b W;
    public ActionBarContextView X;
    public PopupWindow Y;
    public p Z;
    public d0 a0;
    public boolean b0;
    public ViewGroup c0;
    public TextView d0;
    public View e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public x[] n0;
    public x o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public Configuration t0;
    public final int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public v y0;
    public v z0;
    
    static {
        J0 = new t.j();
        K0 = new int[] { 16842836 };
        L0 = ("robolectric".equals((Object)Build.FINGERPRINT) ^ true);
        M0 = true;
    }
    
    public y(Context baseContext, final Window window, final k p4, final Object l) {
        this.a0 = null;
        this.u0 = -100;
        this.C0 = new p(this, 0);
        this.M = baseContext;
        this.P = p4;
        this.L = l;
        Label_0109: {
            if (l instanceof Dialog) {
                while (true) {
                    while (baseContext != null) {
                        if (baseContext instanceof j.j) {
                            final j.j j = (j.j)baseContext;
                            if (j != null) {
                                this.u0 = ((y)j.getDelegate()).u0;
                            }
                            break Label_0109;
                        }
                        else {
                            if (!(baseContext instanceof ContextWrapper)) {
                                break;
                            }
                            baseContext = ((ContextWrapper)baseContext).getBaseContext();
                        }
                    }
                    final j.j j = null;
                    continue;
                }
            }
        }
        if (this.u0 == -100) {
            final t.j j2 = y.J0;
            final Integer n = (Integer)j2.getOrDefault((Object)this.L.getClass().getName(), (Object)null);
            if (n != null) {
                this.u0 = n;
                j2.remove((Object)this.L.getClass().getName());
            }
        }
        if (window != null) {
            this.p(window);
        }
        o.p.c();
    }
    
    public static i q(final Context context) {
        if (Build$VERSION.SDK_INT >= 33) {
            return null;
        }
        final i e = o.E;
        if (e == null) {
            return null;
        }
        final i b = s.b(context.getApplicationContext().getResources().getConfiguration());
        final K.j a = e.a;
        i b2;
        if (a.a.isEmpty()) {
            b2 = i.b;
        }
        else {
            final LinkedHashSet set = new LinkedHashSet();
            for (int i = 0; i < b.a.a.size() + a.a.size(); ++i) {
                Locale locale;
                if (i < a.a.size()) {
                    locale = a.a.get(i);
                }
                else {
                    locale = b.a.a.get(i - a.a.size());
                }
                if (locale != null) {
                    ((Set)set).add((Object)locale);
                }
            }
            b2 = new i(new K.j(h.a((Locale[])((Set)set).toArray((Object[])new Locale[((Set)set).size()]))));
        }
        if (b2.a.a.isEmpty()) {
            b2 = b;
        }
        return b2;
    }
    
    public static Configuration u(final Context context, int n, final i i, final Configuration to, final boolean b) {
        if (n != 1) {
            if (n != 2) {
                if (b) {
                    n = 0;
                }
                else {
                    n = (context.getApplicationContext().getResources().getConfiguration().uiMode & 0x30);
                }
            }
            else {
                n = 32;
            }
        }
        else {
            n = 16;
        }
        final Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        if (to != null) {
            configuration.setTo(to);
        }
        configuration.uiMode = (n | (configuration.uiMode & 0xFFFFFFCF));
        if (i != null) {
            s.d(configuration, i);
        }
        return configuration;
    }
    
    public final x A(final int a) {
        final x[] n0 = this.n0;
        x[] n2 = null;
        Label_0042: {
            if (n0 != null) {
                n2 = n0;
                if (n0.length > a) {
                    break Label_0042;
                }
            }
            n2 = new x[a + 1];
            if (n0 != null) {
                System.arraycopy((Object)n0, 0, (Object)n2, 0, n0.length);
            }
            this.n0 = n2;
        }
        Object o;
        if ((o = n2[a]) == null) {
            o = new Object();
            ((x)o).a = a;
            ((x)o).n = false;
            n2[a] = (x)o;
        }
        return (x)o;
    }
    
    public final void B() {
        this.x();
        if (this.h0) {
            if (this.Q == null) {
                final Object l = this.L;
                if (l instanceof Activity) {
                    this.Q = new L((Activity)l, this.i0);
                }
                else if (l instanceof Dialog) {
                    this.Q = new L((Dialog)l);
                }
                final a q = this.Q;
                if (q != null) {
                    q.o(this.D0);
                }
            }
        }
    }
    
    public final void C(final int n) {
        this.B0 |= 1 << n;
        if (!this.A0) {
            final View decorView = this.N.getDecorView();
            final p c0 = this.C0;
            final WeakHashMap a = O.V.a;
            decorView.postOnAnimation((Runnable)c0);
            this.A0 = true;
        }
    }
    
    public final int D(final Context context, final int n) {
        if (n != -100) {
            if (n != -1) {
                if (n != 0) {
                    if (n != 1 && n != 2) {
                        if (n == 3) {
                            if (this.z0 == null) {
                                this.z0 = new v(this, context);
                            }
                            return this.z0.e();
                        }
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
                else {
                    if (((UiModeManager)context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                        return -1;
                    }
                    return this.z(context).e();
                }
            }
            return n;
        }
        return -1;
    }
    
    public final boolean E() {
        final boolean p0 = this.p0;
        this.p0 = false;
        final x a = this.A(0);
        if (a.m) {
            if (!p0) {
                this.t(a, true);
            }
            return true;
        }
        final b w = this.W;
        if (w != null) {
            w.a();
            return true;
        }
        this.B();
        final a q = this.Q;
        return q != null && q.b();
    }
    
    public final void F(final x x, final KeyEvent keyEvent) {
        if (!x.m) {
            if (!this.s0) {
                final int a = x.a;
                final Context m = this.M;
                if (a == 0 && (m.getResources().getConfiguration().screenLayout & 0xF) == 0x4) {
                    return;
                }
                final Window$Callback callback = this.N.getCallback();
                if (callback != null && !callback.onMenuOpened(a, (Menu)x.h)) {
                    this.t(x, true);
                    return;
                }
                final WindowManager windowManager = (WindowManager)m.getSystemService("window");
                if (windowManager == null) {
                    return;
                }
                if (!this.H(x, keyEvent)) {
                    return;
                }
                final w e = x.e;
                int n = 0;
                Label_0753: {
                    Label_0750: {
                        if (e == null || x.n) {
                            if (e == null) {
                                this.B();
                                final a q = this.Q;
                                Context e2;
                                if (q != null) {
                                    e2 = q.e();
                                }
                                else {
                                    e2 = null;
                                }
                                if (e2 == null) {
                                    e2 = m;
                                }
                                final TypedValue typedValue = new TypedValue();
                                final Resources$Theme theme = e2.getResources().newTheme();
                                theme.setTo(e2.getTheme());
                                theme.resolveAttribute(2130903044, typedValue, true);
                                final int resourceId = typedValue.resourceId;
                                if (resourceId != 0) {
                                    theme.applyStyle(resourceId, true);
                                }
                                theme.resolveAttribute(2130903486, typedValue, true);
                                final int resourceId2 = typedValue.resourceId;
                                if (resourceId2 != 0) {
                                    theme.applyStyle(resourceId2, true);
                                }
                                else {
                                    theme.applyStyle(2131755288, true);
                                }
                                final e j = new e(e2, 0);
                                j.getTheme().setTo(theme);
                                x.j = j;
                                final TypedArray obtainStyledAttributes = ((Context)j).obtainStyledAttributes(i.a.j);
                                x.b = obtainStyledAttributes.getResourceId(86, 0);
                                x.d = obtainStyledAttributes.getResourceId(1, 0);
                                obtainStyledAttributes.recycle();
                                x.e = new w(this, x.j);
                                x.c = 81;
                            }
                            else if (x.n && ((ViewGroup)e).getChildCount() > 0) {
                                ((ViewGroup)x.e).removeAllViews();
                            }
                            final View g = x.g;
                            Label_0822: {
                                if (g != null) {
                                    x.f = g;
                                }
                                else {
                                    if (x.h == null) {
                                        break Label_0822;
                                    }
                                    if (this.V == null) {
                                        this.V = new q(this);
                                    }
                                    final q v = this.V;
                                    if (x.i == null) {
                                        final n.h i = new n.h(x.j);
                                        x.i = i;
                                        i.G = (n.x)v;
                                        final l h = x.h;
                                        h.b(i, h.a);
                                    }
                                    final n.h k = x.i;
                                    final w e3 = x.e;
                                    if (k.F == null) {
                                        k.F = (ExpandedMenuView)k.D.inflate(2131427341, (ViewGroup)e3, false);
                                        if (k.H == null) {
                                            k.H = new g(k);
                                        }
                                        ((AbsListView)k.F).setAdapter((ListAdapter)k.H);
                                        ((AdapterView)k.F).setOnItemClickListener((AdapterView$OnItemClickListener)k);
                                    }
                                    if ((x.f = (View)k.F) == null) {
                                        break Label_0822;
                                    }
                                }
                                if (x.f != null) {
                                    if (x.g == null) {
                                        final n.h l = x.i;
                                        if (l.H == null) {
                                            l.H = new g(l);
                                        }
                                        if (l.H.getCount() <= 0) {
                                            break Label_0822;
                                        }
                                    }
                                    ViewGroup$LayoutParams layoutParams;
                                    if ((layoutParams = x.f.getLayoutParams()) == null) {
                                        layoutParams = new ViewGroup$LayoutParams(-2, -2);
                                    }
                                    x.e.setBackgroundResource(x.b);
                                    final ViewParent parent = x.f.getParent();
                                    if (parent instanceof ViewGroup) {
                                        ((ViewGroup)parent).removeView(x.f);
                                    }
                                    ((ViewGroup)x.e).addView(x.f, layoutParams);
                                    if (!x.f.hasFocus()) {
                                        x.f.requestFocus();
                                    }
                                    break Label_0750;
                                }
                            }
                            x.n = true;
                            return;
                        }
                        final View g2 = x.g;
                        if (g2 != null) {
                            final ViewGroup$LayoutParams layoutParams2 = g2.getLayoutParams();
                            if (layoutParams2 != null && layoutParams2.width == -1) {
                                n = -1;
                                break Label_0753;
                            }
                        }
                    }
                    n = -2;
                }
                x.l = false;
                final WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams(n, -2, 0, 0, 1002, 8519680, -3);
                windowManager$LayoutParams.gravity = x.c;
                windowManager$LayoutParams.windowAnimations = x.d;
                ((ViewManager)windowManager).addView((View)x.e, (ViewGroup$LayoutParams)windowManager$LayoutParams);
                x.m = true;
                if (a == 0) {
                    this.J();
                }
            }
        }
    }
    
    public final boolean G(final x x, final int n, final KeyEvent keyEvent) {
        final boolean system = keyEvent.isSystem();
        final boolean b = false;
        if (system) {
            return false;
        }
        if (!x.k) {
            final boolean performShortcut = b;
            if (!this.H(x, keyEvent)) {
                return performShortcut;
            }
        }
        final l h = x.h;
        boolean performShortcut = b;
        if (h != null) {
            performShortcut = h.performShortcut(n, keyEvent, 1);
        }
        return performShortcut;
    }
    
    public final boolean H(final x o0, final KeyEvent keyEvent) {
        if (this.s0) {
            return false;
        }
        if (o0.k) {
            return true;
        }
        final x o2 = this.o0;
        if (o2 != null && o2 != o0) {
            this.t(o2, false);
        }
        final Window$Callback callback = this.N.getCallback();
        final int a = o0.a;
        if (callback != null) {
            o0.g = callback.onCreatePanelView(a);
        }
        final boolean b = a == 0 || a == 108;
        if (b) {
            final h0 t = this.T;
            if (t != null) {
                final ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)t;
                actionBarOverlayLayout.e();
                ((m1)actionBarOverlayLayout.G).l = true;
            }
        }
        if (o0.g == null && (!b || !(this.Q instanceof G))) {
            final l h = o0.h;
            if (h == null || o0.o) {
                if (h == null) {
                    final Context m = this.M;
                    Object o3 = null;
                    Label_0387: {
                        if (a != 0) {
                            o3 = m;
                            if (a != 108) {
                                break Label_0387;
                            }
                        }
                        o3 = m;
                        if (this.T != null) {
                            final TypedValue typedValue = new TypedValue();
                            final Resources$Theme theme = m.getTheme();
                            theme.resolveAttribute(2130903051, typedValue, true);
                            Resources$Theme theme2;
                            if (typedValue.resourceId != 0) {
                                theme2 = m.getResources().newTheme();
                                theme2.setTo(theme);
                                theme2.applyStyle(typedValue.resourceId, true);
                                theme2.resolveAttribute(2130903052, typedValue, true);
                            }
                            else {
                                theme.resolveAttribute(2130903052, typedValue, true);
                                theme2 = null;
                            }
                            Resources$Theme theme3 = theme2;
                            if (typedValue.resourceId != 0) {
                                if ((theme3 = theme2) == null) {
                                    theme3 = m.getResources().newTheme();
                                    theme3.setTo(theme);
                                }
                                theme3.applyStyle(typedValue.resourceId, true);
                            }
                            o3 = m;
                            if (theme3 != null) {
                                o3 = new e(m, 0);
                                ((e)o3).getTheme().setTo(theme3);
                            }
                        }
                    }
                    final l h2 = new l((Context)o3);
                    h2.e = (j)this;
                    final l h3 = o0.h;
                    if (h2 != h3) {
                        if (h3 != null) {
                            h3.r(o0.i);
                        }
                        o0.h = h2;
                        final n.h i = o0.i;
                        if (i != null) {
                            h2.b(i, h2.a);
                        }
                    }
                    if (o0.h == null) {
                        return false;
                    }
                }
                if (b) {
                    final h0 t2 = this.T;
                    if (t2 != null) {
                        if (this.U == null) {
                            this.U = new C((Object)this, 10);
                        }
                        ((ActionBarOverlayLayout)t2).f(o0.h, (n.x)this.U);
                    }
                }
                o0.h.w();
                if (!callback.onCreatePanelMenu(a, (Menu)o0.h)) {
                    final l h4 = o0.h;
                    if (h4 != null) {
                        if (h4 != null) {
                            h4.r(o0.i);
                        }
                        o0.h = null;
                    }
                    if (b) {
                        final h0 t3 = this.T;
                        if (t3 != null) {
                            ((ActionBarOverlayLayout)t3).f((l)null, (n.x)this.U);
                        }
                    }
                    return false;
                }
                o0.o = false;
            }
            o0.h.w();
            final Bundle p2 = o0.p;
            if (p2 != null) {
                o0.h.s(p2);
                o0.p = null;
            }
            if (!callback.onPreparePanel(0, o0.g, (Menu)o0.h)) {
                if (b) {
                    final h0 t4 = this.T;
                    if (t4 != null) {
                        ((ActionBarOverlayLayout)t4).f((l)null, (n.x)this.U);
                    }
                }
                o0.h.v();
                return false;
            }
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            o0.h.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
            o0.h.v();
        }
        o0.k = true;
        o0.l = false;
        this.o0 = o0;
        return true;
    }
    
    public final void I() {
        if (!this.b0) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
    
    public final void J() {
        if (Build$VERSION.SDK_INT >= 33) {
            final OnBackInvokedDispatcher h0 = this.H0;
            boolean b = false;
            if (h0 != null) {
                if (this.A(0).m || this.W != null) {
                    b = true;
                }
            }
            if (b && this.I0 == null) {
                this.I0 = t.b(this.H0, this);
            }
            else if (!b) {
                final OnBackInvokedCallback i0 = this.I0;
                if (i0 != null) {
                    t.c(this.H0, i0);
                }
            }
        }
    }
    
    @Override
    public final void a() {
        final LayoutInflater from = LayoutInflater.from(this.M);
        if (from.getFactory() == null) {
            from.setFactory2((LayoutInflater$Factory2)this);
        }
        else if (!(from.getFactory2() instanceof y)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }
    
    @Override
    public final void b() {
        if (this.Q != null) {
            this.B();
            if (!this.Q.g()) {
                this.C(0);
            }
        }
    }
    
    public final boolean c(final l l, final MenuItem menuItem) {
        final Window$Callback callback = this.N.getCallback();
        if (callback != null && !this.s0) {
            final l k = l.k();
            final x[] n0 = this.n0;
            int length;
            if (n0 != null) {
                length = n0.length;
            }
            else {
                length = 0;
            }
            int i = 0;
            while (true) {
                while (i < length) {
                    final x x = n0[i];
                    if (x != null && x.h == k) {
                        if (x != null) {
                            return callback.onMenuItemSelected(x.a, menuItem);
                        }
                        return false;
                    }
                    else {
                        ++i;
                    }
                }
                final x x = null;
                continue;
            }
        }
        return false;
    }
    
    @Override
    public final void e() {
        this.o(false, this.q0 = true);
        this.y();
        final Object l = this.L;
        if (l instanceof Activity) {
            String r;
            try {
                final Activity activity = (Activity)l;
                try {
                    r = com.google.android.gms.internal.auth.h.r(activity, activity.getComponentName());
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    throw new IllegalArgumentException((Throwable)ex);
                }
            }
            catch (final IllegalArgumentException ex2) {
                r = null;
            }
            if (r != null) {
                final a q = this.Q;
                if (q == null) {
                    this.D0 = true;
                }
                else {
                    q.o(true);
                }
            }
            final Object j = o.J;
            synchronized (j) {
                o.h(this);
                o.I.add((Object)new WeakReference((Object)this));
            }
        }
        this.t0 = new Configuration(this.M.getResources().getConfiguration());
        this.r0 = true;
    }
    
    public final void f(final l l) {
        final h0 t = this.T;
        Label_0353: {
            if (t != null) {
                final ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)t;
                actionBarOverlayLayout.e();
                final Toolbar a = ((m1)actionBarOverlayLayout.G).a;
                if (((View)a).getVisibility() == 0) {
                    final ActionMenuView c = a.C;
                    if (c != null && c.U) {
                        if (ViewConfiguration.get(this.M).hasPermanentMenuKey()) {
                            final ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout)this.T;
                            actionBarOverlayLayout2.e();
                            final ActionMenuView c2 = ((m1)actionBarOverlayLayout2.G).a.C;
                            if (c2 == null) {
                                break Label_0353;
                            }
                            final o.i v = c2.V;
                            if (v == null || (v.W == null && !v.e())) {
                                break Label_0353;
                            }
                        }
                        final Window$Callback callback = this.N.getCallback();
                        final ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout)this.T;
                        actionBarOverlayLayout3.e();
                        if (((m1)actionBarOverlayLayout3.G).a.p()) {
                            final ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout)this.T;
                            actionBarOverlayLayout4.e();
                            final ActionMenuView c3 = ((m1)actionBarOverlayLayout4.G).a.C;
                            if (c3 != null) {
                                final o.i v2 = c3.V;
                                if (v2 != null) {
                                    v2.c();
                                }
                            }
                            if (!this.s0) {
                                callback.onPanelClosed(108, (Menu)this.A(0).h);
                            }
                            return;
                        }
                        else {
                            if (callback == null || this.s0) {
                                return;
                            }
                            if (this.A0 && (0x1 & this.B0) != 0x0) {
                                final View decorView = this.N.getDecorView();
                                final p c4 = this.C0;
                                decorView.removeCallbacks((Runnable)c4);
                                c4.run();
                            }
                            final x a2 = this.A(0);
                            final l h = a2.h;
                            if (h != null && !a2.o && callback.onPreparePanel(0, a2.g, (Menu)h)) {
                                callback.onMenuOpened(108, (Menu)a2.h);
                                final ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout)this.T;
                                actionBarOverlayLayout5.e();
                                ((m1)actionBarOverlayLayout5.G).a.v();
                            }
                            return;
                        }
                    }
                }
            }
        }
        final x a3 = this.A(0);
        a3.n = true;
        this.t(a3, false);
        this.F(a3, null);
    }
    
    @Override
    public final void g() {
        if (this.L instanceof Activity) {
            final Object j = o.J;
            synchronized (j) {
                o.h(this);
            }
        }
        if (this.A0) {
            this.N.getDecorView().removeCallbacks((Runnable)this.C0);
        }
        this.s0 = true;
        Label_0134: {
            if (this.u0 != -100) {
                final Object l = this.L;
                if (l instanceof Activity && ((Activity)l).isChangingConfigurations()) {
                    y.J0.put((Object)this.L.getClass().getName(), (Object)this.u0);
                    break Label_0134;
                }
            }
            y.J0.remove((Object)this.L.getClass().getName());
        }
        final a q = this.Q;
        if (q != null) {
            q.j();
        }
        final v y0 = this.y0;
        if (y0 != null) {
            y0.c();
        }
        final v z0 = this.z0;
        if (z0 != null) {
            z0.c();
        }
    }
    
    @Override
    public final boolean i(final int n) {
        int n2;
        if (n == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            n2 = 108;
        }
        else if ((n2 = n) == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            n2 = 109;
        }
        if (this.l0 && n2 == 108) {
            return false;
        }
        if (this.h0 && n2 == 1) {
            this.h0 = false;
        }
        if (n2 == 1) {
            this.I();
            return this.l0 = true;
        }
        if (n2 == 2) {
            this.I();
            return this.f0 = true;
        }
        if (n2 == 5) {
            this.I();
            return this.g0 = true;
        }
        if (n2 == 10) {
            this.I();
            return this.j0 = true;
        }
        if (n2 == 108) {
            this.I();
            return this.h0 = true;
        }
        if (n2 != 109) {
            return this.N.requestFeature(n2);
        }
        this.I();
        return this.i0 = true;
    }
    
    @Override
    public final void j(final int n) {
        this.x();
        final ViewGroup viewGroup = (ViewGroup)((View)this.c0).findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.M).inflate(n, viewGroup);
        this.O.a(this.N.getCallback());
    }
    
    @Override
    public final void k(final View view) {
        this.x();
        final ViewGroup viewGroup = (ViewGroup)((View)this.c0).findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.O.a(this.N.getCallback());
    }
    
    @Override
    public final void l(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.x();
        final ViewGroup viewGroup = (ViewGroup)((View)this.c0).findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, viewGroup$LayoutParams);
        this.O.a(this.N.getCallback());
    }
    
    @Override
    public final void m(final CharSequence text) {
        this.S = text;
        final h0 t = this.T;
        if (t != null) {
            t.setWindowTitle(text);
        }
        else {
            final a q = this.Q;
            if (q != null) {
                q.s(text);
            }
            else {
                final TextView d0 = this.d0;
                if (d0 != null) {
                    d0.setText(text);
                }
            }
        }
    }
    
    @Override
    public final b n(final m.a a) {
        Label_0782: {
            if (a == null) {
                break Label_0782;
            }
            final b w = this.W;
            if (w != null) {
                w.a();
            }
            final m g = new m(this, 6, a);
            this.B();
            final a q = this.Q;
            final Object p = this.P;
            if (q != null) {
                final b u = q.u(g);
                if ((this.W = u) != null) {
                    ((k)p).onSupportActionModeStarted(u);
                }
            }
            Label_0773: {
                if (this.W != null) {
                    break Label_0773;
                }
                final d0 a2 = this.a0;
                if (a2 != null) {
                    a2.b();
                }
                final b w2 = this.W;
                if (w2 != null) {
                    w2.a();
                }
                while (true) {
                    if (this.s0) {
                        break Label_0129;
                    }
                    try {
                        b onWindowStartingSupportActionMode = ((k)p).onWindowStartingSupportActionMode((m.a)g);
                        while (true) {
                            if (onWindowStartingSupportActionMode != null) {
                                this.W = onWindowStartingSupportActionMode;
                            }
                            else {
                                if (this.X == null) {
                                    final boolean k0 = this.k0;
                                    Context m = this.M;
                                    if (k0) {
                                        final TypedValue typedValue = new TypedValue();
                                        final Resources$Theme theme = m.getTheme();
                                        theme.resolveAttribute(2130903051, typedValue, true);
                                        e e = (e)m;
                                        if (typedValue.resourceId != 0) {
                                            final Resources$Theme theme2 = m.getResources().newTheme();
                                            theme2.setTo(theme);
                                            theme2.applyStyle(typedValue.resourceId, true);
                                            e = new e(m, 0);
                                            e.getTheme().setTo(theme2);
                                        }
                                        this.X = new ActionBarContextView((Context)e, (AttributeSet)null);
                                        T.l.d(this.Y = new PopupWindow((Context)e, (AttributeSet)null, 2130903066), 2);
                                        this.Y.setContentView((View)this.X);
                                        this.Y.setWidth(-1);
                                        ((Context)e).getTheme().resolveAttribute(2130903045, typedValue, true);
                                        this.X.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, ((Context)e).getResources().getDisplayMetrics()));
                                        this.Y.setHeight(-2);
                                        this.Z = new p(this, 1);
                                    }
                                    else {
                                        final ViewStubCompat viewStubCompat = (ViewStubCompat)((View)this.c0).findViewById(2131230784);
                                        if (viewStubCompat != null) {
                                            this.B();
                                            final a q2 = this.Q;
                                            Context e2;
                                            if (q2 != null) {
                                                e2 = q2.e();
                                            }
                                            else {
                                                e2 = null;
                                            }
                                            if (e2 != null) {
                                                m = e2;
                                            }
                                            viewStubCompat.setLayoutInflater(LayoutInflater.from(m));
                                            this.X = (ActionBarContextView)viewStubCompat.a();
                                        }
                                    }
                                }
                                if (this.X != null) {
                                    final d0 a3 = this.a0;
                                    if (a3 != null) {
                                        a3.b();
                                    }
                                    this.X.e();
                                    final Context context = ((View)this.X).getContext();
                                    final ActionBarContextView x = this.X;
                                    final Object o = new Object();
                                    ((f)o).E = context;
                                    ((f)o).F = x;
                                    ((f)o).G = g;
                                    final l j = new l(((View)x).getContext());
                                    j.l = 1;
                                    ((f)o).J = j;
                                    j.e = (j)o;
                                    if (((m.a)g.D).g((b)o, j)) {
                                        ((f)o).i();
                                        this.X.c((b)o);
                                        this.W = (b)o;
                                        boolean b = false;
                                        Label_0619: {
                                            if (this.b0) {
                                                final ViewGroup c0 = this.c0;
                                                if (c0 != null) {
                                                    final WeakHashMap a4 = O.V.a;
                                                    if (((View)c0).isLaidOut()) {
                                                        b = true;
                                                        break Label_0619;
                                                    }
                                                }
                                            }
                                            b = false;
                                        }
                                        if (b) {
                                            ((View)this.X).setAlpha(0.0f);
                                            final d0 a5 = O.V.a((View)this.X);
                                            a5.a(1.0f);
                                            (this.a0 = a5).d((e0)new r(this, 1));
                                        }
                                        else {
                                            ((View)this.X).setAlpha(1.0f);
                                            this.X.setVisibility(0);
                                            if (((View)this.X).getParent() instanceof View) {
                                                final View view = (View)((View)this.X).getParent();
                                                final WeakHashMap a6 = O.V.a;
                                                O.H.c(view);
                                            }
                                        }
                                        if (this.Y != null) {
                                            this.N.getDecorView().post((Runnable)this.Z);
                                        }
                                    }
                                    else {
                                        this.W = null;
                                    }
                                }
                            }
                            final b w3 = this.W;
                            if (w3 != null) {
                                ((k)p).onSupportActionModeStarted(w3);
                            }
                            this.J();
                            this.W = this.W;
                            this.J();
                            return this.W;
                            onWindowStartingSupportActionMode = null;
                            continue;
                        }
                        throw new IllegalArgumentException("ActionMode callback can not be null.");
                    }
                    catch (final AbstractMethodError abstractMethodError) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public final boolean o(final boolean b, final boolean b2) {
        final boolean s0 = this.s0;
        final int n = 0;
        if (s0) {
            return false;
        }
        int n2 = this.u0;
        if (n2 == -100) {
            n2 = o.D;
        }
        final Context m = this.M;
        final int d = this.D(m, n2);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final LongSparseArray longSparseArray = null;
        i q;
        if (sdk_INT < 33) {
            q = q(m);
        }
        else {
            q = null;
        }
        i b3 = q;
        if (!b2 && (b3 = q) != null) {
            b3 = s.b(m.getResources().getConfiguration());
        }
        final Configuration u = u(m, d, b3, null, false);
        final boolean x0 = this.x0;
        final Object l = this.L;
        int w0 = 0;
        Label_0257: {
            if (!x0 && l instanceof Activity) {
                final PackageManager packageManager = m.getPackageManager();
                if (packageManager == null) {
                    w0 = 0;
                    break Label_0257;
                }
                int n3;
                if (sdk_INT >= 29) {
                    n3 = 269221888;
                }
                else {
                    n3 = 786432;
                }
                try {
                    final ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(m, (Class)((Activity)l).getClass()), n3);
                    if (activityInfo != null) {
                        this.w0 = activityInfo.configChanges;
                    }
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", (Throwable)ex);
                    this.w0 = 0;
                }
            }
            this.x0 = true;
            w0 = this.w0;
        }
        Configuration configuration;
        if ((configuration = this.t0) == null) {
            configuration = m.getResources().getConfiguration();
        }
        final int uiMode = configuration.uiMode;
        final int n4 = u.uiMode & 0x30;
        final i b4 = s.b(configuration);
        i b5;
        if (b3 == null) {
            b5 = null;
        }
        else {
            b5 = s.b(u);
        }
        int n5;
        if ((uiMode & 0x30) != n4) {
            n5 = 512;
        }
        else {
            n5 = 0;
        }
        int n6 = n5;
        if (b5 != null) {
            n6 = n5;
            if (!b4.equals((Object)b5)) {
                n6 = (n5 | 0x2004);
            }
        }
        boolean b6 = false;
        Label_0475: {
            if ((~w0 & n6) != 0x0 && b && this.q0 && (y.L0 || this.r0) && l instanceof Activity) {
                final Activity activity = (Activity)l;
                if (!activity.isChild()) {
                    if (Build$VERSION.SDK_INT >= 28) {
                        activity.recreate();
                    }
                    else {
                        new Handler(((Context)activity).getMainLooper()).post((Runnable)new C.a((Object)activity, 0));
                    }
                    b6 = true;
                    break Label_0475;
                }
            }
            b6 = false;
        }
        if (!b6 && n6 != 0) {
            int n7 = n;
            if ((w0 & n6) == n6) {
                n7 = 1;
            }
            final Resources resources = m.getResources();
            final Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = ((resources.getConfiguration().uiMode & 0xFFFFFFCF) | n4);
            if (b5 != null) {
                s.d(configuration2, b5);
            }
            resources.updateConfiguration(configuration2, (DisplayMetrics)null);
            final int sdk_INT2 = Build$VERSION.SDK_INT;
            if (sdk_INT2 < 26) {
                if (sdk_INT2 < 28) {
                    if (!n3.u0.h) {
                        try {
                            ((AccessibleObject)(n3.u0.g = Resources.class.getDeclaredField("mResourcesImpl"))).setAccessible(true);
                        }
                        catch (final NoSuchFieldException ex2) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", (Throwable)ex2);
                        }
                        n3.u0.h = true;
                    }
                    final Field g = n3.u0.g;
                    if (g != null) {
                        Object value;
                        try {
                            value = g.get((Object)resources);
                        }
                        catch (final IllegalAccessException ex3) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", (Throwable)ex3);
                            value = null;
                        }
                        if (value != null) {
                            if (!n3.u0.b) {
                                try {
                                    ((AccessibleObject)(n3.u0.a = value.getClass().getDeclaredField("mDrawableCache"))).setAccessible(true);
                                }
                                catch (final NoSuchFieldException ex4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", (Throwable)ex4);
                                }
                                n3.u0.b = true;
                            }
                            final Field a = n3.u0.a;
                            Object value2 = null;
                            Label_0775: {
                                if (a != null) {
                                    try {
                                        value2 = a.get(value);
                                        break Label_0775;
                                    }
                                    catch (final IllegalAccessException ex5) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", (Throwable)ex5);
                                    }
                                }
                                value2 = null;
                            }
                            if (value2 != null) {
                                if (!n3.u0.d) {
                                    try {
                                        n3.u0.c = Class.forName("android.content.res.ThemedResourceCache");
                                    }
                                    catch (final ClassNotFoundException ex6) {
                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", (Throwable)ex6);
                                    }
                                    n3.u0.d = true;
                                }
                                final Class c = n3.u0.c;
                                if (c != null) {
                                    if (!n3.u0.f) {
                                        try {
                                            ((AccessibleObject)(n3.u0.e = c.getDeclaredField("mUnthemedEntries"))).setAccessible(true);
                                        }
                                        catch (final NoSuchFieldException ex7) {
                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", (Throwable)ex7);
                                        }
                                        n3.u0.f = true;
                                    }
                                    final Field e = n3.u0.e;
                                    if (e != null) {
                                        LongSparseArray longSparseArray2;
                                        try {
                                            longSparseArray2 = (LongSparseArray)e.get(value2);
                                        }
                                        catch (final IllegalAccessException ex8) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", (Throwable)ex8);
                                            longSparseArray2 = longSparseArray;
                                        }
                                        if (longSparseArray2 != null) {
                                            j.F.a(longSparseArray2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final int v0 = this.v0;
            if (v0 != 0) {
                m.setTheme(v0);
                m.getTheme().applyStyle(this.v0, true);
            }
            if (n7 != 0 && l instanceof Activity) {
                final Activity activity2 = (Activity)l;
                if (activity2 instanceof androidx.lifecycle.t) {
                    if (((Enum)((androidx.lifecycle.v)((androidx.lifecycle.t)activity2).getLifecycle()).c).compareTo((Enum)androidx.lifecycle.n.E) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                }
                else if (this.r0 && !this.s0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            b6 = true;
        }
        if (b6 && l instanceof j.j) {
            if ((n6 & 0x200) != 0x0) {
                ((j.j)l).onNightModeChanged(d);
            }
            if ((n6 & 0x4) != 0x0) {
                ((j.j)l).onLocalesChanged(b3);
            }
        }
        if (b6 && b5 != null) {
            s.c(s.b(m.getResources().getConfiguration()));
        }
        if (n2 == 0) {
            this.z(m).j();
        }
        else {
            final v y0 = this.y0;
            if (y0 != null) {
                y0.c();
            }
        }
        if (n2 == 3) {
            if (this.z0 == null) {
                this.z0 = new v(this, m);
            }
            this.z0.j();
        }
        else {
            final v z0 = this.z0;
            if (z0 != null) {
                z0.c();
            }
        }
        return b6;
    }
    
    public final View onCreateView(View string, final String s, Context context, final AttributeSet set) {
        int n = 4;
        final B g0 = this.G0;
        final View view = null;
        if (g0 == null) {
            final int[] j = i.a.j;
            final Context m = this.M;
            string = (View)m.obtainStyledAttributes(j).getString(116);
            if (string == null) {
                this.G0 = new B();
            }
            else {
                try {
                    this.G0 = (B)m.getClassLoader().loadClass((String)string).getDeclaredConstructor((Class[])null).newInstance((Object[])null);
                }
                finally {
                    final StringBuilder sb = new StringBuilder("Failed to instantiate custom view inflater ");
                    sb.append((String)string);
                    sb.append(". Falling back to default.");
                    final Throwable t;
                    Log.i("AppCompatDelegate", sb.toString(), t);
                    this.G0 = new B();
                }
            }
        }
        final B g2 = this.G0;
        final int a = r1.a;
        g2.getClass();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, i.a.z, 0, 0);
        final int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Object o;
        if (resourceId != 0 && (!(context instanceof e) || ((e)context).a != resourceId)) {
            o = new e(context, resourceId);
        }
        else {
            o = context;
        }
        s.getClass();
        Label_0653: {
            switch (s.hashCode()) {
                case 2001146706: {
                    if (!s.equals((Object)"Button")) {
                        break;
                    }
                    n = 13;
                    break Label_0653;
                }
                case 1666676343: {
                    if (!s.equals((Object)"EditText")) {
                        break;
                    }
                    n = 12;
                    break Label_0653;
                }
                case 1601505219: {
                    if (!s.equals((Object)"CheckBox")) {
                        break;
                    }
                    n = 11;
                    break Label_0653;
                }
                case 1413872058: {
                    if (!s.equals((Object)"AutoCompleteTextView")) {
                        break;
                    }
                    n = 10;
                    break Label_0653;
                }
                case 1125864064: {
                    if (!s.equals((Object)"ImageView")) {
                        break;
                    }
                    n = 9;
                    break Label_0653;
                }
                case 799298502: {
                    if (!s.equals((Object)"ToggleButton")) {
                        break;
                    }
                    n = 8;
                    break Label_0653;
                }
                case 776382189: {
                    if (!s.equals((Object)"RadioButton")) {
                        break;
                    }
                    n = 7;
                    break Label_0653;
                }
                case -339785223: {
                    if (!s.equals((Object)"Spinner")) {
                        break;
                    }
                    n = 6;
                    break Label_0653;
                }
                case -658531749: {
                    if (!s.equals((Object)"SeekBar")) {
                        break;
                    }
                    n = 5;
                    break Label_0653;
                }
                case -937446323: {
                    if (!s.equals((Object)"ImageButton")) {
                        break;
                    }
                    break Label_0653;
                }
                case -938935918: {
                    if (!s.equals((Object)"TextView")) {
                        break;
                    }
                    n = 3;
                    break Label_0653;
                }
                case -1346021293: {
                    if (!s.equals((Object)"MultiAutoCompleteTextView")) {
                        break;
                    }
                    n = 2;
                    break Label_0653;
                }
                case -1455429095: {
                    if (!s.equals((Object)"CheckedTextView")) {
                        break;
                    }
                    n = 1;
                    break Label_0653;
                }
                case -1946472170: {
                    if (!s.equals((Object)"RatingBar")) {
                        break;
                    }
                    n = 0;
                    break Label_0653;
                }
            }
            n = -1;
        }
        Object o2 = null;
        switch (n) {
            default: {
                o2 = null;
                break;
            }
            case 13: {
                o2 = new AppCompatButton((Context)o, set);
                break;
            }
            case 12: {
                o2 = new o.r((Context)o, set);
                break;
            }
            case 11: {
                o2 = new o.n((Context)o, set);
                break;
            }
            case 10: {
                o2 = new o.m((Context)o, set);
                break;
            }
            case 9: {
                o2 = new o.u((Context)o, set, 0);
                break;
            }
            case 8: {
                o2 = new f0((Context)o, set);
                break;
            }
            case 7: {
                o2 = new o.y((Context)o, set);
                break;
            }
            case 6: {
                o2 = new O((Context)o, set);
                break;
            }
            case 5: {
                o2 = new o.B((Context)o, set);
                break;
            }
            case 4: {
                o2 = new o.t((Context)o, set, 2130903325);
                break;
            }
            case 3: {
                o2 = new X((Context)o, set);
                break;
            }
            case 2: {
                o2 = new o.v((Context)o, set);
                break;
            }
            case 1: {
                o2 = new o.o((Context)o, set);
                break;
            }
            case 0: {
                o2 = new z((Context)o, set);
                break;
            }
        }
        View view2 = (View)o2;
        if (o2 == null) {
            view2 = (View)o2;
            if (context != o) {
                context = (Context)g2.a;
                String attributeValue = s;
                if (s.equals((Object)"view")) {
                    attributeValue = set.getAttributeValue((String)null, "class");
                }
                context[0] = o;
                context[1] = set;
                try {
                    if (-1 != attributeValue.indexOf(46)) {
                        goto Label_1073;
                    }
                    int n2 = 0;
                    View a2;
                    while (true) {
                        final String[] g3 = B.g;
                        if (n2 >= 3) {
                            goto Label_1059;
                        }
                        a2 = g2.a((Context)o, attributeValue, g3[n2]);
                        if (a2 != null) {
                            break;
                        }
                        ++n2;
                    }
                    context[1] = (context[0] = null);
                    string = a2;
                }
                catch (final Exception ex) {
                    context[1] = (context[0] = null);
                    string = view;
                }
                finally {
                    goto Label_1094;
                }
                view2 = string;
            }
        }
        if (view2 != null) {
            context = view2.getContext();
            if (context instanceof ContextWrapper) {
                final WeakHashMap a3 = O.V.a;
                if (view2.hasOnClickListeners()) {
                    final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, B.c);
                    final String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        view2.setOnClickListener((View$OnClickListener)new A(view2, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
            if (Build$VERSION.SDK_INT <= 28) {
                final TypedArray obtainStyledAttributes3 = ((Context)o).obtainStyledAttributes(set, B.d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    final boolean boolean1 = obtainStyledAttributes3.getBoolean(0, false);
                    final WeakHashMap a4 = O.V.a;
                    ((O.G)new E(2131231052, (Class)Boolean.class, 0, 28, 3)).d(view2, (Object)boolean1);
                }
                obtainStyledAttributes3.recycle();
                final TypedArray obtainStyledAttributes4 = ((Context)o).obtainStyledAttributes(set, B.e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    O.V.i(view2, (CharSequence)obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                final TypedArray obtainStyledAttributes5 = ((Context)o).obtainStyledAttributes(set, B.f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    final boolean boolean2 = obtainStyledAttributes5.getBoolean(0, false);
                    final WeakHashMap a5 = O.V.a;
                    ((O.G)new E(2131231057, (Class)Boolean.class, 0, 28, 0)).d(view2, (Object)boolean2);
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return view2;
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
    
    public final void p(final Window n) {
        if (this.N != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        final Window$Callback callback = n.getCallback();
        if (!(callback instanceof u)) {
            n.setCallback((Window$Callback)(this.O = new u(this, callback)));
            final int[] k0 = y.K0;
            Object backgroundDrawable = this.M;
            final TypedArray obtainStyledAttributes = ((Context)backgroundDrawable).obtainStyledAttributes((AttributeSet)null, k0);
            Label_0116: {
                if (obtainStyledAttributes.hasValue(0)) {
                    final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        final o.p a = o.p.a();
                        synchronized (a) {
                            backgroundDrawable = a.a.d((Context)backgroundDrawable, resourceId, true);
                            break Label_0116;
                        }
                    }
                }
                backgroundDrawable = null;
            }
            if (backgroundDrawable != null) {
                n.setBackgroundDrawable((Drawable)backgroundDrawable);
            }
            obtainStyledAttributes.recycle();
            this.N = n;
            if (Build$VERSION.SDK_INT >= 33) {
                final OnBackInvokedDispatcher h0 = this.H0;
                if (h0 == null) {
                    if (h0 != null) {
                        final OnBackInvokedCallback i0 = this.I0;
                        if (i0 != null) {
                            t.c(h0, i0);
                            this.I0 = null;
                        }
                    }
                    final Object l = this.L;
                    Label_0215: {
                        if (l instanceof Activity) {
                            final Activity activity = (Activity)l;
                            if (activity.getWindow() != null) {
                                this.H0 = t.a(activity);
                                break Label_0215;
                            }
                        }
                        this.H0 = null;
                    }
                    this.J();
                }
            }
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    
    public final void r(final int n, x o, final l l) {
        x x = o;
        l h = l;
        if (l == null) {
            x x2;
            if ((x2 = o) == null) {
                x2 = o;
                if (n >= 0) {
                    final x[] n2 = this.n0;
                    x2 = o;
                    if (n < n2.length) {
                        x2 = n2[n];
                    }
                }
            }
            x = x2;
            h = l;
            if (x2 != null) {
                h = x2.h;
                x = x2;
            }
        }
        if (x != null && !x.m) {
            return;
        }
        if (!this.s0) {
            o = (x)this.O;
            final Window$Callback callback = this.N.getCallback();
            o.getClass();
            try {
                ((u)o).G = true;
                callback.onPanelClosed(n, (Menu)h);
            }
            finally {
                ((u)o).G = false;
            }
        }
    }
    
    public final void s(final l l) {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        final ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)this.T;
        actionBarOverlayLayout.e();
        final ActionMenuView c = ((m1)actionBarOverlayLayout.G).a.C;
        if (c != null) {
            final o.i v = c.V;
            if (v != null) {
                v.c();
                final o.e v2 = v.V;
                if (v2 != null && ((n.w)v2).b()) {
                    ((n.w)v2).i.dismiss();
                }
            }
        }
        final Window$Callback callback = this.N.getCallback();
        if (callback != null && !this.s0) {
            callback.onPanelClosed(108, (Menu)l);
        }
        this.m0 = false;
    }
    
    public final void t(final x x, final boolean b) {
        if (b && x.a == 0) {
            final h0 t = this.T;
            if (t != null) {
                final ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)t;
                actionBarOverlayLayout.e();
                if (((m1)actionBarOverlayLayout.G).a.p()) {
                    this.s(x.h);
                    return;
                }
            }
        }
        final WindowManager windowManager = (WindowManager)this.M.getSystemService("window");
        if (windowManager != null && x.m) {
            final w e = x.e;
            if (e != null) {
                ((ViewManager)windowManager).removeView((View)e);
                if (b) {
                    this.r(x.a, x, null);
                }
            }
        }
        x.k = false;
        x.l = false;
        x.m = false;
        x.f = null;
        x.n = true;
        if (this.o0 == x) {
            this.o0 = null;
        }
        if (x.a == 0) {
            this.J();
        }
    }
    
    public final boolean v(KeyEvent keyEvent) {
        final Object l = this.L;
        final boolean b = l instanceof O.l;
        final boolean b2 = true;
        boolean p0 = true;
        if (b || l instanceof j.g) {
            final View decorView = this.N.getDecorView();
            if (decorView != null && a.a.e(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82) {
            final u o = this.O;
            final Window$Callback callback = this.N.getCallback();
            o.getClass();
            try {
                o.F = true;
                final boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                o.F = false;
                if (dispatchKeyEvent) {
                    return true;
                }
            }
            finally {
                o.F = false;
            }
        }
        final int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    boolean b3 = b2;
                    if (keyEvent.getRepeatCount() != 0) {
                        return b3;
                    }
                    final x a = this.A(0);
                    b3 = b2;
                    if (!a.m) {
                        this.H(a, keyEvent);
                        b3 = b2;
                        return b3;
                    }
                    return b3;
                }
            }
            else {
                if ((keyEvent.getFlags() & 0x80) == 0x0) {
                    p0 = false;
                }
                this.p0 = p0;
            }
        }
        else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.W != null) {
                    return b2;
                }
                final x a2 = this.A(0);
                final h0 t = this.T;
                final Context m = this.M;
                int n = 0;
                Label_0548: {
                    Label_0536: {
                        Label_0531: {
                            if (t != null) {
                                final ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)t;
                                actionBarOverlayLayout.e();
                                final Toolbar a3 = ((m1)actionBarOverlayLayout.G).a;
                                if (((View)a3).getVisibility() == 0) {
                                    final ActionMenuView c = a3.C;
                                    if (c != null && c.U && !ViewConfiguration.get(m).hasPermanentMenuKey()) {
                                        final ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout)this.T;
                                        actionBarOverlayLayout2.e();
                                        if (!((m1)actionBarOverlayLayout2.G).a.p()) {
                                            if (!this.s0 && this.H(a2, keyEvent)) {
                                                final ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout)this.T;
                                                actionBarOverlayLayout3.e();
                                                n = (((m1)actionBarOverlayLayout3.G).a.v() ? 1 : 0);
                                                break Label_0548;
                                            }
                                            break Label_0536;
                                        }
                                        else {
                                            final ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout)this.T;
                                            actionBarOverlayLayout4.e();
                                            final ActionMenuView c2 = ((m1)actionBarOverlayLayout4.G).a.C;
                                            if (c2 == null) {
                                                break Label_0536;
                                            }
                                            final o.i v = c2.V;
                                            if (v != null && v.c()) {
                                                break Label_0531;
                                            }
                                            break Label_0536;
                                        }
                                    }
                                }
                            }
                            n = (a2.m ? 1 : 0);
                            if (n != 0 || a2.l) {
                                this.t(a2, true);
                                break Label_0548;
                            }
                            if (!a2.k) {
                                break Label_0536;
                            }
                            boolean h;
                            if (a2.o) {
                                a2.k = false;
                                h = this.H(a2, keyEvent);
                            }
                            else {
                                h = true;
                            }
                            if (!h) {
                                break Label_0536;
                            }
                            this.F(a2, keyEvent);
                        }
                        n = 1;
                        break Label_0548;
                    }
                    n = 0;
                }
                boolean b3 = b2;
                if (n == 0) {
                    return b3;
                }
                final AudioManager audioManager = (AudioManager)m.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    b3 = b2;
                    return b3;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                b3 = b2;
                return b3;
            }
        }
        else if (this.E()) {
            return b2;
        }
        return false;
    }
    
    public final void w(final int n) {
        final x a = this.A(n);
        if (a.h != null) {
            final Bundle p = new Bundle();
            a.h.t(p);
            if (((BaseBundle)p).size() > 0) {
                a.p = p;
            }
            a.h.w();
            a.h.clear();
        }
        a.o = true;
        a.n = true;
        if ((n == 108 || n == 0) && this.T != null) {
            final x a2 = this.A(0);
            a2.k = false;
            this.H(a2, null);
        }
    }
    
    public final void x() {
        if (!this.b0) {
            final int[] j = i.a.j;
            final Context m = this.M;
            final TypedArray obtainStyledAttributes = m.obtainStyledAttributes(j);
            if (!obtainStyledAttributes.hasValue(117)) {
                obtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (obtainStyledAttributes.getBoolean(126, false)) {
                this.i(1);
            }
            else if (obtainStyledAttributes.getBoolean(117, false)) {
                this.i(108);
            }
            if (obtainStyledAttributes.getBoolean(118, false)) {
                this.i(109);
            }
            if (obtainStyledAttributes.getBoolean(119, false)) {
                this.i(10);
            }
            this.k0 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            this.y();
            this.N.getDecorView();
            final LayoutInflater from = LayoutInflater.from(m);
            ViewGroup viewGroup;
            if (!this.l0) {
                if (this.k0) {
                    viewGroup = (ViewGroup)from.inflate(2131427340, (ViewGroup)null);
                    this.i0 = false;
                    this.h0 = false;
                }
                else if (this.h0) {
                    final TypedValue typedValue = new TypedValue();
                    m.getTheme().resolveAttribute(2130903051, typedValue, true);
                    Object o;
                    if (typedValue.resourceId != 0) {
                        o = new e(m, typedValue.resourceId);
                    }
                    else {
                        o = m;
                    }
                    final ViewGroup viewGroup2 = (ViewGroup)LayoutInflater.from((Context)o).inflate(2131427351, (ViewGroup)null);
                    (this.T = (h0)((View)viewGroup2).findViewById(2131230864)).setWindowCallback(this.N.getCallback());
                    if (this.i0) {
                        ((ActionBarOverlayLayout)this.T).d(109);
                    }
                    if (this.f0) {
                        ((ActionBarOverlayLayout)this.T).d(2);
                    }
                    viewGroup = viewGroup2;
                    if (this.g0) {
                        ((ActionBarOverlayLayout)this.T).d(5);
                        viewGroup = viewGroup2;
                    }
                }
                else {
                    viewGroup = null;
                }
            }
            else if (this.j0) {
                viewGroup = (ViewGroup)from.inflate(2131427350, (ViewGroup)null);
            }
            else {
                viewGroup = (ViewGroup)from.inflate(2131427349, (ViewGroup)null);
            }
            if (viewGroup == null) {
                final StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                sb.append(this.h0);
                sb.append(", windowActionBarOverlay: ");
                sb.append(this.i0);
                sb.append(", android:windowIsFloating: ");
                sb.append(this.k0);
                sb.append(", windowActionModeOverlay: ");
                sb.append(this.j0);
                sb.append(", windowNoTitle: ");
                sb.append(this.l0);
                sb.append(" }");
                throw new IllegalArgumentException(sb.toString());
            }
            final q q = new q(this);
            final WeakHashMap a = O.V.a;
            O.J.u((View)viewGroup, (O.w)q);
            if (this.T == null) {
                this.d0 = (TextView)((View)viewGroup).findViewById(2131231070);
            }
            final Method a2 = t1.a;
            try {
                final Method method = ((View)viewGroup).getClass().getMethod("makeOptionalFitsSystemWindows", (Class<?>[])null);
                if (!((AccessibleObject)method).isAccessible()) {
                    ((AccessibleObject)method).setAccessible(true);
                    goto Label_0504;
                }
                goto Label_0504;
            }
            catch (final IllegalAccessException ex) {
                goto Label_0516;
            }
            catch (final InvocationTargetException ex2) {
                goto Label_0531;
            }
            catch (final NoSuchMethodException ex3) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            }
            final ContentFrameLayout contentFrameLayout = (ContentFrameLayout)((View)viewGroup).findViewById(2131230768);
            final ViewGroup viewGroup3 = (ViewGroup)this.N.findViewById(16908290);
            if (viewGroup3 != null) {
                while (viewGroup3.getChildCount() > 0) {
                    final View child = viewGroup3.getChildAt(0);
                    viewGroup3.removeViewAt(0);
                    ((ViewGroup)contentFrameLayout).addView(child);
                }
                ((View)viewGroup3).setId(-1);
                ((View)contentFrameLayout).setId(16908290);
                if (viewGroup3 instanceof FrameLayout) {
                    ((View)viewGroup3).setForeground((Drawable)null);
                }
            }
            this.N.setContentView((View)viewGroup);
            contentFrameLayout.setAttachListener((g0)new X.a((Object)this, 10));
            this.c0 = viewGroup;
            final Object l = this.L;
            CharSequence charSequence;
            if (l instanceof Activity) {
                charSequence = ((Activity)l).getTitle();
            }
            else {
                charSequence = this.S;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                final h0 t = this.T;
                if (t != null) {
                    t.setWindowTitle(charSequence);
                }
                else {
                    final a q2 = this.Q;
                    if (q2 != null) {
                        q2.s(charSequence);
                    }
                    else {
                        final TextView d0 = this.d0;
                        if (d0 != null) {
                            d0.setText(charSequence);
                        }
                    }
                }
            }
            final ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout)((View)this.c0).findViewById(16908290);
            final View decorView = this.N.getDecorView();
            contentFrameLayout2.I.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            final WeakHashMap a3 = O.V.a;
            if (((View)contentFrameLayout2).isLaidOut()) {
                ((View)contentFrameLayout2).requestLayout();
            }
            final TypedArray obtainStyledAttributes2 = m.obtainStyledAttributes(j);
            obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
            obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
            if (obtainStyledAttributes2.hasValue(122)) {
                obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
            }
            if (obtainStyledAttributes2.hasValue(123)) {
                obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
            }
            if (obtainStyledAttributes2.hasValue(120)) {
                obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
            }
            if (obtainStyledAttributes2.hasValue(121)) {
                obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
            }
            obtainStyledAttributes2.recycle();
            ((View)contentFrameLayout2).requestLayout();
            this.b0 = true;
            final x a4 = this.A(0);
            if (!this.s0 && a4.h == null) {
                this.C(108);
            }
        }
    }
    
    public final void y() {
        if (this.N == null) {
            final Object l = this.L;
            if (l instanceof Activity) {
                this.p(((Activity)l).getWindow());
            }
        }
        if (this.N != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }
    
    public final vd z(Context applicationContext) {
        if (this.y0 == null) {
            if (w2.e.H == null) {
                applicationContext = applicationContext.getApplicationContext();
                w2.e.H = new w2.e(applicationContext, (LocationManager)applicationContext.getSystemService("location"));
            }
            this.y0 = new v(this, w2.e.H);
        }
        return this.y0;
    }
}
