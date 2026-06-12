package n3;

import com.google.android.gms.internal.measurement.L;

public final class i0
{
    public int a;
    public String b;
    public String c;
    public boolean d;
    public byte e;
    
    public final j0 a() {
        if (this.e == 3) {
            final String b = this.b;
            if (b != null) {
                final String c = this.c;
                if (c != null) {
                    return new j0(b, this.a, c, this.d);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.e & 0x1) == 0x0) {
            sb.append(" platform");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        if (this.c == null) {
            sb.append(" buildVersion");
        }
        if ((this.e & 0x2) == 0x0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(L.k("Missing required properties:", sb));
    }
}
