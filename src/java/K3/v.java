package k3;

import android.util.Log;
import m0.a;
import java.util.Collection;
import x.b;
import java.util.HashSet;
import y.c;
import x.g;
import y.j;
import java.util.Iterator;
import y.n;
import y.l;
import y.d;
import x.f;
import y.k;
import java.util.ArrayList;
import y.e;

public final class v
{
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    
    public void a(final e e, final int n, final ArrayList list, final k k) {
        final n d = e.d;
        if (d.c == null) {
            final f f = (f)this.c;
            if (d != ((x.e)f).d) {
                if (d != ((x.e)f).e) {
                    Object c;
                    if ((c = k) == null) {
                        c = new Object();
                        ((k)c).a = null;
                        ((k)c).b = new ArrayList();
                        ((k)c).a = d;
                        list.add(c);
                    }
                    d.c = (k)c;
                    ((k)c).b.add((Object)d);
                    final e h = d.h;
                    for (final d d2 : h.k) {
                        if (d2 instanceof e) {
                            this.a((e)d2, n, list, (k)c);
                        }
                    }
                    final e i = d.i;
                    for (final d d3 : i.k) {
                        if (d3 instanceof e) {
                            this.a((e)d3, n, list, (k)c);
                        }
                    }
                    if (n == 1 && d instanceof l) {
                        for (final d d4 : ((l)d).k.k) {
                            if (d4 instanceof e) {
                                this.a((e)d4, n, list, (k)c);
                            }
                        }
                    }
                    final Iterator iterator4 = h.l.iterator();
                    while (iterator4.hasNext()) {
                        this.a((e)iterator4.next(), n, list, (k)c);
                    }
                    final Iterator iterator5 = i.l.iterator();
                    while (iterator5.hasNext()) {
                        this.a((e)iterator5.next(), n, list, (k)c);
                    }
                    if (n == 1 && d instanceof l) {
                        final Iterator iterator6 = ((l)d).k.l.iterator();
                        while (iterator6.hasNext()) {
                            this.a((e)iterator6.next(), n, list, (k)c);
                        }
                    }
                }
            }
        }
    }
    
