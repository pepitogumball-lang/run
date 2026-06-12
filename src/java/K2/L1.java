package K2;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.K1;
import b1.f;
import A2.b;

public final class l1 extends Z
{
    public b E;
    public boolean F;
    public final f G;
    public final p1 H;
    public final K1 I;
    
    public l1(final n0 n0) {
        super(n0);
        this.F = true;
        this.G = new f((Object)this, 20);
        final Object h = new Object();
        ((p1)h).F = this;
        ((p1)h).E = new q1(h, (w0)super.C, 0);
        ((n0)super.C).P.getClass();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        ((p1)h).C = elapsedRealtime;
        ((p1)h).D = elapsedRealtime;
        this.H = (p1)h;
        this.I = new K1(this);
    }
    
    @Override
    public final boolean B() {
        return false;
    }
    
    public final void C() {
        this.v();
        if (this.E == null) {
            this.E = new b(Looper.getMainLooper(), 4);
        }
    }
}
