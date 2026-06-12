package g2;

import android.os.Handler;
import java.util.Objects;

public final class m implements b
{
    public final e a;
    
    public m(final e a) {
        Objects.requireNonNull((Object)a);
        this.a = a;
    }
    
    public final void a(final boolean b) {
        final e a = this.a;
        ((Handler)a.P).sendMessage(((Handler)a.P).obtainMessage(1, (Object)b));
    }
}
