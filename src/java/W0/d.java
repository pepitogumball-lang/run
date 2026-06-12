package w0;

import java.util.List;

public final class d
{
    public final String a;
    public final boolean b;
    public final List c;
    
    public d(final String a, final boolean b, final List c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || d.class != o.getClass()) {
            return false;
        }
        final d d = (d)o;
        if (this.b != d.b) {
            return false;
        }
        if (!this.c.equals((Object)d.c)) {
            return false;
        }
        final String a = this.a;
        final boolean startsWith = a.startsWith("index_");
        final String a2 = d.a;
        if (startsWith) {
            return a2.startsWith("index_");
        }
        return a.equals((Object)a2);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a.startsWith("index_")) {
            hashCode = -1184239155;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.c.hashCode() + (hashCode * 31 + (this.b ? 1 : 0)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Index{name='");
        sb.append(this.a);
        sb.append("', unique=");
        sb.append(this.b);
        sb.append(", columns=");
        sb.append((Object)this.c);
        sb.append('}');
        return sb.toString();
    }
}
