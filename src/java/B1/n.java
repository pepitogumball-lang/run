package b1;

import androidx.work.impl.WorkDatabase;
import R0.m;
import C2.z;
import S0.b;
import c2.k;

public final class n
{
    public final k a;
    public final b b;
    public final z c;
    
    static {
        m.h("WMFgUpdater");
    }
    
    public n(final WorkDatabase workDatabase, final b b, final k a) {
        this.b = b;
        this.a = a;
        this.c = workDatabase.n();
    }
}
