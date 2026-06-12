package e3;

import java.util.Set;

public interface b
{
    default Object a(final Class clazz) {
        return this.g(o.a(clazz));
    }
    
    E3.b b(final o p0);
    
    E3.b c(final o p0);
    
    m d(final o p0);
    
    default E3.b e(final Class clazz) {
        return this.b(o.a(clazz));
    }
    
    default Set f(final o o) {
        return (Set)this.c(o).get();
    }
    
    default Object g(final o o) {
        final E3.b b = this.b(o);
        if (b == null) {
            return null;
        }
        return b.get();
    }
}
