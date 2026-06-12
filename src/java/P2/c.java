package P2;

import com.google.android.gms.internal.measurement.L;
import android.app.PendingIntent;

public final class c extends b
{
    public final PendingIntent C;
    public final boolean D;
    
    public c(final PendingIntent c, final boolean d) {
        if (c != null) {
            this.C = c;
            this.D = d;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof b) {
            final b b = (b)o;
            if (this.C.equals((Object)((c)b).C) && this.D == ((c)b).D) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.C.hashCode();
        int n;
        if (!this.D) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder l = L.l("ReviewInfo{pendingIntent=", this.C.toString(), ", isNoOp=");
        l.append(this.D);
        l.append("}");
        return l.toString();
    }
}
