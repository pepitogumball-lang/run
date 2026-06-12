package I2;

import t.j;
import K2.p;
import android.os.SystemClock;
import K2.Y0;
import K2.X0;
import java.util.Iterator;
import K2.G1;
import K2.v0;
import java.util.Collections;
import java.util.Map;
import K2.k0;
import K2.x0;
import java.util.concurrent.atomic.AtomicReference;
import R3.b;
import java.util.ArrayList;
import java.util.List;
import K2.J1;
import C.u;
import android.os.Bundle;
import K2.Z;
import h2.A;
import K2.H0;
import K2.n0;

public final class c extends a
{
    public final n0 a;
    public final H0 b;
    
    public c(final n0 a) {
        A.h((Object)a);
        this.a = a;
        final H0 r = a.R;
        n0.e(r);
        this.b = r;
    }
    
    @Override
    public final void a0(final Bundle bundle) {
        final H0 b = this.b;
        ((n0)b.C).P.getClass();
        b.X(bundle, System.currentTimeMillis());
    }
    
    @Override
    public final void b0(final String s, final String s2, final Bundle bundle) {
        final H0 r = this.a.R;
        n0.e(r);
        r.N(s, s2, bundle);
    }
    
    @Override
    public final long c() {
        final J1 n = this.a.N;
        n0.c(n);
        return n.F0();
    }
    
    @Override
    public final List c0(final String s, final String s2) {
        final H0 b = this.b;
        ArrayList p2;
        if (b.l().G()) {
            b.j().H.f("Cannot get conditional user properties from analytics worker thread");
            p2 = new ArrayList(0);
        }
        else if (R3.b.c()) {
            b.j().H.f("Cannot get conditional user properties from main thread");
            p2 = new ArrayList(0);
        }
        else {
            final AtomicReference atomicReference = new AtomicReference();
            final k0 l = ((n0)b.C).L;
            n0.f(l);
            l.A(atomicReference, 5000L, "get conditional user properties", (Runnable)new A1.b((Object)b, (Object)atomicReference, (Object)s, (Object)s2, 3, false));
            final List list = (List)atomicReference.get();
            if (list == null) {
                b.j().H.g("Timed out waiting for get conditional user properties", null);
                p2 = new ArrayList();
            }
            else {
                p2 = J1.p0(list);
            }
        }
        return (List)p2;
    }
    
    @Override
    public final Map d0(final String s, final String s2, final boolean b) {
        final H0 b2 = this.b;
        Object o;
        if (b2.l().G()) {
            b2.j().H.f("Cannot get user properties from analytics worker thread");
            o = Collections.emptyMap();
        }
        else if (b.c()) {
            b2.j().H.f("Cannot get user properties from main thread");
            o = Collections.emptyMap();
        }
        else {
            final AtomicReference atomicReference = new AtomicReference();
            final k0 l = ((n0)b2.C).L;
            n0.f(l);
            l.A(atomicReference, 5000L, "get user properties", (Runnable)new v0(b2, atomicReference, s, s2, b, 1));
            final List list = (List)atomicReference.get();
            if (list == null) {
                b2.j().H.g("Timed out waiting for handle get user properties, includeInternal", b);
                o = Collections.emptyMap();
            }
            else {
                o = new t.b(list.size());
                for (final G1 g1 : list) {
                    final Object a = g1.a();
                    if (a != null) {
                        ((j)o).put((Object)g1.D, a);
                    }
                }
            }
        }
        return (Map)o;
    }
    
    @Override
    public final String e() {
        final X0 q = ((n0)this.b.C).Q;
        n0.e(q);
        final Y0 e = q.E;
        String a;
        if (e != null) {
            a = e.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    @Override
    public final void e0(final String s, final String s2, final Bundle bundle) {
        final H0 b = this.b;
        ((n0)b.C).P.getClass();
        b.O(s, s2, bundle, true, true, System.currentTimeMillis());
    }
    
    @Override
    public final String f() {
        return (String)this.b.I.get();
    }
    
    @Override
    public final String i() {
        final X0 q = ((n0)this.b.C).Q;
        n0.e(q);
        final Y0 e = q.E;
        String b;
        if (e != null) {
            b = e.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    @Override
    public final String j() {
        return (String)this.b.I.get();
    }
    
    @Override
    public final int p(final String s) {
        A.e(s);
        return 25;
    }
    
    @Override
    public final void v(final String s) {
        final n0 a = this.a;
        final p m = a.m();
        a.P.getClass();
        m.E(s, SystemClock.elapsedRealtime());
    }
    
    @Override
    public final void y(final String s) {
        final n0 a = this.a;
        final p m = a.m();
        a.P.getClass();
        m.B(s, SystemClock.elapsedRealtime());
    }
}
