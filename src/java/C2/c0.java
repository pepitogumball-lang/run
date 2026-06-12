package C2;

import com.google.android.gms.internal.measurement.K1;
import android.app.Application;

public final class c0 implements W
{
    public final int C;
    public final b D;
    public final V E;
    
    @Override
    public final Object a() {
        switch (this.C) {
            default: {
                return this.b();
            }
            case 0: {
                return new b0((Application)this.D.D, (e)this.E.a());
            }
        }
    }
    
    public K1 b() {
        return new K1((Object)this.D.D, 2, (Object)this.E.a());
    }
}
