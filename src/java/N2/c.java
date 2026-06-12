package n2;

import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;
import i2.a;

public final class c extends a
{
    public static final Parcelable$Creator<c> CREATOR;
    public final int C;
    public final String D;
    public final int E;
    
    static {
        CREATOR = (Parcelable$Creator)new p(19);
    }
    
    public c(final int c, final String d, final int e) {
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public c(final String d, final int e) {
        this.C = 1;
        this.D = d;
        this.E = e;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.v(parcel, 2, this.D, false);
        a.a.C(parcel, 3, 4);
        parcel.writeInt(this.E);
        a.a.E(parcel, d);
    }
}
