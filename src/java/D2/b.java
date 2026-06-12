package d2;

import java.util.concurrent.ThreadPoolExecutor;
import android.os.RemoteException;
import android.os.Message;
import O2.d;
import java.util.concurrent.Executor;
import android.util.Log;
import android.os.Parcelable;
import A2.a;
import android.content.Intent;
import O2.t;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import A.g;
import android.content.Context;
import t.j;
import java.util.regex.Pattern;
import android.app.PendingIntent;

public final class b
{
    public static int h;
    public static PendingIntent i;
    public static final Pattern j;
    public final j a;
    public final Context b;
    public final g c;
    public final ScheduledThreadPoolExecutor d;
    public final Messenger e;
    public Messenger f;
    public d2.g g;
    
    static {
        j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    }
    
    public b(final Context b) {
        this.a = new j();
        this.b = b;
        this.c = new g(b);
        this.e = new Messenger((Handler)new e(this, Looper.getMainLooper()));
        final ScheduledThreadPoolExecutor d = new ScheduledThreadPoolExecutor(1);
        ((ThreadPoolExecutor)d).setKeepAliveTime(60L, TimeUnit.SECONDS);
        ((ThreadPoolExecutor)d).allowCoreThreadTimeOut(true);
        this.d = d;
    }
    
    public final t a(final Bundle bundle) {
        synchronized (b.class) {
            final int h = d2.b.h;
            d2.b.h = h + 1;
            final String string = Integer.toString(h);
            monitorexit(b.class);
            final O2.j j = new O2.j();
            final j a = this.a;
            synchronized (a) {
                this.a.put((Object)string, (Object)j);
                monitorexit(a);
                final Intent obj = new Intent();
                obj.setPackage("com.google.android.gms");
                if (this.c.b() == 2) {
                    obj.setAction("com.google.iid.TOKEN_REQUEST");
                }
                else {
                    obj.setAction("com.google.android.c2dm.intent.REGISTER");
                }
                obj.putExtras(bundle);
                final Context b = this.b;
                monitorenter(b.class);
                Label_0168: {
                    try {
                        if (d2.b.i == null) {
                            final Intent intent = new Intent();
                            intent.setPackage("com.google.example.invalidpackage");
                            d2.b.i = PendingIntent.getBroadcast(b, 0, intent, A2.a.a);
                        }
                        break Label_0168;
                    }
                    finally {
                        monitorexit(b.class);
                        obj.putExtra("app", (Parcelable)d2.b.i);
                        monitorexit(b.class);
                        final StringBuilder sb = new StringBuilder("|ID|");
                        sb.append(string);
                        sb.append("|");
                        obj.putExtra("kid", sb.toString());
                        iftrue(Label_0245:)(!Log.isLoggable("Rpc", 3));
                    Label_0343_Outer:
                        while (true) {
                            Block_10: {
                                break Block_10;
                                j.a.b((Executor)d2.h.E, (d)new w2.e((Object)this, (Object)string, (Object)this.d.schedule((Runnable)new C2.h((Object)j, 27), 30L, TimeUnit.SECONDS), 18));
                                return j.a;
                            }
                            Log.d("Rpc", "Sending ".concat(String.valueOf((Object)obj.getExtras())));
                            Label_0245: {
                                obj.putExtra("google.messenger", (Parcelable)this.e);
                            }
                            iftrue(Label_0343:)(this.f == null && this.g == null);
                            while (true) {
                                Label_0271: {
                                    break Label_0271;
                                    Label_0366:
                                    this.b.startService(obj);
                                    continue Label_0343_Outer;
                                    iftrue(Label_0366:)(this.c.b() != 2);
                                    this.b.sendBroadcast(obj);
                                    continue Label_0343_Outer;
                                }
                                final Message obtain = Message.obtain();
                                obtain.obj = obj;
                                try {
                                    final Messenger f = this.f;
                                    if (f != null) {
                                        f.send(obtain);
                                        continue Label_0343_Outer;
                                    }
                                    final Messenger c = this.g.C;
                                    c.getClass();
                                    c.send(obtain);
                                    continue Label_0343_Outer;
                                }
                                catch (final RemoteException ex) {
                                    if (!Log.isLoggable("Rpc", 3)) {
                                        continue;
                                    }
                                    Log.d("Rpc", "Messenger failed, fallback to startService");
                                }
                                break;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public final void b(final String s, final Bundle bundle) {
        final j a;
        monitorenter(a = this.a);
        Label_0063: {
            try {
                final O2.j j = (O2.j)this.a.remove((Object)s);
                if (j == null) {
                    final StringBuilder sb = new StringBuilder("Missing callback for ");
                    sb.append(s);
                    Log.w("Rpc", sb.toString());
                    monitorexit(a);
                    return;
                }
                break Label_0063;
            }
            finally {
                monitorexit(a);
                final O2.j j;
                j.b((Object)bundle);
                monitorexit(a);
            }
        }
    }
}
