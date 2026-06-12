package h2;

import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;
import i2.a;

public final class o extends a
{
    public static final Parcelable$Creator<o> CREATOR;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final int G;
    
    static {
        CREATOR = (Parcelable$Creator)new p(8);
    }
    
    public o(final int c, final boolean d, final boolean e, final int f, final int g) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.C(parcel, 2, 4);
        parcel.writeInt((int)(this.D ? 1 : 0));
        a.a.C(parcel, 3, 4);
        parcel.writeInt((int)(this.E ? 1 : 0));
        a.a.C(parcel, 4, 4);
        parcel.writeInt(this.F);
        a.a.C(parcel, 5, 4);
        parcel.writeInt(this.G);
        a.a.E(parcel, d);
    }
}
