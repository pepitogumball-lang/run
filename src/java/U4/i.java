package U4;

import java.util.Objects;
import java.util.List;

public final class i
{
    public List a;
    public l b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && i.class == o.getClass()) {
            final i i = (i)o;
            if (!this.a.equals((Object)i.a) || !this.b.equals(i.b) || !Objects.equals((Object)this.c, (Object)i.c) || !Objects.equals((Object)this.d, (Object)i.d) || !Objects.equals((Object)this.e, (Object)i.e) || !this.f.equals((Object)i.f)) {
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
