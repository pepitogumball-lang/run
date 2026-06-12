package L3;

import java.util.concurrent.Callable;
import android.util.Base64;
import java.util.concurrent.Executor;
import F3.g;
import O2.d;
import E4.b;
import n3.u0;
import android.util.Log;
import O2.t;
import android.content.Intent;
import t.j;
import java.util.concurrent.ExecutorService;
import p.a;
import android.content.Context;

public final class l
{
    public static final Object c;
    public static N d;
    public final Object a;
    public final Object b;
    
    static {
        c = new Object();
    }
    
    public l(final Context a) {
        this.a = a;
        this.b = new a(1);
    }
    
    public l(final ExecutorService a) {
        this.b = new j();
        this.a = a;
    }
    
    public static t a(final Context context, final Intent intent, final boolean b) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        final Object c;
        monitorenter(c = l.c);
        Label_0055: {
            try {
                if (l.d == null) {
                    l.d = new N(context);
                }
                break Label_0055;
            }
            finally {
                monitorexit(c);
                N d = null;
                while (true) {
                Block_6:
                    while (true) {
                        d.b(intent);
                        return u0.m((Object)(-1));
                        d = l.d;
                        monitorexit(c);
                        iftrue(Label_0178:)(!b);
                        break Block_6;
                        final Object b2;
                        monitorenter(b2 = K.b);
                        Label_0126: {
                            try {
                                K.a(context);
                                final boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                                if (!booleanExtra) {
                                    K.c.a(K.a);
                                }
                                break Label_0126;
                            }
                            finally {
                                monitorexit(b2);
                                d.b(intent).k((d)new b((Object)intent, 2));
                                monitorexit(b2);
                                return u0.m((Object)(-1));
                            }
                        }
                        continue;
                    }
                    iftrue(Label_0163:)(!A.e().g(context));
                    continue;
                }
                Label_0178: {
                    return d.b(intent).l((Executor)new a(1), (O2.a)new g(2));
                }
            }
        }
    }
    
    public t b(final Intent intent) {
        final String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean b = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final boolean h = q2.b.h();
        final Context context = (Context)this.a;
        final boolean b2 = h && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 0x10000000) != 0x0) {
            b = true;
        }
        t t;
        if (b2 && !b) {
            t = a(context, intent, b);
        }
        else {
            final a a = (a)this.b;
            t = u0.f((Executor)a, (Callable)new L3.j(context, 0, intent)).e((Executor)a, (O2.a)new k(context, intent, b));
        }
        return t;
    }
}
