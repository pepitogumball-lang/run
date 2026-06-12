package O2;

import h2.d;
import java.util.concurrent.Executor;
import com.google.android.gms.internal.ads.Dq;
import com.google.android.gms.internal.ads.Aq;
import com.google.android.gms.internal.ads.om;
import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.D7;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;
import J1.j;
import android.app.Application;
import com.google.android.gms.internal.ads.Q5;
import com.google.android.gms.internal.ads.R5;
import java.util.ArrayDeque;
import android.os.IBinder;
import F1.p0;
import com.google.android.gms.internal.ads.nm;
import android.os.Binder;
import com.google.android.gms.internal.ads.n6;
import com.google.android.gms.internal.ads.Dv;
import android.content.Context;
import J1.c;
import com.google.android.gms.internal.ads.Gx;
import java.util.ArrayList;
import com.google.android.gms.internal.ads.Cv;

public final class r implements Cv
{
    public boolean C;
    public Object D;
    public Object E;
    
    public r(final int n) {
        switch (n) {
            default: {
                this.D = new Object();
                return;
            }
            case 7: {
                this.D = new ArrayList();
                this.E = Gx.b;
                this.C = false;
                return;
            }
            case 4: {
                this.E = c.b;
                return;
            }
            case 2: {
                this.D = new Object();
                this.E = null;
                this.C = false;
            }
        }
    }
    
    public r(final Context context, final int n) {
        switch (n) {
            default: {
                this.D = new Object();
                return;
            }
            case 4: {
                ((Executor)(this.E = c.b)).execute((Runnable)new Dv((Object)this, 6, (Object)context));
            }
        }
    }
    
    public void a(double n, final double n2) {
        final boolean c = this.C;
        final double[] array = (double[])this.D;
        double n3 = 1.0;
        if (!c) {
            n3 = 1.0 / (array[7] * n2 + array[3] * n + array[15]);
        }
        final double n4 = (array[4] * n2 + array[0] * n + array[12]) * n3;
        n = (array[5] * n2 + array[1] * n + array[13]) * n3;
        final double[] array2 = (double[])this.E;
        if (n4 < array2[0]) {
            array2[0] = n4;
        }
        else if (n4 > array2[1]) {
            array2[1] = n4;
        }
        if (n < array2[2]) {
            array2[2] = n;
        }
        else if (n > array2[3]) {
            array2[3] = n;
        }
    }
    
    public void b(final int n) {
        synchronized (this) {
            if (this.C) {
                return;
            }
            this.C = true;
            final String a = ((nm)this.D).a;
            final StringBuilder sb = new StringBuilder("Error from: ");
            sb.append(a);
            sb.append(", code: ");
            sb.append(n);
            this.g(new p0(n, sb.toString(), "undefined", (p0)null, (IBinder)null));
        }
    }
    
    public void c(final q q) {
        final Object d;
        monitorenter(d = this.D);
        Label_0040: {
            try {
                if (this.E == null) {
                    this.E = new ArrayDeque();
                }
                break Label_0040;
            }
            finally {
                monitorexit(d);
                ((ArrayDeque)this.E).add((Object)q);
                monitorexit(d);
            }
        }
    }
    
    public void d(final i i) {
        Object o;
        monitorenter(o = this.D);
        Label_0101: {
            try {
                if (this.E == null || this.C) {
                    break Label_0101;
                }
                this.C = true;
                monitorexit(o);
                while (true) {
                    monitorenter(o = this.D);
                    Label_0079: {
                        try {
                            final q q = (q)((ArrayDeque)this.E).poll();
                            if (q == null) {
                                this.C = false;
                                monitorexit(o);
                                return;
                            }
                            break Label_0079;
                        }
                        finally {
                            monitorexit(o);
                            monitorexit(o);
                            final q q;
                            q.a(i);
                        }
                    }
                }
            }
            finally {
                monitorexit(o);
                monitorexit(o);
            }
        }
    }
    
    public void e(final R5 r5) {
        final Object d;
        monitorenter(d = this.D);
        Label_0040: {
            try {
                if (this.E == null) {
                    this.E = new Q5();
                }
                break Label_0040;
            }
            finally {
                monitorexit(d);
                final Q5 q5 = (Q5)this.E;
                final Object e = q5.E;
                synchronized (e) {
                    q5.H.add((Object)r5);
                    monitorexit(e);
                }
            }
        }
    }
    
    public void f(final Context context) {
        final Object d;
        monitorenter(d = this.D);
    Label_0158_Outer:
        while (true) {
            Label_0051: {
                try {
                    if (this.C) {
                        break Label_0158_Outer;
                    }
                    Context applicationContext;
                    if ((applicationContext = context.getApplicationContext()) == null) {
                        applicationContext = context;
                    }
                    if (applicationContext instanceof Application) {
                        final Application d2 = (Application)applicationContext;
                        break Label_0053;
                    }
                    break Label_0051;
                }
                finally {
                    monitorexit(d);
                    final Application d2;
                    iftrue(Label_0066:)(d2 != null);
                    j.i("Can not cast Context to Application");
                    monitorexit(d);
                    return;
                    Label_0066: {
                        iftrue(Label_0089:)(this.E != null);
                    }
                    this.E = new Q5();
                    Label_0089:
                    final Q5 q5 = (Q5)this.E;
                    iftrue(Label_0158:)(q5.K);
                    d2.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)q5);
                    iftrue(Label_0124:)(!(context instanceof Activity));
                    while (true) {
                        Block_10: {
                            break Block_10;
                            this.C = true;
                            break Label_0158_Outer;
                        }
                        q5.a((Activity)context);
                        Label_0124:
                        q5.D = d2;
                        q5.L = (long)F1.q.d.c.a(D7.W0);
                        q5.K = true;
                        continue;
                    }
                    monitorexit(d);
                    return;
                    d2 = null;
                    continue Label_0158_Outer;
                }
            }
            break;
        }
    }
    
    public void g(final p0 p) {
        synchronized (this) {
            final boolean booleanValue = (boolean)F1.q.d.c.a(D7.n5);
            int n = 1;
            if (booleanValue) {
                n = 3;
            }
            ((sd)this.E).d((Throwable)new om(n, p));
        }
    }
    
    public void o(final Object o) {
        final Aq aq = (Aq)this.E;
        aq.m0(true);
        final Dq dq = (Dq)this.D;
        dq.a(aq);
        if (this.C) {
            dq.h();
        }
    }
    
    public void v(final Throwable t) {
        final Aq aq = (Aq)this.E;
        if (aq.k()) {
            aq.p(t);
            aq.m0(false);
            final Dq dq = (Dq)this.D;
            dq.a(aq);
            if (this.C) {
                dq.h();
            }
        }
    }
}
