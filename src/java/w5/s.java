package w5;

import n5.h;
import java.util.concurrent.CancellationException;

public final class S extends CancellationException
{
    public final transient a0 C;
    
    public S(final String s, final Throwable t, final a0 c) {
        super(s);
        this.C = c;
        if (t != null) {
            ((Throwable)this).initCause(t);
        }
    }
    
    public final boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof S) {
                final S s = (S)o;
                if (h.a((Object)((Throwable)s).getMessage(), (Object)((Throwable)this).getMessage()) && h.a((Object)s.C, (Object)this.C) && h.a((Object)((Throwable)s).getCause(), (Object)((Throwable)this).getCause())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final Throwable fillInStackTrace() {
        ((Throwable)this).setStackTrace(new StackTraceElement[0]);
        return (Throwable)this;
    }
    
    public final int hashCode() {
        final String message = ((Throwable)this).getMessage();
        h.b((Object)message);
        final int hashCode = message.hashCode();
        final int hashCode2 = this.C.hashCode();
        final Throwable cause = ((Throwable)this).getCause();
        int hashCode3;
        if (cause != null) {
            hashCode3 = cause.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append((Object)this.C);
        return sb.toString();
    }
}
