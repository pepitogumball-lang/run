package b1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class p implements ThreadFactory
{
    public final int a;
    public int b;
    
    public final Thread newThread(final Runnable runnable) {
        switch (this.a) {
            default: {
                final Thread thread = new Thread(runnable);
                final StringBuilder sb = new StringBuilder("flutter-worker-");
                sb.append(this.b++);
                thread.setName(sb.toString());
                return thread;
            }
            case 0: {
                final Thread thread2 = Executors.defaultThreadFactory().newThread(runnable);
                final StringBuilder sb2 = new StringBuilder("WorkManager-WorkTimer-thread-");
                sb2.append(this.b);
                thread2.setName(sb2.toString());
                ++this.b;
                return thread2;
            }
        }
    }
}
