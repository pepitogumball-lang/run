package g4;

import n5.h;

public final class n
{
    public final String a;
    
    public n(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof n && h.a((Object)this.a, (Object)((n)o).a));
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FirebaseSessionsData(sessionId=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
