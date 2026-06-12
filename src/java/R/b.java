package r;

import android.os.Bundle;

public final class b implements Runnable
{
    public final int C;
    public final Bundle D;
    public final f E;
    
    public final void run() {
        switch (this.C) {
            default: {
                this.E.D.onMinimized(this.D);
                return;
            }
            case 2: {
                this.E.D.onWarmupCompleted(this.D);
                return;
            }
            case 1: {
                this.E.D.onMessageChannelReady(this.D);
                return;
            }
            case 0: {
                this.E.D.onUnminimized(this.D);
            }
        }
    }
}
