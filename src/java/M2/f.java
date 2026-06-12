package M2;

import android.os.Parcelable;
import android.os.Parcel;
import h2.v;
import e2.b;
import android.os.Parcelable$Creator;
import i2.a;

public final class f extends a
{
    public static final Parcelable$Creator<f> CREATOR;
    public final int C;
    public final b D;
    public final v E;
    
    static {
        CREATOR = (Parcelable$Creator)new B1.f(25);
    }
    
    public f(final int c, final b d, final v e) {
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.u(parcel, 2, (Parcelable)this.D, n, false);
        a.a.u(parcel, 3, (Parcelable)this.E, n, false);
        a.a.E(parcel, d);
    }
}
