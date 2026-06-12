package Z1;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import h2.A;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import i2.a;

public final class d extends a
{
    public static final Parcelable$Creator<d> CREATOR;
    public final PendingIntent C;
    
    static {
        CREATOR = (Parcelable$Creator)new U1.d(14);
    }
    
    public d(final PendingIntent c) {
        A.h((Object)c);
        this.C = c;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof d && A.l((Object)this.C, (Object)((d)o).C);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.u(parcel, 1, (Parcelable)this.C, n, false);
        a.a.E(parcel, d);
    }
}
