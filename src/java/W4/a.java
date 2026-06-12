package w4;

import io.flutter.plugin.platform.q;
import android.util.SparseArray;
import io.flutter.plugin.platform.r;
import java.util.Iterator;

public final class a implements b
{
    public final c a;
    
    public a(final c a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void b() {
        final c a = this.a;
        final Iterator iterator = a.v.iterator();
        while (iterator.hasNext()) {
            ((b)iterator.next()).b();
        }
        while (true) {
            final r s = a.s;
            final SparseArray n = s.N;
            if (n.size() <= 0) {
                break;
            }
            s.Y.g(n.keyAt(0));
        }
        while (true) {
            final q t = a.t;
            final SparseArray k = t.K;
            if (k.size() <= 0) {
                break;
            }
            t.R.g(k.keyAt(0));
        }
        a.k.d = null;
    }
}
