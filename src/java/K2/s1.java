package K2;

import android.os.Parcel;
import B1.f;
import android.os.Parcelable$Creator;
import i2.a;

public final class s1 extends a
{
    public static final Parcelable$Creator<s1> CREATOR;
    public final String C;
    public final long D;
    public final int E;
    
    static {
        CREATOR = (Parcelable$Creator)new f(19);
    }
    
    public s1(final long d, final String c, final int e) {
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.v(parcel, 1, this.C, false);
        a.a.C(parcel, 2, 8);
        parcel.writeLong(this.D);
        a.a.C(parcel, 3, 4);
        parcel.writeInt(this.E);
        a.a.E(parcel, d);
    }
}
