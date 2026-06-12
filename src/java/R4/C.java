package R4;

import android.widget.AutoCompleteTextView;
import c2.k;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import android.content.res.Resources;
import java.util.HashMap;
import o.t1;
import android.graphics.Rect;
import androidx.appcompat.widget.SearchView;
import android.view.View;
import android.view.View$OnLayoutChangeListener;

public final class c implements View$OnLayoutChangeListener
{
    public final int a;
    public final Object b;
    
    public final void onLayoutChange(final View view, int i, int dropDownHorizontalOffset, int paddingLeft, final int n, final int n2, final int n3, final int n4, final int n5) {
        switch (this.a) {
            default: {
                final SearchView searchView = (SearchView)this.b;
                final View c0 = searchView.c0;
                if (c0.getWidth() > 1) {
                    final Resources resources = ((View)searchView).getContext().getResources();
                    paddingLeft = searchView.T.getPaddingLeft();
                    final Rect rect = new Rect();
                    final boolean a = t1.a((View)searchView);
                    if (searchView.r0) {
                        i = resources.getDimensionPixelSize(2131099689);
                        i += resources.getDimensionPixelSize(2131099690);
                    }
                    else {
                        i = 0;
                    }
                    final SearchView$SearchAutoComplete r = searchView.R;
                    ((AutoCompleteTextView)r).getDropDownBackground().getPadding(rect);
                    if (a) {
                        dropDownHorizontalOffset = -rect.left;
                    }
                    else {
                        dropDownHorizontalOffset = paddingLeft - (rect.left + i);
                    }
                    ((AutoCompleteTextView)r).setDropDownHorizontalOffset(dropDownHorizontalOffset);
                    ((AutoCompleteTextView)r).setDropDownWidth(c0.getWidth() + rect.left + rect.right + i - paddingLeft);
                }
                return;
            }
            case 0: {
                i = view.getMeasuredHeight();
                final d d = (d)this.b;
                if (i != d.i) {
                    final k b = d.b;
                    b.getClass();
                    final HashMap hashMap = new HashMap();
                    hashMap.put((Object)"adId", (Object)d.a);
                    hashMap.put((Object)"eventName", (Object)"onFluidAdHeightChanged");
                    hashMap.put((Object)"height", (Object)i);
                    b.u(hashMap);
                }
                d.i = i;
            }
        }
    }
}
