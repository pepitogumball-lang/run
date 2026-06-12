package m1;

public final class r extends D
{
    public final q a;
    
    public r(final q a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof D && this.a.equals(((r)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ExternalPrivacyContext{prequest=");
        sb.append((Object)this.a);
        sb.append("}");
        return sb.toString();
    }
}
