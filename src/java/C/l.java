package C;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import d2.m;
import android.view.Window$OnFrameMetricsAvailableListener;

public final class l implements Window$OnFrameMetricsAvailableListener
{
    public final m a;
    
    public l(final m a) {
        this.a = a;
    }
    
    public final void onFrameMetricsAvailable(final Window window, final FrameMetrics frameMetrics, int n) {
        final m a = this.a;
        if ((a.b & 0x1) != 0x0) {
            final SparseIntArray sparseIntArray = ((SparseIntArray[])a.c)[0];
            final long metric = frameMetrics.getMetric(8);
            if (sparseIntArray != null) {
                n = (int)((500000L + metric) / 1000000L);
                if (metric >= 0L) {
                    sparseIntArray.put(n, sparseIntArray.get(n) + 1);
                }
            }
        }
    }
}
