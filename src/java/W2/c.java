package w2;

import android.os.IBinder;
import android.os.IInterface;

public final class c implements IInterface
{
    public final IBinder C;
    
    public c(final IBinder c) {
        this.C = c;
    }
    
    public final IBinder asBinder() {
        return this.C;
    }
}
