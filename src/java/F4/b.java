package f4;

import com.google.android.gms.internal.measurement.L;

public final class b
{
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public byte f;
    
    public final c a() {
        if (this.f == 1 && this.a != null && this.b != null && this.c != null && this.d != null) {
            return new c(this.a, this.b, this.c, this.d, this.e);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutId");
        }
        if (this.b == null) {
            sb.append(" variantId");
        }
        if (this.c == null) {
            sb.append(" parameterKey");
        }
        if (this.d == null) {
            sb.append(" parameterValue");
        }
        if ((0x1 & this.f) == 0x0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(L.k("Missing required properties:", sb));
    }
}
