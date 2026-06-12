package K2;

import android.os.Parcelable;
import android.os.Parcel;
import h2.A;
import B1.f;
import android.os.Parcelable$Creator;
import i2.a;

public final class v extends a
{
    public static final Parcelable$Creator<v> CREATOR;
    public final String C;
    public final u D;
    public final String E;
    public final long F;
    
    static {
        CREATOR = (Parcelable$Creator)new f(18);
    }
    
    public v(final v v, final long f) {
        A.h((Object)v);
        this.C = v.C;
        this.D = v.D;
        this.E = v.E;
        this.F = f;
    }
    
    public v(final String c, final u d, final String e, final long f) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
    }
    
    public final String toString() {
        final String value = String.valueOf((Object)this.D);
        final StringBuilder sb = new StringBuilder("origin=");
        sb.append(this.E);
        sb.append(",name=");
        sb.append(this.C);
        sb.append(",params=");
        sb.append(value);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.v(parcel, 2, this.C, false);
        a.a.u(parcel, 3, (Parcelable)this.D, n, false);
        a.a.v(parcel, 4, this.E, false);
        a.a.C(parcel, 5, 8);
        parcel.writeLong(this.F);
        a.a.E(parcel, d);
    }
}
