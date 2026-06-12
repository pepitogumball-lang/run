package o2;

import android.os.Parcelable;
import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;
import i2.a;

public final class f extends a
{
    public static final Parcelable$Creator<f> CREATOR;
    public final int C;
    public final String D;
    public final o2.a E;
    
    static {
        CREATOR = (Parcelable$Creator)new p(21);
    }
    
    public f(final int c, final String d, final o2.a e) {
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public f(final String d, final o2.a e) {
        this.C = 1;
        this.D = d;
        this.E = e;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.v(parcel, 2, this.D, false);
        a.a.u(parcel, 3, (Parcelable)this.E, n, false);
        a.a.E(parcel, d);
    }
}
