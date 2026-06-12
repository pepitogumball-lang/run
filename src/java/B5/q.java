package B5;

import w5.v;

public abstract class q
{
    public abstract Object a(final Object p0);
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('@');
        sb.append(v.d((Object)this));
        return sb.toString();
    }
}
