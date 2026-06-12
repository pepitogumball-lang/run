package h2;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.internal.IAccountAccessor$Stub;
import f2.p;
import e2.b;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import i2.a;

public final class v extends a
{
    public static final Parcelable$Creator<v> CREATOR;
    public final int C;
    public final IBinder D;
    public final b E;
    public final boolean F;
    public final boolean G;
    
    static {
        CREATOR = (Parcelable$Creator)new p(7);
    }
    
    public v(final int c, final IBinder d, final b e, final boolean f, final boolean g) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
    }
    
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof v)) {
            return false;
        }
        final v v = (v)o;
        if (this.E.equals((Object)v.E)) {
            Object interface1 = null;
            final IBinder d = this.D;
            Object interface2;
            if (d == null) {
                interface2 = null;
            }
            else {
                interface2 = IAccountAccessor$Stub.asInterface(d);
            }
            final IBinder d2 = v.D;
            if (d2 != null) {
                interface1 = IAccountAccessor$Stub.asInterface(d2);
            }
            if (A.l(interface2, interface1)) {
                return true;
            }
        }
        return false;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.s(parcel, 2, this.D);
        a.a.u(parcel, 3, (Parcelable)this.E, n, false);
        a.a.C(parcel, 4, 4);
        parcel.writeInt((int)(this.F ? 1 : 0));
        a.a.C(parcel, 5, 4);
        parcel.writeInt((int)(this.G ? 1 : 0));
        a.a.E(parcel, d);
    }
}
