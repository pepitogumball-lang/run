package g2;

import androidx.fragment.app.Q;
import androidx.fragment.app.S;
import android.os.Bundle;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.Iterator;
import java.util.Map;
import C2.x;
import java.util.WeakHashMap;
import androidx.fragment.app.t;

public final class F extends t implements g
{
    public static final WeakHashMap y0;
    public final x x0;
    
    static {
        y0 = new WeakHashMap();
    }
    
    public F() {
        this.x0 = new x();
    }
    
    public final void A() {
        super.i0 = true;
        final x x0 = this.x0;
        x0.b = 2;
        for (final l l : ((Map)x0.a).values()) {
            l.D = true;
            l.d();
        }
    }
    
    public final void B() {
        super.i0 = true;
        final x x0 = this.x0;
        x0.b = 4;
        final Iterator iterator = ((Map)x0.a).values().iterator();
        while (iterator.hasNext()) {
            ((l)iterator.next()).c();
        }
    }
    
    public final l a() {
        return l.class.cast(((Map)this.x0.a).get((Object)"ConnectionlessLifecycleHelper"));
    }
    
    public final void b(final l l) {
        this.x0.m(l);
    }
    
    public final void e(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.e(s, fileDescriptor, printWriter, array);
        final Iterator iterator = ((Map)this.x0.a).values().iterator();
        while (iterator.hasNext()) {
            iterator.next().getClass();
        }
    }
    
    public final void r(final int n, final int n2, final Intent intent) {
        super.r(n, n2, intent);
        this.x0.o(n, n2, intent);
    }
    
    public final void t(final Bundle bundle) {
        super.i0 = true;
        final Bundle d = super.D;
        if (d != null) {
            final Bundle bundle2 = d.getBundle("childFragmentManager");
            if (bundle2 != null) {
                ((Q)super.X).T(bundle2);
                final S x = super.X;
                ((Q)x).G = false;
                ((Q)x).H = false;
                ((Q)x).N.i = false;
                ((Q)x).u(1);
            }
        }
        final S x2 = super.X;
        if (((Q)x2).u < 1) {
            ((Q)x2).G = false;
            ((Q)x2).H = false;
            ((Q)x2).N.i = false;
            ((Q)x2).u(1);
        }
        this.x0.n(bundle);
    }
    
    public final void u() {
        super.i0 = true;
        final x x0 = this.x0;
        x0.b = 5;
        final Iterator iterator = ((Map)x0.a).values().iterator();
        while (iterator.hasNext()) {
            iterator.next().getClass();
        }
    }
    
    public final void y() {
        super.i0 = true;
        final x x0 = this.x0;
        x0.b = 3;
        final Iterator iterator = ((Map)x0.a).values().iterator();
        while (iterator.hasNext()) {
            ((l)iterator.next()).d();
        }
    }
    
    public final void z(final Bundle bundle) {
        this.x0.p(bundle);
    }
}
