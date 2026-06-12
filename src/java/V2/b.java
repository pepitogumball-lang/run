package v2;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

public final class b implements c, IInterface
{
    public final IBinder C;
    
    public b(final IBinder c) {
        this.C = c;
    }
    
    public final Parcel Q(final Parcel parcel, final int n) {
        final Parcel obtain = Parcel.obtain();
        try {
            try {
                this.C.transact(n, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            }
            finally {}
        }
        catch (final RuntimeException ex) {
            obtain.recycle();
            throw ex;
        }
        parcel.recycle();
    }
    
    public final IBinder asBinder() {
        return this.C;
    }
}
