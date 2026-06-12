package h4;

import n5.h;

public final class e
{
    public final String a;
    
    public e(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof e && h.a((Object)this.a, (Object)((e)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
