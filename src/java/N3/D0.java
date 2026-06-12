package n3;

import x.a;

public final class d0 extends G0
{
    public final String a;
    
    public d0(final String a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof G0 && this.a.equals((Object)((d0)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public final String toString() {
        return x.a.b(new StringBuilder("Log{content="), this.a, "}");
    }
}
