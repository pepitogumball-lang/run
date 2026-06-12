package h2;

import java.util.Arrays;
import android.content.ComponentName;

public final class J
{
    public final String a;
    public final String b;
    public final ComponentName c;
    public final boolean d;
    
    public J(final ComponentName c) {
        this.a = null;
        this.b = null;
        A.h(c);
        this.c = c;
        this.d = false;
    }
    
    public J(final String a, final boolean d) {
        A.e(a);
        this.a = a;
        A.e("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = null;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof J)) {
            return false;
        }
        final J j = (J)o;
        return A.l(this.a, j.a) && A.l(this.b, j.b) && A.l(this.c, j.c) && this.d == j.d;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, 4225, this.d });
    }
    
    @Override
    public final String toString() {
        String s;
        if ((s = this.a) == null) {
            final ComponentName c = this.c;
            A.h(c);
            s = c.flattenToString();
        }
        return s;
    }
}
