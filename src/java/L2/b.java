package l2;

import android.os.Parcelable;
import android.os.Parcel;
import f2.p;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import i2.a;

public final class b extends a
{
    public static final Parcelable$Creator<b> CREATOR;
    public final PendingIntent C;
    
    static {
        CREATOR = (Parcelable$Creator)new p(14);
    }
    
    public b(final PendingIntent c) {
        this.C = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.u(parcel, 1, (Parcelable)this.C, n, false);
        a.a.E(parcel, d);
    }
}
