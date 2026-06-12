package b2;

import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collection;
import h2.A;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.HashMap;
import android.accounts.Account;
import java.util.HashSet;

public final class b
{
    public final HashSet a;
    public boolean b;
    public boolean c;
    public boolean d;
    public String e;
    public final Account f;
    public String g;
    public final HashMap h;
    public String i;
    
    public b() {
        this.a = new HashSet();
        this.h = new HashMap();
    }
    
    public b(final GoogleSignInOptions googleSignInOptions) {
        this.a = new HashSet();
        this.h = new HashMap();
        A.h((Object)googleSignInOptions);
        this.a = new HashSet((Collection)googleSignInOptions.D);
        this.b = googleSignInOptions.G;
        this.c = googleSignInOptions.H;
        this.d = googleSignInOptions.F;
        this.e = googleSignInOptions.I;
        this.f = googleSignInOptions.E;
        this.g = googleSignInOptions.J;
        this.h = GoogleSignInOptions.i(googleSignInOptions.K);
        this.i = googleSignInOptions.L;
    }
    
    public final GoogleSignInOptions a() {
        final Scope r = GoogleSignInOptions.R;
        final HashSet a = this.a;
        if (a.contains((Object)r)) {
            final Scope q = GoogleSignInOptions.Q;
            if (a.contains((Object)q)) {
                a.remove((Object)q);
            }
        }
        if (this.d && (this.f == null || !a.isEmpty())) {
            this.a.add((Object)GoogleSignInOptions.P);
        }
        return new GoogleSignInOptions(3, new ArrayList((Collection)a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
    }
}
