package O2;

import java.util.concurrent.Executor;

public final class s implements Executor
{
    public final int C;
    
    public final void execute(final Runnable runnable) {
        switch (this.C) {
            default: {
                new Thread(runnable).start();
                return;
            }
            case 1: {
                runnable.run();
                return;
            }
            case 0: {
                runnable.run();
            }
        }
    }
}
