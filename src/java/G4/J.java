package g4;

public final class j
{
    public final i a;
    public final i b;
    public final double c;
    
    public j(final i a, final i b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final j j = (j)o;
        return this.a == j.a && this.b == j.b && Double.compare(this.c, j.c) == 0;
    }
    
    @Override
    public final int hashCode() {
        return Double.hashCode(this.c) + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DataCollectionStatus(performance=");
        sb.append((Object)this.a);
        sb.append(", crashlytics=");
        sb.append((Object)this.b);
        sb.append(", sessionSamplingRate=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
