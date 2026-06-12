package q;

import java.util.HashMap;

public final class a extends f
{
    public final HashMap G;
    
    public a() {
        this.G = new HashMap();
    }
    
    @Override
    public final c c(final Object o) {
        return (c)this.G.get(o);
    }
    
    @Override
    public final Object h(final Object o) {
        final Object h = super.h(o);
        this.G.remove(o);
        return h;
    }
}
