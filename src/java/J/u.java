package j;

import Y0.h;
import m.g;
import m.b;
import android.content.Context;
import t.j;
import java.util.ArrayList;
import android.view.ActionMode$Callback;
import android.view.WindowManager$LayoutParams;
import m.m;
import android.view.SearchEvent;
import m.o;
import android.view.MenuItem;
import android.view.View;
import n.l;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.KeyboardShortcutGroup;
import m.n;
import java.util.List;
import android.view.Menu;
import V4.G;
import android.view.Window$Callback;

public final class u implements Window$Callback
{
    public final Window$Callback C;
    public G D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final y H;
    
    public u(final y h, final Window$Callback c) {
        this.H = h;
        if (c != null) {
            this.C = c;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }
    
    public final void a(final Window$Callback window$Callback) {
        try {
            this.E = true;
            window$Callback.onContentChanged();
        }
        finally {
            this.E = false;
        }
    }
    
    public final boolean b(final int n, final Menu menu) {
        return this.C.onMenuOpened(n, menu);
    }
    
    public final void c(final int n, final Menu menu) {
        this.C.onPanelClosed(n, menu);
    }
    
    public final void d(final List list, final Menu menu, final int n) {
        n.a(this.C, (List<KeyboardShortcutGroup>)list, menu, n);
    }
    
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        return this.C.dispatchGenericMotionEvent(motionEvent);
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final boolean f = this.F;
        final Window$Callback c = this.C;
        if (f) {
            return c.dispatchKeyEvent(keyEvent);
        }
        return this.H.v(keyEvent) || c.dispatchKeyEvent(keyEvent);
    }
    
    public final boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        final boolean dispatchKeyShortcutEvent = this.C.dispatchKeyShortcutEvent(keyEvent);
        boolean b2;
        final boolean b = b2 = true;
        if (!dispatchKeyShortcutEvent) {
            final int keyCode = keyEvent.getKeyCode();
            final y h = this.H;
            h.B();
            final a q = h.Q;
            if (q != null && q.k(keyCode, keyEvent)) {
                b2 = b;
            }
            else {
                final x o0 = h.o0;
                if (o0 != null && h.G(o0, keyEvent.getKeyCode(), keyEvent)) {
                    final x o2 = h.o0;
                    b2 = b;
                    if (o2 != null) {
                        o2.l = true;
                        b2 = b;
                    }
                }
                else {
                    if (h.o0 == null) {
                        final x a = h.A(0);
                        h.H(a, keyEvent);
                        final boolean g = h.G(a, keyEvent.getKeyCode(), keyEvent);
                        a.k = false;
                        if (g) {
                            b2 = b;
                            return b2;
                        }
                    }
                    b2 = false;
                }
            }
        }
        return b2;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return this.C.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return this.C.dispatchTouchEvent(motionEvent);
    }
    
    public final boolean dispatchTrackballEvent(final MotionEvent motionEvent) {
        return this.C.dispatchTrackballEvent(motionEvent);
    }
    
    public final void onActionModeFinished(final ActionMode actionMode) {
        this.C.onActionModeFinished(actionMode);
    }
    
    public final void onActionModeStarted(final ActionMode actionMode) {
        this.C.onActionModeStarted(actionMode);
    }
    
    public final void onAttachedToWindow() {
        this.C.onAttachedToWindow();
    }
    
    public final void onContentChanged() {
        if (this.E) {
            this.C.onContentChanged();
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        return (n != 0 || menu instanceof l) && this.C.onCreatePanelMenu(n, menu);
    }
    
    public final View onCreatePanelView(final int n) {
        final G d = this.D;
        if (d != null) {
            View view;
            if (n == 0) {
                view = new View(((View)((j.G)d.D).a.a).getContext());
            }
            else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return this.C.onCreatePanelView(n);
    }
    
    public final void onDetachedFromWindow() {
        this.C.onDetachedFromWindow();
    }
    
    public final boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return this.C.onMenuItemSelected(n, menuItem);
    }
    
    public final boolean onMenuOpened(final int n, final Menu menu) {
        this.b(n, menu);
        final y h = this.H;
        if (n == 108) {
            h.B();
            final a q = h.Q;
            if (q != null) {
                q.c(true);
            }
        }
        else {
            h.getClass();
        }
        return true;
    }
    
    public final void onPanelClosed(final int n, final Menu menu) {
        if (this.G) {
            this.C.onPanelClosed(n, menu);
            return;
        }
        this.c(n, menu);
        final y h = this.H;
        if (n == 108) {
            h.B();
            final a q = h.Q;
            if (q != null) {
                q.c(false);
            }
        }
        else if (n == 0) {
            final x a = h.A(n);
            if (a.m) {
                h.t(a, false);
            }
        }
        else {
            h.getClass();
        }
    }
    
    public final void onPointerCaptureChanged(final boolean b) {
        o.a(this.C, b);
    }
    
    public final boolean onPreparePanel(final int n, final View view, final Menu menu) {
        l l;
        if (menu instanceof l) {
            l = (l)menu;
        }
        else {
            l = null;
        }
        if (n == 0 && l == null) {
            return false;
        }
        if (l != null) {
            l.y = true;
        }
        final G d = this.D;
        if (d != null && n == 0) {
            final j.G g = (j.G)d.D;
            if (!g.d) {
                g.a.l = true;
                g.d = true;
            }
        }
        final boolean onPreparePanel = this.C.onPreparePanel(n, view, menu);
        if (l != null) {
            l.y = false;
        }
        return onPreparePanel;
    }
    
    public final void onProvideKeyboardShortcuts(final List list, final Menu menu, final int n) {
        final l h = this.H.A(0).h;
        if (h != null) {
            this.d(list, (Menu)h, n);
        }
        else {
            this.d(list, menu, n);
        }
    }
    
    public final boolean onSearchRequested() {
        return this.C.onSearchRequested();
    }
    
    public final boolean onSearchRequested(final SearchEvent searchEvent) {
        return m.a(this.C, searchEvent);
    }
    
    public final void onWindowAttributesChanged(final WindowManager$LayoutParams windowManager$LayoutParams) {
        this.C.onWindowAttributesChanged(windowManager$LayoutParams);
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        this.C.onWindowFocusChanged(b);
    }
    
    public final ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
        return null;
    }
    
    public final ActionMode onWindowStartingActionMode(final ActionMode$Callback c, final int n) {
        final y h = this.H;
        h.getClass();
        if (n != 0) {
            return m.b(this.C, c, n);
        }
        final Context m = h.M;
        final Object o = new Object();
        ((h)o).D = m;
        ((h)o).C = c;
        ((h)o).E = new ArrayList();
        ((h)o).F = new j();
        final b n2 = h.n((m.a)o);
        g j;
        if (n2 != null) {
            j = ((h)o).j(n2);
        }
        else {
            j = null;
        }
        return j;
    }
}
