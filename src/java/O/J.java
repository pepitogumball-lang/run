package o;

import androidx.appcompat.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

public final class J implements AdapterView$OnItemClickListener
{
    public final int C;
    public final Object D;
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int selection, final long n) {
        switch (this.C) {
            default: {
                ((SearchView)this.D).o(selection);
                return;
            }
            case 0: {
                final L l = (L)this.D;
                ((AdapterView)l.h0).setSelection(selection);
                final O h0 = l.h0;
                if (((AdapterView)h0).getOnItemClickListener() != null) {
                    ((AdapterView)h0).performItemClick(view, selection, l.e0.getItemId(selection));
                }
                l.dismiss();
            }
        }
    }
}
