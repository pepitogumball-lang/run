package A2;

import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

public class b extends Handler
{
    public final int a;
    
    public b(final Looper looper, final int a) {
        switch (this.a = a) {
            default: {
                super(looper);
                Looper.getMainLooper();
                return;
            }
            case 5: {
                super(looper);
                Looper.getMainLooper();
                return;
            }
            case 4: {
                super(looper);
                Looper.getMainLooper();
                return;
            }
            case 3: {
                super(looper);
                Looper.getMainLooper();
            }
        }
    }
    
    public void a(final Message message) {
        super.dispatchMessage(message);
    }
    
    public void dispatchMessage(final Message message) {
        switch (this.a) {
            default: {
                super.dispatchMessage(message);
                return;
            }
            case 3: {
                this.a(message);
            }
        }
    }
}
