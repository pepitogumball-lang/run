package v4;

import android.view.ViewGroup;
import android.view.View;
import C.a;
import io.flutter.embedding.engine.renderer.j;

public final class k implements io.flutter.embedding.engine.renderer.k
{
    public final j a;
    public final a b;
    public final l c;
    
    public k(final l c, final j a, final a b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
    }
    
    public final void b() {
        this.a.g((io.flutter.embedding.engine.renderer.k)this);
        this.b.run();
        final l c = this.c;
        if (!(c.F instanceof f)) {
            final f e = c.E;
            if (e != null) {
                e.a();
                final f e2 = c.E;
                if (e2 != null) {
                    e2.C.close();
                    ((ViewGroup)c).removeView((View)c.E);
                    c.E = null;
                }
            }
        }
    }
}
