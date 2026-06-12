package b2;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import f2.l;

public final class c implements l
{
    public final Status C;
    public final GoogleSignInAccount D;
    
    public c(final GoogleSignInAccount d, final Status c) {
        this.D = d;
        this.C = c;
    }
    
    public final Status c() {
        return this.C;
    }
}
