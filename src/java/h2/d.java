package h2;

import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;
import i2.a;

public final class D extends a
{
    public static final Parcelable$Creator<D> CREATOR;
    public final int C;
    
    static {
        CREATOR = (Parcelable$Creator)new p(9);
    }
    
    public D(final int c) {
        this.C = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.E(parcel, d);
    }
}
