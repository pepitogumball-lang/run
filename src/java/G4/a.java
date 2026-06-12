package g4;

import com.google.android.gms.internal.measurement.L;
import n5.h;
import java.util.ArrayList;

public final class a
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final t e;
    public final ArrayList f;
    
    public a(final String a, final String b, final String c, final String d, final t e, final ArrayList f) {
        h.e("versionName", (Object)b);
        h.e("appBuildVersion", (Object)c);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return this.a.equals(a.a) && h.a((Object)this.b, (Object)a.b) && h.a((Object)this.c, (Object)a.c) && this.d.equals(a.d) && this.e.equals(a.e) && this.f.equals(a.f);
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() + L.g(L.g(L.g(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb.append(this.a);
        sb.append(", versionName=");
        sb.append(this.b);
        sb.append(", appBuildVersion=");
        sb.append(this.c);
        sb.append(", deviceManufacturer=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append((Object)this.e);
        sb.append(", appProcessDetails=");
        sb.append((Object)this.f);
        sb.append(')');
        return sb.toString();
    }
}
