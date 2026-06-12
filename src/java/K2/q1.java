package K2;

import android.os.SystemClock;

public final class q1 extends m
{
    public final int e;
    public final Object f;
    
    @Override
    public final void c() {
        switch (this.e) {
            default: {
                final t1 t1 = (t1)this.f;
                t1.C();
                t1.j().P.f("Starting upload from DelayedRunnable");
                t1.D.g0();
                return;
            }
            case 0: {
                final p1 p1 = (p1)this.f;
                ((l1)p1.F).v();
                final l1 l1 = (l1)p1.F;
                ((n0)l1.C).P.getClass();
                p1.a(false, false, SystemClock.elapsedRealtime());
                final n0 n0 = (n0)l1.C;
                final p m = n0.m();
                n0.P.getClass();
                m.z(SystemClock.elapsedRealtime());
            }
        }
    }
}
