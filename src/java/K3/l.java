package k3;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.concurrent.Callable;

public final class l implements Callable
{
    public final long a;
    public final m b;
    
    public l(final m b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public final Object call() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("fatal", 1);
        ((BaseBundle)bundle).putLong("timestamp", this.a);
        this.b.k.r(bundle);
        return null;
    }
}
