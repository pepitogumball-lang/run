package i0;

import androidx.lifecycle.B;
import androidx.lifecycle.D;
import com.google.android.gms.internal.ads.Tl;
import androidx.lifecycle.t;
import c2.d;
import androidx.lifecycle.C;

public final class b extends C
{
    public final d l;
    public t m;
    public Tl n;
    
    public b(final d l) {
        this.l = l;
        if (l.a == null) {
            l.a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }
    
    public final void f() {
        final d l = this.l;
        l.b = true;
        l.d = false;
        l.c = false;
        l.i.drainPermits();
        l.c();
    }
    
    public final void g() {
        this.l.b = false;
    }
    
    public final void i(final D d) {
        super.i(d);
        this.m = null;
        this.n = null;
    }
    
    public final void k() {
        final t m = this.m;
        final Tl n = this.n;
        if (m != null && n != null) {
            super.i((D)n);
            ((B)this).d(m, (D)n);
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)this)));
        sb.append(" #0 : ");
        final Class<? extends d> class1 = this.l.getClass();
        sb.append(class1.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)class1)));
        sb.append("}}");
        return sb.toString();
    }
}
