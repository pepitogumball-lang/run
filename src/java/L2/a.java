package l2;

import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;

public final class a extends i2.a
{
    public static final Parcelable$Creator<a> CREATOR;
    public final boolean C;
    public final int D;
    
    static {
        CREATOR = (Parcelable$Creator)new p(13);
    }
    
    public a(final int d, final boolean c) {
        this.C = c;
        this.D = d;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt((int)(this.C ? 1 : 0));
        a.a.C(parcel, 2, 4);
        parcel.writeInt(this.D);
        a.a.E(parcel, d);
    }
}
