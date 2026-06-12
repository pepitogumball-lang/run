package h2;

import f2.p;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzd;
import android.os.IBinder;

public final class x implements k
{
    public final IBinder C;
    
    public x(final IBinder c) {
        this.C = c;
    }
    
    public final void H0(final zzd zzd, final f f) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder((IBinder)zzd);
            obtain.writeInt(1);
            p.a(f, obtain, 0);
            this.C.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.C;
    }
}
