package n;

import androidx.appcompat.view.menu.ListMenuItemView;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

public final class i extends BaseAdapter
{
    public final l C;
    public int D;
    public boolean E;
    public final boolean F;
    public final LayoutInflater G;
    public final int H;
    
    public i(final l c, final LayoutInflater g, final boolean f, final int h) {
        this.D = -1;
        this.F = f;
        this.G = g;
        this.C = c;
        this.H = h;
        this.a();
    }
    
    public final void a() {
        final l c = this.C;
        final n w = c.w;
        if (w != null) {
            c.i();
            final ArrayList j = c.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                if (j.get(i) == w) {
                    this.D = i;
                    return;
                }
            }
        }
        this.D = -1;
    }
    
    public final n b(final int n) {
        final l c = this.C;
        ArrayList list;
        if (this.F) {
            c.i();
            list = c.j;
        }
        else {
            list = c.l();
        }
        final int d = this.D;
        int n2 = n;
        if (d >= 0 && (n2 = n) >= d) {
            n2 = n + 1;
        }
        return (n)list.get(n2);
    }
    
    public final int getCount() {
        final l c = this.C;
        ArrayList list;
        if (this.F) {
            c.i();
            list = c.j;
        }
        else {
            list = c.l();
        }
        if (this.D < 0) {
            return list.size();
        }
        return list.size() - 1;
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final boolean b = false;
        View inflate = view;
        if (view == null) {
            inflate = this.G.inflate(this.H, viewGroup, false);
        }
        final int b2 = this.b(n).b;
        final int n2 = n - 1;
        int b3;
        if (n2 >= 0) {
            b3 = this.b(n2).b;
        }
        else {
            b3 = b2;
        }
        final ListMenuItemView listMenuItemView = (ListMenuItemView)inflate;
        boolean groupDividerEnabled = b;
        if (this.C.m()) {
            groupDividerEnabled = b;
            if (b2 != b3) {
                groupDividerEnabled = true;
            }
        }
        listMenuItemView.setGroupDividerEnabled(groupDividerEnabled);
        final z z = (z)inflate;
        if (this.E) {
            listMenuItemView.setForceShowIcon(true);
        }
        z.a(this.b(n));
        return inflate;
    }
    
    public final void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}
