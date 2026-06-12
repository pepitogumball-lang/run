package r3;

import k1.g;
import k1.b;
import k1.d;
import android.util.Log;
import O2.j;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import android.os.SystemClock;
import s3.a;
import h1.m;
import F1.n;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ArrayBlockingQueue;

public final class c
{
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final n h;
    public final m i;
    public int j;
    public long k;
    
    public c(final n h, final a a, final m i) {
        final double d = a.d;
        final long n = a.f;
        this.a = d;
        this.b = a.e;
        this.c = n * 1000L;
        this.h = h;
        this.i = i;
        this.d = SystemClock.elapsedRealtime();
        final int e = (int)d;
        this.e = e;
        final ArrayBlockingQueue f = new ArrayBlockingQueue(e);
        this.f = f;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, (BlockingQueue)f);
        this.j = 0;
        this.k = 0L;
    }
    
    public final int a() {
        if (this.k == 0L) {
            this.k = System.currentTimeMillis();
        }
        final int n = (int)((System.currentTimeMillis() - this.k) / this.c);
        int j;
        if (this.f.size() == this.e) {
            j = Math.min(100, this.j + n);
        }
        else {
            j = Math.max(0, this.j - n);
        }
        if (this.j != j) {
            this.j = j;
            this.k = System.currentTimeMillis();
        }
        return j;
    }
    
    public final void b(final k3.a a, final j j) {
        final StringBuilder sb = new StringBuilder("Sending report through Google DataTransport: ");
        sb.append(a.b);
        final String string = sb.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, (Throwable)null);
        }
        this.h.i(new k1.a((Object)a.a, k1.d.E, (b)null), (g)new r3.b(this, j, SystemClock.elapsedRealtime() - this.d < 2000L, a));
    }
}
