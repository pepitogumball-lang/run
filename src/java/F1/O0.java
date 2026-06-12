package F1;

import com.google.android.gms.internal.ads.F5;
import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;
import B2.a;

public final class o0 extends a implements q0
{
    public o0(final IBinder binder) {
        super(binder, "com.google.android.gms.ads.internal.client.IVideoController", 1);
    }
    
    @Override
    public final float b() {
        throw null;
    }
    
    @Override
    public final float c() {
        throw null;
    }
    
    @Override
    public final s0 e() {
        final Parcel k4 = this.K4(this.P1(), 11);
        final IBinder strongBinder = k4.readStrongBinder();
        s0 s0;
        if (strongBinder == null) {
            s0 = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            if (queryLocalInterface instanceof s0) {
                s0 = (s0)queryLocalInterface;
            }
            else {
                s0 = new r0(strongBinder);
            }
        }
        k4.recycle();
        return s0;
    }
    
    @Override
    public final float f() {
        throw null;
    }
    
    @Override
    public final void t1(final s0 s0) {
        final Parcel p = this.P1();
        F5.e(p, (IInterface)s0);
        this.m5(p, 8);
    }
}
