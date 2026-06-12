package a2;

import android.os.Parcelable;
import android.os.Parcel;
import U1.d;
import android.os.Bundle;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;

public final class a extends i2.a
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int C;
    public final PendingIntent D;
    public final int E;
    public final byte[] F;
    public final int G;
    public final Bundle H;
    
    static {
        CREATOR = (Parcelable$Creator)new d(15);
    }
    
    public a(final int g, final int c, final PendingIntent d, final int e, final Bundle h, final byte[] f) {
        this.G = g;
        this.C = c;
        this.E = e;
        this.H = h;
        this.F = f;
        this.D = d;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.u(parcel, 2, (Parcelable)this.D, n, false);
        a.a.C(parcel, 3, 4);
        parcel.writeInt(this.E);
        a.a.q(parcel, 4, this.H);
        a.a.r(parcel, 5, this.F, false);
        a.a.C(parcel, 1000, 4);
        parcel.writeInt(this.G);
        a.a.E(parcel, d);
    }
}
