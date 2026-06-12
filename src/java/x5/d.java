package x5;

import android.os.Handler$Callback;
import android.os.Build$VERSION;
import android.os.Handler;
import com.google.android.gms.internal.auth.h;
import android.os.Looper;
import android.view.Choreographer;

public abstract class d
{
    private static volatile Choreographer choreographer;
    
    static {
        c5.d k = null;
        try {
            final c c = new c(a(Looper.getMainLooper()));
        }
        finally {
            final Throwable t;
            k = h.k(t);
        }
        Object o = k;
        if (k instanceof c5.d) {
            o = null;
        }
        final c c2 = (c)o;
    }
    
    public static final Handler a(final Looper looper) {
        if (Build$VERSION.SDK_INT >= 28) {
            final Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke((Object)null, new Object[] { looper });
            n5.h.c("null cannot be cast to non-null type android.os.Handler", invoke);
            return (Handler)invoke;
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(new Object[] { looper, null, Boolean.TRUE });
        }
        catch (final NoSuchMethodException ex) {
            return new Handler(looper);
        }
    }
}
