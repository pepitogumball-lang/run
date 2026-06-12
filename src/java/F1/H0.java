package F1;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.internal.ads.F5;
import android.os.IBinder;
import B2.a;

public final class h0 extends a implements i0
{
    public h0(final IBinder binder) {
        super(binder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 1);
    }
    
    @Override
    public final boolean c() {
        final Parcel k4 = this.K4(this.P1(), 2);
        final ClassLoader a = F5.a;
        final boolean b = k4.readInt() != 0;
        k4.recycle();
        return b;
    }
    
    @Override
    public final void x3(final Q0 q0) {
        final Parcel p = this.P1();
        F5.c(p, (Parcelable)q0);
        this.m5(p, 1);
    }
}
