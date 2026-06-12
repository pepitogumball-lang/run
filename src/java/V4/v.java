package v4;

import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.k;

public final class v implements k
{
    public final Runnable a;
    public final x b;
    
    public v(final x b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
    }
    
    public final void b() {
        this.a.run();
        final j d = this.b.D;
        if (d != null) {
            d.g((k)this);
        }
    }
}
