package Y3;

import android.os.Bundle;
import R3.a;

public final class e
{
    public static final a b;
    public final Bundle a;
    
    static {
        b = a.d();
    }
    
    public e() {
        this(new Bundle());
    }
    
    public e(final Bundle bundle) {
        this.a = (Bundle)bundle.clone();
    }
}
