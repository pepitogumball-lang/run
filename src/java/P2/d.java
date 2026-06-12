package P2;

import android.os.Bundle;
import android.os.Handler;
import O2.j;
import android.os.ResultReceiver;

public final class d extends ResultReceiver
{
    public final j C;
    
    public d(final Handler handler, final j c) {
        this.C = c;
        super(handler);
    }
    
    public final void onReceiveResult(final int n, final Bundle bundle) {
        this.C.d(null);
    }
}
