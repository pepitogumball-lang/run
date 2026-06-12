package B5;

import c5.e;
import com.google.android.gms.internal.auth.h;
import a.a;

public abstract class v
{
    public static final int a = 0;
    
    static {
        final Exception ex = new Exception();
        final String simpleName = a.class.getSimpleName();
        final StackTraceElement stackTraceElement = ((Throwable)ex).getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        Object k = null;
        try {
            g5.a.class.getCanonicalName();
        }
        finally {
            final Throwable t;
            k = h.k(t);
        }
        if (e.a(k) != null) {
            k = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        final String s = (String)k;
        Object i = null;
        try {
            v.class.getCanonicalName();
        }
        finally {
            final Throwable t2;
            i = h.k(t2);
        }
        if (e.a(i) != null) {
            i = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        final String s2 = (String)i;
    }
}
