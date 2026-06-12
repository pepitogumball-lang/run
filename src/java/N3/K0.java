package n3;

import x.a;

public final class k0 extends M0
{
    public final String a;
    
    public k0(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof M0 && this.a.equals((Object)((k0)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        return x.a.b(new StringBuilder("User{identifier="), this.a, "}");
    }
}
