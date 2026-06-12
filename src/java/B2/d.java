package B2;

import java.util.List;
import J5.b;

public final class d extends f
{
    public final transient f E;
    
    public d(final f e) {
        this.E = e;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.E.contains(o);
    }
    
    public final Object get(final int n) {
        final f e = this.E;
        J5.b.c0(n, e.size());
        return ((List)e).get(e.size() - 1 - n);
    }
    
    @Override
    public final int indexOf(final Object o) {
        final f e = this.E;
        final int lastIndex = e.lastIndexOf(o);
        if (lastIndex >= 0) {
            return e.size() - 1 - lastIndex;
        }
        return -1;
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        final f e = this.E;
        final int index = e.indexOf(o);
        if (index >= 0) {
            return e.size() - 1 - index;
        }
        return -1;
    }
    
    @Override
    public final f r() {
        return this.E;
    }
    
    public final int size() {
        return this.E.size();
    }
    
    @Override
    public final f t(final int n, final int n2) {
        final f e = this.E;
        J5.b.f0(n, n2, e.size());
        return e.t(e.size() - n2, e.size() - n).r();
    }
}
