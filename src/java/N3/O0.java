package n3;

public final class o0
{
    public final String a;
    public final String b;
    public final boolean c;
    
    public o0(final String a, final String b, final boolean c) {
        if (a == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null osCodeName");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o0) {
            final o0 o2 = (o0)o;
            if (!this.a.equals((Object)o2.a) || !this.b.equals((Object)o2.b) || this.c != o2.c) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int n;
        if (this.c) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.a);
        sb.append(", osCodeName=");
        sb.append(this.b);
        sb.append(", isRooted=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
