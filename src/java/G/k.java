package G;

import java.util.Objects;
import android.content.res.Resources$Theme;
import android.content.res.Resources;

public final class k
{
    public final Resources a;
    public final Resources$Theme b;
    
    public k(final Resources a, final Resources$Theme b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && k.class == o.getClass()) {
            final k k = (k)o;
            if (!this.a.equals(k.a) || !Objects.equals((Object)this.b, (Object)k.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b });
    }
}
