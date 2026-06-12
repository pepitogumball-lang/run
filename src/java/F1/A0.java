package F1;

import android.os.Parcel;
import B2.a;

public final class a0 extends a implements b0
{
    @Override
    public final String b() {
        final Parcel k4 = this.K4(this.P1(), 1);
        final String string = k4.readString();
        k4.recycle();
        return string;
    }
    
    @Override
    public final String c() {
        final Parcel k4 = this.K4(this.P1(), 2);
        final String string = k4.readString();
        k4.recycle();
        return string;
    }
}
