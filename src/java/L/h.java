package L;

import android.os.Process;

public final class h extends Thread
{
    public final int C;
    
    public h(final Runnable runnable, final String s, final int c) {
        super(runnable, s);
        this.C = c;
    }
    
    public final void run() {
        Process.setThreadPriority(this.C);
        super.run();
    }
}
