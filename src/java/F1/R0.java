package F1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.F5;
import android.os.IBinder;
import B2.a;

public final class r0 extends a implements s0
{
    public r0(final IBinder binder) {
        super(binder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks", 1);
    }
    
    @Override
    public final void b() {
        this.m5(this.P1(), 4);
    }
    
    @Override
    public final void e() {
        this.m5(this.P1(), 1);
    }
    
    @Override
    public final void f() {
        this.m5(this.P1(), 3);
    }
    
    @Override
    public final void i() {
        this.m5(this.P1(), 2);
    }
    
    @Override
    public final void t3(final boolean b) {
        final Parcel p = this.P1();
        final ClassLoader a = F5.a;
        p.writeInt((int)(b ? 1 : 0));
        this.m5(p, 5);
    }
}
