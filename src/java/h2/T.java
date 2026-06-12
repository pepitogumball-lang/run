package h2;

import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.api.Status;
import O2.j;
import com.google.android.gms.internal.auth.m;
import f2.k;

public final class t implements k
{
    public final m a;
    public final j b;
    public final h2.m c;
    
    public t(final m a, final j b, final h2.m c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Status status) {
        final boolean h = status.h();
        final j b = this.b;
        if (h) {
            b.b(this.c.f(this.a.b(TimeUnit.MILLISECONDS)));
            return;
        }
        b.a((Exception)A.m(status));
    }
}
