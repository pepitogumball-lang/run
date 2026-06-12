package g;

import android.os.Parcel;
import n5.h;
import f2.p;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class i implements Parcelable
{
    public static final Parcelable$Creator<i> CREATOR;
    public final IntentSender C;
    public final Intent D;
    public final int E;
    public final int F;
    
    static {
        CREATOR = (Parcelable$Creator)new p(3);
    }
    
    public i(final IntentSender c, final Intent d, final int e, final int f) {
        h.e("intentSender", (Object)c);
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        h.e("dest", (Object)parcel);
        parcel.writeParcelable((Parcelable)this.C, n);
        parcel.writeParcelable((Parcelable)this.D, n);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
    }
}
