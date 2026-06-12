package n4;

import android.os.Message;
import android.os.Looper;
import android.os.Handler;

public final class b extends Handler
{
    public final boolean a;
    public final c b;
    
    public b(final c b, final Looper looper, final boolean a) {
        this.b = b;
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        this.b.J.a((Object)this.a);
    }
}
