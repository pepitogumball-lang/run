package f3;

import java.util.concurrent.Executor;

public enum j implements Executor
{
    C("INSTANCE", 0);
    
    public static final j[] D;
    
    public final void execute(final Runnable runnable) {
        runnable.run();
    }
}
