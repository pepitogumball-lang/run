package a4;

public final class a
{
    public final String a;
    public final String b;
    
    public a(final String a, final String b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null version");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            if (!this.a.equals((Object)a.a) || !this.b.equals((Object)a.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return x.a.b(sb, this.b, "}");
    }
}
