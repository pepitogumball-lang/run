package Z;

import java.util.logging.Logger;
import Y.f;
import Y.c;
import androidx.datastore.preferences.protobuf.k;
import java.util.Set;
import W.p;
import androidx.datastore.preferences.protobuf.y;
import java.util.Iterator;
import androidx.datastore.preferences.protobuf.B;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collections;
import n3.u0;
import java.io.IOException;
import Y.i;
import java.util.Map$Entry;
import java.util.Arrays;
import Y.e;
import java.io.FileInputStream;

public final class h
{
    public static final h a;
    
    static {
        a = (h)new Object();
    }
    
    public final b a(final FileInputStream fileInputStream) {
        try {
            final e l = e.l(fileInputStream);
            final b b = new b(false);
            final Z.e[] array = (Z.e[])Arrays.copyOf((Object[])new Z.e[0], 0);
            n5.h.e("pairs", (Object)array);
            b.a();
            if (array.length <= 0) {
                final Map j = l.j();
                n5.h.d("preferencesProto.preferencesMap", (Object)j);
                for (final Map$Entry map$Entry : j.entrySet()) {
                    final String s = (String)map$Entry.getKey();
                    final i i = (i)map$Entry.getValue();
                    n5.h.d("name", (Object)s);
                    n5.h.d("value", (Object)i);
                    final int x = i.x();
                    int n;
                    if (x == 0) {
                        n = -1;
                    }
                    else {
                        n = g.a[v.e.d(x)];
                    }
                    switch (n) {
                        default: {
                            throw new RuntimeException();
                        }
                        case 8: {
                            throw new IOException("Value not set.", (Throwable)null);
                        }
                        case 7: {
                            final d d = new d(s);
                            final y k = i.w().k();
                            n5.h.d("value.stringSet.stringsList", (Object)k);
                            b.d(d, d5.d.N((Iterable)k));
                            continue;
                        }
                        case 6: {
                            final d d2 = new d(s);
                            final String v = i.v();
                            n5.h.d("value.string", (Object)v);
                            b.d(d2, v);
                            continue;
                        }
                        case 5: {
                            b.d(new d(s), i.u());
                            continue;
                        }
                        case 4: {
                            b.d(new d(s), i.t());
                            continue;
                        }
                        case 3: {
                            b.d(new d(s), i.r());
                            continue;
                        }
                        case 2: {
                            b.d(new d(s), i.s());
                            continue;
                        }
                        case 1: {
                            b.d(u0.e(s), i.p());
                            continue;
                        }
                        case -1: {
                            throw new IOException("Value case is null.", (Throwable)null);
                        }
                    }
                }
                final Map unmodifiableMap = Collections.unmodifiableMap(b.a);
                n5.h.d("unmodifiableMap(preferencesMap)", (Object)unmodifiableMap);
                return new b((Map)new LinkedHashMap(unmodifiableMap), true);
            }
            final Z.e e = array[0];
            throw null;
        }
        catch (final B b2) {
            throw new IOException("Unable to parse preferences proto.", (Throwable)b2);
        }
    }
    
    public final void b(Object value, final p p2) {
        final Map unmodifiableMap = Collections.unmodifiableMap(((b)value).a);
        n5.h.d("unmodifiableMap(preferencesMap)", (Object)unmodifiableMap);
        final c k = e.k();
        for (final Map$Entry map$Entry : unmodifiableMap.entrySet()) {
            final d d = (d)map$Entry.getKey();
            value = map$Entry.getValue();
            final String a = d.a;
            i i;
            if (value instanceof Boolean) {
                final Y.h y = Y.i.y();
                final boolean booleanValue = (boolean)value;
                y.d();
                Y.i.m((i)y.D, booleanValue);
                i = (i)y.a();
            }
            else if (value instanceof Float) {
                final Y.h y2 = Y.i.y();
                final float floatValue = ((Number)value).floatValue();
                y2.d();
                Y.i.n((i)y2.D, floatValue);
                i = (i)y2.a();
            }
            else if (value instanceof Double) {
                final Y.h y3 = Y.i.y();
                final double doubleValue = ((Number)value).doubleValue();
                y3.d();
                Y.i.l((i)y3.D, doubleValue);
                i = (i)y3.a();
            }
            else if (value instanceof Integer) {
                final Y.h y4 = Y.i.y();
                final int intValue = ((Number)value).intValue();
                y4.d();
                Y.i.o((i)y4.D, intValue);
                i = (i)y4.a();
            }
            else if (value instanceof Long) {
                final Y.h y5 = Y.i.y();
                final long longValue = ((Number)value).longValue();
                y5.d();
                Y.i.i((i)y5.D, longValue);
                i = (i)y5.a();
            }
            else if (value instanceof String) {
                final Y.h y6 = Y.i.y();
                final String s = (String)value;
                y6.d();
                Y.i.j((i)y6.D, s);
                i = (i)y6.a();
            }
            else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(n5.h.g("PreferencesSerializer does not support type: ", (Object)value.getClass().getName()));
                }
                final Y.h y7 = Y.i.y();
                final f l = Y.g.l();
                final Set set = (Set)value;
                l.d();
                Y.g.i((Y.g)l.D, set);
                y7.d();
                Y.i.k((i)y7.D, l);
                i = (i)y7.a();
            }
            k.getClass();
            a.getClass();
            k.d();
            e.i((e)k.D).put((Object)a, (Object)i);
        }
        final e e = (e)k.a();
        final int a2 = e.a();
        final Logger h = androidx.datastore.preferences.protobuf.k.h;
        int n;
        if ((n = a2) > 4096) {
            n = 4096;
        }
        final k j = new k(p2, n);
        e.c(j);
        if (j.f > 0) {
            j.P();
        }
    }
}
