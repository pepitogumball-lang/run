package J1;

import f3.k;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory
{
    public final int a;
    public final Object b;
    public final Object c;
    
    public b() {
        this.a = 1;
        this.c = Executors.defaultThreadFactory();
        this.b = new AtomicInteger(1);
    }
    
    public b(final String s, final int a) {
        switch (this.a = a) {
            default: {
                this.c = s;
                this.b = new AtomicInteger(1);
                return;
            }
            case 2: {
                this.b = Executors.defaultThreadFactory();
                this.c = s;
            }
        }
    }
    
    public final Thread newThread(final Runnable runnable) {
        switch (this.a) {
            default: {
                final Thread thread = ((ThreadFactory)this.b).newThread((Runnable)new k(runnable, 2));
                thread.setName((String)this.c);
                return thread;
            }
            case 1: {
                final AtomicInteger atomicInteger = (AtomicInteger)this.b;
                final Thread thread2 = ((ThreadFactory)this.c).newThread(runnable);
                final int andIncrement = atomicInteger.getAndIncrement();
                final StringBuilder sb = new StringBuilder("PlayBillingLibrary-");
                sb.append(andIncrement);
                thread2.setName(sb.toString());
                return thread2;
            }
            case 0: {
                final int andIncrement2 = ((AtomicInteger)this.b).getAndIncrement();
                final StringBuilder sb2 = new StringBuilder("AdWorker(");
                sb2.append((String)this.c);
                sb2.append(") #");
                sb2.append(andIncrement2);
                return new Thread(runnable, sb2.toString());
            }
        }
    }
}