    public void b(final f f) {
        for (final x.e e : f.p0) {
            final int[] o0 = e.o0;
            final int n = o0[0];
            int d = o0[1];
            if (e.f0 == 8) {
                e.a = true;
            }
            else {
                final float w = e.w;
                if (w < 1.0f && n == 3) {
                    e.r = 2;
                }
                final float z = e.z;
                if (z < 1.0f && d == 3) {
                    e.s = 2;
                }
                if (e.V > 0.0f) {
                    if (n == 3 && (d == 2 || d == 1)) {
                        e.r = 3;
                    }
                    else if (d == 3 && (n == 2 || n == 1)) {
                        e.s = 3;
                    }
                    else if (n == 3 && d == 3) {
                        if (e.r == 0) {
                            e.r = 3;
                        }
                        if (e.s == 0) {
                            e.s = 3;
                        }
                    }
                }
                final x.d j = e.J;
                final x.d h = e.H;
                int d2 = 0;
                Label_0281: {
                    if ((d2 = n) == 3) {
                        d2 = n;
                        if (e.r == 1) {
                            if (h.f != null) {
                                d2 = n;
                                if (j.f != null) {
                                    break Label_0281;
                                }
                            }
                            d2 = 2;
                        }
                    }
                }
                final x.d k = e.K;
                final x.d i = e.I;
                if (d == 3 && e.s == 1 && (i.f == null || k.f == null)) {
                    d = 2;
                }
                final j d3 = e.d;
                ((n)d3).d = d2;
                final int r = e.r;
                ((n)d3).a = r;
                final l e2 = e.e;
                ((n)e2).d = d;
                final int s = e.s;
                ((n)e2).a = s;
                if ((d2 == 4 || d2 == 1 || d2 == 2) && (d == 4 || d == 1 || d == 2)) {
                    int o2 = e.o();
                    if (d2 == 4) {
                        o2 = ((x.e)f).o() - h.g - j.g;
                        d2 = 1;
                    }
                    int l = e.i();
                    if (d == 4) {
                        l = ((x.e)f).i() - i.g - k.g;
                        d = 1;
                    }
                    this.h(d2, o2, d, l, e);
                    ((n)e.d).e.d(e.o());
                    ((n)e.e).e.d(e.i());
                    e.a = true;
                }
                else {
                    final int[] o3 = ((x.e)f).o0;
                    final x.d[] p = e.P;
                    if (d2 == 3 && (d == 2 || d == 1)) {
                        if (r == 3) {
                            if (d == 2) {
                                this.h(2, 0, 2, 0, e);
                            }
                            final int m = e.i();
                            this.h(1, (int)(m * e.V + 0.5f), 1, m, e);
                            ((n)e.d).e.d(e.o());
                            ((n)e.e).e.d(e.i());
                            e.a = true;
                            continue;
                        }
                        if (r == 1) {
                            this.h(2, 0, d, 0, e);
                            ((n)e.d).e.m = e.o();
                            continue;
                        }
                        if (r == 2) {
                            final int n2 = o3[0];
                            if (n2 == 1 || n2 == 4) {
                                this.h(1, (int)(w * ((x.e)f).o() + 0.5f), d, e.i(), e);
                                ((n)e.d).e.d(e.o());
                                ((n)e.e).e.d(e.i());
                                e.a = true;
                                continue;
                            }
                        }
                        else if (p[0].f == null || p[1].f == null) {
                            this.h(2, 0, d, 0, e);
                            ((n)e.d).e.d(e.o());
                            ((n)e.e).e.d(e.i());
                            e.a = true;
                            continue;
                        }
                    }
                    if (d == 3) {
                        if (d2 == 2 || d2 == 1) {
                            if (s == 3) {
                                if (d2 == 2) {
                                    this.h(2, 0, 2, 0, e);
                                }
                                final int o4 = e.o();
                                float v = e.V;
                                if (e.W == -1) {
                                    v = 1.0f / v;
                                }
                                this.h(1, o4, 1, (int)(o4 * v + 0.5f), e);
                                ((n)e.d).e.d(e.o());
                                ((n)e.e).e.d(e.i());
                                e.a = true;
                                continue;
                            }
                            if (s == 1) {
                                this.h(d2, 0, 2, 0, e);
                                ((n)e.e).e.m = e.i();
                                continue;
                            }
                            if (s == 2) {
                                final int n3 = o3[1];
                                if (n3 == 1 || n3 == 4) {
                                    this.h(d2, e.o(), 1, (int)(z * ((x.e)f).i() + 0.5f), e);
                                    ((n)e.d).e.d(e.o());
                                    ((n)e.e).e.d(e.i());
                                    e.a = true;
                                    continue;
                                }
                            }
                            else if (p[2].f == null || p[3].f == null) {
                                this.h(2, 0, d, 0, e);
                                ((n)e.d).e.d(e.o());
                                ((n)e.e).e.d(e.i());
                                e.a = true;
                                continue;
                            }
                        }
                    }
                    if (d2 != 3 || d != 3) {
                        continue;
                    }
                    if (r != 1 && s != 1) {
                        if (s != 2 || r != 2 || o3[0] != 1 || o3[1] != 1) {
                            continue;
                        }
                        this.h(1, (int)(w * ((x.e)f).o() + 0.5f), 1, (int)(z * ((x.e)f).i() + 0.5f), e);
                        ((n)e.d).e.d(e.o());
                        ((n)e.e).e.d(e.i());
                        e.a = true;
                    }
                    else {
                        this.h(2, 0, 2, 0, e);
                        ((n)e.d).e.m = e.o();
                        ((n)e.e).e.m = e.i();
                    }
                }
            }
        }
    }
    
