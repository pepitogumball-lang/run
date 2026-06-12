package w5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class U extends a0
{
    public final boolean E;
    
    public U(final Q q) {
        boolean e = true;
        super(true);
        this.F(q);
        final AtomicReferenceFieldUpdater d = a0.D;
        final i i = (i)d.get((Object)this);
        j j;
        if (i instanceof j) {
            j = (j)i;
        }
        else {
            j = null;
        }
        Label_0101: {
            Label_0099: {
                if (j != null) {
                    j l;
                    for (a0 a0 = j.m(); !a0.z(); a0 = l.m()) {
                        final i k = (i)d.get((Object)a0);
                        if (k instanceof j) {
                            l = (j)k;
                        }
                        else {
                            l = null;
                        }
                        if (l == null) {
                            break Label_0099;
                        }
                    }
                    break Label_0101;
                }
            }
            e = false;
        }
        this.E = e;
    }
    
    public final boolean A() {
        return true;
    }
    
    public final boolean z() {
        return this.E;
    }
}
