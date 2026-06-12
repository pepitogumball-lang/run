package F1;

import android.os.Parcelable;
import com.google.android.gms.internal.ads.F5;
import android.os.Parcel;
import android.os.IBinder;
import B2.a;

public final class t extends a implements u
{
    public t(final IBinder binder) {
        super(binder, "com.google.android.gms.ads.internal.client.IAdListener", 1);
    }
    
    @Override
    public final void C(final int n) {
        final Parcel p = this.P1();
        p.writeInt(n);
        this.m5(p, 2);
    }
    
    @Override
    public final void e() {
        this.m5(this.P1(), 4);
    }
    
    @Override
    public final void f() {
        this.m5(this.P1(), 7);
    }
    
    @Override
    public final void h() {
        this.m5(this.P1(), 1);
    }
    
    @Override
    public final void i() {
        this.m5(this.P1(), 3);
    }
    
    @Override
    public final void j() {
        this.m5(this.P1(), 5);
    }
    
    @Override
    public final void k() {
        this.m5(this.P1(), 9);
    }
    
    @Override
    public final void r() {
        this.m5(this.P1(), 6);
    }
    
    @Override
    public final void t(final p0 p) {
        final Parcel p2 = this.P1();
        F5.c(p2, (Parcelable)p);
        this.m5(p2, 8);
    }
}
