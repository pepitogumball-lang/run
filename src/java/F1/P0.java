package F1;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import y1.q;
import y1.l;
import d2.m;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import i2.a;

public final class p0 extends a
{
    public static final Parcelable$Creator<p0> CREATOR;
    public final int C;
    public final String D;
    public final String E;
    public p0 F;
    public IBinder G;
    
    static {
        CREATOR = (Parcelable$Creator)new X(3);
    }
    
    public p0(final int c, final String d, final String e, final p0 f, final IBinder g) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
    }
    
    public final m h() {
        final p0 f = this.F;
        m m = null;
        if (f != null) {
            m = new m(f.C, f.D, f.E, (m)null);
        }
        return new m(this.C, this.D, this.E, m);
    }
    
    public final l i() {
        final p0 f = this.F;
        q q = null;
        m m;
        if (f == null) {
            m = null;
        }
        else {
            m = new m(f.C, f.D, f.E, (m)null);
        }
        final IBinder g = this.G;
        n0 n0;
        if (g == null) {
            n0 = null;
        }
        else {
            final IInterface queryLocalInterface = g.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof n0) {
                n0 = (n0)queryLocalInterface;
            }
            else {
                n0 = new m0(g);
            }
        }
        if (n0 != null) {
            q = new q(n0);
        }
        return new l(this.C, this.D, this.E, m, q);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.v(parcel, 2, this.D, false);
        a.a.v(parcel, 3, this.E, false);
        a.a.u(parcel, 4, (Parcelable)this.F, n, false);
        a.a.s(parcel, 5, this.G);
        a.a.E(parcel, d);
    }
}
