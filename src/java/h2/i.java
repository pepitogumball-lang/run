package h2;

import android.os.Parcelable;
import android.os.Parcel;
import f2.p;
import e2.d;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import i2.a;

public final class I extends a
{
    public static final Parcelable$Creator<I> CREATOR;
    public Bundle C;
    public d[] D;
    public int E;
    public e F;
    
    static {
        CREATOR = (Parcelable$Creator)new p(10);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.q(parcel, 1, this.C);
        a.a.y(parcel, 2, (Parcelable[])this.D, n);
        a.a.C(parcel, 3, 4);
        parcel.writeInt(this.E);
        a.a.u(parcel, 4, (Parcelable)this.F, n, false);
        a.a.E(parcel, d);
    }
}
