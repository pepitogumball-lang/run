package x5;

import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import e5.i;
import e5.h;
import w5.t;
import e5.g;
import e5.a;

public final class b extends a implements g
{
    private volatile Object _preHandler;
    
    public b() {
        super((h)t.C);
        this._preHandler = this;
    }
    
    public void g(final i i, final Throwable t) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (26 > sdk_INT || sdk_INT >= 28) {
            return;
        }
        final Object preHandler = this._preHandler;
        Thread$UncaughtExceptionHandler thread$UncaughtExceptionHandler = null;
        Label_0080: {
            if (preHandler != this) {
                final Method declaredMethod = (Method)preHandler;
                break Label_0080;
            }
            while (true) {
                try {
                    Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", (Class<?>[])null);
                    if (!Modifier.isPublic(declaredMethod.getModifiers()) || !Modifier.isStatic(declaredMethod.getModifiers())) {
                        declaredMethod = null;
                    }
                    this._preHandler = declaredMethod;
                    Object invoke;
                    if (declaredMethod != null) {
                        invoke = declaredMethod.invoke((Object)null, (Object[])null);
                    }
                    else {
                        invoke = null;
                    }
                    if (invoke instanceof Thread$UncaughtExceptionHandler) {
                        thread$UncaughtExceptionHandler = (Thread$UncaughtExceptionHandler)invoke;
                    }
                    if (thread$UncaughtExceptionHandler != null) {
                        thread$UncaughtExceptionHandler.uncaughtException(Thread.currentThread(), t);
                    }
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
