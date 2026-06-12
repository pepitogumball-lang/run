package K2;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import com.google.android.gms.internal.ads.rF;
import com.google.android.gms.internal.ads.UD;
import java.io.IOException;
import com.google.android.gms.internal.ads.oF;
import com.google.android.gms.internal.ads.jF;
import android.util.Pair;
import com.google.android.gms.internal.ads.AD;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.gms.internal.measurement.S;

public final class d1 implements Runnable
{
    public final int C;
    public final Object D = d;
    public final Object E = e;
    public final Object F = f;
    public final boolean G = g;
    public final Object H = h;
    public final Object I = i;
    
    public d1(final b1 h, final String d, final String e, final B1 f, final boolean g, final S i) {
        this.C = 0;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.I = i;
        this.H = h;
    }
    
    public d1(final b1 h, final AtomicReference i, final String d, final String e, final B1 f, final boolean g) {
        this.C = 1;
        this.I = i;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
    }
    
    public final void run() {
        switch (this.C) {
            default: {
                final UD ud = (UD)((AD)this.D).b.K;
                final Pair pair = (Pair)this.E;
                ud.d((int)pair.first, (rF)pair.second, (jF)this.F, (oF)this.I, (IOException)this.H, this.G);
                return;
            }
            case 1: {
                final AtomicReference atomicReference;
                monitorenter(atomicReference = (AtomicReference)this.I);
                try {
                    try {
                        final b1 b1 = (b1)this.H;
                        Label_0221: {
                            if (b1.F != null) {
                                break Label_0221;
                            }
                            b1.j().H.h("(legacy) Failed to get user properties; not connected to service", null, this.D, this.E);
                            ((AtomicReference)this.I).set((Object)Collections.emptyList());
                            try {
                                this.I.notify();
                                monitorexit(atomicReference);
                            }
                            finally {
                                monitorexit(atomicReference);
                            Label_0313:
                                while (true) {
                                    final H h;
                                    while (true) {
                                        ((AtomicReference)this.I).set((Object)h.b3((String)this.D, (String)this.E, this.G, (B1)this.F));
                                        break Label_0313;
                                        final RemoteException ex;
                                        ((b1)this.H).j().H.h("(legacy) Failed to get user properties; remote exception", null, this.D, ex);
                                        ((AtomicReference)this.I).set((Object)Collections.emptyList());
                                        this.I.notify();
                                        Label_0387: {
                                            break Label_0387;
                                            ((b1)this.H).N();
                                            this.I.notify();
                                        }
                                        monitorexit(atomicReference);
                                        return;
                                        iftrue(Label_0277:)(!TextUtils.isEmpty((CharSequence)null));
                                        continue;
                                    }
                                    Label_0277: {
                                        ((AtomicReference)this.I).set((Object)h.R1(null, (String)this.D, (String)this.E, this.G));
                                    }
                                    continue Label_0313;
                                }
                                this.I.notify();
                            }
                        }
                    }
                    finally {}
                }
                catch (final RemoteException ex2) {}
            }
            case 0: {
                final B1 b2 = (B1)this.F;
                final String s = (String)this.D;
                final S s2 = (S)this.I;
                final b1 b3 = (b1)this.H;
                Bundle bundle2;
                final Bundle bundle = bundle2 = new Bundle();
                Label_0532: {
                    try {
                        try {
                            final H f = b3.F;
                            final String s3 = (String)this.E;
                            if (f == null) {
                                bundle2 = bundle;
                                b3.j().H.e(s, s3, "Failed to get user properties; not connected to service");
                                b3.u().U(s2, bundle);
                                return;
                            }
                            break Label_0532;
                        }
                        finally {}
                    }
                    catch (final RemoteException ex3) {
                        b3.j().H.e(s, ex3, "Failed to get user properties; remote exception");
                        final Bundle bundle3;
                        b3.u().U(s2, bundle3);
                        final H f;
                        final String s3;
                        final Bundle h2 = J1.H(f.b3(s, s3, this.G, b2));
                        b3.N();
                        b3.u().U(s2, h2);
                    }
                }
                return;
                b3.u().U(s2, bundle2);
                break;
            }
        }
    }
}
