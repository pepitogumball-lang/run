package J1;

public final class h
{
    public final int a;
    public final int b;
    public final boolean c;
    
    public h(final int a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof h) {
            final h h = (h)o;
            if (this.a == h.a && this.b == h.b && this.c == h.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.c) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return n ^ ((this.a ^ 0xF4243) * 1000003 ^ this.b) * 1000003;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("OfflineAdConfig{impressionPrerequisite=");
        sb.append(this.a);
        sb.append(", clickPrerequisite=");
        sb.append(this.b);
        sb.append(", notificationFlowEnabled=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
