package Q2;

import android.os.RemoteException;
import android.os.HandlerThread;
import android.os.Handler;
import O2.j;
import java.util.Iterator;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.ref.WeakReference;
import android.content.Intent;
import java.util.HashSet;
import java.util.ArrayList;
import B5.w;
import android.content.Context;
import java.util.HashMap;

public final class i
{
    public static final HashMap n;
    public final Context a;
    public final w b;
    public final String c;
    public final ArrayList d;
    public final HashSet e;
    public final Object f;
    public boolean g;
    public final Intent h;
    public final WeakReference i;
    public final e j;
    public final AtomicInteger k;
    public h l;
    public c m;
    
    static {
        n = new HashMap();
    }
    
    public i(final Context a, final w b, final Intent h) {
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new Object();
        this.j = new e(this);
        this.k = new AtomicInteger(0);
        this.a = a;
        this.b = b;
        this.c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.h = h;
        this.i = new WeakReference((Object)null);
    }
    
    public static void b(final i i, final P2.e e) {
        final c m = i.m;
        final ArrayList d = i.d;
        final w b = i.b;
        if (m == null && !i.g) {
            b.e("Initiate binding to the service.", new Object[0]);
            d.add((Object)e);
            final h l = new h(i, 0);
            i.l = l;
            i.g = true;
            if (!i.a.bindService(i.h, (ServiceConnection)l, 1)) {
                b.e("Failed to bind to the service.", new Object[0]);
                i.g = false;
                for (final d d2 : d) {
                    final RuntimeException ex = new RuntimeException("Failed to bind to the service.");
                    final j c = d2.C;
                    if (c != null) {
                        c.c((Exception)ex);
                    }
                }
                d.clear();
            }
            return;
        }
        if (i.g) {
            b.e("Waiting to bind to the service.", new Object[0]);
            d.add((Object)e);
            return;
        }
        e.run();
    }
    
    public final Handler a() {
        final HashMap n = Q2.i.n;
        final HashMap hashMap;
        monitorenter(hashMap = n);
        Label_0073: {
            try {
                if (!n.containsKey((Object)this.c)) {
                    final HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    ((Thread)handlerThread).start();
                    n.put((Object)this.c, (Object)new Handler(handlerThread.getLooper()));
                }
                break Label_0073;
            }
            finally {
                monitorexit(hashMap);
                final Handler handler = (Handler)n.get((Object)this.c);
                monitorexit(hashMap);
                return handler;
            }
        }
    }
    
    public final void c() {
        final HashSet e = this.e;
        final Iterator iterator = e.iterator();
        while (iterator.hasNext()) {
            ((j)iterator.next()).c((Exception)new RemoteException(String.valueOf((Object)this.c).concat(" : Binder has died.")));
        }
        e.clear();
    }
}
