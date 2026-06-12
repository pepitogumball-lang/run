package y2;

import android.os.BadParcelableException;
import com.google.android.gms.internal.measurement.L;
import android.os.Parcel;

public abstract class a
{
    public static final int a = 0;
    
    static {
        a.class.getClassLoader();
    }
    
    public static void a(final Parcel parcel) {
        final int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException(L.h(dataAvail, "Parcel data not fully consumed, unread size: "));
    }
}
