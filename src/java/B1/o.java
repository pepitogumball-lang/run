package b1;

import R0.m;
import c2.k;
import androidx.work.impl.WorkDatabase;

public final class o
{
    public static final String c;
    public final WorkDatabase a;
    public final k b;
    
    static {
        c = m.h("WorkProgressUpdater");
    }
    
    public o(final WorkDatabase a, final k b) {
        this.a = a;
        this.b = b;
    }
}
