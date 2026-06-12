package t0;

import android.os.Parcel;
import V.b;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import V.c;

public final class y extends c
{
    public static final Parcelable$Creator<y> CREATOR;
    public Parcelable E;
    
    static {
        CREATOR = (Parcelable$Creator)new b(3);
    }
    
    public y(final Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = r.class.getClassLoader();
        }
        this.E = parcel.readParcelable(classLoader);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeParcelable(this.E, 0);
    }
}
