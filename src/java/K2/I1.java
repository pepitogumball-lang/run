package K2;

import android.content.ComponentName;

public final class i1 implements Runnable
{
    public final int C;
    public final h1 D;
    
    public final void run() {
        switch (this.C) {
            default: {
                final h1 d = this.D;
                final b1 e = d.E;
                final ComponentName componentName = new ComponentName(((n0)d.E.C).C, "com.google.android.gms.measurement.AppMeasurementService");
                e.v();
                if (e.F != null) {
                    e.F = null;
                    e.j().P.g("Disconnected from device MeasurementService", componentName);
                    e.v();
                    e.H();
                }
                return;
            }
            case 0: {
                final b1 e2 = this.D.E;
                e2.F = null;
                e2.M();
            }
        }
    }
}