    public void c() {
        final ArrayList list = (ArrayList)this.e;
        list.clear();
        final f f = (f)this.d;
        ((x.e)f).d.f();
        ((x.e)f).e.f();
        list.add((Object)((x.e)f).d);
        list.add((Object)((x.e)f).e);
        final Iterator iterator = f.p0.iterator();
        Object o = null;
        while (iterator.hasNext()) {
            final x.e e = (x.e)iterator.next();
            if (e instanceof g) {
                final n n = new n(e);
                e.d.f();
                e.e.f();
                n.f = ((g)e).t0;
                list.add((Object)n);
            }
            else {
                if (e.v()) {
                    if (e.b == null) {
                        e.b = new c(e, 0);
                    }
                    HashSet set;
                    if ((set = (HashSet)o) == null) {
                        set = new HashSet();
                    }
                    set.add((Object)e.b);
                    o = set;
                }
                else {
                    list.add((Object)e.d);
                }
                HashSet set2;
                if (e.w()) {
                    if (e.c == null) {
                        e.c = new c(e, 1);
                    }
                    if ((set2 = (HashSet)o) == null) {
                        set2 = new HashSet();
                    }
                    set2.add((Object)e.c);
                }
                else {
                    list.add((Object)e.e);
                    set2 = (HashSet)o;
                }
                o = set2;
                if (!(e instanceof b)) {
                    continue;
                }
                list.add((Object)new n(e));
                o = set2;
            }
        }
        if (o != null) {
            list.addAll((Collection)o);
        }
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            ((n)iterator2.next()).f();
        }
        for (final n n2 : list) {
            if (n2.b == f) {
                continue;
            }
            n2.d();
        }
        final ArrayList list2 = (ArrayList)this.h;
        list2.clear();
        final f f2 = (f)this.c;
        this.e((n)((x.e)f2).d, 0, list2);
        this.e((n)((x.e)f2).e, 1, list2);
        this.a = false;
    }
    
    public int d(final f f, final int n) {
        final ArrayList list = (ArrayList)this.h;
        final int size = list.size();
        int i = 0;
        long max = 0L;
        while (i < size) {
            final n a = ((k)list.get(i)).a;
            long n2 = 0L;
            Label_0537: {
                Label_0096: {
                    if (a instanceof c) {
                        if (((n)a).f == n) {
                            break Label_0096;
                        }
                    }
                    else if (n == 0) {
                        if (a instanceof j) {
                            break Label_0096;
                        }
                    }
                    else if (a instanceof l) {
                        break Label_0096;
                    }
                    n2 = 0L;
                    break Label_0537;
                }
                Object o;
                if (n == 0) {
                    o = ((x.e)f).d;
                }
                else {
                    o = ((x.e)f).e;
                }
                final e h = ((n)o).h;
                Object o2;
                if (n == 0) {
                    o2 = ((x.e)f).d;
                }
                else {
                    o2 = ((x.e)f).e;
                }
                final e j = ((n)o2).i;
                final boolean contains = a.h.l.contains((Object)h);
                final e k = a.i;
                final boolean contains2 = k.l.contains((Object)j);
                final long l = a.j();
                final e h2 = a.h;
                if (contains && contains2) {
                    final long b = y.k.b(h2, 0L);
                    final long a2 = y.k.a(k, 0L);
                    final long n3 = b - l;
                    final int f2 = k.f;
                    long n4 = n3;
                    if (n3 >= -f2) {
                        n4 = n3 + f2;
                    }
                    final long n5 = -a2;
                    final long n6 = h2.f;
                    long n8;
                    final long n7 = n8 = n5 - l - n6;
                    if (n7 >= n6) {
                        n8 = n7 - n6;
                    }
                    final x.e b2 = a.b;
                    float n9;
                    if (n == 0) {
                        n9 = b2.c0;
                    }
                    else if (n == 1) {
                        n9 = b2.d0;
                    }
                    else {
                        b2.getClass();
                        n9 = -1.0f;
                    }
                    long n10;
                    if (n9 > 0.0f) {
                        n10 = (long)(n4 / (1.0f - n9) + n8 / n9);
                    }
                    else {
                        n10 = 0L;
                    }
                    final float n11 = (float)n10;
                    n2 = h2.f + ((long)(n11 * n9 + 0.5f) + l + (long)((1.0f - n9) * n11 + 0.5f)) - k.f;
                }
                else if (contains) {
                    n2 = Math.max(y.k.b(h2, (long)h2.f), h2.f + l);
                }
                else if (contains2) {
                    n2 = Math.max(-y.k.a(k, (long)k.f), -k.f + l);
                }
                else {
                    n2 = a.j() + h2.f - k.f;
                }
            }
            max = Math.max(max, n2);
            ++i;
        }
        return (int)max;
    }
    
    public void e(final n n, final int n2, final ArrayList list) {
        final Iterator iterator = n.h.k.iterator();
        e i;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            i = n.i;
            if (!hasNext) {
                break;
            }
            final d d = (d)iterator.next();
            if (d instanceof e) {
                this.a((e)d, n2, list, null);
            }
            else {
                if (!(d instanceof n)) {
                    continue;
                }
                this.a(((n)d).h, n2, list, null);
            }
        }
        for (final d d2 : i.k) {
            if (d2 instanceof e) {
                this.a((e)d2, n2, list, null);
            }
            else {
                if (!(d2 instanceof n)) {
                    continue;
                }
                this.a(((n)d2).i, n2, list, null);
            }
        }
        if (n2 == 1) {
            for (final d d3 : ((l)n).k.k) {
                if (d3 instanceof e) {
                    this.a((e)d3, n2, list, null);
                }
            }
        }
    }
    
    public boolean f() {
        monitorenter(this);
        while (true) {
            Label_0028: {
                try {
                    final Boolean b = (Boolean)this.h;
                    if (b != null) {
                        final boolean b2 = b;
                        break Label_0045;
                    }
                    break Label_0028;
                }
                finally {
                    monitorexit(this);
                    boolean b2 = false;
                    this.g(b2);
                    monitorexit(this);
                    return b2;
                    try {
                        b2 = ((X2.f)this.d).k();
                    }
                    catch (final IllegalStateException ex) {
                        b2 = false;
                    }
                    continue;
                }
            }
            break;
        }
    }
    
    public void g(final boolean b) {
        String s;
        if (b) {
            s = "ENABLED";
        }
        else {
            s = "DISABLED";
        }
        String s2;
        if (this.h == null) {
            s2 = "global Firebase setting";
        }
        else if (this.b) {
            s2 = "firebase_crashlytics_collection_enabled manifest flag";
        }
        else {
            s2 = "API";
        }
        final String i = m0.a.i("Crashlytics automatic data collection ", s, " by ", s2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i, (Throwable)null);
        }
    }
    
    public void h(int g, final int c, final int b, final int d, final x.e e) {
        final y.b b2 = (y.b)this.g;
        b2.a = g;
        b2.b = b;
        b2.c = c;
        b2.d = d;
        ((A.f)this.f).b(e, b2);
        e.K(b2.e);
        e.H(b2.f);
        e.E = b2.h;
        g = b2.g;
        e.Z = g;
        e.E = (g > 0);
    }
    
    public void i() {
        for (final x.e e : ((f)this.c).p0) {
            if (e.a) {
                continue;
            }
            final int[] o0 = e.o0;
            final int n = 0;
            final int n2 = o0[0];
            final int n3 = o0[1];
            final int r = e.r;
            final int s = e.s;
            final boolean b = n2 == 2 || (n2 == 3 && r == 1);
            int n4 = 0;
            Label_0133: {
                if (n3 != 2) {
                    n4 = n;
                    if (n3 != 3) {
                        break Label_0133;
                    }
                    n4 = n;
                    if (s != 1) {
                        break Label_0133;
                    }
                }
                n4 = 1;
            }
            final y.f e2 = ((n)e.d).e;
            final boolean j = ((e)e2).j;
            final y.f e3 = ((n)e.e).e;
            final boolean i = ((e)e3).j;
            if (j && i) {
                this.h(1, ((e)e2).g, 1, ((e)e3).g, e);
                e.a = true;
            }
            else if (j && n4 != 0) {
                this.h(1, ((e)e2).g, 2, ((e)e3).g, e);
                if (n3 == 3) {
                    ((n)e.e).e.m = e.i();
                }
                else {
                    ((n)e.e).e.d(e.i());
                    e.a = true;
                }
            }
            else if (i && b) {
                this.h(2, ((e)e2).g, 1, ((e)e3).g, e);
                if (n2 == 3) {
                    ((n)e.d).e.m = e.o();
                }
                else {
                    ((n)e.d).e.d(e.o());
                    e.a = true;
                }
            }
            if (!e.a) {
                continue;
            }
            final y.a l = e.e.l;
            if (l == null) {
                continue;
            }
            ((y.f)l).d(e.Z);
        }
    }
}
