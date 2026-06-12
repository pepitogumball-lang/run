package q0;

import x.a;

public final class c
{
    public final long a;
    public final long b;
    public final int c;
    
    public c(final int c, final long a, final long b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        if (this.a != c.a || this.b != c.b || this.c != c.c) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) + Long.hashCode(this.a) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.a);
        sb.append(", ModelVersion=");
        sb.append(this.b);
        sb.append(", TopicCode=");
        return m0.a.f("Topic { ", x.a.a(sb, this.c, " }"));
    }
}
