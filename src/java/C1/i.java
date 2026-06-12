package c1;

import java.util.concurrent.Executor;

public enum i implements Executor
{
    C("INSTANCE", 0);
    
    public static final i[] D;
    
    public final void execute(final Runnable runnable) {
        runnable.run();
    }
    
    public final String toString() {
        return "DirectExecutor";
    }
}
