package f3;

import J5.b;
import android.os.Process;

public final class k implements Runnable
{
    public final int C;
    public final Runnable D;
    
    public final void run() {
        switch (this.C) {
            default: {
                Process.setThreadPriority(0);
                this.D.run();
                return;
            }
            case 1: {
                try {
                    this.D.run();
                }
                catch (final Exception ex) {
                    b.w("Executor", "Background execution failure.", ex);
                }
                return;
            }
            case 0: {
                this.D.run();
            }
        }
    }
    
    @Override
    public String toString() {
        switch (this.C) {
            default: {
                return super.toString();
            }
            case 0: {
                return this.D.toString();
            }
        }
    }
}
