package d2;

import android.os.Parcelable;
import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;

public final class a extends i2.a
{
    public static final Parcelable$Creator<a> CREATOR;
    public final Intent C;
    
    static {
        CREATOR = (Parcelable$Creator)new c(0);
    }
    
    public a(final Intent c) {
        this.C = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.u(parcel, 1, (Parcelable)this.C, n, false);
        a.a.E(parcel, d);
    }
}
