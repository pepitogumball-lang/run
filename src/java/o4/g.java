package o4;

import G.l;
import android.os.Handler;
import android.os.HandlerThread;

public final class g
{
    public final String a;
    public final int b;
    public HandlerThread c;
    public Handler d;
    public l e;
    public f f;
    
    public g(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final l e) {
        synchronized (this) {
            ((Thread)(this.c = new HandlerThread(this.a, this.b))).start();
            this.d = new Handler(this.c.getLooper());
            this.e = e;
        }
    }
}
