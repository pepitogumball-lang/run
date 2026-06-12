package E1;

import android.os.Parcel;
import B1.f;
import android.os.Parcelable$Creator;
import i2.a;

public final class i extends a
{
    public static final Parcelable$Creator<i> CREATOR;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final boolean F;
    public final float G;
    public final int H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    
    static {
        CREATOR = (Parcelable$Creator)new f(3);
    }
    
    public i(final boolean c, final boolean d, final String e, final boolean f, final float g, final int h, final boolean i, final boolean j, final boolean k) {
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
    
    public i(final boolean b, final boolean b2, final boolean b3, final float n, final boolean b4, final boolean b5, final boolean b6) {
        this(b, b2, null, b3, n, -1, b4, b5, b6);
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 2, 4);
        parcel.writeInt((int)(this.C ? 1 : 0));
        a.a.C(parcel, 3, 4);
        parcel.writeInt((int)(this.D ? 1 : 0));
        a.a.v(parcel, 4, this.E, false);
        a.a.C(parcel, 5, 4);
        parcel.writeInt((int)(this.F ? 1 : 0));
        a.a.C(parcel, 6, 4);
        parcel.writeFloat(this.G);
        a.a.C(parcel, 7, 4);
        parcel.writeInt(this.H);
        a.a.C(parcel, 8, 4);
        parcel.writeInt((int)(this.I ? 1 : 0));
        a.a.C(parcel, 9, 4);
        parcel.writeInt((int)(this.J ? 1 : 0));
        a.a.C(parcel, 10, 4);
        parcel.writeInt((int)(this.K ? 1 : 0));
        a.a.E(parcel, d);
    }
}
