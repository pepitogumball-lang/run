package h2;

import android.os.Parcelable;
import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;
import i2.a;

public final class e extends a
{
    public static final Parcelable$Creator<e> CREATOR;
    public final o C;
    public final boolean D;
    public final boolean E;
    public final int[] F;
    public final int G;
    public final int[] H;
    
    static {
        CREATOR = (Parcelable$Creator)new p(11);
    }
    
    public e(final o c, final boolean d, final boolean e, final int[] f, final int g, final int[] h) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
    }
    
    public final void writeToParcel(final Parcel parcel, int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.u(parcel, 1, (Parcelable)this.C, n, false);
        a.a.C(parcel, 2, 4);
        parcel.writeInt((int)(this.D ? 1 : 0));
        a.a.C(parcel, 3, 4);
        parcel.writeInt((int)(this.E ? 1 : 0));
        final int[] f = this.F;
        if (f != null) {
            n = a.a.D(parcel, 4);
            parcel.writeIntArray(f);
            a.a.E(parcel, n);
        }
        a.a.C(parcel, 5, 4);
        parcel.writeInt(this.G);
        final int[] h = this.H;
        if (h != null) {
            n = a.a.D(parcel, 6);
            parcel.writeIntArray(h);
            a.a.E(parcel, n);
        }
        a.a.E(parcel, d);
    }
}
