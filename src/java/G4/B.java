package g4;

import com.google.android.gms.internal.measurement.L;
import n5.h;

public final class b
{
    public final String a;
    public final String b;
    public final String c;
    public final a d;
    
    public b(final String a, final String b, final String c, final a d) {
        h.e("appId", (Object)a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return h.a((Object)this.a, (Object)b.a) && this.b.equals(b.b) && this.c.equals(b.c) && this.d.equals(b.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + (s.D.hashCode() + L.g(((this.b.hashCode() + this.a.hashCode() * 31) * 31 + 47594045) * 31, this.c, 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ApplicationInfo(appId=");
        sb.append(this.a);
        sb.append(", deviceModel=");
        sb.append(this.b);
        sb.append(", sessionSdkVersion=2.0.7, osVersion=");
        sb.append(this.c);
        sb.append(", logEnvironment=");
        sb.append((Object)s.D);
        sb.append(", androidAppInfo=");
        sb.append((Object)this.d);
        sb.append(')');
        return sb.toString();
    }
}
