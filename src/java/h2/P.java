package h2;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import i2.a;

public final class p extends a
{
    public static final Parcelable$Creator<p> CREATOR;
    public final int C;
    public List D;
    
    static {
        CREATOR = (Parcelable$Creator)new f2.p(4);
    }
    
    public p(final int c, final List d) {
        this.C = c;
        this.D = d;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.z(parcel, 2, this.D, false);
        a.a.E(parcel, d);
    }
}
