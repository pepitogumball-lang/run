package J1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class c
{
    public static final ThreadPoolExecutor a;
    public static final ExecutorService b;
    
    static {
        a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, (BlockingQueue)new SynchronousQueue(), (ThreadFactory)new b("ClientDefault", 0));
        b = Executors.newSingleThreadExecutor((ThreadFactory)new b("ClientSingle", 0));
    }
}
