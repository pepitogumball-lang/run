package n;

import android.os.BaseBundle;
import java.lang.ref.Reference;
import E.a;
import android.util.SparseArray;
import android.os.Bundle;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.ActivityNotFoundException;
import android.util.Log;
import java.util.Collection;
import android.view.KeyCharacterMap$KeyData;
import android.view.KeyEvent;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.view.SubMenu;
import android.content.pm.ActivityInfo;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import android.view.MenuItem;
import java.lang.reflect.Method;
import O.X;
import android.os.Build$VERSION;
import O.Z;
import android.view.ViewConfiguration;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.content.res.Resources;
import android.content.Context;
import android.view.Menu;

public class l implements Menu
{
    public static final int[] z;
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public j e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public int l;
    public CharSequence m;
    public Drawable n;
    public View o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final ArrayList u;
    public final CopyOnWriteArrayList v;
    public n w;
    public boolean x;
    public boolean y;
    
    static {
        z = new int[] { 1, 4, 5, 3, 2, 0 };
    }
    
    public l(final Context a) {
        final boolean b = false;
        this.l = 0;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = new ArrayList();
        this.v = new CopyOnWriteArrayList();
        this.x = false;
        this.a = a;
        final Resources resources = a.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        boolean d = b;
        if (resources.getConfiguration().keyboard != 1) {
            final ViewConfiguration value = ViewConfiguration.get(a);
            final Method a2 = Z.a;
            boolean b2;
            if (Build$VERSION.SDK_INT >= 28) {
                b2 = X.b(value);
            }
            else {
                final Resources resources2 = a.getResources();
                final int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                b2 = (identifier != 0 && resources2.getBoolean(identifier));
            }
            d = b;
            if (b2) {
                d = true;
            }
        }
        this.d = d;
    }
    
