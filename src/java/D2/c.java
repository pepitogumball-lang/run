package d2;

import android.content.Intent;
import J5.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class c implements Parcelable$Creator
{
    public final int a;
    
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.a) {
            default: {
                return new g(parcel.readStrongBinder());
            }
            case 0: {
                final int v = b.V(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < v) {
                    final int int1 = parcel.readInt();
                    if ((char)int1 != '\u0001') {
                        b.S(parcel, int1);
                    }
                    else {
                        intent = (Intent)b.p(parcel, int1, Intent.CREATOR);
                    }
                }
                b.x(parcel, v);
                return new a(intent);
            }
        }
    }
}
