package Z4;

import android.webkit.DownloadListener;

public final class q implements DownloadListener
{
    public final r C;
    
    public q(final r c) {
        this.C = c;
    }
    
    public final void onDownloadStart(final String s, final String s2, final String s3, final String s4, final long n) {
        this.C.a.h((Runnable)new o(this, s, s2, s3, s4, n));
    }
}
