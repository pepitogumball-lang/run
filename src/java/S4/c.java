package S4;

import java.util.Objects;
import android.graphics.drawable.ColorDrawable;

public final class c
{
    public final ColorDrawable a;
    public final ColorDrawable b;
    public final a c;
    public final Double d;
    
    public c(final ColorDrawable a, final ColorDrawable b, final a c, final Double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Float a() {
        final Double d = this.d;
        Float value;
        if (d == null) {
            value = null;
        }
        else {
            value = d.floatValue();
        }
        return value;
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
        final ColorDrawable a = this.a;
        if ((a == null && c.a == null) || a.getColor() == c.a.getColor()) {
            final ColorDrawable b2 = this.b;
            if (((b2 == null && c.b == null) || b2.getColor() == c.b.getColor()) && Objects.equals((Object)this.d, (Object)c.d) && Objects.equals((Object)this.c, (Object)c.c)) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public final int hashCode() {
        Object value = null;
        final ColorDrawable a = this.a;
        Object value2;
        if (a == null) {
            value2 = null;
        }
        else {
            value2 = a.getColor();
        }
        final ColorDrawable b = this.b;
        if (b != null) {
            value = b.getColor();
        }
        return Objects.hash(new Object[] { value2, value, this.d, this.c });
    }
}
