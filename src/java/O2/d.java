package o2;

import J5.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class d implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int v = b.V(parcel);
        String q = null;
        n2.b b;
        Object q2 = b = null;
        int l = 0;
        int i = 0;
        int k;
        int j = k = i;
        int l2;
        int m = l2 = k;
        while (parcel.dataPosition() < v) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    J5.b.S(parcel, int1);
                    continue;
                }
                case '\t': {
                    b = (n2.b)J5.b.p(parcel, int1, n2.b.CREATOR);
                    continue;
                }
                case '\b': {
                    q2 = J5.b.q(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    l2 = J5.b.L(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    q = J5.b.q(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    m = (J5.b.J(parcel, int1) ? 1 : 0);
                    continue;
                }
                case '\u0004': {
                    k = J5.b.L(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    j = (J5.b.J(parcel, int1) ? 1 : 0);
                    continue;
                }
                case '\u0002': {
                    i = J5.b.L(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    l = J5.b.L(parcel, int1);
                    continue;
                }
            }
        }
        J5.b.x(parcel, v);
        return new a(l, i, (boolean)(j != 0), k, (boolean)(m != 0), q, l2, (String)q2, b);
    }
}
