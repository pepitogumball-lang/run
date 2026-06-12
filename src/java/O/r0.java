package o;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import android.widget.TextView$OnEditorActionListener;

public final class R0 implements TextView$OnEditorActionListener
{
    public final SearchView a;
    
    public R0(final SearchView a) {
        this.a = a;
    }
    
    public final boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        this.a.r();
        return true;
    }
}