    public final n a(int i, final int n, final int n2, final CharSequence charSequence) {
        final int n3 = (0xFFFF0000 & n2) >> 16;
        if (n3 >= 0 && n3 < 6) {
            final int n4 = n.l.z[n3] << 16 | (0xFFFF & n2);
            final n n5 = new n(this, i, n, n2, n4, charSequence, this.l);
            final ArrayList f = this.f;
            while (true) {
                for (i = f.size() - 1; i >= 0; --i) {
                    if (((n)f.get(i)).d <= n4) {
                        ++i;
                        f.add(i, (Object)n5);
                        this.p(true);
                        return n5;
                    }
                }
                i = 0;
                continue;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }
    
    public final MenuItem add(final int n) {
        return (MenuItem)this.a(0, 0, 0, (CharSequence)this.b.getString(n));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return (MenuItem)this.a(n, n2, n3, (CharSequence)this.b.getString(n4));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return (MenuItem)this.a(n, n2, n3, charSequence);
    }
    
    public final MenuItem add(final CharSequence charSequence) {
        return (MenuItem)this.a(0, 0, 0, charSequence);
    }
    
    public final int addIntentOptions(final int n, final int n2, final int n3, final ComponentName componentName, final Intent[] array, final Intent intent, int n4, final MenuItem[] array2) {
        final PackageManager packageManager = this.a.getPackageManager();
        final int n5 = 0;
        final List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, array, intent, 0);
        int size;
        if (queryIntentActivityOptions != null) {
            size = queryIntentActivityOptions.size();
        }
        else {
            size = 0;
        }
        int i = n5;
        if ((n4 & 0x1) == 0x0) {
            this.removeGroup(n);
            i = n5;
        }
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo)queryIntentActivityOptions.get(i);
            n4 = resolveInfo.specificIndex;
            Intent intent2;
            if (n4 < 0) {
                intent2 = intent;
            }
            else {
                intent2 = array[n4];
            }
            final Intent g = new Intent(intent2);
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            g.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            final n a = this.a(n, n2, n3, resolveInfo.loadLabel(packageManager));
            a.setIcon(resolveInfo.loadIcon(packageManager));
            a.g = g;
            if (array2 != null) {
                n4 = resolveInfo.specificIndex;
                if (n4 >= 0) {
                    array2[n4] = (MenuItem)a;
                }
            }
            ++i;
        }
        return size;
    }
    
    public final SubMenu addSubMenu(final int n) {
        return this.addSubMenu(0, 0, 0, (CharSequence)this.b.getString(n));
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.addSubMenu(n, n2, n3, (CharSequence)this.b.getString(n4));
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final n a = this.a(n, n2, n3, charSequence);
        final E o = new E(this.a, this, a);
        (a.o = o).setHeaderTitle(a.e);
        return (SubMenu)o;
    }
    
    public final SubMenu addSubMenu(final CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }
    
    public final void b(final y y, final Context context) {
        this.v.add((Object)new WeakReference((Object)y));
        y.g(context, this);
        this.k = true;
    }
    
    public final void c(final boolean b) {
        if (this.t) {
            return;
        }
        this.t = true;
        final CopyOnWriteArrayList v = this.v;
        for (final WeakReference weakReference : v) {
            final y y = (y)((Reference)weakReference).get();
            if (y == null) {
                v.remove((Object)weakReference);
            }
            else {
                y.a(this, b);
            }
        }
        this.t = false;
    }
    
    public final void clear() {
        final n w = this.w;
        if (w != null) {
            this.d(w);
        }
        this.f.clear();
        this.p(true);
    }
    
    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        this.p(false);
    }
    
    public final void close() {
        this.c(true);
    }
    
    public boolean d(final n n) {
        final CopyOnWriteArrayList v = this.v;
        final boolean empty = v.isEmpty();
        final boolean b = false;
        final int n2 = 0;
        boolean b2 = b;
        if (!empty) {
            if (this.w != n) {
                b2 = b;
            }
            else {
                this.w();
                final Iterator iterator = v.iterator();
                boolean k = n2 != 0;
                boolean b3;
                while (true) {
                    b3 = k;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final WeakReference weakReference = (WeakReference)iterator.next();
                    final y y = (y)((Reference)weakReference).get();
                    if (y == null) {
                        v.remove((Object)weakReference);
                    }
                    else {
                        b3 = (k = y.k(n));
                        if (b3) {
                            break;
                        }
                        continue;
                    }
                }
                this.v();
                b2 = b3;
                if (b3) {
                    this.w = null;
                    b2 = b3;
                }
            }
        }
        return b2;
    }
    
    public boolean e(final l l, final MenuItem menuItem) {
        final j e = this.e;
        return e != null && e.c(l, menuItem);
    }
    
    public boolean f(final n w) {
        final CopyOnWriteArrayList v = this.v;
        final boolean empty = v.isEmpty();
        boolean f = false;
        if (empty) {
            return false;
        }
        this.w();
        final Iterator iterator = v.iterator();
        boolean b;
        while (true) {
            b = f;
            if (!iterator.hasNext()) {
                break;
            }
            final WeakReference weakReference = (WeakReference)iterator.next();
            final y y = (y)((Reference)weakReference).get();
            if (y == null) {
                v.remove((Object)weakReference);
            }
            else {
                b = (f = y.f(w));
                if (b) {
                    break;
                }
                continue;
            }
        }
        this.v();
        if (b) {
            this.w = w;
        }
        return b;
    }
    
    public final MenuItem findItem(final int n) {
        final ArrayList f = this.f;
        for (int size = f.size(), i = 0; i < size; ++i) {
            final n n2 = (n)f.get(i);
            if (n2.a == n) {
                return (MenuItem)n2;
            }
            if (n2.hasSubMenu()) {
                final MenuItem item = n2.o.findItem(n);
                if (item != null) {
                    return item;
                }
            }
        }
        return null;
    }
    
    public final n g(final int n, final KeyEvent keyEvent) {
        final ArrayList u = this.u;
        u.clear();
        this.h(u, n, keyEvent);
        if (u.isEmpty()) {
            return null;
        }
        final int metaState = keyEvent.getMetaState();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        keyEvent.getKeyData(keyCharacterMap$KeyData);
        final int size = u.size();
        if (size == 1) {
            return (n)u.get(0);
        }
        final boolean n2 = this.n();
        for (int i = 0; i < size; ++i) {
            final n n3 = (n)u.get(i);
            char c;
            if (n2) {
                c = n3.j;
            }
            else {
                c = n3.h;
            }
            final char[] meta = keyCharacterMap$KeyData.meta;
            if ((c == meta[0] && (metaState & 0x2) == 0x0) || (c == meta[2] && (metaState & 0x2) != 0x0) || (n2 && c == '\b' && n == 67)) {
                return n3;
            }
        }
        return null;
    }
    
    public final MenuItem getItem(final int n) {
        return (MenuItem)this.f.get(n);
    }
    
    public final void h(final ArrayList list, final int n, final KeyEvent keyEvent) {
        final boolean n2 = this.n();
        final int modifiers = keyEvent.getModifiers();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        if (!keyEvent.getKeyData(keyCharacterMap$KeyData) && n != 67) {
            return;
        }
        final ArrayList f = this.f;
        for (int size = f.size(), i = 0; i < size; ++i) {
            final n n3 = (n)f.get(i);
            if (n3.hasSubMenu()) {
                n3.o.h(list, n, keyEvent);
            }
            char c;
            if (n2) {
                c = n3.j;
            }
            else {
                c = n3.h;
            }
            int n4;
            if (n2) {
                n4 = n3.k;
            }
            else {
                n4 = n3.i;
            }
            if ((modifiers & 0x1100F) == (n4 & 0x1100F) && c != '\0') {
                final char[] meta = keyCharacterMap$KeyData.meta;
                if (c != meta[0] && c != meta[2]) {
                    if (!n2 || c != '\b') {
                        continue;
                    }
                    if (n != 67) {
                        continue;
                    }
                }
                if (n3.isEnabled()) {
                    list.add((Object)n3);
                }
            }
        }
    }
    
    public final boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        final ArrayList f = this.f;
        for (int size = f.size(), i = 0; i < size; ++i) {
            if (((n)f.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }
    
    public final void i() {
        final ArrayList l = this.l();
        if (!this.k) {
            return;
        }
        final CopyOnWriteArrayList v = this.v;
        final Iterator iterator = v.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final WeakReference weakReference = (WeakReference)iterator.next();
            final y y = (y)((Reference)weakReference).get();
            if (y == null) {
                v.remove((Object)weakReference);
            }
            else {
                b |= y.i();
            }
        }
        final ArrayList i = this.i;
        final ArrayList j = this.j;
        if (b) {
            i.clear();
            j.clear();
            for (int size = l.size(), k = 0; k < size; ++k) {
                final n n = (n)l.get(k);
                if (n.f()) {
                    i.add((Object)n);
                }
                else {
                    j.add((Object)n);
                }
            }
        }
        else {
            i.clear();
            j.clear();
            j.addAll((Collection)this.l());
        }
        this.k = false;
    }
    
    public final boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.g(n, keyEvent) != null;
    }
    
    public String j() {
        return "android:menu:actionviewstates";
    }
    
    public l k() {
        return this;
    }
    
    public final ArrayList l() {
        final boolean h = this.h;
        final ArrayList g = this.g;
        if (!h) {
            return g;
        }
        g.clear();
        final ArrayList f = this.f;
        for (int size = f.size(), i = 0; i < size; ++i) {
            final n n = (n)f.get(i);
            if (n.isVisible()) {
                g.add((Object)n);
            }
        }
        this.h = false;
        this.k = true;
        return g;
    }
    
    public boolean m() {
        return this.x;
    }
    
    public boolean n() {
        return this.c;
    }
    
    public boolean o() {
        return this.d;
    }
    
    public final void p(final boolean b) {
        if (!this.p) {
            if (b) {
                this.h = true;
                this.k = true;
            }
            final CopyOnWriteArrayList v = this.v;
            if (!v.isEmpty()) {
                this.w();
                for (final WeakReference weakReference : v) {
                    final y y = (y)((Reference)weakReference).get();
                    if (y == null) {
                        v.remove((Object)weakReference);
                    }
                    else {
                        y.d();
                    }
                }
                this.v();
            }
        }
        else {
            this.q = true;
            if (b) {
                this.r = true;
            }
        }
    }
    
    public final boolean performIdentifierAction(final int n, final int n2) {
        return this.q(this.findItem(n), null, n2);
    }
    
    public final boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        final n g = this.g(n, keyEvent);
        final boolean b = g != null && this.q((MenuItem)g, null, n2);
        if ((n2 & 0x2) != 0x0) {
            this.c(true);
        }
        return b;
    }
    
    public final boolean q(MenuItem menuItem, final y y, final int n) {
        menuItem = menuItem;
        int n2 = 0;
        int n3 = 0;
        if (menuItem != null && ((n)menuItem).isEnabled()) {
            final MenuItem$OnMenuItemClickListener p3 = ((n)menuItem).p;
            int n5 = 0;
            Label_0139: {
                Label_0047: {
                    if (p3 == null || !p3.onMenuItemClick(menuItem)) {
                        final l n4 = ((n)menuItem).n;
                        if (!n4.e(n4, menuItem)) {
                            final Intent g = ((n)menuItem).g;
                            if (g != null) {
                                try {
                                    n4.a.startActivity(g);
                                    break Label_0047;
                                }
                                catch (final ActivityNotFoundException ex) {
                                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", (Throwable)ex);
                                }
                            }
                            final o a = ((n)menuItem).A;
                            if (a == null || !a.a.onPerformDefaultAction()) {
                                n5 = 0;
                                break Label_0139;
                            }
                        }
                    }
                }
                n5 = 1;
            }
            final o a2 = ((n)menuItem).A;
            final boolean b = a2 != null && a2.a.hasSubMenu();
            int n6;
            if (((n)menuItem).e()) {
                final boolean b2 = (n6 = (n5 | (((n)menuItem).expandActionView() ? 1 : 0))) != 0;
                if (b2) {
                    this.c(true);
                    n6 = (b2 ? 1 : 0);
                }
            }
            else if (!((n)menuItem).hasSubMenu() && !b) {
                n6 = n5;
                if ((n & 0x1) == 0x0) {
                    this.c(true);
                    n6 = n5;
                }
            }
            else {
                if ((n & 0x4) == 0x0) {
                    this.c(false);
                }
                if (!((n)menuItem).hasSubMenu()) {
                    (((n)menuItem).o = new E(this.a, this, (n)menuItem)).setHeaderTitle(((n)menuItem).e);
                }
                final E o = ((n)menuItem).o;
                if (b) {
                    a2.b.getClass();
                    a2.a.onPrepareSubMenu((SubMenu)o);
                }
                final CopyOnWriteArrayList v = this.v;
                if (!v.isEmpty()) {
                    if (y != null) {
                        n3 = (y.h(o) ? 1 : 0);
                    }
                    final Iterator iterator = v.iterator();
                    while (true) {
                        n2 = n3;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final WeakReference weakReference = (WeakReference)iterator.next();
                        final y y2 = (y)((Reference)weakReference).get();
                        if (y2 == null) {
                            v.remove((Object)weakReference);
                        }
                        else {
                            if (n3 != 0) {
                                continue;
                            }
                            n3 = (y2.h(o) ? 1 : 0);
                        }
                    }
                }
                final int n7 = n6 = (n5 | n2);
                if (n7 == 0) {
                    this.c(true);
                    n6 = n7;
                }
            }
            return n6 != 0;
        }
        return false;
    }
    
    public final void r(final y y) {
        final CopyOnWriteArrayList v = this.v;
        for (final WeakReference weakReference : v) {
            final y y2 = (y)((Reference)weakReference).get();
            if (y2 == null || y2 == y) {
                v.remove((Object)weakReference);
            }
        }
    }
    
    public final void removeGroup(final int n) {
        final ArrayList f = this.f;
        final int size = f.size();
        int n2 = 0;
        while (true) {
            for (int i = 0; i < size; ++i) {
                if (((n)f.get(i)).b == n) {
                    if (i >= 0) {
                        while (n2 < f.size() - i && ((n)f.get(i)).b == n) {
                            if (i >= 0) {
                                final ArrayList f2 = this.f;
                                if (i < f2.size()) {
                                    f2.remove(i);
                                }
                            }
                            ++n2;
                        }
                        this.p(true);
                    }
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public final void removeItem(final int n) {
        final ArrayList f = this.f;
        while (true) {
            for (int size = f.size(), i = 0; i < size; ++i) {
                if (((n)f.get(i)).a == n) {
                    if (i >= 0) {
                        final ArrayList f2 = this.f;
                        if (i < f2.size()) {
                            f2.remove(i);
                            this.p(true);
                        }
                    }
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public final void s(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(this.j());
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((E)item.getSubMenu()).s(bundle);
            }
        }
        final int int1 = ((BaseBundle)bundle).getInt("android:menu:expandedactionview");
        if (int1 > 0) {
            final MenuItem item2 = this.findItem(int1);
            if (item2 != null) {
                item2.expandActionView();
            }
        }
    }
    
    public final void setGroupCheckable(final int n, final boolean checkable, final boolean b) {
        final ArrayList f = this.f;
        for (int size = f.size(), i = 0; i < size; ++i) {
            final n n2 = (n)f.get(i);
            if (n2.b == n) {
                final int x = n2.x;
                int n3;
                if (b) {
                    n3 = 4;
                }
                else {
                    n3 = 0;
                }
                n2.x = ((x & 0xFFFFFFFB) | n3);
                n2.setCheckable(checkable);
            }
        }
    }
    
    public void setGroupDividerEnabled(final boolean x) {
        this.x = x;
    }
    
    public final void setGroupEnabled(final int n, final boolean enabled) {
        final ArrayList f = this.f;
        for (int size = f.size(), i = 0; i < size; ++i) {
            final n n2 = (n)f.get(i);
            if (n2.b == n) {
                n2.setEnabled(enabled);
            }
        }
    }
    
    public final void setGroupVisible(final int n, final boolean b) {
        final ArrayList f = this.f;
        final int size = f.size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            final n n3 = (n)f.get(i);
            int n4 = n2;
            if (n3.b == n) {
                final int x = n3.x;
                int n5;
                if (b) {
                    n5 = 0;
                }
                else {
                    n5 = 8;
                }
                final int x2 = (x & 0xFFFFFFF7) | n5;
                n3.x = x2;
                n4 = n2;
                if (x != x2) {
                    n4 = 1;
                }
            }
            ++i;
            n2 = n4;
        }
        if (n2 != 0) {
            this.p(true);
        }
    }
    
    public void setQwertyMode(final boolean c) {
        this.c = c;
        this.p(false);
    }
    
    public final int size() {
        return this.f.size();
    }
    
    public final void t(final Bundle bundle) {
        final int size = this.f.size();
        SparseArray sparseArray = null;
        SparseArray sparseArray2;
        for (int i = 0; i < size; ++i, sparseArray = sparseArray2) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            sparseArray2 = sparseArray;
            if (actionView != null) {
                sparseArray2 = sparseArray;
                if (actionView.getId() != -1) {
                    SparseArray sparseArray3;
                    if ((sparseArray3 = sparseArray) == null) {
                        sparseArray3 = new SparseArray();
                    }
                    actionView.saveHierarchyState(sparseArray3);
                    sparseArray2 = sparseArray3;
                    if (item.isActionViewExpanded()) {
                        ((BaseBundle)bundle).putInt("android:menu:expandedactionview", item.getItemId());
                        sparseArray2 = sparseArray3;
                    }
                }
            }
            if (item.hasSubMenu()) {
                ((E)item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(this.j(), sparseArray);
        }
    }
    
    public final void u(final int n, final CharSequence m, final int n2, final Drawable n3, final View o) {
        if (o != null) {
            this.o = o;
            this.m = null;
            this.n = null;
        }
        else {
            if (n > 0) {
                this.m = this.b.getText(n);
            }
            else if (m != null) {
                this.m = m;
            }
            if (n2 > 0) {
                this.n = E.a.b(this.a, n2);
            }
            else if (n3 != null) {
                this.n = n3;
            }
            this.o = null;
        }
        this.p(false);
    }
    
    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            this.p(this.r);
        }
    }
    
    public final void w() {
        if (!this.p) {
            this.p = true;
            this.q = false;
            this.r = false;
        }
    }
}
