package n;

import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.widget.BaseAdapter;

public final class g extends BaseAdapter
{
    public int C;
    public final h D;
    
    public g(final h d) {
        this.D = d;
        this.C = -1;
        this.a();
    }
    
    public final void a() {
        final l e = this.D.E;
        final n w = e.w;
        if (w != null) {
            e.i();
            final ArrayList j = e.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                if (j.get(i) == w) {
                    this.C = i;
                    return;
                }
            }
        }
        this.C = -1;
    }
    
    public final n b(final int n) {
        final h d = this.D;
        final l e = d.E;
        e.i();
        final ArrayList j = e.j;
        d.getClass();
        final int c = this.C;
        int n2 = n;
        if (c >= 0 && (n2 = n) >= c) {
            n2 = n + 1;
        }
        return (n)j.get(n2);
    }
    
    public final int getCount() {
        final h d = this.D;
        final l e = d.E;
        e.i();
        final int size = e.j.size();
        d.getClass();
        if (this.C < 0) {
            return size;
        }
        return size - 1;
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = this.D.D.inflate(2131427344, viewGroup, false);
        }
        ((z)inflate).a(this.b(n));
        return inflate;
    }
    
    public final void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}
