package n3;

public final class j0 extends L0
{
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    
    public j0(final String b, final int a, final String c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof L0) {
            final L0 l0 = (L0)o;
            if (this.a == ((j0)l0).a) {
                final j0 j0 = (j0)l0;
                if (this.b.equals((Object)j0.b) && this.c.equals((Object)j0.c) && this.d == j0.d) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        int n;
        if (this.d) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return (((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
