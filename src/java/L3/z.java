package L3;

import android.os.BaseBundle;
import android.os.Parcel;
import java.util.Iterator;
import t.j;
import java.util.Map;
import B1.f;
import t.b;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import i2.a;

public final class z extends a
{
    public static final Parcelable$Creator<z> CREATOR;
    public final Bundle C;
    public b D;
    public y E;
    
    static {
        CREATOR = (Parcelable$Creator)new f(22);
    }
    
    public z(final Bundle c) {
        this.C = c;
    }
    
    public final Map h() {
        if (this.D == null) {
            final j d = new j();
            final Bundle c = this.C;
            for (final String s : ((BaseBundle)c).keySet()) {
                final Object value = ((BaseBundle)c).get(s);
                if (value instanceof String) {
                    final String s2 = (String)value;
                    if (s.startsWith("google.") || s.startsWith("gcm.") || s.equals((Object)"from") || s.equals((Object)"message_type") || s.equals((Object)"collapse_key")) {
                        continue;
                    }
                    d.put((Object)s, (Object)s2);
                }
            }
            this.D = (b)d;
        }
        return (Map)this.D;
    }
    
    public final String i() {
        final Bundle c = this.C;
        String s;
        if ((s = ((BaseBundle)c).getString("google.message_id")) == null) {
            s = ((BaseBundle)c).getString("message_id");
        }
        return s;
    }
    
    public final y p() {
        if (this.E == null) {
            final Bundle c = this.C;
            if (C2.b.x(c)) {
                this.E = new y(new C2.b(c));
            }
        }
        return this.E;
    }
    
    public final void writeToParcel(final Parcel parcel, int d) {
        d = a.a.D(parcel, 20293);
        a.a.q(parcel, 2, this.C);
        a.a.E(parcel, d);
    }
}
