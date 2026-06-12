package g2;

import android.os.IInterface;
import O2.j;
import h2.I;
import android.util.Log;
import android.os.DeadObjectException;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import O2.p;
import android.util.SparseIntArray;
import android.os.Handler;
import android.os.Message;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import android.content.Context;
import X4.C;
import android.os.Looper;
import h2.d;
import h2.A;
import java.util.Set;
import C2.m;
import java.util.Objects;
import f2.g;
import e2.b;
import java.util.ArrayList;
import com.google.android.gms.common.api.internal.zacm;
import java.util.HashMap;
import java.util.HashSet;
import com.google.android.gms.internal.auth.l;
import f2.c;
import java.util.LinkedList;
import f2.i;
import f2.h;

public final class o implements h, i
{
    public final LinkedList C;
    public final c D;
    public final a E;
    public final l F;
    public final HashSet G;
    public final HashMap H;
    public final int I;
    public final zacm J;
    public boolean K;
    public final ArrayList L;
    public b M;
    public int N;
    public final e O;
    
    public o(final e o, final g g) {
        Objects.requireNonNull((Object)o);
        this.O = o;
        this.C = new LinkedList();
        this.G = new HashSet();
        this.H = new HashMap();
        this.L = new ArrayList();
        this.M = null;
        this.N = 0;
        final Looper looper = ((Handler)o.P).getLooper();
        final w2.e a = g.a();
        final m m = new m((Set)a.D, (String)a.E, (String)a.F);
        final com.google.android.gms.internal.auth.h h = (com.google.android.gms.internal.auth.h)g.F.D;
        A.h((Object)h);
        final c e = h.e(g.C, looper, m, (Object)g.G, (h)this, (i)this);
        final C e2 = g.E;
        if (e2 != null && e instanceof d) {
            ((d)e).t = e2;
        }
        else {
            final String d = g.D;
            if (d != null && e instanceof d) {
                ((d)e).s = d;
            }
        }
        this.D = e;
        this.E = g.H;
        this.F = new l(26);
        this.I = g.J;
        if (e.c()) {
            final Context g2 = o.G;
            final A2.b p2 = o.P;
            final w2.e a2 = g.a();
            this.J = new zacm(g2, p2, new m((Set)a2.D, (String)a2.E, (String)a2.F));
            return;
        }
        this.J = null;
    }
    
    public final void Q(final int n) {
        final e o = this.O;
        if (Looper.myLooper() == ((Handler)o.P).getLooper()) {
            this.b(n);
            return;
        }
        ((Handler)o.P).post((Runnable)new Z0.c(this, n));
    }
    
    public final void T() {
        final e o = this.O;
        if (Looper.myLooper() == ((Handler)o.P).getLooper()) {
            this.a();
            return;
        }
        ((Handler)o.P).post((Runnable)new C2.h(this));
    }
    
    public final void a() {
        final e o = this.O;
        A.c(o.P);
        this.M = null;
        this.i(b.G);
        if (this.K) {
            final A2.b p = o.P;
            final a e = this.E;
            ((Handler)p).removeMessages(11, (Object)e);
            ((Handler)o.P).removeMessages(9, (Object)e);
            this.K = false;
        }
        final Iterator iterator = this.H.values().iterator();
        if (!iterator.hasNext()) {
            this.d();
            this.h();
            return;
        }
        iterator.next().getClass();
        throw new ClassCastException();
    }
    
