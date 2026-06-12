package x2;

import android.os.BadParcelableException;
import com.google.android.gms.internal.measurement.L;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

public abstract class b
{
    public static final int a = 0;
    
    static {
        b.class.getClassLoader();
    }
    
    public static Parcelable a(final Parcel parcel, final Parcelable$Creator parcelable$Creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable)parcelable$Creator.createFromParcel(parcel);
    }
    
    public static void b(final Parcel parcel) {
        final int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException(L.h(dataAvail, "Parcel data not fully consumed, unread size: "));
    }
}
