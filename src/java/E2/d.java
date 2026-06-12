package e2;

import android.os.Parcel;
import h1.m;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import i2.a;

public final class d extends a
{
    public static final Parcelable$Creator<d> CREATOR;
    public final String C;
    public final int D;
    public final long E;
    
    static {
        CREATOR = (Parcelable$Creator)new U1.d(28);
    }
    
    public d(final long e, final String c, final int d) {
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public d(final String c, final long e) {
        this.C = c;
        this.E = e;
        this.D = -1;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof d) {
            final d d = (d)o;
            final String c = this.C;
            if (((c != null && c.equals((Object)d.C)) || (c == null && d.C == null)) && this.h() == d.h()) {
                return true;
            }
        }
        return false;
    }
    
    public final long h() {
        final long e = this.E;
        if (e == -1L) {
            return this.D;
        }
        return e;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C, this.h() });
    }
    
    public final String toString() {
        final m m = new m((Object)this);
        m.h("name", (Object)this.C);
        m.h("version", (Object)this.h());
        return m.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.v(parcel, 1, this.C, false);
        a.a.C(parcel, 2, 4);
        parcel.writeInt(this.D);
        final long h = this.h();
        a.a.C(parcel, 3, 8);
        parcel.writeLong(h);
        a.a.E(parcel, d);
    }
}
