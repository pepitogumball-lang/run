package o;

import androidx.appcompat.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

public final class x0 implements AdapterView$OnItemSelectedListener
{
    public final int C;
    public final Object D;
    
    private final void a(final AdapterView adapterView) {
    }
    
    private final void b(final AdapterView adapterView) {
    }
    
    public final void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        switch (this.C) {
            default: {
                ((SearchView)this.D).p(n);
                return;
            }
            case 0: {
                if (n != -1) {
                    final r0 e = ((C0)this.D).E;
                    if (e != null) {
                        e.setListSelectionHidden(false);
                    }
                }
            }
        }
    }
    
    public final void onNothingSelected(final AdapterView adapterView) {
        final int c = this.C;
    }
}
