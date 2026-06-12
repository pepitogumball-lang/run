package c3;

import android.os.BaseBundle;
import U2.e;
import K2.C0;
import java.util.HashSet;
import com.google.android.gms.internal.measurement.K1;
import V4.G;
import f2.d;
import android.os.Bundle;
import K2.D0;

public final class b implements D0
{
    public final int a;
    public final Object b;
    
    public final void a(final long n, final Bundle bundle, final String s, String s2) {
        final Object b = this.b;
        switch (this.a) {
            default: {
                if (s != null && !((U2.a)c3.a.a).contains((Object)s2)) {
                    final Bundle bundle2 = new Bundle();
                    ((BaseBundle)bundle2).putString("name", s2);
                    ((BaseBundle)bundle2).putLong("timestampInMillis", n);
                    bundle2.putBundle("params", bundle);
                    ((d)((G)b).D).j(3, bundle2);
                }
                return;
            }
            case 0: {
                final K1 k1 = (K1)b;
                if (((HashSet)k1.D).contains((Object)s2)) {
                    final Bundle bundle3 = new Bundle();
                    final e a = c3.a.a;
                    final String c = C0.c(s2, C0.c, C0.a);
                    if (c != null) {
                        s2 = c;
                    }
                    ((BaseBundle)bundle3).putString("events", s2);
                    ((d)k1.E).j(2, bundle3);
                }
            }
        }
    }
}
