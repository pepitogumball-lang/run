package S4;

import java.util.Objects;
import android.graphics.drawable.ColorDrawable;

public final class b
{
    public final d a;
    public final ColorDrawable b;
    public final c c;
    public final c d;
    public final c e;
    public final c f;
    
    public b(final d a, final ColorDrawable b, final c c, final c d, final c e, final c f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b2 = (b)o;
        if (this.a == b2.a) {
            final ColorDrawable b3 = b2.b;
            final ColorDrawable b4 = this.b;
            if (((b4 == null && b3 == null) || b4.getColor() == b3.getColor()) && Objects.equals((Object)this.c, (Object)b2.c) && Objects.equals((Object)this.d, (Object)b2.d) && Objects.equals((Object)this.e, (Object)b2.e) && Objects.equals((Object)this.f, (Object)b2.f)) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public final int hashCode() {
        final ColorDrawable b = this.b;
        Object value;
        if (b == null) {
            value = null;
        }
        else {
            value = b.getColor();
        }
        return Objects.hash(new Object[] { value, this.c, this.d, this.e, this.f });
    }
}
