package h2;

import e2.b;
import java.util.Objects;
import android.os.Bundle;

public final class H extends w
{
    public final d g;
    
    public H(final d g, final int n, final Bundle bundle) {
        Objects.requireNonNull((Object)g);
        super(this.g = g, n, bundle);
    }
    
    @Override
    public final boolean a() {
        this.g.j.a(e2.b.G);
        return true;
    }
    
    @Override
    public final void b(final b b) {
        final d g = this.g;
        g.getClass();
        g.j.a(b);
        System.currentTimeMillis();
    }
}
