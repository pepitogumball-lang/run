package t1;

import android.database.Cursor;
import android.os.BaseBundle;
import java.util.Set;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import android.util.Log;
import android.util.Base64;
import android.os.PersistableBundle;
import android.app.job.JobInfo$Builder;
import u1.i;
import J5.b;
import android.app.job.JobInfo;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import n1.j;
import u1.d;
import android.content.Context;

public final class c
{
    public final Context a;
    public final d b;
    public final a c;
    
    public c(final Context a, final d b, final a c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final j j, final int n, final boolean b) {
        final Context a = this.a;
        final ComponentName componentName = new ComponentName(a, (Class)JobInfoSchedulerService.class);
        final JobScheduler jobScheduler = (JobScheduler)a.getSystemService("jobscheduler");
        final Adler32 adler32 = new Adler32();
        adler32.update(a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(j.a.getBytes(Charset.forName("UTF-8")));
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        final k1.d c = j.c;
        adler32.update(allocate.putInt(x1.a.a(c)).array());
        final byte[] b2 = j.b;
        if (b2 != null) {
            adler32.update(b2);
        }
        final int n2 = (int)adler32.getValue();
        if (!b) {
            for (final JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                final int int1 = ((BaseBundle)jobInfo.getExtras()).getInt("attemptNumber");
                if (jobInfo.getId() == n2) {
                    if (int1 >= n) {
                        b.v("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", (Object)j);
                        return;
                    }
                    break;
                }
            }
        }
        final SQLiteDatabase a2 = ((i)this.b).a();
        final int a3 = x1.a.a(c);
        final String a4 = j.a;
        Object o = a2.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { a4, String.valueOf(a3) });
        try {
            Long n3;
            if (((Cursor)o).moveToNext()) {
                n3 = ((Cursor)o).getLong(0);
            }
            else {
                n3 = 0L;
            }
            ((Cursor)o).close();
            final long longValue = n3;
            final JobInfo$Builder jobInfo$Builder = new JobInfo$Builder(n2, componentName);
            o = this.c;
            jobInfo$Builder.setMinimumLatency(((a)o).a(c, longValue, n));
            final Set c2 = ((t1.b)((a)o).b.get((Object)c)).c;
            if (c2.contains((Object)t1.d.C)) {
                jobInfo$Builder.setRequiredNetworkType(2);
            }
            else {
                jobInfo$Builder.setRequiredNetworkType(1);
            }
            if (c2.contains((Object)t1.d.E)) {
                jobInfo$Builder.setRequiresCharging(true);
            }
            if (c2.contains((Object)t1.d.D)) {
                jobInfo$Builder.setRequiresDeviceIdle(true);
            }
            final PersistableBundle extras = new PersistableBundle();
            ((BaseBundle)extras).putInt("attemptNumber", n);
            ((BaseBundle)extras).putString("backendName", a4);
            ((BaseBundle)extras).putInt("priority", x1.a.a(c));
            if (b2 != null) {
                ((BaseBundle)extras).putString("extras", Base64.encodeToString(b2, 0));
            }
            jobInfo$Builder.setExtras(extras);
            final long a5 = ((a)o).a(c, longValue, n);
            final String c3 = b.C("JobInfoScheduler");
            if (Log.isLoggable(c3, 3)) {
                Log.d(c3, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { j, n2, a5, n3, n }));
            }
            jobScheduler.schedule(jobInfo$Builder.build());
        }
        finally {
            ((Cursor)o).close();
        }
    }
}
