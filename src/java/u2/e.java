package u2;

import android.os.Process;

public final class e extends Thread
{
    public final void run() {
        Process.setThreadPriority(19);
        monitorenter(this);
        try {
            try {
                while (true) {
                    this.wait();
                }
            }
            finally {
                monitorexit(this);
            }
        }
        catch (final InterruptedException ex) {}
    }
}
