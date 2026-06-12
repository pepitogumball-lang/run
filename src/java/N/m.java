package n;

import android.app.Dialog;
import android.view.KeyEvent$DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.content.DialogInterface;
import j.g;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnKeyListener;

public final class m implements DialogInterface$OnKeyListener, DialogInterface$OnClickListener, DialogInterface$OnDismissListener, x
{
    public E C;
    public g D;
    public h E;
    
    public final void a(final l l, final boolean b) {
        if (b || l == this.C) {
            final g d = this.D;
            if (d != null) {
                d.dismiss();
            }
        }
    }
    
    public final boolean h(final l l) {
        return false;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        final h e = this.E;
        if (e.H == null) {
            e.H = new n.g(e);
        }
        this.C.q((MenuItem)e.H.b(n), null, 0);
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        this.E.a(this.C, true);
    }
    
    public final boolean onKey(final DialogInterface dialogInterface, final int n, final KeyEvent keyEvent) {
        final E c = this.C;
        if (n == 82 || n == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final Window window = ((Dialog)this.D).getWindow();
                if (window != null) {
                    final View decorView = window.getDecorView();
                    if (decorView != null) {
                        final KeyEvent$DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, (Object)this);
                            return true;
                        }
                    }
                }
            }
            else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                final Window window2 = ((Dialog)this.D).getWindow();
                if (window2 != null) {
                    final View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        final KeyEvent$DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            c.c(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return c.performShortcut(n, keyEvent, 0);
    }
}
