package h2;

import android.os.Parcel;
import B2.i;
import B2.a;

public final class y extends a implements z
{
    public final boolean f() {
        final Parcel e0 = this.e0(this.P1(), 7);
        final int a = i.a;
        final boolean b = e0.readInt() != 0;
        e0.recycle();
        return b;
    }
}
