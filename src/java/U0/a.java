package u0;

import android.os.Parcel;
import android.os.IBinder;

public final class a implements b
{
    public IBinder C;
    
    public final void U1(final String[] array) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(array);
            this.C.transact(1, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.C;
    }
}
