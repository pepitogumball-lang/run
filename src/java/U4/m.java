package U4;

import java.util.Objects;

public final class m
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && m.class == o.getClass()) {
            final m m = (m)o;
            if (!Objects.equals((Object)this.a, (Object)m.a) || !this.b.equals((Object)m.b) || !this.c.equals((Object)m.c) || !Objects.equals((Object)this.d, (Object)m.d) || !Objects.equals((Object)this.e, (Object)m.e) || !Objects.equals((Object)this.f, (Object)m.f)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f });
    }
}
