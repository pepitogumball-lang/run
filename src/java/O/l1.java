package o;

import android.view.Window$Callback;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import n.a;
import android.view.View$OnClickListener;

public final class l1 implements View$OnClickListener
{
    public final a C;
    public final m1 D;
    
    public l1(final m1 d) {
        this.D = d;
        final Context context = ((View)d.a).getContext();
        final CharSequence h = d.h;
        final Object c = new Object();
        ((a)c).e = 4096;
        ((a)c).g = 4096;
        ((a)c).l = null;
        ((a)c).m = null;
        ((a)c).n = false;
        ((a)c).o = false;
        ((a)c).p = 16;
        ((a)c).i = context;
        ((a)c).a = h;
        this.C = (a)c;
    }
    
    public final void onClick(final View view) {
        final m1 d = this.D;
        final Window$Callback k = d.k;
        if (k != null && d.l) {
            k.onMenuItemSelected(0, (MenuItem)this.C);
        }
    }
}
