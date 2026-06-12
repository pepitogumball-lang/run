package K2;

import android.content.Context;
import android.app.job.JobScheduler;
import android.app.PendingIntent;
import com.google.android.gms.internal.measurement.N;
import android.content.Intent;
import android.app.AlarmManager;

public final class t1 extends u1
{
    public final AlarmManager F;
    public q1 G;
    public Integer H;
    
    public t1(final y1 y1) {
        super(y1);
        this.F = (AlarmManager)((n0)super.C).C.getSystemService("alarm");
    }
    
    @Override
    public final boolean B() {
        final n0 n0 = (n0)super.C;
        final AlarmManager f = this.F;
        if (f != null) {
            final Context c = n0.C;
            f.cancel(PendingIntent.getBroadcast(c, 0, new Intent().setClassName(c, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), N.a));
        }
        final JobScheduler jobScheduler = (JobScheduler)n0.C.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(this.D());
        }
        return false;
    }
    
    public final void C() {
        this.z();
        this.j().P.f("Unscheduling upload");
        final n0 n0 = (n0)super.C;
        final AlarmManager f = this.F;
        if (f != null) {
            final Context c = n0.C;
            f.cancel(PendingIntent.getBroadcast(c, 0, new Intent().setClassName(c, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), N.a));
        }
        this.E().a();
        final JobScheduler jobScheduler = (JobScheduler)n0.C.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(this.D());
        }
    }
    
    public final int D() {
        if (this.H == null) {
            final String packageName = ((n0)super.C).C.getPackageName();
            final StringBuilder sb = new StringBuilder("measurement");
            sb.append(packageName);
            this.H = sb.toString().hashCode();
        }
        return this.H;
    }
    
    public final m E() {
        if (this.G == null) {
            this.G = new q1(this, (w0)super.D.N, 1);
        }
        return this.G;
    }
}
