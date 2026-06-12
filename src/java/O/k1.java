package o;

import android.os.Parcel;
import V.b;
import android.os.Parcelable$Creator;
import V.c;

public final class k1 extends c
{
    public static final Parcelable$Creator<k1> CREATOR;
    public int E;
    public boolean F;
    
    static {
        CREATOR = (Parcelable$Creator)new b(2);
    }
    
    public k1(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.E = parcel.readInt();
        this.F = (parcel.readInt() != 0);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.E);
        parcel.writeInt((int)(this.F ? 1 : 0));
    }
}
