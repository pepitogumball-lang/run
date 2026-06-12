package z5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import A5.c;

public final class q extends c
{
    public static final AtomicReferenceFieldUpdater a;
    private volatile Object _state;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater((Class)q.class, (Class)Object.class, "_state");
    }
}
