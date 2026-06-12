package m;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import O.q;
import android.os.Build$VERSION;
import J.a;
import android.view.View;
import n.s;
import n.n;
import android.view.InflateException;
import com.google.android.gms.internal.measurement.L;
import android.view.MenuItem$OnMenuItemClickListener;
import android.view.MenuItem;
import java.lang.reflect.Constructor;
import android.util.Log;
import n.o;
import android.view.Menu;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;

public final class i
{
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C;
    public PorterDuff$Mode D;
    public final j E;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public o z;
    
    public i(final j e, final Menu a) {
        this.E = e;
        this.C = null;
        this.D = null;
        this.a = a;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }
    
    public final Object a(final String name, final Class[] parameterTypes, final Object[] array) {
        try {
            final java.lang.reflect.Constructor<?> constructor = Class.forName(name, false, this.E.c.getClassLoader()).getConstructor((Class<?>[])parameterTypes);
            ((AccessibleObject)constructor).setAccessible(true);
            return constructor.newInstance(array);
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder("Cannot instantiate class: ");
            sb.append(name);
            Log.w("SupportMenuInflater", sb.toString(), (Throwable)ex);
            return null;
        }
    }
    
    public final void b(final MenuItem menuItem) {
        final MenuItem setEnabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        final int r = this.r;
        boolean b = false;
        setEnabled.setCheckable(r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        final int v = this.v;
        if (v >= 0) {
            menuItem.setShowAsAction(v);
        }
        final String y = this.y;
        final j e = this.E;
        Label_0269: {
            if (y != null) {
                if (!e.c.isRestricted()) {
                    if (e.d == null) {
                        e.d = m.j.a(e.c);
                    }
                    final Object d = e.d;
                    final String y2 = this.y;
                    final Object onMenuItemClickListener = new Object();
                    ((h)onMenuItemClickListener).a = d;
                    final Class<?> class1 = d.getClass();
                    try {
                        ((h)onMenuItemClickListener).b = class1.getMethod(y2, (Class<?>[])m.h.c);
                        menuItem.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)onMenuItemClickListener);
                        break Label_0269;
                    }
                    catch (final Exception ex) {
                        final StringBuilder l = L.l("Couldn't resolve menu item onClick handler ", y2, " in class ");
                        l.append(class1.getName());
                        final InflateException ex2 = new InflateException(l.toString());
                        ((Throwable)ex2).initCause((Throwable)ex);
                        throw ex2;
                    }
                }
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        Label_0409: {
            if (this.r >= 2) {
                if (menuItem instanceof n) {
                    final n n = (n)menuItem;
                    n.x = ((n.x & 0xFFFFFFFB) | 0x4);
                }
                else if (menuItem instanceof s) {
                    final s s = (s)menuItem;
                    Label_0397: {
                        a c;
                        try {
                            final Method d2 = s.d;
                            c = s.c;
                            if (d2 == null) {
                                s.d = c.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                            }
                        }
                        catch (final Exception ex3) {
                            break Label_0397;
                        }
                        s.d.invoke((Object)c, new Object[] { Boolean.TRUE });
                        break Label_0409;
                    }
                    final Exception ex3;
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", (Throwable)ex3);
                }
            }
        }
        final String x = this.x;
        if (x != null) {
            menuItem.setActionView((View)this.a(x, m.j.e, e.a));
            b = true;
        }
        final int w = this.w;
        if (w > 0) {
            if (!b) {
                menuItem.setActionView(w);
            }
            else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        final o z = this.z;
        if (z != null) {
            if (menuItem instanceof a) {
                ((a)menuItem).a(z);
            }
            else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        final CharSequence a = this.A;
        final boolean b2 = menuItem instanceof a;
        if (b2) {
            ((a)menuItem).setContentDescription(a);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            O.q.h(menuItem, a);
        }
        final CharSequence b3 = this.B;
        if (b2) {
            ((a)menuItem).setTooltipText(b3);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            O.q.m(menuItem, b3);
        }
        final char n2 = this.n;
        final int o = this.o;
        if (b2) {
            ((a)menuItem).setAlphabeticShortcut(n2, o);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            O.q.g(menuItem, n2, o);
        }
        final char p = this.p;
        final int q = this.q;
        if (b2) {
            ((a)menuItem).setNumericShortcut(p, q);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            O.q.k(menuItem, p, q);
        }
        final PorterDuff$Mode d3 = this.D;
        if (d3 != null) {
            if (b2) {
                ((a)menuItem).setIconTintMode(d3);
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                O.q.j(menuItem, d3);
            }
        }
        final ColorStateList c2 = this.C;
        if (c2 != null) {
            if (b2) {
                ((a)menuItem).setIconTintList(c2);
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                O.q.i(menuItem, c2);
            }
        }
    }
}
