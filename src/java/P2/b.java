package P2;

import android.os.Parcel;
import B1.f;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new f(26);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final c c = (c)this;
        parcel.writeParcelable((Parcelable)c.C, 0);
        parcel.writeInt((int)(c.D ? 1 : 0));
    }
}
