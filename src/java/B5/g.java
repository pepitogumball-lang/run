package B5;

import e5.i;

public final class g extends RuntimeException
{
    public final transient i C;
    
    public g(final i c) {
        this.C = c;
    }
    
    public final Throwable fillInStackTrace() {
        ((Throwable)this).setStackTrace(new StackTraceElement[0]);
        return (Throwable)this;
    }
    
    public final String getLocalizedMessage() {
        return this.C.toString();
    }
}
