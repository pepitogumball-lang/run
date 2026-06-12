package K;

import java.util.Locale;

public final class i
{
    public static final i b;
    public final j a;
    
    static {
        b = new i(new j(h.a(new Locale[0])));
    }
    
    public i(final j a) {
        this.a = a;
    }
    
    public static i a(final String s) {
        if (s != null && !s.isEmpty()) {
            final String[] split = s.split(",", -1);
            final int length = split.length;
            final Locale[] array = new Locale[length];
            for (int i = 0; i < length; ++i) {
                array[i] = g.a(split[i]);
            }
            return new i(new j(h.a(array)));
        }
        return i.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof i && this.a.equals(((i)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.a.toString();
    }
}
