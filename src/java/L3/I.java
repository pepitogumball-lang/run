package L3;

import O2.t;
import O2.d;
import java.util.concurrent.Executor;
import p.a;
import O2.j;
import java.util.ArrayDeque;
import b1.f;
import android.util.Log;
import android.os.IBinder;
import android.content.Intent;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import J1.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import android.app.Service;

public abstract class i extends Service
{
    public final ExecutorService C;
    public L D;
    public final Object E;
    public int F;
    public int G;
    
    public i() {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), (ThreadFactory)new b("Firebase-Messaging-Intent-Handle", 2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.C = Executors.unconfigurableExecutorService((ExecutorService)threadPoolExecutor);
        this.E = new Object();
        this.G = 0;
    }
    
    public final void a(final Intent intent) {
        if (intent != null) {
            K.b(intent);
        }
        final Object e;
        monitorenter(e = this.E);
        Label_0050: {
            try {
                final int g = this.G - 1;
                this.G = g;
                if (g == 0) {
                    this.stopSelfResult(this.F);
                }
                break Label_0050;
            }
            finally {
                monitorexit(e);
                monitorexit(e);
            }
        }
    }
    
    public abstract void b(final Intent p0);
    
    public final IBinder onBind(final Intent intent) {
        monitorenter(this);
        Label_0028: {
            try {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "Service received bind request");
                }
                break Label_0028;
            }
            finally {
                monitorexit(this);
                iftrue(Label_0060:)(this.D != null);
                while (true) {
                    Block_5: {
                        break Block_5;
                        final L d = this.D;
                        monitorexit(this);
                        return (IBinder)d;
                    }
                    this.D = new L(new f((Object)this, 22));
                    continue;
                }
            }
        }
    }
    
    public final void onDestroy() {
        this.C.shutdown();
        super.onDestroy();
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int f) {
        final Object e = this.E;
        synchronized (e) {
            this.F = f;
            ++this.G;
            monitorexit(e);
            final Intent intent2 = (Intent)((ArrayDeque)A.e().G).poll();
            if (intent2 == null) {
                this.a(intent);
                return 2;
            }
            final j j = new j();
            ((Executor)this.C).execute((Runnable)new h(this, intent2, j, 0));
            final t a = j.a;
            if (a.i()) {
                this.a(intent);
                return 2;
            }
            a.b((Executor)new a(1), (d)new g(this, 0, intent));
            return 3;
        }
    }
}
