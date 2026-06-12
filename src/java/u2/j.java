package u2;

import android.os.Parcel;
import android.os.IInterface;
import B2.i;
import t2.b;
import B2.a;

public final class j extends a
{
    public final b r5(final b b, final String s, final int n, final b b2) {
        final Parcel p4 = this.P1();
        i.b(p4, (IInterface)b);
        p4.writeString(s);
        p4.writeInt(n);
        i.b(p4, (IInterface)b2);
        return m0.a.j(this.e0(p4, 2));
    }
    
    public final b s5(final b b, final String s, final int n, final b b2) {
        final Parcel p4 = this.P1();
        i.b(p4, (IInterface)b);
        p4.writeString(s);
        p4.writeInt(n);
        i.b(p4, (IInterface)b2);
        return m0.a.j(this.e0(p4, 3));
    }
}