    public final void b(final int n) {
        A.c(this.O.P);
        this.M = null;
        this.K = true;
        final String a = ((d)this.D).a;
        final l f = this.F;
        f.getClass();
        final StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (n == 1) {
            sb.append(" due to service disconnection.");
        }
        else if (n == 3) {
            sb.append(" due to dead object exception.");
        }
        if (a != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(a);
        }
        f.u(true, new Status(20, sb.toString(), (PendingIntent)null, (b)null));
        final a e = this.E;
        final e o = this.O;
        final A2.b p = o.P;
        ((Handler)p).sendMessageDelayed(Message.obtain((Handler)p, 9, (Object)e), 5000L);
        final A2.b p2 = o.P;
        ((Handler)p2).sendMessageDelayed(Message.obtain((Handler)p2, 11, (Object)e), 120000L);
        final SparseIntArray sparseIntArray = (SparseIntArray)o.I.D;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
            monitorexit(sparseIntArray);
            final Iterator iterator = this.H.values().iterator();
            if (!iterator.hasNext()) {
                return;
            }
            iterator.next().getClass();
            throw new ClassCastException();
        }
    }
    
    public final boolean c(final b b) {
        final Object t;
        monitorenter(t = e.T);
        Label_0129: {
            try {
                final e o = this.O;
                if (o.M != null && o.N.contains((Object)this.E)) {
                    final g2.l m = o.M;
                    final int i = this.I;
                    m.getClass();
                    final B b2 = new B(b, i);
                    final AtomicReference e = m.E;
                    while (true) {
                        while (!e.compareAndSet((Object)null, (Object)b2)) {
                            if (e.get() != null) {
                                monitorexit(t);
                                return true;
                            }
                        }
                        ((Handler)m.F).post((Runnable)new p(m, b2));
                        continue;
                    }
                }
                break Label_0129;
            }
            finally {
                monitorexit(t);
                monitorexit(t);
                return false;
            }
        }
    }
    
    public final void d() {
        final LinkedList c = this.C;
        final ArrayList list = new ArrayList((Collection)c);
        for (int size = list.size(), i = 0; i < size; ++i) {
            final g2.A a = (g2.A)list.get(i);
            if (!((d)this.D).q()) {
                break;
            }
            if (this.e(a)) {
                c.remove((Object)a);
            }
        }
    }
    
    public final boolean e(final g2.A a) {
        if (!(a instanceof v)) {
            final c d = this.D;
            a.c(this.F, d.c());
            try {
                a.d(this);
            }
            catch (final DeadObjectException ex) {
                this.Q(1);
                d.a("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        final v v = (v)a;
        final e2.d[] f = v.f(this);
        e2.d d5 = null;
        Label_0255: {
            if (f != null) {
                if (f.length != 0) {
                    final I w = ((d)this.D).w;
                    e2.d[] d2;
                    if (w == null) {
                        d2 = null;
                    }
                    else {
                        d2 = w.D;
                    }
                    e2.d[] array = d2;
                    if (d2 == null) {
                        array = new e2.d[0];
                    }
                    final t.b b = new t.b(array.length);
                    for (int i = 0; i < array.length; ++i) {
                        final e2.d d3 = array[i];
                        ((t.j)b).put((Object)d3.C, (Object)d3.h());
                    }
                    for (final e2.d d4 : f) {
                        final Long n = (Long)((t.j)b).getOrDefault((Object)d4.C, (Object)null);
                        d5 = d4;
                        if (n == null) {
                            break Label_0255;
                        }
                        if (n < d4.h()) {
                            d5 = d4;
                            break Label_0255;
                        }
                    }
                }
            }
            d5 = null;
        }
        if (d5 == null) {
            final c d6 = this.D;
            a.c(this.F, d6.c());
            try {
                a.d(this);
            }
            catch (final DeadObjectException ex2) {
                this.Q(1);
                d6.a("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        final String name = this.D.getClass().getName();
        final String c = d5.C;
        final long h = d5.h();
        final StringBuilder sb = new StringBuilder(name.length() + 53 + String.valueOf((Object)c).length() + 2 + String.valueOf(h).length() + 2);
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(c);
        sb.append(", ");
        sb.append(h);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        final e o = this.O;
        if (o.Q && v.g(this)) {
            final g2.p p = new g2.p(this.E, d5);
            final ArrayList l = this.L;
            final int index = l.indexOf((Object)p);
            if (index >= 0) {
                final g2.p p2 = (g2.p)l.get(index);
                ((Handler)o.P).removeMessages(15, (Object)p2);
                ((Handler)o.P).sendMessageDelayed(Message.obtain((Handler)o.P, 15, (Object)p2), 5000L);
            }
            else {
                l.add((Object)p);
                ((Handler)o.P).sendMessageDelayed(Message.obtain((Handler)o.P, 15, (Object)p), 5000L);
                ((Handler)o.P).sendMessageDelayed(Message.obtain((Handler)o.P, 16, (Object)p), 120000L);
                final b b2 = new b(2, null);
                if (!this.c(b2)) {
                    if (o.f(b2, this.I)) {
                        final String c2 = d5.C;
                        final long h2 = d5.h();
                        final StringBuilder sb2 = new StringBuilder(String.valueOf((Object)c2).length() + 55 + String.valueOf(h2).length());
                        sb2.append("Notification displayed for missing feature: ");
                        sb2.append(c2);
                        sb2.append(", version: ");
                        sb2.append(h2);
                        Log.w("GoogleApiManager", sb2.toString());
                    }
                }
                else {
                    final String c3 = d5.C;
                    final long h3 = d5.h();
                    final StringBuilder sb3 = new StringBuilder(String.valueOf((Object)c3).length() + 61 + String.valueOf(h3).length());
                    sb3.append("A dialog should be displayed for missing feature: ");
                    sb3.append(c3);
                    sb3.append(", version: ");
                    sb3.append(h3);
                    Log.w("GoogleApiManager", sb3.toString());
                }
            }
            return false;
        }
        v.b((RuntimeException)new f2.m(d5));
        return true;
    }
    
    public final void e0(final b b) {
        this.k(b, null);
    }
    
    public final void f(final Status status, final RuntimeException ex, final boolean b) {
        A.c(this.O.P);
        int n = true ? 1 : 0;
        final boolean b2 = status == null;
        if (ex != null) {
            n = (false ? 1 : 0);
        }
        if ((b2 ? 1 : 0) != n) {
            final Iterator iterator = ((Collection)this.C).iterator();
            while (iterator.hasNext()) {
                final g2.A a = (g2.A)iterator.next();
                if (!b || a.a == 2) {
                    if (status != null) {
                        a.a(status);
                    }
                    else {
                        a.b(ex);
                    }
                    iterator.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }
    
    public final void g(final Status status) {
        A.c(this.O.P);
        this.f(status, null, false);
    }
    
    public final void h() {
        final e o = this.O;
        final A2.b p = o.P;
        final a e = this.E;
        ((Handler)p).removeMessages(12, (Object)e);
        final A2.b p2 = o.P;
        ((Handler)p2).sendMessageDelayed(((Handler)p2).obtainMessage(12, (Object)e), o.C);
    }
    
    public final void i(final b b) {
        final HashSet g = this.G;
        final Iterator iterator = g.iterator();
        if (!iterator.hasNext()) {
            g.clear();
            return;
        }
        if (iterator.next() == null) {
            if (A.l((Object)b, (Object)b.G)) {
                final d d = (d)this.D;
                if (!d.q() || d.b == null) {
                    throw new RuntimeException("Failed to connect when checking package");
                }
            }
            throw null;
        }
        throw new ClassCastException();
    }
    
    public final void j(final b b) {
        A.c(this.O.P);
        final c d = this.D;
        final String name = d.getClass().getName();
        final String value = String.valueOf((Object)b);
        final StringBuilder sb = new StringBuilder(name.length() + 25 + value.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(value);
        d.a(sb.toString());
        this.k(b, null);
    }
    
    public final void k(final b m, final RuntimeException ex) {
        final e o = this.O;
        A.c(o.P);
        final zacm j = this.J;
        if (j != null) {
            final M2.a h = j.H;
            if (h != null) {
                ((d)h).f();
            }
        }
        A.c(this.O.P);
        this.M = null;
        final SparseIntArray sparseIntArray = (SparseIntArray)o.I.D;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
            monitorexit(sparseIntArray);
            this.i(m);
            if (this.D instanceof j2.c && m.D != 24) {
                o.D = true;
                final A2.b p2 = o.P;
                ((Handler)p2).sendMessageDelayed(((Handler)p2).obtainMessage(19), 300000L);
            }
            final int d = m.D;
            if (d == 4) {
                this.g(e.S);
                return;
            }
            if (d == 25) {
                this.g(e.b(this.E, m));
                return;
            }
            final LinkedList c = this.C;
            if (((Collection)c).isEmpty()) {
                this.M = m;
                return;
            }
            if (ex != null) {
                A.c(o.P);
                this.f(null, ex, false);
                return;
            }
            if (o.Q) {
                final a e = this.E;
                this.f(g2.e.b(e, m), null, true);
                if (!((Collection)c).isEmpty()) {
                    if (!this.c(m) && !o.f(m, this.I)) {
                        if (m.D == 18) {
                            this.K = true;
                        }
                        if (this.K) {
                            final A2.b p3 = o.P;
                            ((Handler)p3).sendMessageDelayed(Message.obtain((Handler)p3, 9, (Object)e), 5000L);
                            return;
                        }
                        this.g(g2.e.b(e, m));
                    }
                }
                return;
            }
            this.g(e.b(this.E, m));
        }
    }
    
    public final void l(final g2.A a) {
        A.c(this.O.P);
        final boolean q = ((d)this.D).q();
        final LinkedList c = this.C;
        if (q) {
            if (this.e(a)) {
                this.h();
                return;
            }
            c.add((Object)a);
        }
        else {
            c.add((Object)a);
            final b m = this.M;
            if (m != null && m.D != 0 && m.E != null) {
                this.k(m, null);
                return;
            }
            this.n();
        }
    }
    
    public final void m() {
        A.c(this.O.P);
        final Status r = e.R;
        this.g(r);
        final l f = this.F;
        int i = 0;
        f.u(false, r);
        for (g2.h[] array = (g2.h[])this.H.keySet().toArray((Object[])new g2.h[0]); i < array.length; ++i) {
            final g2.h h = array[i];
            this.l(new z(new j()));
        }
        this.i(new b(4));
        if (((d)this.D).q()) {
            final X.a a = new X.a(this);
            ((Handler)((o)a.D).O.P).post((Runnable)new n(a, 0));
        }
    }
    
    public final void n() {
        final e o = this.O;
        A.c(o.P);
        final c d = this.D;
        final d d2 = (d)d;
        if (!d2.q()) {
            if (!d2.r()) {
                Label_0465: {
                    try {
                        final int i = o.I.i(o.G, d);
                        if (i != 0) {
                            final b b = new b(i, null);
                            final String name = d.getClass().getName();
                            final String string = b.toString();
                            final StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                            sb.append("The service for ");
                            sb.append(name);
                            sb.append(" is not available: ");
                            sb.append(string);
                            Log.w("GoogleApiManager", sb.toString());
                            this.k(b, null);
                            return;
                        }
                    }
                    catch (final IllegalStateException ex) {
                        break Label_0465;
                    }
                    final a e = this.E;
                    final Object o2 = new Object();
                    Objects.requireNonNull((Object)o);
                    ((H1.n)o2).H = o;
                    ((H1.n)o2).F = null;
                    ((H1.n)o2).G = null;
                    ((H1.n)o2).C = false;
                    ((H1.n)o2).D = d;
                    ((H1.n)o2).E = e;
                    if (d.c()) {
                        final zacm j = this.J;
                        A.h((Object)j);
                        final M2.a h = j.H;
                        if (h != null) {
                            ((d)h).f();
                        }
                        final int identityHashCode = System.identityHashCode((Object)j);
                        final m g = j.G;
                        g.I = identityHashCode;
                        final A2.b d3 = j.D;
                        j.H = (M2.a)j.E.e(j.C, ((Handler)d3).getLooper(), g, (Object)g.G, (h)j, (i)j);
                        j.I = (H1.n)o2;
                        final Set f = j.F;
                        if (f != null && !f.isEmpty()) {
                            final M2.a h2 = j.H;
                            h2.getClass();
                            ((d)h2).j = (h2.c)new h2.n((d)h2);
                            ((d)h2).u(2, (IInterface)null);
                        }
                        else {
                            ((Handler)d3).post((Runnable)new n(j));
                        }
                    }
                    try {
                        d2.j = (h2.c)o2;
                        d2.u(2, (IInterface)null);
                        return;
                    }
                    catch (final SecurityException ex2) {
                        this.k(new b(10), (RuntimeException)ex2);
                        return;
                    }
                }
                final IllegalStateException ex;
                this.k(new b(10), (RuntimeException)ex);
            }
        }
    }
}
