package o;

import android.widget.AdapterView;
import android.widget.AbsListView;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import n.l;
import android.widget.ListAdapter;
import n.i;
import android.widget.HeaderViewListAdapter;
import android.view.MotionEvent;
import android.content.Context;
import n.n;

public final class H0 extends r0
{
    public final int O;
    public final int P;
    public D0 Q;
    public n R;
    
    public H0(final Context context, final boolean b) {
        super(context, b);
        if (1 == G0.a(context.getResources().getConfiguration())) {
            this.O = 21;
            this.P = 22;
        }
        else {
            this.O = 22;
            this.P = 21;
        }
    }
    
    @Override
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        if (this.Q != null) {
            final ListAdapter adapter = this.getAdapter();
            int headersCount;
            i i;
            if (adapter instanceof HeaderViewListAdapter) {
                final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                i = (i)headerViewListAdapter.getWrappedAdapter();
            }
            else {
                i = (i)adapter;
                headersCount = 0;
            }
            n b = null;
            Label_0116: {
                if (motionEvent.getAction() != 10) {
                    final int pointToPosition = ((AbsListView)this).pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
                    if (pointToPosition != -1) {
                        final int n = pointToPosition - headersCount;
                        if (n >= 0 && n < i.getCount()) {
                            b = i.b(n);
                            break Label_0116;
                        }
                    }
                }
                b = null;
            }
            final n r = this.R;
            if (r != b) {
                final l c = i.C;
                if (r != null) {
                    this.Q.f(c, r);
                }
                if ((this.R = b) != null) {
                    this.Q.o(c, b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final ListMenuItemView listMenuItemView = (ListMenuItemView)((AdapterView)this).getSelectedView();
        if (listMenuItemView != null && n == this.O) {
            if (((View)listMenuItemView).isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                ((AdapterView)this).performItemClick((View)listMenuItemView, ((AdapterView)this).getSelectedItemPosition(), ((AdapterView)this).getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && n == this.P) {
            ((AdapterView)this).setSelection(-1);
            final ListAdapter adapter = this.getAdapter();
            i i;
            if (adapter instanceof HeaderViewListAdapter) {
                i = (i)((HeaderViewListAdapter)adapter).getWrappedAdapter();
            }
            else {
                i = (i)adapter;
            }
            i.C.c(false);
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public void setHoverListener(final D0 q) {
        this.Q = q;
    }
}
