package o;

import android.widget.AdapterView;
import android.widget.AbsListView;
import android.widget.AdapterView$OnItemClickListener;
import android.graphics.drawable.Drawable;
import android.widget.SpinnerAdapter;
import android.widget.ListAdapter;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow$OnDismissListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import n.d;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;

public final class L extends C0 implements N
{
    public CharSequence d0;
    public I e0;
    public final Rect f0;
    public int g0;
    public final O h0;
    
    public L(final O o, final Context context, final AttributeSet set) {
        this.h0 = o;
        super(context, set, 2130903569);
        this.f0 = new Rect();
        super.Q = (View)o;
        super.Z = true;
        super.a0.setFocusable(true);
        super.R = (AdapterView$OnItemClickListener)new J(this, 0);
    }
    
    @Override
    public final void g(final CharSequence d0) {
        this.d0 = d0;
    }
    
    @Override
    public final void j(final int g0) {
        this.g0 = g0;
    }
    
    @Override
    public final void l(int selectedItemPosition, final int n) {
        final w a0 = super.a0;
        final boolean showing = a0.isShowing();
        this.s();
        super.a0.setInputMethodMode(2);
        this.c();
        final r0 e = super.E;
        ((AbsListView)e).setChoiceMode(1);
        o.F.d((View)e, selectedItemPosition);
        o.F.c((View)e, n);
        final O h0 = this.h0;
        selectedItemPosition = ((AdapterView)h0).getSelectedItemPosition();
        final r0 e2 = super.E;
        if (a0.isShowing() && e2 != null) {
            e2.setListSelectionHidden(false);
            ((AdapterView)e2).setSelection(selectedItemPosition);
            if (((AbsListView)e2).getChoiceMode() != 0) {
                ((AbsListView)e2).setItemChecked(selectedItemPosition, true);
            }
        }
        if (showing) {
            return;
        }
        final ViewTreeObserver viewTreeObserver = ((View)h0).getViewTreeObserver();
        if (viewTreeObserver != null) {
            final d d = new d((Object)this, 3);
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)d);
            super.a0.setOnDismissListener((PopupWindow$OnDismissListener)new K(this, d));
        }
    }
    
    @Override
    public final CharSequence n() {
        return this.d0;
    }
    
    @Override
    public final void p(final ListAdapter listAdapter) {
        super.p(listAdapter);
        this.e0 = (I)listAdapter;
    }
    
    public final void s() {
        final w a0 = super.a0;
        final Drawable background = a0.getBackground();
        final O h0 = this.h0;
        int right;
        if (background != null) {
            background.getPadding(h0.J);
            final boolean a2 = t1.a((View)h0);
            final Rect j = h0.J;
            if (a2) {
                right = j.right;
            }
            else {
                right = -j.left;
            }
        }
        else {
            final Rect i = h0.J;
            i.right = 0;
            i.left = 0;
            right = 0;
        }
        final int paddingLeft = ((View)h0).getPaddingLeft();
        final int paddingRight = ((View)h0).getPaddingRight();
        final int width = ((View)h0).getWidth();
        final int k = h0.I;
        if (k == -2) {
            final int a3 = h0.a((SpinnerAdapter)this.e0, a0.getBackground());
            final int widthPixels = ((View)h0).getContext().getResources().getDisplayMetrics().widthPixels;
            final Rect l = h0.J;
            final int n = widthPixels - l.left - l.right;
            int n2;
            if ((n2 = a3) > n) {
                n2 = n;
            }
            this.r(Math.max(n2, width - paddingLeft - paddingRight));
        }
        else if (k == -1) {
            this.r(width - paddingLeft - paddingRight);
        }
        else {
            this.r(k);
        }
        int h2;
        if (t1.a((View)h0)) {
            h2 = width - paddingRight - super.G - this.g0 + right;
        }
        else {
            h2 = paddingLeft + this.g0 + right;
        }
        super.H = h2;
    }
}
