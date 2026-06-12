package K2;

import t.j;
import java.util.Map;
import java.util.LinkedHashMap;
import com.google.android.gms.internal.measurement.N0;
import android.text.TextUtils;
import h2.A;
import com.google.android.gms.internal.ads.o1;

public final class i0 extends o1
{
    public final h0 I;
    
    public i0(final h0 i) {
        this.I = i;
        super(20);
    }
    
    public final Object b(final Object o) {
        final String s = (String)o;
        A.e(s);
        final h0 i = this.I;
        i.z();
        A.e(s);
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        Object o2 = null;
        boolean b = false;
        if (!empty) {
            final N0 n0 = (N0)((j)i.J).getOrDefault((Object)s, (Object)null);
            if (n0 != null) {
                if (n0.o() != 0) {
                    b = true;
                }
            }
        }
        if (!b) {
            return o2;
        }
        if (((j)i.J).containsKey((Object)s) && ((j)i.J).getOrDefault((Object)s, (Object)null) != null) {
            i.I(s, (N0)((j)i.J).getOrDefault((Object)s, (Object)null));
        }
        else {
            i.T(s);
        }
        final i0 l = i.L;
        synchronized (l) {
            final LinkedHashMap linkedHashMap = new LinkedHashMap((Map)l.H);
            monitorexit(l);
            o2 = linkedHashMap.get((Object)s);
            return o2;
        }
    }
}
