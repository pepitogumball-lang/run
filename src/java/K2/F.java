package K2;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import i2.a;

public final class f extends a
{
    public static final Parcelable$Creator<f> CREATOR;
    public final Bundle C;
    
    static {
        CREATOR = (Parcelable$Creator)new B1.f(16);
    }
    
    public f(final Bundle c) {
        this.C = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.q(parcel, 1, this.C);
        a.a.E(parcel, d);
    }
}
