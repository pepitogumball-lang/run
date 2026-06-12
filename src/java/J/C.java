package j;

import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

public final class c implements AdapterView$OnItemClickListener
{
    public final f C;
    public final d D;
    
    public c(final d d, final f c) {
        this.D = d;
        this.C = c;
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final d d = this.D;
        final DialogInterface$OnClickListener n3 = d.n;
        final f c = this.C;
        n3.onClick((DialogInterface)c.b, n);
        if (!d.o) {
            c.b.dismiss();
        }
    }
}
