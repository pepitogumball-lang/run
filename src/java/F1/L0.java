package F1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.IInterface;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.zzbok;
import t2.b;
import B2.a;

public final class l0 extends a
{
    public final k0 r5(final b b, final zzbok zzbok) {
        final Parcel p2 = this.P1();
        F5.e(p2, (IInterface)b);
        F5.e(p2, (IInterface)zzbok);
        p2.writeInt(250930000);
        final Parcel k4 = this.K4(p2, 1);
        final IBinder strongBinder = k4.readStrongBinder();
        k0 k5;
        if (strongBinder == null) {
            k5 = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof k0) {
                k5 = (k0)queryLocalInterface;
            }
            else {
                k5 = new j0(strongBinder);
            }
        }
        k4.recycle();
        return k5;
    }
}
