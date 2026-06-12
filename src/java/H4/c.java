package h4;

import k3.j;
import java.util.Iterator;
import java.util.Map$Entry;
import d5.o;
import n5.h;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c
{
    public static final c a;
    public static final Map b;
    
    static {
        a = (c)new Object();
        b = Collections.synchronizedMap((Map)new LinkedHashMap());
    }
    
    public static a a(final d d) {
        final Map b = c.b;
        h.d("dependencies", (Object)b);
        final Object value = b.get((Object)d);
        if (value != null) {
            return (a)value;
        }
        final StringBuilder sb = new StringBuilder("Cannot get dependency ");
        sb.append((Object)d);
        sb.append(". Dependencies should be added at class load time.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final Object b(final g5.c c) {
        g5.c c2 = null;
        Label_0045: {
            if (c instanceof b) {
                c2 = c;
                final int n = ((b)c2).N;
                if ((n & Integer.MIN_VALUE) != 0x0) {
                    ((b)c2).N = n + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            c2 = new b(this, c);
        }
        final Object l = ((b)c2).L;
        final f5.a c3 = f5.a.C;
        final int n2 = ((b)c2).N;
        LinkedHashMap linkedHashMap = null;
        Label_0315: {
            Iterator g;
            b b;
            if (n2 != 0) {
                if (n2 == 1) {
                    final Object k = ((b)c2).K;
                    final Map map = ((b)c2).J;
                    final Object i = ((b)c2).I;
                    final d h = ((b)c2).H;
                    g = ((b)c2).G;
                    final Map map2 = ((b)c2).F;
                    com.google.android.gms.internal.auth.h.z(l);
                    b = (b)c2;
                    break Label_0315;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                com.google.android.gms.internal.auth.h.z(l);
                final Map b2 = c.b;
                h.d("dependencies", (Object)b2);
                linkedHashMap = new LinkedHashMap(o.G(b2.size()));
                g = ((Iterable)b2.entrySet()).iterator();
                b = (b)c2;
            }
            while (true) {
                if (!g.hasNext()) {
                    return linkedHashMap;
                }
                final Map$Entry map$Entry = (Map$Entry)g.next();
                final Object key = map$Entry.getKey();
                final d h = (d)map$Entry.getKey();
                final Object i = ((a)map$Entry.getValue()).a;
                final Map map3 = (Map)linkedHashMap;
                b.F = map3;
                b.G = g;
                b.H = h;
                b.I = (E5.a)i;
                b.J = map3;
                b.K = key;
                b.N = 1;
                if (((E5.d)i).d((g5.c)b) == c3) {
                    return c3;
                }
                final Map map = (Map)linkedHashMap;
                final Object k = key;
                try {
                    n5.h.e("subscriberName", (Object)h);
                    final j b3 = a(h).b;
                    if (b3 != null) {
                        ((E5.d)i).e((Object)null);
                        map.put(k, (Object)b3);
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder("Subscriber ");
                    sb.append((Object)h);
                    sb.append(" has not been registered.");
                    throw new IllegalStateException(sb.toString());
                }
                finally {
                    ((E5.d)i).e((Object)null);
                }
                break;
            }
        }
        return linkedHashMap;
    }
}
