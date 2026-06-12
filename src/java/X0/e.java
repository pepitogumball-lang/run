package x0;

import java.util.Set;
import android.os.BaseBundle;
import java.util.LinkedHashSet;
import androidx.lifecycle.j;
import q.c;
import java.util.Iterator;
import java.util.Map$Entry;
import q.b;
import j.h;
import android.os.Bundle;
import q.f;

public final class e
{
    public final f a;
    public boolean b;
    public Bundle c;
    public boolean d;
    public h e;
    public boolean f;
    
    public e() {
        this.a = new f();
        this.f = true;
    }
    
    public final Bundle a(final String s) {
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        final Bundle c = this.c;
        if (c != null) {
            final Bundle bundle = c.getBundle(s);
            final Bundle c2 = this.c;
            if (c2 != null) {
                c2.remove(s);
            }
            final Bundle c3 = this.c;
            if (c3 == null || ((BaseBundle)c3).isEmpty()) {
                this.c = null;
            }
            return bundle;
        }
        return null;
    }
    
    public final d b() {
        final Iterator iterator = this.a.iterator();
        String s;
        d d;
        do {
            final b b = (b)iterator;
            if (!b.hasNext()) {
                d = null;
                return d;
            }
            final Map$Entry map$Entry = (Map$Entry)b.next();
            n5.h.d("components", (Object)map$Entry);
            s = (String)map$Entry.getKey();
            d = (d)map$Entry.getValue();
        } while (!n5.h.a((Object)s, (Object)"androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return d;
    }
    
    public final void c(final String s, final d d) {
        n5.h.e("provider", (Object)d);
        final f a = this.a;
        final c c = a.c((Object)s);
        Object d2;
        if (c != null) {
            d2 = c.D;
        }
        else {
            final c c2 = new c((Object)s, (Object)d);
            ++a.F;
            final c d3 = a.D;
            if (d3 == null) {
                a.C = c2;
                a.D = c2;
            }
            else {
                d3.E = c2;
                c2.F = d3;
                a.D = c2;
            }
            d2 = null;
        }
        if (d2 == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }
    
    public final void d() {
        if (this.f) {
            h e;
            if ((e = this.e) == null) {
                e = new h(this);
            }
            this.e = e;
            try {
                j.class.getDeclaredConstructor((Class<?>[])null);
                final h e2 = this.e;
                if (e2 != null) {
                    ((Set)e2.b).add((Object)j.class.getName());
                }
                return;
            }
            catch (final NoSuchMethodException ex) {
                final StringBuilder sb = new StringBuilder("Class ");
                sb.append(j.class.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), (Throwable)ex);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
