package R4;

import android.os.BaseBundle;
import java.util.Objects;
import java.util.Iterator;
import J1.j;
import android.text.TextUtils;
import java.util.ArrayList;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Map$Entry;
import android.os.Bundle;
import java.util.HashMap;
import h2.A;
import java.util.HashSet;
import F1.u0;
import C.u;
import y1.g;
import java.util.Map;
import java.util.List;

public class r
{
    public final List a;
    public final String b;
    public final Boolean c;
    public final List d;
    public final Integer e;
    public final String f;
    public final Map g;
    public final String h;
    public final List i;
    
    public r(final List a, final String b, final Boolean c, final List d, final Integer e, final String f, final Map g, final String h, final List i) {
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
    
    public final g a() {
        final u u = new u(4);
        this.b(u);
        return new g(u);
    }
    
    public final void b(final u u) {
        final u0 u2 = (u0)u.C;
        final List a = this.a;
        if (a != null) {
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                ((HashSet)u2.d).add((Object)iterator.next());
            }
        }
        final String b = this.b;
        if (b != null) {
            A.f(b, "Content URL must be non-empty.");
            final int length = b.length();
            final int length2 = b.length();
            if (length > 512) {
                throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", new Object[] { 512, length2 }));
            }
            u2.j = b;
        }
        final HashMap hashMap = new HashMap();
        final List i = this.i;
        if (i != null) {
            final Iterator iterator2 = i.iterator();
            if (iterator2.hasNext()) {
                iterator2.next().getClass();
                throw new ClassCastException();
            }
        }
        final Map g = this.g;
        if (g != null && !g.isEmpty()) {
            final Bundle bundle = new Bundle();
            for (final Map$Entry map$Entry : g.entrySet()) {
                ((BaseBundle)bundle).putString((String)map$Entry.getKey(), (String)map$Entry.getValue());
            }
            hashMap.put((Object)AdMobAdapter.class, (Object)bundle);
        }
        final Boolean c = this.c;
        if (c != null && c) {
            Bundle bundle2;
            if ((bundle2 = (Bundle)hashMap.get((Object)AdMobAdapter.class)) == null) {
                bundle2 = new Bundle();
            }
            ((BaseBundle)bundle2).putString("npa", "1");
            hashMap.put((Object)AdMobAdapter.class, (Object)bundle2);
        }
        for (final Map$Entry map$Entry2 : hashMap.entrySet()) {
            u.b((Bundle)map$Entry2.getValue(), (Class)map$Entry2.getKey());
        }
        final List d = this.d;
        if (d != null) {
            final ArrayList list = (ArrayList)u2.m;
            list.clear();
            for (final String s : d) {
                if (TextUtils.isEmpty((CharSequence)s)) {
                    j.i("neighboring content URL should not be null or empty");
                }
                else {
                    list.add((Object)s);
                }
            }
        }
        final Integer e = this.e;
        if (e != null) {
            u2.b = e;
        }
        u2.l = this.h;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof r)) {
            return false;
        }
        final r r = (r)o;
        if (!Objects.equals((Object)this.a, (Object)r.a) || !Objects.equals((Object)this.b, (Object)r.b) || !Objects.equals((Object)this.c, (Object)r.c) || !Objects.equals((Object)this.d, (Object)r.d) || !Objects.equals((Object)this.e, (Object)r.e) || !Objects.equals((Object)this.f, (Object)r.f) || !Objects.equals((Object)this.g, (Object)r.g) || !Objects.equals((Object)this.i, (Object)r.i)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, null, this.i });
    }
}
