package B2;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

public abstract class i
{
    public static final int a = 0;
    
    static {
        i.class.getClassLoader();
    }
    
    public static Parcelable a(final Parcel parcel, final Parcelable$Creator parcelable$Creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable)parcelable$Creator.createFromParcel(parcel);
    }
    
    public static void b(final Parcel parcel, final IInterface interface1) {
        if (interface1 == null) {
            parcel.writeStrongBinder((IBinder)null);
            return;
        }
        parcel.writeStrongBinder(interface1.asBinder());
    }
    
    public static void c(final Parcel parcel) {
        final int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new BadParcelableException(sb.toString());
    }
}
