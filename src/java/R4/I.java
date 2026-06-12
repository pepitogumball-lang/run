package R4;

import android.os.BaseBundle;
import java.util.Objects;
import java.util.Iterator;
import F1.n0;
import java.util.HashMap;
import java.util.ArrayList;
import android.os.RemoteException;
import J1.j;
import y1.q;
import java.util.Map;
import java.util.List;

public final class i
{
    public final String a;
    public final String b;
    public final List c;
    public final f d;
    public final Map e;
    
    public i(final String a, final String b, final List c, final f d, final Map e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public i(final q q) {
        q.getClass();
        final n0 a = q.a;
        String e = null;
        Label_0037: {
            if (a != null) {
                try {
                    e = a.e();
                    break Label_0037;
                }
                catch (final RemoteException ex) {
                    j.g("Could not forward getResponseId to ResponseInfo.", (Throwable)ex);
                }
            }
            e = null;
        }
        this.a = e;
        String f = null;
        Label_0065: {
            if (a != null) {
                try {
                    f = a.f();
                    break Label_0065;
                }
                catch (final RemoteException ex2) {
                    j.g("Could not forward getMediationAdapterClassName to ResponseInfo.", (Throwable)ex2);
                }
            }
            f = null;
        }
        this.b = f;
        final ArrayList c = new ArrayList();
        final Iterator iterator = q.b.iterator();
        while (iterator.hasNext()) {
            c.add((Object)new f((y1.j)iterator.next()));
        }
        this.c = (List)c;
        final y1.j c2 = q.c;
        if (c2 != null) {
            this.d = new f(c2);
        }
        else {
            this.d = null;
        }
        final HashMap e2 = new HashMap();
        if (q.a() != null) {
            for (final String s : ((BaseBundle)q.a()).keySet()) {
                e2.put((Object)s, (Object)((BaseBundle)q.a()).getString(s));
            }
        }
        this.e = (Map)e2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        if (!Objects.equals((Object)this.a, (Object)i.a) || !Objects.equals((Object)this.b, (Object)i.b) || !Objects.equals((Object)this.c, (Object)i.c) || !Objects.equals((Object)this.d, (Object)i.d)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c, this.d });
    }
}
