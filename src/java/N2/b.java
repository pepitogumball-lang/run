package n2;

import android.os.Parcelable;
import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;
import i2.a;

public final class b extends a
{
    public static final Parcelable$Creator<b> CREATOR;
    public final int C;
    public final n2.a D;
    
    static {
        CREATOR = (Parcelable$Creator)new p(17);
    }
    
    public b(final int c, final n2.a d) {
        this.C = c;
        this.D = d;
    }
    
    public b(final n2.a d) {
        this.C = 1;
        this.D = d;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.u(parcel, 2, (Parcelable)this.D, n, false);
        a.a.E(parcel, d);
    }
}
