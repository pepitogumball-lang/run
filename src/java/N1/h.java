package n1;

import com.google.android.gms.internal.measurement.L;
import java.util.HashMap;

public final class h
{
    public String a;
    public Integer b;
    public l c;
    public Long d;
    public Long e;
    public HashMap f;
    public Integer g;
    public String h;
    public byte[] i;
    public byte[] j;
    
    public final void a(final String s, final String s2) {
        final HashMap f = this.f;
        if (f != null) {
            f.put((Object)s, (Object)s2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
    
    public final i b() {
        String s;
        if (this.a == null) {
            s = " transportName";
        }
        else {
            s = "";
        }
        String concat = s;
        if (this.c == null) {
            concat = s.concat(" encodedPayload");
        }
        String i = concat;
        if (this.d == null) {
            i = L.i(concat, " eventMillis");
        }
        String j = i;
        if (this.e == null) {
            j = L.i(i, " uptimeMillis");
        }
        String k = j;
        if (this.f == null) {
            k = L.i(j, " autoMetadata");
        }
        if (k.isEmpty()) {
            return new i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(k));
    }
}
