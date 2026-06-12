package R4;

import android.os.BaseBundle;
import java.util.Objects;
import java.util.Iterator;
import y1.g;
import android.os.Bundle;
import J1.j;
import android.text.TextUtils;
import java.util.Map$Entry;
import F1.u0;
import C.u;
import z1.b;
import java.util.List;
import java.util.Map;

public final class m extends r
{
    public final Map j;
    public final Map k;
    public final String l;
    
    public m(final List list, final String s, final Map j, final Map k, final Boolean b, final List list2, final Integer n, final String l, final String s2, final Map map, final String s3, final List list3) {
        super(list, s, b, list2, n, s2, map, s3, list3);
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final b c() {
        final u u = new u(4);
        this.b(u);
        final u0 u2 = (u0)u.C;
        final Map j = this.j;
        if (j != null) {
            for (final Map$Entry map$Entry : j.entrySet()) {
                final String s = (String)map$Entry.getKey();
                final String s2 = (String)map$Entry.getValue();
                if (!TextUtils.isEmpty((CharSequence)s2) && s2.contains((CharSequence)",")) {
                    final StringBuilder sb = new StringBuilder("Value ");
                    sb.append(s2);
                    sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                    J1.j.i(sb.toString());
                }
                ((BaseBundle)u2.h).putString(s, s2);
            }
        }
        final Map k = this.k;
        if (k != null) {
            for (final Map$Entry map$Entry2 : k.entrySet()) {
                final String s3 = (String)map$Entry2.getKey();
                final List list = (List)map$Entry2.getValue();
                if (list != null) {
                    for (final String s4 : list) {
                        if (!TextUtils.isEmpty((CharSequence)s4) && s4.contains((CharSequence)",")) {
                            final StringBuilder sb2 = new StringBuilder("Value ");
                            sb2.append(s4);
                            sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                            J1.j.i(sb2.toString());
                        }
                    }
                    ((BaseBundle)u2.h).putString(s3, TextUtils.join((CharSequence)",", (Iterable)list));
                }
            }
        }
        final String l = this.l;
        if (l != null) {
            u2.k = l;
        }
        return (b)new g(u);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final m m = (m)o;
        if (!super.equals(o) || !Objects.equals((Object)this.j, (Object)m.j) || !Objects.equals((Object)this.k, (Object)m.k)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { super.hashCode(), this.j, this.k });
    }
}
