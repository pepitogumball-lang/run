package e3;

public final class o
{
    public final Class a;
    public final Class b;
    
    public o(final Class a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    public static o a(final Class clazz) {
        return new o(n.class, clazz);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && o.class == o.getClass()) {
            final o o2 = (o)o;
            return this.b.equals(o2.b) && this.a.equals(o2.a);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final Class b = this.b;
        final Class a = this.a;
        if (a == n.class) {
            return b.getName();
        }
        final StringBuilder sb = new StringBuilder("@");
        sb.append(a.getName());
        sb.append(" ");
        sb.append(b.getName());
        return sb.toString();
    }
}
