package e3;

import L3.s;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Set;
import G.l;
import java.util.concurrent.Executor;
import java.util.Map$Entry;
import java.util.Collections;
import X2.b;
import java.util.Map;
import B3.a;
import f3.m;
import java.util.ArrayDeque;
import java.util.HashMap;
import B3.c;
import B3.d;

public final class i implements d, c
{
    public final HashMap a;
    public ArrayDeque b;
    public final m c;
    
    public i() {
        final m c = m.C;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = c;
    }
    
    public final void a(final a a) {
        a.getClass();
        monitorenter(this);
        Label_0033: {
            try {
                final ArrayDeque b = this.b;
                if (b != null) {
                    b.add((Object)a);
                    monitorexit(this);
                    return;
                }
                break Label_0033;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
                monitorenter(this);
                Label_0069: {
                    try {
                        final Map map = (Map)this.a.get((Object)b.class);
                        if (map == null) {
                            final Set set = Collections.emptySet();
                            break Label_0069;
                        }
                        break Label_0069;
                    }
                    finally {
                        monitorexit(this);
                        final Map map;
                        final Set set = map.entrySet();
                        break Label_0069;
                        while (true) {
                            final Iterator iterator;
                            final Map$Entry map$Entry = (Map$Entry)iterator.next();
                            ((Executor)map$Entry.getValue()).execute((Runnable)new l((Object)map$Entry, 17, (Object)a));
                            Label_0086: {
                                break Label_0086;
                                Label_0133: {
                                    return;
                                }
                                monitorexit(this);
                                iterator = set.iterator();
                            }
                            iftrue(Label_0133:)(!iterator.hasNext());
                            continue;
                        }
                    }
                }
            }
        }
    }
    
    public final void b(final Executor executor, final B3.b b) {
        monitorenter(this);
        Label_0053: {
            try {
                executor.getClass();
                if (!this.a.containsKey((Object)b.class)) {
                    this.a.put((Object)b.class, (Object)new ConcurrentHashMap());
                }
                break Label_0053;
            }
            finally {
                monitorexit(this);
                ((ConcurrentHashMap)this.a.get((Object)b.class)).put((Object)b, (Object)executor);
                monitorexit(this);
            }
        }
    }
    
    public final void c(final s s) {
        monitorenter(this);
        Label_0071: {
            try {
                s.getClass();
                if (!this.a.containsKey((Object)b.class)) {
                    monitorexit(this);
                    return;
                }
                final ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap)this.a.get((Object)b.class);
                concurrentHashMap.remove((Object)s);
                if (concurrentHashMap.isEmpty()) {
                    this.a.remove((Object)b.class);
                }
                break Label_0071;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
    }
}
