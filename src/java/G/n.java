package G;

import java.util.WeakHashMap;

public abstract class n
{
    public static final ThreadLocal a;
    public static final WeakHashMap b;
    public static final Object c;
    
    static {
        a = new ThreadLocal();
        b = new WeakHashMap(0);
        c = new Object();
    }
}
