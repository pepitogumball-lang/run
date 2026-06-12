package c2;

import android.os.Parcelable;
import android.os.IInterface;
import h2.d;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import x2.b;
import android.os.Parcel;
import f2.c;
import f2.l;
import com.google.android.gms.common.api.Status;
import g2.q;

public final class h extends i
{
    public final int p;
    
    @Override
    public final void N(final c c) {
        switch (this.p) {
            default: {
                final e e = (e)c;
                final m m = (m)((d)e).m();
                final f f = new f(2, this);
                final Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(m.E);
                final int a = b.a;
                obtain.writeStrongBinder(((IInterface)f).asBinder());
                final GoogleSignInOptions a2 = e.A;
                if (a2 == null) {
                    obtain.writeInt(0);
                }
                else {
                    obtain.writeInt(1);
                    ((Parcelable)a2).writeToParcel(obtain, 0);
                }
                m.T(obtain, 103);
                return;
            }
            case 0: {
                final e e2 = (e)c;
                final m i = (m)((d)e2).m();
                final f f2 = new f(1, this);
                final Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(i.E);
                final int a3 = b.a;
                obtain2.writeStrongBinder(((IInterface)f2).asBinder());
                final GoogleSignInOptions a4 = e2.A;
                if (a4 == null) {
                    obtain2.writeInt(0);
                }
                else {
                    obtain2.writeInt(1);
                    ((Parcelable)a4).writeToParcel(obtain2, 0);
                }
                i.T(obtain2, 102);
            }
        }
    }
}
