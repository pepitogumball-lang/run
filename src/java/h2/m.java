package h2;

import android.os.Handler;
import java.util.concurrent.Executor;
import android.content.ServiceConnection;
import android.os.Handler$Callback;
import android.os.Looper;
import p2.a;
import A2.b;
import android.content.Context;
import java.util.HashMap;
import android.os.HandlerThread;

public final class M
{
    public static final Object g;
    public static M h;
    public static HandlerThread i;
    public final HashMap a;
    public final Context b;
    public volatile b c;
    public final a d;
    public final long e;
    public final long f;
    
    static {
        g = new Object();
    }
    
    public M(final Context context, final Looper looper) {
        this.a = new HashMap();
        final L l = new L(this);
        this.b = context.getApplicationContext();
        final b c = new b(looper, (Handler$Callback)l, 1);
        Looper.getMainLooper();
        this.c = c;
        this.d = p2.a.b();
        this.e = 5000L;
        this.f = 300000L;
    }
    
    public static M a(final Context context) {
        final Object g;
        monitorenter(g = M.g);
        Label_0041: {
            try {
                if (M.h == null) {
                    M.h = new M(context.getApplicationContext(), context.getMainLooper());
                }
                break Label_0041;
            }
            finally {
                monitorexit(g);
                monitorexit(g);
                return M.h;
            }
        }
    }
    
    public final e2.b b(final J j, final ServiceConnection serviceConnection, final String s, final Executor executor) {
        final HashMap a = this.a;
        final HashMap hashMap;
        monitorenter(hashMap = a);
    Label_0224_Outer:
        while (true) {
            Label_0096: {
                try {
                    final K k = (K)a.get((Object)j);
                    final e2.b b = null;
                    Executor executor2 = executor;
                    if (executor == null) {
                        executor2 = null;
                    }
                    if (k == null) {
                        final K i = new K(this, j);
                        i.C.put((Object)serviceConnection, (Object)serviceConnection);
                        final e2.b a2 = i.a(s, executor2);
                        a.put((Object)j, (Object)i);
                        final K l = i;
                        final e2.b a3 = a2;
                        break Label_0193;
                    }
                    break Label_0096;
                }
                finally {
                    monitorexit(hashMap);
                    final K k;
                    Label_0156: {
                        final Executor executor2;
                        final e2.b a3 = k.a(s, executor2);
                    }
                    K l = k;
                    break Label_0193;
                    final e2.b b;
                Block_8:
                    while (true) {
                        monitorexit(hashMap);
                        return null;
                        e2.b a3 = null;
                        Label_0209:
                        iftrue(Label_0224:)((b2 = a3) != null);
                        Block_10: {
                            break Block_10;
                            while (true) {
                                k.C.put((Object)serviceConnection, (Object)serviceConnection);
                                final int d = k.D;
                                iftrue(Label_0171:)(d == 1);
                                Block_7: {
                                    break Block_7;
                                    Label_0171:
                                    serviceConnection.onServiceConnected(k.H, k.F);
                                    a3 = b;
                                    l = k;
                                    break Label_0193;
                                }
                                iftrue(Label_0156:)(d == 2);
                                break Block_8;
                                ((Handler)this.c).removeMessages(0, (Object)j);
                                iftrue(Label_0229:)(k.C.containsKey((Object)serviceConnection));
                                continue;
                            }
                            iftrue(Label_0209:)(!l.E);
                            Block_9: {
                                break Block_9;
                                Label_0229:
                                final String string = j.toString();
                                final StringBuilder sb = new StringBuilder(string.length() + 81);
                                sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                                sb.append(string);
                                throw new IllegalStateException(sb.toString());
                            }
                            final e2.b g = e2.b.G;
                            monitorexit(hashMap);
                            return g;
                        }
                        b2 = new e2.b(-1);
                        continue;
                    }
                    l = k;
                    e2.b a3 = b;
                    continue Label_0224_Outer;
                }
            }
            break;
        }
    }
    
    public final void c(final J j, final ServiceConnection serviceConnection) {
        A.i("ServiceConnection must not be null", serviceConnection);
        final HashMap a = this.a;
        final HashMap hashMap;
        monitorenter(hashMap = a);
        Label_0097: {
            try {
                final K k = (K)a.get((Object)j);
                if (k == null) {
                    break Label_0097;
                }
                if (!k.C.containsKey((Object)serviceConnection)) {
                    break Label_0097;
                }
                k.C.remove((Object)serviceConnection);
                if (k.C.isEmpty()) {
                    ((Handler)this.c).sendMessageDelayed(((Handler)this.c).obtainMessage(0, (Object)j), this.e);
                }
                break Label_0097;
            }
            finally {
                monitorexit(hashMap);
                final String string = j.toString();
                final StringBuilder sb = new StringBuilder(string.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
                final String string2 = j.toString();
                final StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(string2);
                throw new IllegalStateException(sb2.toString());
                monitorexit(hashMap);
            }
        }
    }
}
