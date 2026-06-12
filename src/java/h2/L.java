package h2;

import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;
import i2.a;

public final class l extends a
{
    public static final Parcelable$Creator<l> CREATOR;
    public final int C;
    public final int D;
    public final int E;
    public final long F;
    public final long G;
    public final String H;
    public final String I;
    public final int J;
    public final int K;
    
    static {
        CREATOR = (Parcelable$Creator)new p(5);
    }
    
    public l(final int c, final int d, final int e, final long f, final long g, final String h, final String i, final int j, final int k) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.C(parcel, 2, 4);
        parcel.writeInt(this.D);
        a.a.C(parcel, 3, 4);
        parcel.writeInt(this.E);
        a.a.C(parcel, 4, 8);
        parcel.writeLong(this.F);
        a.a.C(parcel, 5, 8);
        parcel.writeLong(this.G);
        a.a.v(parcel, 6, this.H, false);
        a.a.v(parcel, 7, this.I, false);
        a.a.C(parcel, 8, 4);
        parcel.writeInt(this.J);
        a.a.C(parcel, 9, 4);
        parcel.writeInt(this.K);
        a.a.E(parcel, d);
    }
}
