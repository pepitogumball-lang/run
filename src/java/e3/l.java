package e3;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import E3.b;

public final class l implements b
{
    public volatile Set a;
    public volatile Set b;
    
    public final Object get() {
        if (this.b == null) {
            l l = this;
            monitorenter(this);
            Label_0108: {
                try {
                    if (this.b != null) {
                        break Label_0108;
                    }
                    this.b = Collections.newSetFromMap((Map)new ConcurrentHashMap());
                    l = this;
                    monitorenter(this);
                    try {
                        final Iterator iterator = this.a.iterator();
                        while (iterator.hasNext()) {
                            this.b.add(((b)iterator.next()).get());
                        }
                    }
                    finally {
                        monitorexit(l);
                        this.a = null;
                        monitorexit(l);
                    }
                }
                finally {
                    monitorexit(l);
                    monitorexit(l);
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
