package c5;

import n5.h;

public final class b implements Comparable
{
    public static final b D;
    public final int C;
    
    static {
        D = new b();
    }
    
    public b() {
        this.C = 131328;
    }
    
    public final int compareTo(final Object o) {
        final b b = (b)o;
        h.e("other", (Object)b);
        return this.C - b.C;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        b b2;
        if (o instanceof b) {
            b2 = (b)o;
        }
        else {
            b2 = null;
        }
        if (b2 == null) {
            return false;
        }
        if (this.C != b2.C) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return this.C;
    }
    
    @Override
    public final String toString() {
        return "2.1.0";
    }
}
