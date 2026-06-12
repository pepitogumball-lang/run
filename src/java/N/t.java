package n;

import android.widget.Adapter;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.HeaderViewListAdapter;
import android.widget.AdapterView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.widget.ListAdapter;
import android.graphics.Rect;
import android.widget.AdapterView$OnItemClickListener;

public abstract class t implements C, y, AdapterView$OnItemClickListener
{
    public Rect C;
    
    public static int m(final ListAdapter listAdapter, final Context context, final int n) {
        int i = 0;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int count = ((Adapter)listAdapter).getCount();
        int n2 = 0;
        int n3 = 0;
        ViewGroup viewGroup = null;
        View view = null;
        while (i < count) {
            final int itemViewType = ((Adapter)listAdapter).getItemViewType(i);
            int n4 = n3;
            View view2 = view;
            if (itemViewType != n3) {
                view2 = null;
                n4 = itemViewType;
            }
            Object o;
            if ((o = viewGroup) == null) {
                o = new FrameLayout(context);
            }
            final View view3 = ((Adapter)listAdapter).getView(i, view2, (ViewGroup)o);
            view3.measure(measureSpec, measureSpec2);
            final int measuredWidth = view3.getMeasuredWidth();
            if (measuredWidth >= n) {
                return n;
            }
            int n5;
            if (measuredWidth > (n5 = n2)) {
                n5 = measuredWidth;
            }
            ++i;
            n2 = n5;
            n3 = n4;
            viewGroup = (ViewGroup)o;
            view = view3;
        }
        return n2;
    }
    
    public static boolean u(final l l) {
        final int size = l.f.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            final MenuItem item = l.getItem(n);
            if (item.isVisible() && item.getIcon() != null) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    @Override
    public final boolean f(final n n) {
        return false;
    }
    
    @Override
    public final void g(final Context context, final l l) {
    }
    
    @Override
    public final boolean k(final n n) {
        return false;
    }
    
    public abstract void l(final l p0);
    
    public abstract void n(final View p0);
    
    public abstract void o(final boolean p0);
    
    public final void onItemClick(final AdapterView adapterView, final View view, int n, final long n2) {
        final ListAdapter listAdapter = (ListAdapter)adapterView.getAdapter();
        i i;
        if (listAdapter instanceof HeaderViewListAdapter) {
            i = (i)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        }
        else {
            i = (i)listAdapter;
        }
        final l c = i.C;
        final MenuItem menuItem = (MenuItem)((Adapter)listAdapter).getItem(n);
        if (!(this instanceof f)) {
            n = 0;
        }
        else {
            n = 4;
        }
        c.q(menuItem, this, n);
    }
    
    public abstract void p(final int p0);
    
    public abstract void q(final int p0);
    
    public abstract void r(final PopupWindow$OnDismissListener p0);
    
    public abstract void s(final boolean p0);
    
    public abstract void t(final int p0);
}
