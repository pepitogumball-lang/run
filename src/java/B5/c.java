package B5;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.lang.reflect.Method;

public abstract class c
{
    public static final Method a;
    
    static {
        Method a2;
        try {
            ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        }
        finally {
            a2 = null;
        }
        a = a2;
    }
}
