package r5;

public final class c extends a
{
    static {
        new a(1, 0, 1);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof c) {
            if (!this.isEmpty() || !((c)o).isEmpty()) {
                final c c = (c)o;
                if (super.C != c.C || super.D != c.D) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.isEmpty()) {
            n = -1;
        }
        else {
            n = super.C * 31 + super.D;
        }
        return n;
    }
    
    public final boolean isEmpty() {
        return super.C > super.D;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.C);
        sb.append("..");
        sb.append(super.D);
        return sb.toString();
    }
}
