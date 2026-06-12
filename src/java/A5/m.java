package A5;

import e5.h;
import w5.a0;
import w5.Q;
import w5.t;
import e5.g;
import m5.p;
import n5.i;

public final class m extends i implements p
{
    public final j D;
    
    public m(final j d) {
        this.D = d;
        super(2);
    }
    
    @Override
    public final Object f(final Object o, final Object o2) {
        int intValue = ((Number)o).intValue();
        final g g = (g)o2;
        final h key = g.getKey();
        final g i = this.D.G.i(key);
        if (key == t.D) {
            final Q q = (Q)i;
            Q parent = (Q)g;
            while (true) {
                while (parent != null) {
                    if (parent != q) {
                        if (parent instanceof B5.t) {
                            final w5.i j = (w5.i)a0.D.get((Object)parent);
                            if (j != null) {
                                parent = j.getParent();
                                continue;
                            }
                            parent = null;
                            continue;
                        }
                    }
                    if (parent == q) {
                        if (q != null) {
                            ++intValue;
                        }
                        return intValue;
                    }
                    final StringBuilder sb = new StringBuilder("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
                    sb.append((Object)parent);
                    sb.append(", expected child of ");
                    sb.append((Object)q);
                    sb.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                    throw new IllegalStateException(sb.toString().toString());
                }
                parent = null;
                continue;
            }
        }
        if (g != i) {
            intValue = Integer.MIN_VALUE;
        }
        else {
            ++intValue;
        }
        return intValue;
    }
}
