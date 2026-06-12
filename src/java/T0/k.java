package t0;

import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class k implements Parcelable
{
    public static final Parcelable$Creator<k> CREATOR;
    public int C;
    public int D;
    public boolean E;
    
    static {
        CREATOR = (Parcelable$Creator)new p(25);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt((int)(this.E ? 1 : 0));
    }
}
