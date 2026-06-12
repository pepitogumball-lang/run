package s2;

import android.content.Context;

public final class b
{
    public static final b b;
    public R4.b a;
    
    static {
        final Object b2 = new Object();
        ((b)b2).a = null;
        b = (b)b2;
    }
    
    public static R4.b a(final Context context) {
        final b b = s2.b.b;
        final b b2;
        monitorenter(b2 = b);
        Label_0036: {
            try {
                if (b.a != null) {
                    break Label_0036;
                }
                Context applicationContext = context;
                if (context.getApplicationContext() != null) {
                    applicationContext = context.getApplicationContext();
                }
                break Label_0036;
            }
            finally {
                monitorexit(b2);
                final Context applicationContext;
                b.a = new R4.b(applicationContext);
                final R4.b a = b.a;
                monitorexit(b2);
                return a;
            }
        }
    }
}
