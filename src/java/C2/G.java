package c2;

import android.os.Parcelable;
import android.os.IInterface;
import h2.d;
import x2.b;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import b2.c;
import f2.l;
import com.google.android.gms.common.api.Status;
import g2.q;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.content.Context;

public final class g extends i
{
    public final Context p;
    public final GoogleSignInOptions q;
    
    public g(final q q, final Context p3, final GoogleSignInOptions q2) {
        this.p = p3;
        this.q = q2;
        super(q);
    }
    
    @Override
    public final void N(final f2.c c) {
        final m m = (m)((d)c).m();
        final f f = new f(0, this);
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(m.E);
        final int a = b.a;
        obtain.writeStrongBinder(((IInterface)f).asBinder());
        final GoogleSignInOptions q = this.q;
        if (q == null) {
            obtain.writeInt(0);
        }
        else {
            obtain.writeInt(1);
            ((Parcelable)q).writeToParcel(obtain, 0);
        }
        m.T(obtain, 101);
    }
}
