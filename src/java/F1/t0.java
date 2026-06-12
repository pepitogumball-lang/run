package F1;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import i2.a;

public final class t0 extends a
{
    public static final Parcelable$Creator<t0> CREATOR;
    public final int C;
    
    static {
        CREATOR = (Parcelable$Creator)new X(1);
    }
    
    public t0(final int c) {
        this.C = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 2, 4);
        parcel.writeInt(this.C);
        a.a.E(parcel, d);
    }
}
