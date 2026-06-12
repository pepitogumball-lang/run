package c2;

import android.os.Parcel;
import U1.d;
import android.os.Bundle;
import android.os.Parcelable$Creator;

public final class a extends i2.a
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int C;
    public final int D;
    public final Bundle E;
    
    static {
        CREATOR = (Parcelable$Creator)new d(25);
    }
    
    public a(final int c, final int d, final Bundle e) {
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.C(parcel, 2, 4);
        parcel.writeInt(this.D);
        a.a.q(parcel, 3, this.E);
        a.a.E(parcel, d);
    }
}
