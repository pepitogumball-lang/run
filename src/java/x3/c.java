package x3;

import java.util.Collections;
import java.util.Map;

public final class c
{
    public final String a;
    public final Map b;
    
    public c(final String a, final Map b) {
        this.a = a;
        this.b = b;
    }
    
    public static c a(final String s) {
        return new c(s, Collections.emptyMap());
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        if (!this.a.equals((Object)c.a) || !this.b.equals((Object)c.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FieldDescriptor{name=");
        sb.append(this.a);
        sb.append(", properties=");
        sb.append((Object)this.b.values());
        sb.append("}");
        return sb.toString();
    }
}
