package I1;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import com.google.android.gms.internal.ads.F5;
import t2.b;
import B2.a;

public final class w extends a implements x
{
    public final void zze(final b b) {
        final Parcel p = this.P1();
        F5.e(p, (IInterface)b);
        this.m5(p, 2);
    }
    
    public final boolean zzf(final b b, final String s, final String s2) {
        final Parcel p3 = this.P1();
        F5.e(p3, (IInterface)b);
        p3.writeString(s);
        p3.writeString(s2);
        boolean b2 = true;
        final Parcel k4 = this.K4(p3, 1);
        if (k4.readInt() == 0) {
            b2 = false;
        }
        k4.recycle();
        return b2;
    }
    
    public final boolean zzg(final b b, final G1.a a) {
        final Parcel p2 = this.P1();
        F5.e(p2, (IInterface)b);
        F5.c(p2, (Parcelable)a);
        final Parcel k4 = this.K4(p2, 3);
        final boolean b2 = k4.readInt() != 0;
        k4.recycle();
        return b2;
    }
}
