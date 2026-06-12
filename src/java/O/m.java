package o;

import android.os.Parcel;
import f2.p;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public final class M extends View$BaseSavedState
{
    public static final Parcelable$Creator<M> CREATOR;
    public boolean C;
    
    static {
        CREATOR = (Parcelable$Creator)new p(20);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeByte((byte)(byte)(this.C ? 1 : 0));
    }
}
