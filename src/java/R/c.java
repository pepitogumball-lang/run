package r;

import android.os.Bundle;

public final class c implements Runnable
{
    public final int C;
    public final String D;
    public final Bundle E;
    public final f F;
    
    public final void run() {
        switch (this.C) {
            default: {
                this.F.D.onPostMessage(this.D, this.E);
                return;
            }
            case 0: {
                this.F.D.extraCallback(this.D, this.E);
            }
        }
    }
}
