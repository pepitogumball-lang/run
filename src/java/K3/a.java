package k3;

import java.io.File;
import n3.B;

public final class a
{
    public final B a;
    public final String b;
    public final File c;
    
    public a(final B a, final String b, final File c) {
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            if (!this.a.equals(a.a) || !this.b.equals((Object)a.b) || !this.c.equals((Object)a.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CrashlyticsReportWithSessionId{report=");
        sb.append((Object)this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", reportFile=");
        sb.append((Object)this.c);
        sb.append("}");
        return sb.toString();
    }
}
