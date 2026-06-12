package n;

import java.util.ArrayList;
import android.view.KeyEvent;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.ActionProvider$VisibilityListener;
import android.view.View;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem$OnMenuItemClickListener;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.view.MenuItem$OnActionExpandListener;
import J.a;

public final class n implements a
{
    public o A;
    public MenuItem$OnActionExpandListener B;
    public boolean C;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public int i;
    public char j;
    public int k;
    public Drawable l;
    public int m;
    public final l n;
    public E o;
    public MenuItem$OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public ColorStateList s;
    public PorterDuff$Mode t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public View z;
    
    public n(final l n, final int b, final int a, final int c, final int d, final CharSequence e, final int y) {
        this.i = 4096;
        this.k = 4096;
        this.m = 0;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = 16;
        this.C = false;
        this.n = n;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.y = y;
    }
    
    public static void c(final int n, final int n2, final String s, final StringBuilder sb) {
        if ((n & n2) == n2) {
            sb.append(s);
        }
    }
    
    public final a a(o a) {
        this.z = null;
        this.A = a;
        this.n.p(true);
        a = this.A;
        if (a != null) {
            a.c = new X.a((Object)this, 14);
            a.a.setVisibilityListener((ActionProvider$VisibilityListener)a);
        }
        return (a)this;
    }
    
    public final o b() {
        return this.A;
    }
    
    public final boolean collapseActionView() {
        if ((this.y & 0x8) == 0x0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        final MenuItem$OnActionExpandListener b = this.B;
        return (b == null || b.onMenuItemActionCollapse((MenuItem)this)) && this.n.d(this);
    }
    
    public final Drawable d(final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (this.w) {
                if (!this.u) {
                    mutate = drawable;
                    if (!this.v) {
                        return mutate;
                    }
                }
                mutate = drawable.mutate();
                if (this.u) {
                    I.a.h(mutate, this.s);
                }
                if (this.v) {
                    I.a.i(mutate, this.t);
                }
                this.w = false;
            }
        }
        return mutate;
    }
    
    public final boolean e() {
        final int y = this.y;
        boolean b = false;
        if ((y & 0x8) != 0x0) {
            if (this.z == null) {
                final o a = this.A;
                if (a != null) {
                    this.z = a.a(this);
                }
            }
            b = b;
            if (this.z != null) {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean expandActionView() {
        if (!this.e()) {
            return false;
        }
        final MenuItem$OnActionExpandListener b = this.B;
        return (b == null || b.onMenuItemActionExpand((MenuItem)this)) && this.n.f(this);
    }
    
    public final boolean f() {
        return (this.x & 0x20) == 0x20;
    }
    
    public final void g(final boolean b) {
        if (b) {
            this.x |= 0x20;
        }
        else {
            this.x &= 0xFFFFFFDF;
        }
    }
    
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }
    
    public final View getActionView() {
        final View z = this.z;
        if (z != null) {
            return z;
        }
        final o a = this.A;
        if (a != null) {
            return this.z = a.a(this);
        }
        return null;
    }
    
    public final int getAlphabeticModifiers() {
        return this.k;
    }
    
    public final char getAlphabeticShortcut() {
        return this.j;
    }
    
    public final CharSequence getContentDescription() {
        return this.q;
    }
    
    public final int getGroupId() {
        return this.b;
    }
    
    public final Drawable getIcon() {
        final Drawable l = this.l;
        if (l != null) {
            return this.d(l);
        }
        final int m = this.m;
        if (m != 0) {
            final Drawable f = s2.a.f(this.n.a, m);
            this.m = 0;
            this.l = f;
            return this.d(f);
        }
        return null;
    }
    
    public final ColorStateList getIconTintList() {
        return this.s;
    }
    
    public final PorterDuff$Mode getIconTintMode() {
        return this.t;
    }
    
    public final Intent getIntent() {
        return this.g;
    }
    
    public final int getItemId() {
        return this.a;
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    public final int getNumericModifiers() {
        return this.i;
    }
    
    public final char getNumericShortcut() {
        return this.h;
    }
    
    public final int getOrder() {
        return this.c;
    }
    
    public final SubMenu getSubMenu() {
        return (SubMenu)this.o;
    }
    
    public final CharSequence getTitle() {
        return this.e;
    }
    
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            charSequence = this.e;
        }
        return charSequence;
    }
    
    public final CharSequence getTooltipText() {
        return this.r;
    }
    
    public final boolean hasSubMenu() {
        return this.o != null;
    }
    
    public final boolean isActionViewExpanded() {
        return this.C;
    }
    
    public final boolean isCheckable() {
        final int x = this.x;
        boolean b = true;
        if ((x & 0x1) != 0x1) {
            b = false;
        }
        return b;
    }
    
    public final boolean isChecked() {
        return (this.x & 0x2) == 0x2;
    }
    
    public final boolean isEnabled() {
        return (this.x & 0x10) != 0x0;
    }
    
    public final boolean isVisible() {
        final o a = this.A;
        boolean b = false;
        final boolean b2 = false;
        if (a != null && a.a.overridesItemVisibility()) {
            boolean b3 = b2;
            if ((this.x & 0x8) == 0x0) {
                b3 = b2;
                if (this.A.a.isVisible()) {
                    b3 = true;
                }
            }
            return b3;
        }
        if ((this.x & 0x8) == 0x0) {
            b = true;
        }
        return b;
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }
    
    public final MenuItem setActionView(int a) {
        final Context a2 = this.n.a;
        final View inflate = LayoutInflater.from(a2).inflate(a, (ViewGroup)new LinearLayout(a2), false);
        this.z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1) {
            a = this.a;
            if (a > 0) {
                inflate.setId(a);
            }
        }
        final l n = this.n;
        n.p(n.k = true);
        return (MenuItem)this;
    }
    
