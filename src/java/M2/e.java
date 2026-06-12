package M2;

import java.util.List;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import B1.f;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import f2.l;
import i2.a;

public final class e extends a implements l
{
    public static final Parcelable$Creator<e> CREATOR;
    public final ArrayList C;
    public final String D;
    
    static {
        CREATOR = (Parcelable$Creator)new f(24);
    }
    
    public e(final String d, final ArrayList c) {
        this.C = c;
        this.D = d;
    }
    
    public final Status c() {
        if (this.D != null) {
            return Status.G;
        }
        return Status.K;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.x(parcel, 1, (List)this.C);
        a.a.v(parcel, 2, this.D, false);
        a.a.E(parcel, d);
    }
}
