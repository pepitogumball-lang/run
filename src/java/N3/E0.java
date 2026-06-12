package n3;

import com.google.android.gms.internal.measurement.L;

public final class e0
{
    public g0 a;
    public String b;
    public String c;
    public long d;
    public byte e;
    
    public final f0 a() {
        if (this.e == 1) {
            final g0 a = this.a;
            if (a != null) {
                final String b = this.b;
                if (b != null) {
                    final String c = this.c;
                    if (c != null) {
                        return new f0(a, b, c, this.d);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((0x1 & this.e) == 0x0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(L.k("Missing required properties:", sb));
    }
}
