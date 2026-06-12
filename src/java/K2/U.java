package K2;

import android.os.BaseBundle;
import android.os.Parcel;
import java.util.Iterator;
import B1.f;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import i2.a;

public final class u extends a implements Iterable
{
    public static final Parcelable$Creator<u> CREATOR;
    public final Bundle C;
    
    static {
        CREATOR = (Parcelable$Creator)new f(17);
    }
    
    public u(final Bundle c) {
        this.C = c;
    }
    
    public final Double h() {
        return ((BaseBundle)this.C).getDouble("value");
    }
    
    public final Bundle i() {
        return new Bundle(this.C);
    }
    
    public final Iterator iterator() {
        return (Iterator)new t(this);
    }
    
    public final String p() {
        return ((BaseBundle)this.C).getString("currency");
    }
    
    public final String toString() {
        return this.C.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.q(parcel, 2, this.i());
        a.a.E(parcel, d);
    }
}
