package u2;

import android.os.Parcel;
import android.os.IInterface;
import t2.b;
import B2.a;

public final class i extends a
{
    public final b r5(final b b, final String s, final int n) {
        final Parcel p3 = this.P1();
        B2.i.b(p3, (IInterface)b);
        p3.writeString(s);
        p3.writeInt(n);
        return m0.a.j(this.e0(p3, 2));
    }
    
    public final b s5(final b b, final String s, final int n) {
        final Parcel p3 = this.P1();
        B2.i.b(p3, (IInterface)b);
        p3.writeString(s);
        p3.writeInt(n);
        return m0.a.j(this.e0(p3, 4));
    }
    
    public final b t5(final b b, final String s, final int n, final b b2) {
        final Parcel p4 = this.P1();
        B2.i.b(p4, (IInterface)b);
        p4.writeString(s);
        p4.writeInt(n);
        B2.i.b(p4, (IInterface)b2);
        return m0.a.j(this.e0(p4, 8));
    }
}
