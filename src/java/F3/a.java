package f3;

import java.util.Locale;
import G.l;
import java.util.concurrent.Executors;
import android.os.StrictMode$ThreadPolicy;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory
{
    public static final ThreadFactory e;
    public final AtomicLong a;
    public final String b;
    public final int c;
    public final StrictMode$ThreadPolicy d;
    
    static {
        e = Executors.defaultThreadFactory();
    }
    
    public a(final String b, final int c, final StrictMode$ThreadPolicy d) {
        this.a = new AtomicLong();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = f3.a.e.newThread((Runnable)new l((Object)this, 18, (Object)runnable));
        final Locale root = Locale.ROOT;
        final long andIncrement = this.a.getAndIncrement();
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(" Thread #");
        sb.append(andIncrement);
        thread.setName(sb.toString());
        return thread;
    }
}
