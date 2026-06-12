package R0;

public final class k extends l
{
    public final f a;
    
    public k(final f a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && k.class == o.getClass() && this.a.equals(((k)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + k.class.getName().hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Success {mOutputData=");
        sb.append((Object)this.a);
        sb.append('}');
        return sb.toString();
    }
}
