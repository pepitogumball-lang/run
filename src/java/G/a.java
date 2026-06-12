package g;

import android.os.Parcel;
import f2.p;
import android.content.Intent;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int C;
    public final Intent D;
    
    static {
        CREATOR = (Parcelable$Creator)new p(2);
    }
    
    public a(final Intent d, final int c) {
        this.C = c;
        this.D = d;
    }
    
    public a(final Parcel parcel) {
        this.C = parcel.readInt();
        Intent d;
        if (parcel.readInt() == 0) {
            d = null;
        }
        else {
            d = (Intent)Intent.CREATOR.createFromParcel(parcel);
        }
        this.D = d;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        final int c = this.C;
        String value;
        if (c != -1) {
            if (c != 0) {
                value = String.valueOf(c);
            }
            else {
                value = "RESULT_CANCELED";
            }
        }
        else {
            value = "RESULT_OK";
        }
        sb.append(value);
        sb.append(", data=");
        sb.append((Object)this.D);
        sb.append('}');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.C);
        final Intent d = this.D;
        int n2;
        if (d == null) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        parcel.writeInt(n2);
        if (d != null) {
            d.writeToParcel(parcel, n);
        }
    }
}
