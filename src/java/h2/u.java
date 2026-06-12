package h2;

import android.os.Parcelable;
import android.os.Parcel;
import f2.p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import android.os.Parcelable$Creator;
import i2.a;

public final class u extends a
{
    public static final Parcelable$Creator<u> CREATOR;
    public final int C;
    public final Account D;
    public final int E;
    public final GoogleSignInAccount F;
    
    static {
        CREATOR = (Parcelable$Creator)new p(6);
    }
    
    public u(final int c, final Account d, final int e, final GoogleSignInAccount f) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d = a.a.D(parcel, 20293);
        a.a.C(parcel, 1, 4);
        parcel.writeInt(this.C);
        a.a.u(parcel, 2, (Parcelable)this.D, n, false);
        a.a.C(parcel, 3, 4);
        parcel.writeInt(this.E);
        a.a.u(parcel, 4, (Parcelable)this.F, n, false);
        a.a.E(parcel, d);
    }
}
