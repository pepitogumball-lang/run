package io.flutter.plugins.firebase.messaging;

import java.util.concurrent.Executor;
import O4.i;
import M.b;
import android.os.IBinder;
import android.content.Intent;
import java.util.concurrent.ExecutorService;
import O4.h;
import O4.m;
import android.os.Build$VERSION;
import K2.D;
import android.content.ComponentName;
import android.content.Context;
import java.util.ArrayList;
import c2.k;
import O4.n;
import O4.l;
import java.util.HashMap;
import android.app.Service;

public abstract class a extends Service
{
    public static final Object H;
    public static final HashMap I;
    public l C;
    public n D;
    public k E;
    public boolean F;
    public final ArrayList G;
    
    static {
        H = new Object();
        I = new HashMap();
    }
    
    public a() {
        this.F = false;
        this.G = new ArrayList();
    }
    
    public static n b(final Context context, final ComponentName componentName, final boolean b, final int n, final boolean b2) {
        final D d = new D(10);
        final HashMap i = a.I;
        n n2;
        if ((n2 = (n)i.get((Object)d)) == null) {
            Object o;
            if (Build$VERSION.SDK_INT >= 26 && !b2) {
                if (!b) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                o = new m(context, componentName, n);
            }
            else {
                o = new h(context, componentName);
            }
            i.put((Object)d, o);
            n2 = (n)o;
        }
        return n2;
    }
    
    public final void a(final boolean b) {
        if (this.E == null) {
            this.E = new k(this);
            final n d = this.D;
            if (d != null && b) {
                d.d();
            }
            final k e = this.E;
            ((Executor)e.D).execute((Runnable)new C2.h((Object)e, 18));
        }
    }
    
    public final void c() {
        final ArrayList g = this.G;
        if (g != null) {
            final ArrayList list;
            monitorenter(list = g);
        Block_7_Outer:
            while (true) {
                Label_0046: {
                    try {
                        this.E = null;
                        final ArrayList g2 = this.G;
                        if (g2 != null && g2.size() > 0) {
                            this.a(false);
                            break Label_0060;
                        }
                        break Label_0046;
                    }
                    finally {
                        monitorexit(list);
                        monitorexit(list);
                        return;
                        while (true) {
                            this.D.c();
                            continue Block_7_Outer;
                            iftrue(Label_0060:)(this.F);
                            continue;
                        }
                    }
                }
                break;
            }
        }
    }
    
    public final IBinder onBind(final Intent intent) {
        final l c = this.C;
        if (c != null) {
            return b.i(c);
        }
        return null;
    }
    
    public void onCreate() {
        super.onCreate();
        if (Build$VERSION.SDK_INT >= 26) {
            this.C = new l(this);
            this.D = null;
        }
        this.D = b((Context)this, new ComponentName((Context)this, (Class)this.getClass()), false, 0, true);
    }
    
    public final void onDestroy() {
        super.onDestroy();
        final k e = this.E;
        if (e != null) {
            ((a)e.F).c();
        }
        final ArrayList g = this.G;
        synchronized (g) {
            this.F = true;
            this.D.c();
        }
    }
    
    public final int onStartCommand(Intent intent, final int n, final int n2) {
        this.D.e();
        final ArrayList g = this.G;
        synchronized (g) {
            final ArrayList g2 = this.G;
            if (intent == null) {
                intent = new Intent();
            }
            g2.add((Object)new i(this, intent, n2));
            this.a(true);
            return 3;
        }
    }
}
