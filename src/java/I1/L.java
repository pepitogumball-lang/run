package I1;

import android.app.Dialog;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import E1.o;
import android.content.Context;

public final class l implements Runnable
{
    public final Context C;
    public final String D;
    public final boolean E;
    public final boolean F;
    
    public l(final Context c, final String d, final boolean e, final boolean f) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
    }
    
    public final void run() {
        final M c = o.B.c;
        final Context c2 = this.C;
        final AlertDialog$Builder j = M.j(c2);
        j.setMessage((CharSequence)this.D);
        if (this.E) {
            j.setTitle((CharSequence)"Error");
        }
        else {
            j.setTitle((CharSequence)"Info");
        }
        if (this.F) {
            j.setNeutralButton((CharSequence)"Dismiss", (DialogInterface$OnClickListener)null);
        }
        else {
            j.setPositiveButton((CharSequence)"Learn More", (DialogInterface$OnClickListener)new g(c2, 2));
            j.setNegativeButton((CharSequence)"Dismiss", (DialogInterface$OnClickListener)null);
        }
        ((Dialog)j.create()).show();
    }
}
