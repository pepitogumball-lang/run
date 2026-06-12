package p;

import java.lang.reflect.InvocationTargetException;
import android.os.Handler$Callback;
import K.f;
import android.os.Build$VERSION;
import android.os.Looper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import C2.F;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import s2.a;

public final class c extends a
{
    public final Object d;
    public final ExecutorService e;
    public volatile Handler f;
    
    public c() {
        this.d = new Object();
        this.e = Executors.newFixedThreadPool(4, (ThreadFactory)new F());
    }
    
    public static Handler u(final Looper looper) {
        if (Build$VERSION.SDK_INT >= 28) {
            return f.b(looper);
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(new Object[] { looper, null, Boolean.TRUE });
        }
        catch (final InvocationTargetException ex) {
            return new Handler(looper);
        }
        catch (final IllegalAccessException | InstantiationException | NoSuchMethodException ex2) {
            return new Handler(looper);
        }
    }
}
