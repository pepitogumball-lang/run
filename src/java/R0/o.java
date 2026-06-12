package R0;

import m0.a;
import com.google.android.gms.internal.auth.m;

public final class o extends m
{
    public final Throwable f;
    
    public o(final Throwable f) {
        this.f = f;
    }
    
    public final String toString() {
        return a.g("FAILURE (", this.f.getMessage(), ")");
    }
}