    public final MenuItem setActionView(final View z) {
        this.z = z;
        this.A = null;
        if (z != null && z.getId() == -1) {
            final int a = this.a;
            if (a > 0) {
                z.setId(a);
            }
        }
        final l n = this.n;
        n.p(n.k = true);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char c) {
        if (this.j == c) {
            return (MenuItem)this;
        }
        this.j = Character.toLowerCase(c);
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        if (this.j == c && this.k == n) {
            return (MenuItem)this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(n);
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean b) {
        final int x = this.x;
        final int x2 = (b ? 1 : 0) | (x & 0xFFFFFFFE);
        this.x = x2;
        if (x != x2) {
            this.n.p(false);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean b) {
        final int x = this.x;
        int n = 2;
        if ((x & 0x4) != 0x0) {
            final l n2 = this.n;
            n2.getClass();
            final ArrayList f = n2.f;
            final int size = f.size();
            n2.w();
            for (int i = 0; i < size; ++i) {
                final n n3 = (n)f.get(i);
                if (n3.b == this.b && (n3.x & 0x4) != 0x0) {
                    if (n3.isCheckable()) {
                        final boolean b2 = n3 == this;
                        final int x2 = n3.x;
                        int n4;
                        if (b2) {
                            n4 = 2;
                        }
                        else {
                            n4 = 0;
                        }
                        final int x3 = n4 | (x2 & 0xFFFFFFFD);
                        n3.x = x3;
                        if (x2 != x3) {
                            n3.n.p(false);
                        }
                    }
                }
            }
            n2.v();
        }
        else {
            if (!b) {
                n = 0;
            }
            final int x4 = (x & 0xFFFFFFFD) | n;
            this.x = x4;
            if (x != x4) {
                this.n.p(false);
            }
        }
        return (MenuItem)this;
    }
    
    public final a setContentDescription(final CharSequence q) {
        this.q = q;
        this.n.p(false);
        return (a)this;
    }
    
    public final MenuItem setEnabled(final boolean b) {
        if (b) {
            this.x |= 0x10;
        }
        else {
            this.x &= 0xFFFFFFEF;
        }
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int m) {
        this.l = null;
        this.m = m;
        this.w = true;
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable l) {
        this.m = 0;
        this.l = l;
        this.w = true;
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintList(final ColorStateList s) {
        this.s = s;
        this.u = true;
        this.w = true;
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintMode(final PorterDuff$Mode t) {
        this.t = t;
        this.v = true;
        this.w = true;
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent g) {
        this.g = g;
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char h) {
        if (this.h == h) {
            return (MenuItem)this;
        }
        this.h = h;
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char h, final int n) {
        if (this.h == h && this.i == n) {
            return (MenuItem)this;
        }
        this.h = h;
        this.i = KeyEvent.normalizeMetaState(n);
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener b) {
        this.B = b;
        return (MenuItem)this;
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener p) {
        this.p = p;
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char h, final char c) {
        this.h = h;
        this.j = Character.toLowerCase(c);
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char h, final char c, final int n, final int n2) {
        this.h = h;
        this.i = KeyEvent.normalizeMetaState(n);
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(n2);
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final void setShowAsAction(final int y) {
        final int n = y & 0x3;
        if (n != 0 && n != 1 && n != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = y;
        final l n2 = this.n;
        n2.p(n2.k = true);
    }
    
    public final MenuItem setShowAsActionFlags(final int showAsAction) {
        this.setShowAsAction(showAsAction);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final int n) {
        this.setTitle((CharSequence)this.n.a.getString(n));
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence charSequence) {
        this.e = charSequence;
        this.n.p(false);
        final E o = this.o;
        if (o != null) {
            o.setHeaderTitle(charSequence);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence f) {
        this.f = f;
        this.n.p(false);
        return (MenuItem)this;
    }
    
    public final a setTooltipText(final CharSequence r) {
        this.r = r;
        this.n.p(false);
        return (a)this;
    }
    
    public final MenuItem setVisible(final boolean b) {
        final int x = this.x;
        int n;
        if (b) {
            n = 0;
        }
        else {
            n = 8;
        }
        final int x2 = n | (x & 0xFFFFFFF7);
        this.x = x2;
        if (x != x2) {
            final l n2 = this.n;
            n2.p(n2.h = true);
        }
        return (MenuItem)this;
    }
    
    @Override
    public final String toString() {
        final CharSequence e = this.e;
        String string;
        if (e != null) {
            string = e.toString();
        }
        else {
            string = null;
        }
        return string;
    }
}
