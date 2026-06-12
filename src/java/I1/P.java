package I1;

import android.os.Parcel;
import B1.f;
import android.os.Parcelable$Creator;
import i2.a;

public final class p extends a
{
    public static final Parcelable$Creator<p> CREATOR;
    public final String C;
    public final int D;
    
    static {
        CREATOR = (Parcelable$Creator)new f(13);
    }
    
    public p(final String s, final int d) {
        String c = s;
        if (s == null) {
            c = "";
        }
        this.C = c;
        this.D = d;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.v(parcel, 1, this.C, false);
        a.a.C(parcel, 2, 4);
        parcel.writeInt(this.D);
        a.a.E(parcel, d);
    }
}
