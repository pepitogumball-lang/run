package B5;

import w5.g0;
import e5.g;
import m5.p;
import n5.i;

public final class y extends i implements p
{
    public static final y E;
    public static final y F;
    public static final y G;
    public final int D;
    
    @Override
    public final Object f(final Object o, Object value) {
        switch (this.D) {
            default: {
                final A a = (A)o;
                final g g = (g)value;
                return a;
            }
            case 1: {
                g0 g2 = (g0)o;
                final g g3 = (g)value;
                if (g2 == null) {
                    if (g3 instanceof g0) {
                        g2 = (g0)g3;
                    }
                    else {
                        g2 = null;
                    }
                }
                return g2;
            }
            case 0: {
                final g g4 = (g)value;
                value = o;
                if (g4 instanceof g0) {
                    Integer n;
                    if (o instanceof Integer) {
                        n = (Integer)o;
                    }
                    else {
                        n = null;
                    }
                    int intValue;
                    if (n != null) {
                        intValue = n;
                    }
                    else {
                        intValue = 1;
                    }
                    if (intValue == 0) {
                        value = g4;
                    }
                    else {
                        value = intValue + 1;
                    }
                }
                return value;
            }
        }
    }
}
