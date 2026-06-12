package w5;

import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import e5.g;
import m5.p;
import e5.b;
import java.util.concurrent.CancellationException;
import B5.w;
import a.a;
import n5.h;
import A0.c;
import B5.q;
import B5.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class a0 implements Q, e0
{
    public static final AtomicReferenceFieldUpdater C;
    public static final AtomicReferenceFieldUpdater D;
    private volatile Object _parentHandle;
    private volatile Object _state;
    
    static {
        C = AtomicReferenceFieldUpdater.newUpdater((Class)a0.class, (Class)Object.class, "_state");
        D = AtomicReferenceFieldUpdater.newUpdater((Class)a0.class, (Class)Object.class, "_parentHandle");
    }
    
    public a0(final boolean b) {
        F state;
        if (b) {
            state = v.i;
        }
        else {
            state = v.h;
        }
        this._state = state;
    }
    
    public static j J(k k) {
        k i;
        while (true) {
            i = k;
            if (!k.l()) {
                break;
            }
            final k h = k.h();
            if (h == null) {
                AtomicReferenceFieldUpdater d;
                for (d = k.D, k = (k)d.get((Object)k); k.l(); k = (k)d.get((Object)k)) {}
            }
            else {
                k = h;
            }
        }
        while (true) {
            k = (i = i.k());
            if (!k.l()) {
                if (k instanceof j) {
                    return (j)k;
                }
                i = k;
                if (k instanceof b0) {
                    return null;
                }
                continue;
            }
        }
    }
    
    public static String P(final Object o) {
        final boolean b = o instanceof Y;
        final String s = "Active";
        String s2;
        if (b) {
            final Y y = (Y)o;
            if (y.d()) {
                s2 = "Cancelling";
            }
            else {
                s2 = s;
                if (y.f()) {
                    s2 = "Completing";
                }
            }
        }
        else if (o instanceof M) {
            if (((M)o).a()) {
                s2 = s;
            }
            else {
                s2 = "New";
            }
        }
        else if (o instanceof n) {
            s2 = "Cancelled";
        }
        else {
            s2 = "Completed";
        }
        return s2;
    }
    
    public boolean A() {
        return this instanceof l;
    }
    
    public final b0 B(final M m) {
        Object e;
        if ((e = m.e()) == null) {
            if (m instanceof F) {
                e = new k();
            }
            else {
                if (!(m instanceof V)) {
                    final StringBuilder sb = new StringBuilder("State should have list: ");
                    sb.append((Object)m);
                    throw new IllegalStateException(sb.toString().toString());
                }
                this.N((V)m);
                e = null;
            }
        }
        return (b0)e;
    }
    
    public final Object C() {
        Object value;
        while (true) {
            value = a0.C.get((Object)this);
            if (!(value instanceof q)) {
                break;
            }
            ((q)value).a(this);
        }
        return value;
    }
    
    public boolean D(final Throwable t) {
        return false;
    }
    
    public void E(final c c) {
        throw c;
    }
    
    public final void F(final Q q) {
        final c0 c = c0.C;
        final AtomicReferenceFieldUpdater d = a0.D;
        if (q == null) {
            d.set((Object)this, (Object)c);
            return;
        }
        final a0 a0 = (a0)q;
        int o;
        do {
            o = a0.O(a0.C());
        } while (o != 0 && o != 1);
        final w5.i i = (w5.i)v.g((Q)a0, true, (V)new j(this), 2);
        d.set((Object)this, (Object)i);
        if (!(this.C() instanceof M)) {
            ((D)i).dispose();
            d.set((Object)this, (Object)c);
        }
    }
    
    public final D G(final boolean b, final boolean b2, final m5.l l) {
        final Object o = null;
        Object c = null;
        Object o2;
        if (b) {
            if (l instanceof T) {
                c = l;
            }
            else {
                c = null;
            }
            o2 = c;
            if (c == null) {
                o2 = new O(l);
            }
        }
        else {
            if (l instanceof V) {
                o2 = l;
            }
            else {
                o2 = null;
            }
            if (o2 == null) {
                o2 = new P((Object)l, 0);
            }
        }
        ((V)o2).F = this;
    Label_0092:
        while (true) {
            final Object c2 = this.C();
            if (c2 instanceof F) {
                final F f = (F)c2;
                if (f.C) {
                    c = a0.C;
                    while (!((AtomicReferenceFieldUpdater)c).compareAndSet((Object)this, c2, o2)) {
                        if (((AtomicReferenceFieldUpdater)c).get((Object)this) != c2) {
                            continue Label_0092;
                        }
                    }
                    return (D)o2;
                }
                c = new k();
                if (!f.C) {
                    c = new L((b0)c);
                }
                Object o3;
                do {
                    o3 = a0.C;
                    if (((AtomicReferenceFieldUpdater)o3).compareAndSet((Object)this, (Object)f, c)) {
                        break;
                    }
                } while (((AtomicReferenceFieldUpdater)o3).get((Object)this) == f);
            }
            else {
                if (!(c2 instanceof M)) {
                    if (b2) {
                        n n;
                        if (c2 instanceof n) {
                            n = (n)c2;
                        }
                        else {
                            n = null;
                        }
                        Object a = o;
                        if (n != null) {
                            a = n.a;
                        }
                        l.g(a);
                    }
                    return (D)c0.C;
                }
                final b0 e = ((M)c2).e();
                if (e == null) {
                    h.c("null cannot be cast to non-null type kotlinx.coroutines.JobNode", c2);
                    this.N((V)c2);
                }
                else {
                    Object c3 = c0.C;
                    Label_0400: {
                        if (b && c2 instanceof Y) {
                            final V v;
                            monitorenter(v = (V)c2);
                            Label_0392: {
                                Object o3 = null;
                                Label_0378: {
                                    try {
                                        o3 = ((Y)c2).c();
                                        if (o3 != null) {
                                            c = c3;
                                            if (!(l instanceof j)) {
                                                break Label_0378;
                                            }
                                            c = c3;
                                            if (((Y)c2).f()) {
                                                break Label_0378;
                                            }
                                        }
                                    }
                                    finally {
                                        break Label_0392;
                                    }
                                    if (!this.n((M)c2, e, (V)o2)) {
                                        monitorexit(v);
                                        continue;
                                    }
                                    if (o3 == null) {
                                        monitorexit(v);
                                        return (D)o2;
                                    }
                                    c = o2;
                                }
                                monitorexit(v);
                                c3 = c;
                                c = o3;
                                break Label_0400;
                            }
                            monitorexit(v);
                        }
                        else {
                            c = null;
                        }
                    }
                    if (c != null) {
                        if (b2) {
                            l.g(c);
                        }
                        return (D)c3;
                    }
                    if (this.n((M)c2, e, (V)o2)) {
                        return (D)o2;
                    }
                    continue;
                }
            }
        }
    }
    
    public boolean H() {
        return this instanceof w5.c;
    }
    
    public final Object I(final Object o) {
        Object q;
        do {
            q = this.Q(this.C(), o);
            if (q == v.c) {
                final StringBuilder sb = new StringBuilder("Job ");
                sb.append((Object)this);
                sb.append(" is already complete or completing, but is being completed with ");
                sb.append(o);
                final String string = sb.toString();
                final boolean b = o instanceof n;
                Throwable a = null;
                n n;
                if (b) {
                    n = (n)o;
                }
                else {
                    n = null;
                }
                if (n != null) {
                    a = n.a;
                }
                throw new IllegalStateException(string, a);
            }
        } while (q == v.e);
        return q;
    }
    
    public final void K(final b0 obj, final Throwable t) {
        final Object j = ((k)obj).j();
        h.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", j);
        k k = (k)j;
        Object o = null;
        while (!k.equals(obj)) {
            Object o2 = o;
            if (k instanceof T) {
                Object o3 = k;
                try {
                    ((V)o3).n(t);
                    o3 = o;
                }
                finally {
                    if (o != null) {
                        final Throwable t2;
                        a.a((Throwable)o, t2);
                        o2 = o;
                    }
                    else {
                        final StringBuilder sb = new StringBuilder("Exception in completion handler ");
                        sb.append(o3);
                        sb.append(" for ");
                        sb.append((Object)this);
                        final Throwable t2;
                        o2 = new RuntimeException(sb.toString(), t2);
                    }
                }
            }
            k = k.k();
            o = o2;
        }
        if (o != null) {
            this.E((c)o);
        }
        this.s(t);
    }
    
    public void L(final Object o) {
    }
    
    public void M() {
    }
    
    public final void N(final V v) {
        final k k = new k();
        v.getClass();
        B5.k.D.lazySet((Object)k, (Object)v);
        final AtomicReferenceFieldUpdater c = B5.k.C;
        c.lazySet((Object)k, (Object)v);
    Label_0031:
        while (true) {
            while (((k)v).j() == v) {
                while (!c.compareAndSet((Object)v, (Object)v, (Object)k)) {
                    if (c.get((Object)v) != v) {
                        continue Label_0031;
                    }
                }
                k.i((k)v);
                final k i = ((k)v).k();
                AtomicReferenceFieldUpdater c2;
                do {
                    c2 = a0.C;
                    if (c2.compareAndSet((Object)this, (Object)v, (Object)i)) {
                        break;
                    }
                } while (c2.get((Object)this) == v);
                return;
            }
            continue;
        }
    }
    
    public final int O(final Object o) {
        final boolean b = o instanceof F;
        final AtomicReferenceFieldUpdater c = a0.C;
        if (b) {
            if (((F)o).C) {
                return 0;
            }
            while (!c.compareAndSet((Object)this, o, (Object)v.i)) {
                if (c.get((Object)this) != o) {
                    return -1;
                }
            }
            return 1;
        }
        else {
            if (o instanceof L) {
                while (!c.compareAndSet((Object)this, o, (Object)((L)o).C)) {
                    if (c.get((Object)this) != o) {
                        return -1;
                    }
                }
                return 1;
            }
            return 0;
        }
    }
    
    public final Object Q(Object o, final Object o2) {
        if (!(o instanceof M)) {
            return v.c;
        }
        if ((o instanceof F || o instanceof V) && !(o instanceof j) && !(o2 instanceof n)) {
            final M m = (M)o;
            if (o2 instanceof M) {
                o = new N((M)o2);
            }
            else {
                o = o2;
            }
            AtomicReferenceFieldUpdater c;
            do {
                c = a0.C;
                if (c.compareAndSet((Object)this, (Object)m, o)) {
                    this.L(o2);
                    this.v(m, o2);
                    return o2;
                }
            } while (c.get((Object)this) == m);
            return v.e;
        }
        final M i = (M)o;
        final b0 b = this.B(i);
        if (b == null) {
            o = v.e;
        }
        else {
            final boolean b2 = i instanceof Y;
            final k k = null;
            Y y;
            if (b2) {
                y = (Y)i;
            }
            else {
                y = null;
            }
            Y y2 = y;
            if (y == null) {
                y2 = new Y(b, (Throwable)null);
            }
            final Y y3;
            monitorenter(y3 = y2);
            Label_0443: {
                try {
                    if (y2.f()) {
                        final w c2 = v.c;
                        monitorexit(y3);
                        return o;
                    }
                    Y.D.set((Object)y2, 1);
                    if (y2 != i) {
                        final AtomicReferenceFieldUpdater c3 = a0.C;
                        while (!c3.compareAndSet((Object)this, (Object)i, (Object)y2)) {
                            if (c3.get((Object)this) != i) {
                                final w e = v.e;
                                monitorexit(y3);
                                return o;
                            }
                        }
                    }
                }
                finally {
                    break Label_0443;
                }
                final boolean d = y2.d();
                n n;
                if (o2 instanceof n) {
                    n = (n)o2;
                }
                else {
                    n = null;
                }
                if (n != null) {
                    y2.b(n.a);
                }
                Throwable c4 = y2.c();
                if (d) {
                    c4 = null;
                }
                monitorexit(y3);
                if (c4 != null) {
                    this.K(b, c4);
                }
                Object o3;
                if (i instanceof j) {
                    o3 = i;
                }
                else {
                    o3 = null;
                }
                if (o3 == null) {
                    final b0 e2 = i.e();
                    o3 = k;
                    if (e2 != null) {
                        o3 = J((k)e2);
                    }
                }
                if (o3 != null) {
                    while (v.g((Q)((j)o3).G, false, (V)new X(this, y2, (j)o3, o2), 1) == c0.C) {
                        if ((o3 = J((k)o3)) == null) {
                            return this.x(y2, o2);
                        }
                    }
                    o = v.d;
                    return o;
                }
                o = this.x(y2, o2);
                return o;
            }
            monitorexit(y3);
        }
        return o;
    }
    
    @Override
    public boolean a() {
        final Object c = this.C();
        return c instanceof M && ((M)c).a();
    }
    
    @Override
    public void b(final CancellationException ex) {
        Object o = ex;
        if (ex == null) {
            o = new S(this.t(), (Throwable)null, this);
        }
        this.r((CancellationException)o);
    }
    
    @Override
    public final i c(i i) {
        h.e("context", (Object)i);
        if (i == e5.j.C) {
            i = this;
        }
        else {
            i = (i)i.f(this, (p)new b(1));
        }
        return i;
    }
    
    @Override
    public final Object f(final Object o, final p p2) {
        return p2.f(o, this);
    }
    
    @Override
    public final e5.h getKey() {
        return (e5.h)t.D;
    }
    
    @Override
    public final g i(final e5.h h) {
        return a.h((g)this, h);
    }
    
    @Override
    public final i l(final e5.h h) {
        return a.m((g)this, h);
    }
    
    public final boolean n(final M m, final b0 c, final V v) {
        final Z z = new Z(v, this, m);
        boolean b = false;
    Label_0161:
        while (true) {
            k h;
            if ((h = ((k)c).h()) == null) {
                AtomicReferenceFieldUpdater d;
                for (d = k.D, h = (k)d.get((Object)c); h.l(); h = (k)d.get((Object)h)) {}
            }
            k.D.lazySet((Object)v, (Object)h);
            final AtomicReferenceFieldUpdater c2 = k.C;
            c2.lazySet((Object)v, (Object)c);
            z.c = c;
            while (true) {
                do {
                    final boolean compareAndSet = c2.compareAndSet((Object)h, (Object)c, (Object)z);
                    b = false;
                    if (compareAndSet) {
                        int n;
                        if (((B5.b)z).a(h) == null) {
                            n = 1;
                        }
                        else {
                            n = 2;
                        }
                        if (n == 1) {
                            b = true;
                            break Label_0161;
                        }
                        if (n != 2) {
                            continue Label_0161;
                        }
                        break Label_0161;
                    }
                } while (c2.get((Object)h) == c);
                int n = 0;
                continue;
            }
        }
        return b;
    }
    
    public void o(final Object o) {
    }
    
    public void p(final Object o) {
        this.o(o);
    }
    
    public final boolean q(Object o) {
        w c = v.c;
        boolean b = this.A();
        boolean b2 = false;
        Label_0105: {
            if (b) {
                while (true) {
                    Object o2;
                    do {
                        final Object c2 = this.C();
                        if (c2 instanceof M && (!(c2 instanceof Y) || !((Y)c2).f())) {
                            o2 = this.Q(c2, new n(this.w(o), false));
                        }
                        else {
                            o2 = v.c;
                            c = (w)o2;
                            if (o2 == v.d) {
                                return true;
                            }
                            break Label_0105;
                        }
                    } while (o2 == v.e);
                    continue;
                }
            }
        }
        Object o3 = null;
        Label_0500: {
            if ((o3 = c) == v.c) {
                final Throwable t = null;
                Object o4 = null;
            Label_0188:
                while (true) {
                    Label_0493: {
                        Object c3 = null;
                        Label_0460: {
                            Object q = null;
                            Block_18: {
                                b0 b3 = null;
                                Block_15: {
                                    while (true) {
                                        c3 = this.C();
                                        if (c3 instanceof Y) {
                                            break;
                                        }
                                        if (!(c3 instanceof M)) {
                                            break Label_0493;
                                        }
                                        if ((o3 = o4) == null) {
                                            o3 = this.w(o);
                                        }
                                        final M m = (M)c3;
                                        if (m.a()) {
                                            b3 = this.B(m);
                                            if (b3 == null) {
                                                o4 = o3;
                                            }
                                            else {
                                                c3 = new Y(b3, (Throwable)o3);
                                                AtomicReferenceFieldUpdater c4;
                                                do {
                                                    c4 = a0.C;
                                                    if (c4.compareAndSet((Object)this, (Object)m, c3)) {
                                                        break Block_15;
                                                    }
                                                } while (c4.get((Object)this) == m);
                                                o4 = o3;
                                            }
                                        }
                                        else {
                                            q = this.Q(c3, new n((Throwable)o3, false));
                                            if (q == v.c) {
                                                break Label_0460;
                                            }
                                            o4 = o3;
                                            if (q != v.e) {
                                                break Block_18;
                                            }
                                            continue;
                                        }
                                    }
                                    while (true) {
                                        final M i;
                                        monitorenter(i = (M)c3);
                                        Label_0285: {
                                            try {
                                                o3 = c3;
                                                o3.getClass();
                                                if (Y.F.get(o3) == v.g) {
                                                    final w w = v.f;
                                                    monitorexit(i);
                                                    o3 = w;
                                                    break Label_0500;
                                                }
                                                b = ((Y)c3).d();
                                                if ((o3 = o4) == null) {
                                                    o3 = this.w(o);
                                                }
                                            }
                                            finally {
                                                break Label_0285;
                                            }
                                            ((Y)c3).b((Throwable)o3);
                                            final Throwable c5 = ((Y)c3).c();
                                            Throwable t2 = t;
                                            if (!b) {
                                                t2 = c5;
                                            }
                                            monitorexit(i);
                                            if (t2 != null) {
                                                this.K(((Y)c3).C, t2);
                                            }
                                            final w w = v.c;
                                            continue Label_0188;
                                        }
                                        monitorexit(i);
                                    }
                                }
                                this.K(b3, (Throwable)o3);
                                final w w = v.c;
                                continue Label_0188;
                            }
                            o3 = q;
                            break Label_0500;
                        }
                        o = new StringBuilder("Cannot happen in ");
                        ((StringBuilder)o).append(c3);
                        throw new IllegalStateException(((StringBuilder)o).toString().toString());
                    }
                    final w w = v.f;
                    continue Label_0188;
                }
            }
        }
        if (o3 != v.c) {
            if (o3 != v.d) {
                if (o3 == v.f) {
                    return b2;
                }
                this.o(o3);
            }
        }
        b2 = true;
        return b2;
    }
    
    public void r(final CancellationException ex) {
        this.q(ex);
    }
    
    public final boolean s(final Throwable t) {
        final boolean h = this.H();
        final boolean b = true;
        if (h) {
            return true;
        }
        final boolean b2 = t instanceof CancellationException;
        final w5.i i = (w5.i)a0.D.get((Object)this);
        if (i != null && i != c0.C) {
            boolean b3 = b;
            if (!i.d(t)) {
                b3 = (b2 && b);
            }
            return b3;
        }
        return b2;
    }
    
    public String t() {
        return "Job was cancelled";
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getClass().getSimpleName());
        sb2.append('{');
        sb2.append(P(this.C()));
        sb2.append('}');
        sb.append(sb2.toString());
        sb.append('@');
        sb.append(v.d((Object)this));
        return sb.toString();
    }
    
    public boolean u(final Throwable t) {
        final boolean b = t instanceof CancellationException;
        boolean b2 = true;
        if (b) {
            return true;
        }
        if (!this.q(t) || !this.z()) {
            b2 = false;
        }
        return b2;
    }
    
    public final void v(M k, Object a) {
        final AtomicReferenceFieldUpdater d = a0.D;
        final w5.i i = (w5.i)d.get((Object)this);
        if (i != null) {
            ((D)i).dispose();
            d.set((Object)this, (Object)c0.C);
        }
        final boolean b = a instanceof n;
        Object o = null;
        n n;
        if (b) {
            n = (n)a;
        }
        else {
            n = null;
        }
        if (n != null) {
            a = n.a;
        }
        else {
            a = null;
        }
        if (k instanceof V) {
            try {
                ((V)k).n((Throwable)a);
            }
            finally {
                final StringBuilder sb = new StringBuilder("Exception in completion handler ");
                sb.append(k);
                sb.append(" for ");
                sb.append((Object)this);
                final Throwable t;
                this.E((c)new RuntimeException(sb.toString(), t));
            }
        }
        else {
            final b0 e = ((M)k).e();
            if (e != null) {
                final Object j = ((k)e).j();
                h.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", j);
                Object o2;
                Object o3;
                final Throwable t2;
                StringBuilder sb2;
                for (k = j; !k.equals(e); k = ((k)k).k(), o = o2) {
                    o2 = o;
                    if (k instanceof V) {
                        o3 = k;
                        try {
                            ((V)o3).n((Throwable)a);
                            o3 = o;
                        }
                        finally {
                            if (o != null) {
                                a.a((Throwable)o, t2);
                                o2 = o;
                            }
                            else {
                                sb2 = new StringBuilder("Exception in completion handler ");
                                sb2.append(o3);
                                sb2.append(" for ");
                                sb2.append((Object)this);
                                o2 = new RuntimeException(sb2.toString(), t2);
                            }
                        }
                    }
                }
                if (o != null) {
                    this.E((c)o);
                }
            }
        }
    }
    
    public final Throwable w(Object o) {
        if (o instanceof Throwable) {
            o = o;
        }
        else {
            final a0 a0 = (a0)o;
            final Object c = a0.C();
            final boolean b = c instanceof Y;
            CancellationException ex = null;
            Throwable t;
            if (b) {
                t = ((Y)c).c();
            }
            else if (c instanceof n) {
                t = ((n)c).a;
            }
            else {
                if (c instanceof M) {
                    final StringBuilder sb = new StringBuilder("Cannot be cancelling child in this state: ");
                    sb.append(c);
                    throw new IllegalStateException(sb.toString().toString());
                }
                t = null;
            }
            if (t instanceof CancellationException) {
                ex = (CancellationException)t;
            }
            Object o2;
            if ((o2 = ex) == null) {
                o2 = new S("Parent job is ".concat(P(c)), t, a0);
            }
            o = o2;
        }
        return (Throwable)o;
    }
    
    public final Object x(final Y y, Object o) {
        final boolean b = o instanceof n;
        final Throwable t = null;
        final Throwable t2 = null;
        n n;
        if (b) {
            n = (n)o;
        }
        else {
            n = null;
        }
        Throwable a;
        if (n != null) {
            a = n.a;
        }
        else {
            a = null;
        }
        synchronized (y) {
            y.d();
            final ArrayList g = y.g(a);
            Object o2;
            if (((List)g).isEmpty()) {
                o2 = t;
                if (y.d()) {
                    o2 = new S(this.t(), (Throwable)null, this);
                }
            }
            else {
                final Iterator iterator = ((Iterable)g).iterator();
                Object next;
                do {
                    next = t2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    next = iterator.next();
                } while (((Throwable)next) instanceof CancellationException);
                o2 = next;
                if (o2 == null) {
                    o2 = ((List)g).get(0);
                }
            }
            if (o2 != null) {
                if (((List)g).size() > 1) {
                    final Set setFromMap = Collections.newSetFromMap((Map)new IdentityHashMap(((List)g).size()));
                    for (final Throwable t3 : g) {
                        if (t3 != o2 && t3 != o2 && !(t3 instanceof CancellationException) && setFromMap.add((Object)t3)) {
                            a.a.a((Throwable)o2, t3);
                        }
                    }
                }
            }
            monitorexit(y);
            if (o2 != null) {
                if (o2 != a) {
                    o = new n((Throwable)o2, false);
                }
            }
            if (o2 != null && (this.s((Throwable)o2) || this.D((Throwable)o2))) {
                h.c("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally", o);
                w5.n.b.compareAndSet((Object)o, 0, 1);
            }
            this.L(o);
            final AtomicReferenceFieldUpdater c = a0.C;
            Object o3;
            if (o instanceof M) {
                o3 = new N((M)o);
            }
            else {
                o3 = o;
            }
            while (true) {
                while (!c.compareAndSet((Object)this, (Object)y, o3)) {
                    if (c.get((Object)this) != y) {
                        this.v((M)y, o);
                        return o;
                    }
                }
                continue;
            }
        }
    }
    
    public final CancellationException y() {
        final Object c = this.C();
        final boolean b = c instanceof Y;
        final CancellationException ex = null;
        CancellationException ex2 = null;
        Object o;
        if (b) {
            final Throwable c2 = ((Y)c).c();
            if (c2 == null) {
                final StringBuilder sb = new StringBuilder("Job is still new or active: ");
                sb.append((Object)this);
                throw new IllegalStateException(sb.toString().toString());
            }
            final String concat = this.getClass().getSimpleName().concat(" is cancelling");
            if (c2 instanceof CancellationException) {
                ex2 = (CancellationException)c2;
            }
            if ((o = ex2) == null) {
                String t;
                if ((t = concat) == null) {
                    t = this.t();
                }
                o = new S(t, c2, this);
            }
        }
        else {
            if (c instanceof M) {
                final StringBuilder sb2 = new StringBuilder("Job is still new or active: ");
                sb2.append((Object)this);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (c instanceof n) {
                final Throwable a = ((n)c).a;
                CancellationException ex3 = ex;
                if (a instanceof CancellationException) {
                    ex3 = (CancellationException)a;
                }
                if ((o = ex3) == null) {
                    o = new S(this.t(), a, this);
                }
            }
            else {
                o = new S(this.getClass().getSimpleName().concat(" has completed normally"), (Throwable)null, this);
            }
        }
        return (CancellationException)o;
    }
    
    public boolean z() {
        return true;
    }
}
