package F1;

import com.google.android.gms.internal.ads.W8;
import com.google.android.gms.internal.ads.Y8;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.w8;
import com.google.android.gms.internal.ads.d9;
import android.os.Parcel;
import android.os.IInterface;
import com.google.android.gms.internal.ads.F5;
import android.os.IBinder;
import B2.a;

public final class z extends a implements A
{
    public z(final IBinder binder) {
        super(binder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 1);
    }
    
    @Override
    public final void L3(final u u) {
        final Parcel p = this.P1();
        F5.e(p, (IInterface)u);
        this.m5(p, 2);
    }
    
    @Override
    public final void Q0(final d9 d9) {
        final Parcel p = this.P1();
        F5.e(p, (IInterface)d9);
        this.m5(p, 10);
    }
    
    @Override
    public final void Y3(final w8 w8) {
        final Parcel p = this.P1();
        F5.c(p, (Parcelable)w8);
        this.m5(p, 6);
    }
    
    @Override
    public final y b() {
        final Parcel k4 = this.K4(this.P1(), 1);
        final IBinder strongBinder = k4.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof y) {
                o = queryLocalInterface;
            }
            else {
                o = new a(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 1);
            }
        }
        k4.recycle();
        return (y)o;
    }
    
    @Override
    public final void p4(final String s, final Y8 y8, final W8 w8) {
        final Parcel p3 = this.P1();
        p3.writeString(s);
        F5.e(p3, (IInterface)y8);
        F5.e(p3, (IInterface)w8);
        this.m5(p3, 5);
    }
}
