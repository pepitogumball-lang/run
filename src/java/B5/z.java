package B5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class z
{
    public static final AtomicIntegerFieldUpdater a;
    private volatile int _size;
    
    static {
        a = AtomicIntegerFieldUpdater.newUpdater((Class)z.class, "_size");
    }
}
