package n3;

import com.google.android.gms.internal.measurement.L;

public final class b0
{
    public Double a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public byte g;
    
    public final c0 a() {
        if (this.g != 31) {
            final StringBuilder sb = new StringBuilder();
            if ((this.g & 0x1) == 0x0) {
                sb.append(" batteryVelocity");
            }
            if ((this.g & 0x2) == 0x0) {
                sb.append(" proximityOn");
            }
            if ((this.g & 0x4) == 0x0) {
                sb.append(" orientation");
            }
            if ((this.g & 0x8) == 0x0) {
                sb.append(" ramUsed");
            }
            if ((this.g & 0x10) == 0x0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException(L.k("Missing required properties:", sb));
        }
        return new c0(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
