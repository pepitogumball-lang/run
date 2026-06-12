package b1;

import u0.l;
import androidx.work.impl.WorkDatabase;
import S0.d;
import java.util.UUID;
import S0.k;

public final class a extends c
{
    public final k D;
    public final UUID E;
    
    public a(final k d, final UUID e) {
        this.D = d;
        this.E = e;
    }
    
    @Override
    public final void b() {
        final k d = this.D;
        final WorkDatabase f = d.f;
        ((l)f).c();
        try {
            c.a(d, this.E.toString());
            ((l)f).h();
            ((l)f).f();
            S0.d.a(d.e, d.f, d.h);
        }
        finally {
            ((l)f).f();
        }
    }
}
