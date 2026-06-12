package e3;

import java.util.Set;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Map$Entry;
import Z4.J;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import com.google.firebase.components.ComponentRegistrar;
import B3.c;
import java.util.ArrayList;
import c0.f;
import java.util.concurrent.atomic.AtomicReference;
import java.util.HashSet;
import java.util.HashMap;
import L3.m;

public final class d implements b
{
    public static final m h;
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashSet d;
    public final i e;
    public final AtomicReference f;
    public final f g;
    
    static {
        h = new m(5);
    }
    
    public d(ArrayList list, ArrayList iterator, f g) {
        final f3.m c = f3.m.C;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        final i e = new i();
        this.e = e;
        this.g = g;
        g = (f)new ArrayList();
        ((ArrayList)g).add((Object)e3.a.c(e, i.class, B3.d.class, c.class));
        ((ArrayList)g).add((Object)e3.a.c(this, d.class, new Class[0]));
        for (final a a : iterator) {
            if (a != null) {
                ((ArrayList)g).add((Object)a);
            }
        }
        iterator = new ArrayList();
        final Iterator iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            iterator.add(iterator3.next());
        }
        list = new ArrayList();
        monitorenter(this);
        while (true) {
            E3.b b = null;
            Label_0312: {
                try {
                    iterator = (ArrayList)iterator.iterator();
                    while (((Iterator)iterator).hasNext()) {
                        final E3.b b2;
                        b = (b2 = (E3.b)((Iterator)iterator).next());
                        final Object o = b2.get();
                        final ComponentRegistrar componentRegistrar = (ComponentRegistrar)o;
                        final ComponentRegistrar componentRegistrar3;
                        final ComponentRegistrar componentRegistrar2 = componentRegistrar3 = componentRegistrar;
                        if (componentRegistrar3 != null) {
                            final f f = g;
                            final d d = this;
                            final f f2 = d.g;
                            final ComponentRegistrar componentRegistrar4 = componentRegistrar2;
                            final List list2 = f2.q(componentRegistrar4);
                            ((ArrayList)f).addAll((Collection)list2);
                            final ArrayList list3 = iterator;
                            ((Iterator)list3).remove();
                        }
                    }
                    break Label_0312;
                }
                finally {
                    final ArrayList list4;
                    list = list4;
                    monitorexit(this);
                    final ArrayList list5;
                    Label_0441: {
                        list5 = new ArrayList((Collection)this.a.keySet());
                    }
                    list5.addAll((Collection)g);
                    I5.d.d(list5);
                    Iterator iterator4 = null;
                    int n;
                    Boolean b3;
                    Iterator iterator5;
                    int length;
                    Object[] array;
                    Iterator iterator6;
                    Object o2 = null;
                    a a2;
                    Label_0418_Outer:Label_0318_Outer:
                    while (true) {
                        Block_16: {
                            while (true) {
                                Block_13: {
                                Label_0563:
                                    while (true) {
                                    Label_0318:
                                        while (true) {
                                            while (true) {
                                                Label_0466: {
                                                    break Label_0466;
                                                    iftrue(Label_0532:)(!iterator4.hasNext());
                                                    break Block_16;
                                                    ++n;
                                                    Block_17: {
                                                        Block_18: {
                                                            Block_12: {
                                                            Block_15:
                                                                while (true) {
                                                                    break Label_0354;
                                                                    Label_0424:
                                                                    iftrue(Label_0441:)(!this.a.isEmpty());
                                                                    break Block_15;
                                                                    Label_0589:
                                                                    b3 = (Boolean)this.f.get();
                                                                    iftrue(Label_0616:)(b3 == null);
                                                                    break Block_18;
                                                                    iftrue(Label_0424:)(!iterator5.hasNext());
                                                                    Block_11: {
                                                                        break Block_11;
                                                                        Label_0616:
                                                                        return;
                                                                        iftrue(Label_0318:)(n >= length);
                                                                        break Block_12;
                                                                    }
                                                                    array = ((a)iterator5.next()).b.toArray();
                                                                    length = array.length;
                                                                    n = 0;
                                                                    continue Label_0318_Outer;
                                                                }
                                                                I5.d.d((ArrayList)g);
                                                                break Label_0466;
                                                                iftrue(Label_0589:)(!iterator6.hasNext());
                                                                break Block_17;
                                                            }
                                                            o2 = array[n];
                                                            iftrue(Label_0418:)(!o2.toString().contains((CharSequence)"kotlinx.coroutines.CoroutineDispatcher"));
                                                            break Block_13;
                                                            iterator5.remove();
                                                            continue Label_0318;
                                                        }
                                                        this.h(this.a, b3);
                                                        return;
                                                    }
                                                    ((Runnable)iterator6.next()).run();
                                                    continue Label_0563;
                                                }
                                                iterator4 = ((ArrayList)g).iterator();
                                                continue Label_0418_Outer;
                                                Label_0405:
                                                this.d.add((Object)o2.toString());
                                                continue Label_0318_Outer;
                                            }
                                            iterator5 = ((ArrayList)g).iterator();
                                            continue Label_0318;
                                        }
                                        Label_0532:
                                        list.addAll((Collection)this.j((ArrayList)g));
                                        list.addAll((Collection)this.k());
                                        this.i();
                                        monitorexit(this);
                                        iterator6 = list.iterator();
                                        continue Label_0563;
                                    }
                                }
                                iftrue(Label_0405:)(!this.d.contains((Object)o2.toString()));
                                continue;
                            }
                        }
                        a2 = (a)iterator4.next();
                        this.a.put((Object)a2, (Object)new k((E3.b)new C3.c((Object)this, 2, (Object)a2)));
                        continue;
                    }
                }
            }
            try {
                final E3.b b2 = b;
                final Object o = b2.get();
                final ComponentRegistrar componentRegistrar = (ComponentRegistrar)o;
                final ComponentRegistrar componentRegistrar3;
                final ComponentRegistrar componentRegistrar2 = componentRegistrar3 = componentRegistrar;
                if (componentRegistrar3 != null) {
                    final f f = g;
                    final d d = this;
                    final f f2 = d.g;
                    final ComponentRegistrar componentRegistrar4 = componentRegistrar2;
                    final List list2 = f2.q(componentRegistrar4);
                    ((ArrayList)f).addAll((Collection)list2);
                    final ArrayList list3 = iterator;
                    ((Iterator)list3).remove();
                    continue;
                }
                continue;
            }
            catch (final j j) {}
            break;
        }
    }
    
    @Override
    public final E3.b b(final o o) {
        synchronized (this) {
            J5.b.k("Null interface requested.", (Object)o);
            return (E3.b)this.b.get((Object)o);
        }
    }
    
    @Override
    public final E3.b c(final o o) {
        synchronized (this) {
            final l l = (l)this.c.get((Object)o);
            if (l != null) {
                return (E3.b)l;
            }
            return (E3.b)e3.d.h;
        }
    }
    
    @Override
    public final e3.m d(final o o) {
        final E3.b b = this.b(o);
        if (b == null) {
            return new e3.m(e3.m.c, (E3.b)e3.m.d);
        }
        if (b instanceof e3.m) {
            return (e3.m)b;
        }
        return new e3.m(null, b);
    }
    
    public final void h(final HashMap hashMap, final boolean b) {
        for (final Map$Entry map$Entry : hashMap.entrySet()) {
            final a a = (a)map$Entry.getKey();
            final E3.b b2 = (E3.b)map$Entry.getValue();
            final int d = a.d;
            if (d != 1) {
                if (d != 2 || !b) {
                    continue;
                }
            }
            b2.get();
        }
        final i e = this.e;
        synchronized (e) {
            Object b3 = e.b;
            if (b3 != null) {
                e.b = null;
            }
            else {
                b3 = null;
            }
            monitorexit(e);
            if (b3 != null) {
                final Iterator iterator2 = ((Collection)b3).iterator();
                while (iterator2.hasNext()) {
                    e.a((B3.a)iterator2.next());
                }
            }
        }
    }
    
    public final void i() {
        for (final a a : this.a.keySet()) {
            for (final g g : a.c) {
                final boolean b = g.b == 2;
                final o a2 = g.a;
                if (b) {
                    final HashMap c = this.c;
                    if (!c.containsKey((Object)a2)) {
                        final Set emptySet = Collections.emptySet();
                        final Object o = new Object();
                        ((l)o).b = null;
                        (((l)o).a = Collections.newSetFromMap((Map)new ConcurrentHashMap())).addAll((Collection)emptySet);
                        c.put((Object)a2, o);
                        continue;
                    }
                }
                final HashMap b2 = this.b;
                if (!b2.containsKey((Object)a2)) {
                    final int b3 = g.b;
                    if (b3 == 1) {
                        final StringBuilder sb = new StringBuilder("Unsatisfied dependency for component ");
                        sb.append((Object)a);
                        sb.append(": ");
                        sb.append((Object)a2);
                        throw new RuntimeException(sb.toString());
                    }
                    if (b3 == 2) {
                        continue;
                    }
                    b2.put((Object)a2, (Object)new e3.m(e3.m.c, (E3.b)e3.m.d));
                }
            }
        }
    }
    
    public final ArrayList j(final ArrayList list) {
        final ArrayList list2 = new ArrayList();
        for (final a a : list) {
            if (a.e == 0) {
                final E3.b b = (E3.b)this.a.get((Object)a);
                for (final o o : a.b) {
                    final HashMap b2 = this.b;
                    if (!b2.containsKey((Object)o)) {
                        b2.put((Object)o, (Object)b);
                    }
                    else {
                        list2.add((Object)new G.l((Object)b2.get((Object)o), 15, (Object)b));
                    }
                }
            }
        }
        return list2;
    }
    
    public final ArrayList k() {
        final ArrayList list = new ArrayList();
        final HashMap hashMap = new HashMap();
        for (final Map$Entry map$Entry : this.a.entrySet()) {
            final a a = (a)map$Entry.getKey();
            if (a.e == 0) {
                continue;
            }
            final E3.b b = (E3.b)map$Entry.getValue();
            for (final o o : a.b) {
                if (!hashMap.containsKey((Object)o)) {
                    hashMap.put((Object)o, (Object)new HashSet());
                }
                ((Set)hashMap.get((Object)o)).add((Object)b);
            }
        }
        for (final Map$Entry map$Entry2 : hashMap.entrySet()) {
            final Object key = map$Entry2.getKey();
            final HashMap c = this.c;
            if (!c.containsKey(key)) {
                final o o2 = (o)map$Entry2.getKey();
                final Set set = (Set)map$Entry2.getValue();
                final Object o3 = new Object();
                ((l)o3).b = null;
                (((l)o3).a = Collections.newSetFromMap((Map)new ConcurrentHashMap())).addAll((Collection)set);
                c.put((Object)o2, o3);
            }
            else {
                final l l = (l)c.get(map$Entry2.getKey());
                final Iterator iterator4 = ((Set)map$Entry2.getValue()).iterator();
                while (iterator4.hasNext()) {
                    list.add((Object)new G.l((Object)l, 16, (Object)iterator4.next()));
                }
            }
        }
        return list;
    }
}
