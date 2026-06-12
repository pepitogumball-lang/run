package E1;

import C.u;
import I1.M;
import java.util.Iterator;
import java.util.List;
import C2.b;
import I1.y;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;
import com.google.android.gms.internal.ads.Jc;
import java.util.Collections;
import com.google.android.gms.internal.ads.Yb;
import com.google.android.gms.internal.ads.Lc;
import android.content.Context;

public final class a
{
    public final Context a;
    public boolean b;
    public final Lc c;
    public final Yb d;
    
    public a(final Context a, final Lc c) {
        this.a = a;
        this.c = c;
        this.d = new Yb(Collections.emptyList(), false);
    }
    
    public final void a(final String s) {
        final Yb d = this.d;
        final Lc c = this.c;
        if ((c != null && ((Jc)c).g.H) || d.C) {
            String s2;
            if ((s2 = s) == null) {
                s2 = "";
            }
            if (c != null) {
                ((Jc)c).a(s2, (Map)null, 3);
                return;
            }
            if (d.C) {
                final List d2 = d.D;
                if (d2 != null) {
                    for (final String s3 : d2) {
                        if (!TextUtils.isEmpty((CharSequence)s3)) {
                            final String replace = s3.replace((CharSequence)"{NAVIGATION_URL}", (CharSequence)Uri.encode(s2));
                            final M c2 = o.B.c;
                            ((u)new y(this.a, "", replace, (b)null)).r();
                        }
                    }
                }
            }
        }
    }
    
    public final boolean b() {
        final Lc c = this.c;
        return ((c == null || !((Jc)c).g.H) && !this.d.C) || this.b;
    }
}
