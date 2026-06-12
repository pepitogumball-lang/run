package e3;

import java.util.Iterator;
import java.util.Collections;
import B3.c;
import java.util.HashSet;
import java.util.Set;

public final class q implements b
{
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final b g;
    
    public q(final a a, final b g) {
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        final HashSet set3 = new HashSet();
        final HashSet set4 = new HashSet();
        final HashSet set5 = new HashSet();
        for (final g g2 : a.c) {
            final int c = g2.c;
            final boolean b = c == 0;
            final int b2 = g2.b;
            final o a2 = g2.a;
            if (b) {
                if (b2 == 2) {
                    set4.add((Object)a2);
                }
                else {
                    set.add((Object)a2);
                }
            }
            else if (c == 2) {
                set3.add((Object)a2);
            }
            else if (b2 == 2) {
                set5.add((Object)a2);
            }
            else {
                set2.add((Object)a2);
            }
        }
        final Set g3 = a.g;
        if (!g3.isEmpty()) {
            set.add((Object)o.a(c.class));
        }
        this.a = Collections.unmodifiableSet((Set)set);
        this.b = Collections.unmodifiableSet((Set)set2);
        this.c = Collections.unmodifiableSet((Set)set3);
        this.d = Collections.unmodifiableSet((Set)set4);
        this.e = Collections.unmodifiableSet((Set)set5);
        this.f = g3;
        this.g = g;
    }
    
    @Override
    public final Object a(final Class clazz) {
        if (!this.a.contains((Object)o.a(clazz))) {
            final StringBuilder sb = new StringBuilder("Attempting to request an undeclared dependency ");
            sb.append((Object)clazz);
            sb.append(".");
            throw new RuntimeException(sb.toString());
        }
        final Object a = this.g.a(clazz);
        if (!clazz.equals(c.class)) {
            return a;
        }
        return new p(this.f, (c)a);
    }
    
    @Override
    public final E3.b b(final o o) {
        if (this.b.contains((Object)o)) {
            return this.g.b(o);
        }
        final StringBuilder sb = new StringBuilder("Attempting to request an undeclared dependency Provider<");
        sb.append((Object)o);
        sb.append(">.");
        throw new RuntimeException(sb.toString());
    }
    
    @Override
    public final E3.b c(final o o) {
        if (this.e.contains((Object)o)) {
            return this.g.c(o);
        }
        final StringBuilder sb = new StringBuilder("Attempting to request an undeclared dependency Provider<Set<");
        sb.append((Object)o);
        sb.append(">>.");
        throw new RuntimeException(sb.toString());
    }
    
    @Override
    public final m d(final o o) {
        if (this.c.contains((Object)o)) {
            return this.g.d(o);
        }
        final StringBuilder sb = new StringBuilder("Attempting to request an undeclared dependency Deferred<");
        sb.append((Object)o);
        sb.append(">.");
        throw new RuntimeException(sb.toString());
    }
    
    @Override
    public final E3.b e(final Class clazz) {
        return this.b(o.a(clazz));
    }
    
    @Override
    public final Set f(final o o) {
        if (this.d.contains((Object)o)) {
            return this.g.f(o);
        }
        final StringBuilder sb = new StringBuilder("Attempting to request an undeclared dependency Set<");
        sb.append((Object)o);
        sb.append(">.");
        throw new RuntimeException(sb.toString());
    }
    
    @Override
    public final Object g(final o o) {
        if (this.a.contains((Object)o)) {
            return this.g.g(o);
        }
        final StringBuilder sb = new StringBuilder("Attempting to request an undeclared dependency ");
        sb.append((Object)o);
        sb.append(".");
        throw new RuntimeException(sb.toString());
    }
    
    public final m h(final Class clazz) {
        return this.d(o.a(clazz));
    }
}
