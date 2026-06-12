package K2;

import android.os.Parcelable;
import android.os.Parcel;
import h2.A;
import B1.f;
import android.os.Parcelable$Creator;
import i2.a;

public final class c extends a
{
    public static final Parcelable$Creator<c> CREATOR;
    public String C;
    public String D;
    public G1 E;
    public long F;
    public boolean G;
    public String H;
    public final v I;
    public long J;
    public v K;
    public final long L;
    public final v M;
    
    static {
        CREATOR = (Parcelable$Creator)new f(15);
    }
    
    public c(final c c) {
        A.h((Object)c);
        this.C = c.C;
        this.D = c.D;
        this.E = c.E;
        this.F = c.F;
        this.G = c.G;
        this.H = c.H;
        this.I = c.I;
        this.J = c.J;
        this.K = c.K;
        this.L = c.L;
        this.M = c.M;
    }
    
    public c(final String c, final String d, final G1 e, final long f, final boolean g, final String h, final v i, final long j, final v k, final long l, final v m) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.v(parcel, 2, this.C, false);
        a.a.v(parcel, 3, this.D, false);
        a.a.u(parcel, 4, (Parcelable)this.E, n, false);
        final long f = this.F;
        a.a.C(parcel, 5, 8);
        parcel.writeLong(f);
        final int g = this.G ? 1 : 0;
        a.a.C(parcel, 6, 4);
        parcel.writeInt(g);
        a.a.v(parcel, 7, this.H, false);
        a.a.u(parcel, 8, (Parcelable)this.I, n, false);
        final long j = this.J;
        a.a.C(parcel, 9, 8);
        parcel.writeLong(j);
        a.a.u(parcel, 10, (Parcelable)this.K, n, false);
        a.a.C(parcel, 11, 8);
        parcel.writeLong(this.L);
        a.a.u(parcel, 12, (Parcelable)this.M, n, false);
        a.a.E(parcel, d);
    }
}
