package K2;

import t.j;
import h2.A;

public final class b implements Runnable
{
    public final int C;
    public final String D;
    public final long E;
    public final p F;
    
    public final void run() {
        switch (this.C) {
            default: {
                final p f = this.F;
                f.v();
                final String d = this.D;
                A.e(d);
                final t.b e = f.E;
                final Integer n = (Integer)((j)e).getOrDefault((Object)d, (Object)null);
                if (n != null) {
                    final Y0 c = f.x().C(false);
                    final int n2 = n - 1;
                    if (n2 == 0) {
                        ((j)e).remove((Object)d);
                        final t.b d2 = f.D;
                        final Long n3 = (Long)((j)d2).getOrDefault((Object)d, (Object)null);
                        final long e2 = this.E;
                        if (n3 == null) {
                            f.j().H.f("First ad unit exposure time was never set");
                        }
                        else {
                            final long longValue = n3;
                            ((j)d2).remove((Object)d);
                            f.C(d, e2 - longValue, c);
                        }
                        if (((j)e).isEmpty()) {
                            final long f2 = f.F;
                            if (f2 == 0L) {
                                f.j().H.f("First ad exposure time was never set");
                            }
                            else {
                                f.A(e2 - f2, c);
                                f.F = 0L;
                            }
                        }
                    }
                    else {
                        ((j)e).put((Object)d, (Object)n2);
                    }
                }
                else {
                    f.j().H.g("Call to endAdUnitExposure for unknown ad unit id", d);
                }
                return;
            }
            case 0: {
                final p f3 = this.F;
                f3.v();
                final String d3 = this.D;
                A.e(d3);
                final t.b e3 = f3.E;
                final boolean empty = ((j)e3).isEmpty();
                final long e4 = this.E;
                if (empty) {
                    f3.F = e4;
                }
                final Integer n4 = (Integer)((j)e3).getOrDefault((Object)d3, (Object)null);
                if (n4 != null) {
                    ((j)e3).put((Object)d3, (Object)(n4 + 1));
                }
                else if (((j)e3).E >= 100) {
                    f3.j().K.f("Too many ads visible");
                }
                else {
                    ((j)e3).put((Object)d3, (Object)1);
                    ((j)f3.D).put((Object)d3, (Object)e4);
                }
            }
        }
    }
}
