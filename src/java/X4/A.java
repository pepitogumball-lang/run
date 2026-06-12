package x4;

public final class a
{
    public final String a;
    public final String b;
    public final String c;
    
    public a(final String a, final String c) {
        this.a = a;
        this.b = null;
        this.c = c;
    }
    
    public a(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && a.class == o.getClass()) {
            final a a = (a)o;
            return this.a.equals((Object)a.a) && this.c.equals((Object)a.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.a);
        sb.append(", function: ");
        return x.a.b(sb, this.c, " )");
    }
}
