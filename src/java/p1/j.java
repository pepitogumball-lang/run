package P1;

import android.os.BaseBundle;
import Y3.a;
import E1.o;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import android.os.Bundle;
import android.content.pm.PackageInfo;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

public final class j
{
    public final Context a;
    public final u b;
    public final long c;
    public final ScheduledExecutorService d;
    public final PackageInfo e;
    
    public j(final Context a, final long c, final PackageInfo e, final u b, final ScheduledExecutorService d) {
        this.a = a;
        this.c = c;
        this.e = e;
        this.b = b;
        this.d = d;
    }
    
    public static String a(final String s) {
        if (s == null) {
            return "";
        }
        final char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            charArray[i] ^= "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i % 555);
        }
        return new String(charArray);
    }
    
    public static final void c(final int n, final Bundle bundle) {
        if (!(boolean)q.d.c.a(D7.r7)) {
            return;
        }
        m0.a.n(o.B.j, bundle, a.c(n));
    }
    
    public static final void d(final int n, final Bundle bundle) {
        ((BaseBundle)bundle).putBoolean("sod_h", false);
        ((BaseBundle)bundle).putInt("cmr", n - 1);
    }
    
    public final boolean b() {
        return this.b.b().size() >= (int)q.d.c.a(D7.q7);
    }
}
