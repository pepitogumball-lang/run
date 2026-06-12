package F1;

import android.os.Parcel;
import android.os.IInterface;
import com.google.android.gms.internal.ads.F5;
import t2.b;
import android.os.IBinder;
import B2.a;

public final class j0 extends a implements k0
{
    public j0(final IBinder binder) {
        super(binder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 1);
    }
    
    @Override
    public final void z3(final String s, final b b, final b b2) {
        final Parcel p3 = this.P1();
        p3.writeString(s);
        F5.e(p3, (IInterface)b);
        F5.e(p3, (IInterface)b2);
        this.m5(p3, 1);
    }
}
