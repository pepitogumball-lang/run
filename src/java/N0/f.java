package N0;

import java.util.Set;
import L0.i;
import java.util.Iterator;
import n5.h;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashSet;
import L0.l;
import java.util.concurrent.locks.ReentrantLock;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import N.a;

public final class f implements a, Consumer
{
    public final Context a;
    public final ReentrantLock b;
    public l c;
    public final LinkedHashSet d;
    
    public f(final Context a) {
        this.a = a;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }
    
    public final void a(final WindowLayoutInfo windowLayoutInfo) {
        h.e("value", (Object)windowLayoutInfo);
        final ReentrantLock b = this.b;
        b.lock();
        Label_0076: {
            try {
                this.c = e.c(this.a, windowLayoutInfo);
                final Iterator iterator = ((Iterable)this.d).iterator();
                while (iterator.hasNext()) {
                    ((a)iterator.next()).accept((Object)this.c);
                }
            }
            finally {
                break Label_0076;
            }
            b.unlock();
            return;
        }
        b.unlock();
    }
    
    public final void b(final i i) {
        final ReentrantLock b = this.b;
        b.lock();
        Label_0046: {
            try {
                final l c = this.c;
                if (c != null) {
                    i.accept((Object)c);
                }
            }
            finally {
                break Label_0046;
            }
            final Throwable t;
            ((Set)this.d).add((Object)t);
            b.unlock();
            return;
        }
        b.unlock();
    }
    
    public final boolean c() {
        return ((Set)this.d).isEmpty();
    }
    
    public final void d(final i i) {
        final ReentrantLock b = this.b;
        b.lock();
        try {
            ((Set)this.d).remove((Object)i);
        }
        finally {
            b.unlock();
        }
    }
}
