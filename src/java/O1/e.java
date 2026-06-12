package o1;

import com.google.android.datatransport.cct.CctBackendFactory;
import android.content.Context;
import java.util.HashMap;
import f2.d;

public final class e
{
    public final d a;
    public final o1.d b;
    public final HashMap c;
    
    public e(final Context context, final o1.d b) {
        final d a = new d(context, 8);
        this.c = new HashMap();
        this.a = a;
        this.b = b;
    }
    
    public final f a(final String s) {
        monitorenter(this);
        Label_0037: {
            try {
                if (this.c.containsKey((Object)s)) {
                    final f f = (f)this.c.get((Object)s);
                    monitorexit(this);
                    return f;
                }
                break Label_0037;
            }
            finally {
                monitorexit(this);
                final o1.d b;
                Label_0055: {
                    b = this.b;
                }
                CctBackendFactory h = null;
                final f create = h.create((c)new b(b.a, b.b, b.c, s));
                this.c.put((Object)s, (Object)create);
                monitorexit(this);
                return create;
                while (true) {
                    monitorexit(this);
                    return null;
                    h = this.a.h(s);
                    iftrue(Label_0055:)(h != null);
                    continue;
                }
            }
        }
    }
}
