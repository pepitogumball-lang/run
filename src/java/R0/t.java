package R0;

import m0.a;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import android.content.Context;

public abstract class t
{
    public static final String a;
    
    static {
        a = m.h("WorkerFactory");
    }
    
    public final ListenableWorker a(final Context context, final String className, final WorkerParameters workerParameters) {
        final String a = t.a;
        final ListenableWorker listenableWorker = null;
        Class clazz = null;
        try {
            Class.forName(className).asSubclass(ListenableWorker.class);
        }
        finally {
            final Throwable t;
            m.e().d(a, m0.a.f("Invalid class: ", className), t);
            clazz = null;
        }
        ListenableWorker listenableWorker2 = listenableWorker;
        if (clazz != null) {
            try {
                final ListenableWorker listenableWorker3 = (ListenableWorker)clazz.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(new Object[] { context, workerParameters });
            }
            finally {
                final Throwable t2;
                m.e().d(a, m0.a.f("Could not instantiate ", className), t2);
                listenableWorker2 = listenableWorker;
            }
        }
        if (listenableWorker2 != null && listenableWorker2.isUsed()) {
            throw new IllegalStateException(m0.a.i("WorkerFactory (", this.getClass().getName(), ") returned an instance of a ListenableWorker (", className, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
        }
        return listenableWorker2;
    }
}
