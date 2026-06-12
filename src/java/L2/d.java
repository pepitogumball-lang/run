package l2;

import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;
import i2.a;

public final class d extends a
{
    public static final Parcelable$Creator<d> CREATOR;
    public final int C;
    public final int D;
    public final Long E;
    public final Long F;
    public final int G;
    
    static {
        CREATOR = (Parcelable$Creator)new p(16);
    }
    
    public d(final int c, final int d, final Long e, final Long f, final int g) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        if (e == null || f == null || f == 0L) {
            return;
        }
        if (f != 0L) {
            return;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.C(parcel, 2, 4);
        parcel.writeInt(this.D);
        a.a.t(parcel, 3, this.E);
        a.a.t(parcel, 4, this.F);
        a.a.C(parcel, 5, 4);
        parcel.writeInt(this.G);
        a.a.E(parcel, d);
    }
}
