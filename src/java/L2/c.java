package l2;

import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;
import i2.a;

public final class c extends a
{
    public static final Parcelable$Creator<c> CREATOR;
    public final int C;
    public final boolean D;
    
    static {
        CREATOR = (Parcelable$Creator)new p(15);
    }
    
    public c(final int c, final boolean d) {
        this.C = c;
        this.D = d;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.C(parcel, 2, 4);
        parcel.writeInt((int)(this.D ? 1 : 0));
        a.a.E(parcel, d);
    }
}
