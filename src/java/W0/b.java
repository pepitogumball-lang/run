package w0;

import com.google.android.gms.internal.measurement.L;
import java.util.Collections;
import java.util.List;

public final class b
{
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    
    public b(final String a, final String b, final String c, final List list, final List list2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && b.class == o.getClass()) {
            final b b = (b)o;
            return this.a.equals((Object)b.a) && this.b.equals((Object)b.b) && this.c.equals((Object)b.c) && this.d.equals((Object)b.d) && this.e.equals((Object)b.e);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + L.g(L.g(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
        sb.append(this.a);
        sb.append("', onDelete='");
        sb.append(this.b);
        sb.append("', onUpdate='");
        sb.append(this.c);
        sb.append("', columnNames=");
        sb.append((Object)this.d);
        sb.append(", referenceColumnNames=");
        sb.append((Object)this.e);
        sb.append('}');
        return sb.toString();
    }
}
