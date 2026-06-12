package O3;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import android.view.Window$OnFrameMetricsAvailableListener;
import C.l;
import android.os.Handler;
import android.os.HandlerThread;
import S3.d;
import d2.m;
import android.util.SparseIntArray;
import java.util.HashMap;
import android.app.Activity;
import R3.a;

public final class f
{
    public static final a e;
    public final Activity a;
    public final b1.f b;
    public final HashMap c;
    public boolean d;
    
    static {
        e = a.d();
    }
    
    public f(final Activity a) {
        final b1.f b = new b1.f(1);
        final HashMap c = new HashMap();
        this.d = false;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Y3.f a() {
        final boolean d = this.d;
        final a e = f.e;
        if (!d) {
            e.a("No recording has been started.");
            return new Y3.f();
        }
        final SparseIntArray[] array = (SparseIntArray[])((m)this.b.D).c;
        int i = 0;
        final SparseIntArray sparseIntArray = array[0];
        if (sparseIntArray == null) {
            e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new Y3.f();
        }
        int n = 0;
        int n3;
        int n2 = n3 = 0;
        while (i < sparseIntArray.size()) {
            final int key = sparseIntArray.keyAt(i);
            final int value = sparseIntArray.valueAt(i);
            n += value;
            int n4 = n3;
            if (key > 700) {
                n4 = n3 + value;
            }
            int n5 = n2;
            if (key > 16) {
                n5 = n2 + value;
            }
            ++i;
            n2 = n5;
            n3 = n4;
        }
        return new Y3.f((Object)new d(n, n2, n3));
    }
    
    public final void b() {
        final boolean d = this.d;
        final Activity a = this.a;
        if (d) {
            f.e.b("FrameMetricsAggregator is already recording %s", a.getClass().getSimpleName());
            return;
        }
        final m m = (m)this.b.D;
        m.getClass();
        if (d2.m.g == null) {
            ((Thread)(d2.m.g = new HandlerThread("FrameMetricsAggregator"))).start();
            d2.m.h = new Handler(d2.m.g.getLooper());
        }
        for (int i = 0; i <= 8; ++i) {
            final SparseIntArray[] array = (SparseIntArray[])m.c;
            if (array[i] == null && (1 << i & m.b) != 0x0) {
                array[i] = new SparseIntArray();
            }
        }
        a.getWindow().addOnFrameMetricsAvailableListener((Window$OnFrameMetricsAvailableListener)m.e, d2.m.h);
        ((ArrayList)m.d).add((Object)new WeakReference((Object)a));
        this.d = true;
    }
}
