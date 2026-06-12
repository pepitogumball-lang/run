package t1;

import com.google.android.gms.internal.ads.U1;
import c2.k;
import java.util.Iterator;
import c4.f;
import java.io.IOException;
import java.net.URL;
import m1.m;
import m1.t;
import m1.s;
import com.google.android.gms.internal.measurement.L;
import m1.p;
import m1.o;
import m1.z;
import m1.r;
import m1.q;
import m1.v;
import m1.G;
import m1.H;
import android.util.Log;
import java.nio.charset.Charset;
import m1.J;
import java.util.Map$Entry;
import java.util.List;
import n1.l;
import java.io.ByteArrayOutputStream;
import n1.n;
import java.util.HashMap;
import java.util.Objects;
import java.util.ArrayList;
import v1.b;
import u1.i;
import n1.j;
import w1.a;
import java.util.concurrent.Executor;
import u1.d;
import o1.e;
import android.content.Context;

public final class h
{
    public final Context a;
    public final e b;
    public final d c;
    public final c d;
    public final Executor e;
    public final v1.c f;
    public final a g;
    public final a h;
    public final u1.c i;
    
    public h(final Context a, final e b, final d c, final c d, final Executor e, final v1.c f, final a g, final a h, final u1.c i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void a(final j j, final int n) {
        int n2 = 3;
        Object o = this.b.a(j.a);
        long n3 = 0L;
    Label_0131_Outer:
        while (true) {
            Object o2 = new g(this, j, 0);
            final i i = (i)this.f;
            Label_2109: {
                if (!(boolean)i.g((b)o2)) {
                    break Label_2109;
                }
                final Iterable iterable = (Iterable)i.g((b)new g(this, j, 1));
                if (!iterable.iterator().hasNext()) {
                    break;
                }
                final byte[] b = j.b;
            Label_0131:
                while (true) {
                    if (o == null) {
                        J5.b.v("Uploader", "Unknown backend for %s, deleting event batch for it...", (Object)j);
                        final Object o3 = new o1.a(-1L, n2);
                        o2 = o;
                        o = o3;
                        break Label_0131;
                    }
                    Object o3 = new ArrayList();
                    final Iterator iterator = iterable.iterator();
                    while (iterator.hasNext()) {
                        ((ArrayList)o3).add((Object)((u1.b)iterator.next()).c);
                    }
                    final boolean b2 = b != null;
                    o2 = "proto";
                    Label_1857: {
                        Block_6: {
                            if (b2) {
                                break Block_6;
                            }
                            break Label_1857;
                            break Label_1857;
                        }
                        final u1.c k = this.i;
                        Objects.requireNonNull((Object)k);
                        final q1.a a = (q1.a)i.g((b)new h3.d((Object)k, 6));
                        Object o4 = new Object();
                        ((n1.h)o4).f = new HashMap();
                        ((n1.h)o4).d = this.g.i();
                        ((n1.h)o4).e = this.h.i();
                        ((n1.h)o4).a = "GDT_CLIENT_METRICS";
                        Object o5 = new k1.c("proto");
                        a.getClass();
                        final k a2 = n.a;
                        a2.getClass();
                        Object o6 = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                a2.j((Object)a, (ByteArrayOutputStream)o6);
                                ((n1.h)o4).c = new l((k1.c)o5, ((ByteArrayOutputStream)o6).toByteArray());
                                o6 = ((n1.h)o4).b();
                                ((ArrayList)o3).add((Object)((l1.c)o).a((n1.i)o6));
                                final l1.c c = (l1.c)o;
                                o6 = new HashMap();
                                o5 = ((ArrayList)o3).iterator();
                                while (((Iterator)o5).hasNext()) {
                                    o4 = ((Iterator)o5).next();
                                    final String a3 = ((n1.i)o4).a;
                                    if (!((HashMap)o6).containsKey((Object)a3)) {
                                        o3 = new ArrayList();
                                        ((ArrayList)o3).add(o4);
                                        ((HashMap)o6).put((Object)a3, o3);
                                    }
                                    else {
                                        ((List)((HashMap)o6).get((Object)a3)).add(o4);
                                    }
                                }
                                final ArrayList list = new ArrayList();
                                o3 = ((HashMap)o6).entrySet().iterator();
                                while (((Iterator)o3).hasNext()) {
                                    o6 = ((Iterator)o3).next();
                                    o4 = ((List)((Map$Entry)o6).getValue()).get(0);
                                    o5 = J.C;
                                    final long l = c.f.i();
                                    final long m = c.e.i();
                                    final int b3 = ((n1.i)o4).b("sdk-version");
                                    o5 = ((n1.i)o4).a("model");
                                    final m1.n n4 = new m1.n(new m1.l(Integer.valueOf(b3), (String)o5, ((n1.i)o4).a("hardware"), ((n1.i)o4).a("device"), ((n1.i)o4).a("product"), ((n1.i)o4).a("os-uild"), ((n1.i)o4).a("manufacturer"), ((n1.i)o4).a("fingerprint"), ((n1.i)o4).a("locale"), ((n1.i)o4).a("country"), ((n1.i)o4).a("mcc_mnc"), ((n1.i)o4).a("application_build")));
                                    String s;
                                    try {
                                        o5 = Integer.parseInt((String)((Map$Entry)o6).getKey());
                                        s = null;
                                    }
                                    catch (final NumberFormatException o4) {
                                        s = (String)((Map$Entry)o6).getKey();
                                        o5 = null;
                                    }
                                    final ArrayList list2 = new ArrayList();
                                    final Iterator iterator2 = ((List)((Map$Entry)o6).getValue()).iterator();
                                    while (iterator2.hasNext()) {
                                        o6 = iterator2.next();
                                        final l c2 = ((n1.i)o6).c;
                                        o4 = c2.a;
                                        final boolean equals = ((k1.c)o4).equals(new k1.c((String)o2));
                                        final byte[] b4 = c2.b;
                                        Object o7;
                                        if (equals) {
                                            o7 = new Object();
                                            ((C2.z)o7).f = b4;
                                        }
                                        else if (((k1.c)o4).equals(new k1.c("json"))) {
                                            o4 = new String(b4, Charset.forName("UTF-8"));
                                            o7 = new Object();
                                            ((C2.z)o7).a = o4;
                                        }
                                        else {
                                            final String c3 = J5.b.C("CctTransportBackend");
                                            if (Log.isLoggable(c3, 5)) {
                                                o6 = new StringBuilder("Received event of unsupported encoding ");
                                                ((StringBuilder)o6).append(o4);
                                                ((StringBuilder)o6).append(". Skipping...");
                                                Log.w(c3, ((StringBuilder)o6).toString());
                                                continue Label_0131_Outer;
                                            }
                                            continue Label_0131_Outer;
                                        }
                                        ((C2.z)o7).b = ((n1.i)o6).d;
                                        ((C2.z)o7).e = ((n1.i)o6).e;
                                        o4 = ((n1.i)o6).f.get((Object)"tz-offset");
                                        long longValue;
                                        if (o4 == null) {
                                            longValue = 0L;
                                        }
                                        else {
                                            longValue = Long.valueOf((String)o4);
                                        }
                                        ((C2.z)o7).g = longValue;
                                        o4 = H.C.get(((n1.i)o6).b("net-type"));
                                        ((C2.z)o7).h = new v((H)o4, (G)G.C.get(((n1.i)o6).b("mobile-subtype")));
                                        o4 = ((n1.i)o6).b;
                                        if (o4 != null) {
                                            ((C2.z)o7).c = o4;
                                        }
                                        o4 = ((n1.i)o6).g;
                                        if (o4 != null) {
                                            o4 = new r(new q((Integer)o4));
                                            final z c4 = z.C;
                                            ((C2.z)o7).d = new o((r)o4);
                                        }
                                        o4 = ((n1.i)o6).j;
                                        o6 = ((n1.i)o6).i;
                                        if (o6 != null || o4 != null) {
                                            if (o6 == null) {
                                                o6 = null;
                                            }
                                            if (o4 == null) {
                                                o4 = null;
                                            }
                                            ((C2.z)o7).i = new p((byte[])o6, (byte[])o4);
                                        }
                                        if (((C2.z)o7).b == null) {
                                            o4 = " eventTimeMs";
                                        }
                                        else {
                                            o4 = "";
                                        }
                                        o6 = o4;
                                        if (((C2.z)o7).e == null) {
                                            o6 = ((String)o4).concat(" eventUptimeMs");
                                        }
                                        o4 = o6;
                                        if (((C2.z)o7).g == null) {
                                            o4 = L.i((String)o6, " timezoneOffsetSeconds");
                                        }
                                        if (!((String)o4).isEmpty()) {
                                            throw new IllegalStateException("Missing required properties:".concat((String)o4));
                                        }
                                        list2.add((Object)new s((long)((C2.z)o7).b, (Integer)((C2.z)o7).c, (o)((C2.z)o7).d, (long)((C2.z)o7).e, (byte[])((C2.z)o7).f, (String)((C2.z)o7).a, (long)((C2.z)o7).g, (v)((C2.z)o7).h, (p)((C2.z)o7).i));
                                    }
                                    list.add((Object)new t(l, m, n4, (Integer)o5, s, list2));
                                }
                                o2 = o;
                                o4 = new m(list);
                                o3 = c.d;
                                Label_1581: {
                                    if (b != null) {
                                        try {
                                            o6 = l1.a.a(b);
                                            o = ((l1.a)o6).b;
                                            if (o == null) {
                                                o = null;
                                            }
                                            o6 = ((l1.a)o6).a;
                                            if (o6 != null) {
                                                o3 = l1.c.b((String)o6);
                                            }
                                            break Label_1581;
                                        }
                                        catch (IllegalArgumentException o) {
                                            o = new o1.a(-1L, 3);
                                            n2 = 3;
                                            continue Label_0131;
                                        }
                                    }
                                    o = null;
                                    try {
                                        o6 = new l1.b((URL)o3, (m)o4, (String)o);
                                        o4 = new h3.d((Object)c, 3);
                                        int n5 = 5;
                                        o = o6;
                                        while (true) {
                                            while (true) {
                                                int d = 0;
                                                Label_1748: {
                                                    while (true) {
                                                        try {
                                                            do {
                                                                o6 = ((h3.d)o4).a(o);
                                                                o5 = ((U1)o6).F;
                                                                if (o5 != null) {
                                                                    J5.b.v("CctTransportBackend", "Following redirect to: %s", o5);
                                                                    o3 = (o = new l1.b((URL)o5, ((l1.b)o).b, ((l1.b)o).c));
                                                                }
                                                                else {
                                                                    o = null;
                                                                }
                                                            } while (o != null && --n5 >= 1);
                                                            d = ((U1)o6).D;
                                                            if (d == 200) {
                                                                o = new o1.a(((U1)o6).E, 1);
                                                                n2 = 3;
                                                                break Label_1857;
                                                            }
                                                            break Label_1748;
                                                            break Label_1581;
                                                        }
                                                        catch (final IOException o) {
                                                            continue;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (d >= 500 || d == 404) {
                                                    n2 = 3;
                                                    break;
                                                }
                                                if (d == 400) {
                                                    o = new o1.a(-1L, 4);
                                                    continue;
                                                }
                                                break;
                                            }
                                            n2 = 3;
                                            try {
                                                o = new o1.a(-1L, 3);
                                                continue Label_0131;
                                            }
                                            catch (final IOException o) {
                                                break Label_1581;
                                            }
                                            break;
                                        }
                                        o = new o1.a(-1L, 2);
                                        continue Label_0131;
                                    }
                                    catch (final IOException ex) {}
                                }
                                n2 = 3;
                                J5.b.w("CctTransportBackend", "Could not make request to the backend", (Exception)o);
                                o = new o1.a(-1L, 2);
                                final int a4 = ((o1.a)o).a;
                                if (a4 == 2) {
                                    i.g((b)new f3.b(this, iterable, j, n3));
                                    this.d.a(j, n + 1, true);
                                    return;
                                }
                                i.g((b)new L3.g((Object)this, 13, (Object)iterable));
                                Label_2102: {
                                    long max;
                                    if (a4 == 1) {
                                        n3 = (max = Math.max(n3, ((o1.a)o).b));
                                        if (b != null) {
                                            i.g((b)new h3.d((Object)this, 8));
                                            max = n3;
                                        }
                                    }
                                    else {
                                        max = n3;
                                        if (a4 == 4) {
                                            o = new HashMap();
                                            o3 = iterable.iterator();
                                            while (((Iterator)o3).hasNext()) {
                                                o6 = ((u1.b)((Iterator)o3).next()).c.a;
                                                if (!((HashMap)o).containsKey(o6)) {
                                                    ((HashMap)o).put(o6, (Object)1);
                                                }
                                                else {
                                                    ((HashMap)o).put(o6, (Object)((int)((HashMap)o).get(o6) + 1));
                                                }
                                            }
                                            i.g((b)new L3.g((Object)this, 14, o));
                                            break Label_2102;
                                        }
                                    }
                                    n3 = max;
                                }
                                o = o2;
                                continue Label_0131_Outer;
                                i.g((b)new f((Object)this, (Object)j, n3));
                            }
                            catch (final IOException ex2) {
                                continue;
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
