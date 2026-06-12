package V1;

import java.util.List;
import android.os.Parcel;
import h2.A;
import U1.d;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import i2.a;

public final class b extends a
{
    public static final Parcelable$Creator<b> CREATOR;
    public final int C;
    public final ArrayList D;
    
    static {
        CREATOR = (Parcelable$Creator)new d(2);
    }
    
    public b(final int c, final ArrayList d) {
        this.C = c;
        A.h((Object)d);
        this.D = d;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.z(parcel, 2, (List)this.D, false);
        a.a.E(parcel, d);
    }
}
