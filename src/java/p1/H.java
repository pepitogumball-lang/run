package P1;

import B2.a;
import com.google.android.gms.internal.ads.ar;
import android.os.Parcel;
import java.util.Iterator;
import java.util.ArrayList;
import J1.j;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.Dq;
import C2.b;
import com.google.android.gms.internal.ads.Pb;
import android.net.Uri;
import java.util.List;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.internal.ads.Qb;
import com.google.android.gms.internal.ads.Cv;

public final class h implements Cv
{
    public final int C;
    public final Qb D;
    public final boolean E;
    public final zzau F;
    
    public final void o(final Object o) {
        final boolean e = this.E;
        final Qb d = this.D;
        final zzau f = this.F;
        switch (this.C) {
            default: {
                while (true) {
                    final List list = (List)o;
                Label_0258:
                    while (true) {
                        Uri uri = null;
                        ar n = null;
                        Label_0218: {
                            try {
                                final ArrayList i0 = zzau.i0;
                                final Iterator iterator = list.iterator();
                                while (iterator.hasNext()) {
                                    if (zzau.t5((Uri)iterator.next(), f.Y, f.Z)) {
                                        f.U.getAndIncrement();
                                        break;
                                    }
                                }
                                final Pb pb = (Pb)d;
                                final Parcel p = ((a)pb).P1();
                                p.writeTypedList(list);
                                ((a)pb).m5(p, 1);
                                if (f.P || e) {
                                    final Iterator iterator2 = list.iterator();
                                    while (iterator2.hasNext()) {
                                        uri = (Uri)iterator2.next();
                                        final boolean t5 = zzau.t5(uri, f.Y, f.Z);
                                        n = f.N;
                                        if (!t5) {
                                            break Label_0218;
                                        }
                                        n.b(zzau.v5(uri, f.X, "1").toString(), (b)null, (Dq)null);
                                    }
                                    break;
                                }
                                break;
                            }
                            catch (final RemoteException ex) {
                                break Label_0258;
                            }
                        }
                        if (q.d.c.a(D7.h7)) {
                            n.b(uri.toString(), (b)null, (Dq)null);
                            continue;
                        }
                        continue;
                    }
                    final RemoteException ex;
                    j.g("", (Throwable)ex);
                    break;
                }
                return;
            }
            case 0: {
                while (true) {
                    final ArrayList list2 = (ArrayList)o;
                Label_0425:
                    while (true) {
                        Uri uri2 = null;
                        ar n2 = null;
                        Label_0386: {
                            try {
                                final Pb pb2 = (Pb)d;
                                final Parcel p2 = ((a)pb2).P1();
                                p2.writeTypedList((List)list2);
                                ((a)pb2).m5(p2, 1);
                                if (f.O || e) {
                                    final Iterator iterator3 = list2.iterator();
                                    while (iterator3.hasNext()) {
                                        uri2 = (Uri)iterator3.next();
                                        final boolean t6 = zzau.t5(uri2, f.a0, f.b0);
                                        n2 = f.N;
                                        if (!t6) {
                                            break Label_0386;
                                        }
                                        n2.b(zzau.v5(uri2, f.X, "1").toString(), (b)null, (Dq)null);
                                    }
                                    break;
                                }
                                break;
                            }
                            catch (final RemoteException ex2) {
                                break Label_0425;
                            }
                        }
                        if (q.d.c.a(D7.h7)) {
                            n2.b(uri2.toString(), (b)null, (Dq)null);
                            continue;
                        }
                        continue;
                    }
                    final RemoteException ex2;
                    j.g("", (Throwable)ex2);
                    break;
                }
            }
        }
    }
    
    public final void v(final Throwable t) {
        switch (this.C) {
            default: {
                try {
                    final Qb d = this.D;
                    final String message = t.getMessage();
                    final StringBuilder sb = new StringBuilder("Internal error: ");
                    sb.append(message);
                    final String string = sb.toString();
                    final Pb pb = (Pb)d;
                    final Parcel p = ((a)pb).P1();
                    p.writeString(string);
                    ((a)pb).m5(p, 2);
                }
                catch (final RemoteException ex) {
                    j.g("", (Throwable)ex);
                }
                return;
            }
            case 0: {
                try {
                    final Qb d2 = this.D;
                    final String message2 = t.getMessage();
                    final StringBuilder sb2 = new StringBuilder("Internal error: ");
                    sb2.append(message2);
                    final String string2 = sb2.toString();
                    final Pb pb2 = (Pb)d2;
                    final Parcel p2 = ((a)pb2).P1();
                    p2.writeString(string2);
                    ((a)pb2).m5(p2, 2);
                }
                catch (final RemoteException ex2) {
                    j.g("", (Throwable)ex2);
                }
            }
        }
    }
}
