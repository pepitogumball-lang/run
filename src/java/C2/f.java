package c2;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import b2.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import f2.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.auth.api.signin.internal.zba;

public final class f extends zba
{
    public final int C;
    public final i D;
    
    public f(final int c, final i d) {
        this.C = c;
        this.D = d;
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }
    
    public void X4(final Status status) {
        switch (this.C) {
            default: {
                super.X4(status);
                return;
            }
            case 2: {
                this.D.K((l)status);
            }
        }
    }
    
    public void d1(final Status status) {
        switch (this.C) {
            default: {
                super.d1(status);
                return;
            }
            case 1: {
                this.D.K((l)status);
            }
        }
    }
    
    public void f5(final GoogleSignInAccount e, final Status status) {
        switch (this.C) {
            default: {
                super.f5(e, status);
                return;
            }
            case 0: {
                final g g = (g)this.D;
                if (e != null) {
                    final k f = k.F(g.p);
                    final GoogleSignInOptions q = g.q;
                    synchronized (f) {
                        ((b)f.D).d(e, q);
                        f.E = e;
                        f.F = q;
                    }
                }
                g.K((l)new c(e, status));
            }
        }
    }
}
