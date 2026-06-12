package M2;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import B1.f;
import android.content.Intent;
import android.os.Parcelable$Creator;
import f2.l;
import i2.a;

public final class b extends a implements l
{
    public static final Parcelable$Creator<b> CREATOR;
    public final int C;
    public final int D;
    public final Intent E;
    
    static {
        CREATOR = (Parcelable$Creator)new f(23);
    }
    
    public b(final int c, final int d, final Intent e) {
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public final Status c() {
        if (this.D == 0) {
            return Status.G;
        }
        return Status.K;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.C(parcel, 2, 4);
        parcel.writeInt(this.D);
        a.a.u(parcel, 3, (Parcelable)this.E, n, false);
        a.a.E(parcel, d);
    }
}
