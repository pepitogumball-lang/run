package K2;

import android.os.BaseBundle;
import java.util.Iterator;
import android.os.Bundle;
import android.text.TextUtils;
import h2.A;

public final class s
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final u f;
    
    public s(final n0 n0, final String s, final String a, final String b, final long d, final long e, final u f) {
        A.e(a);
        A.e(b);
        A.h((Object)f);
        this.a = a;
        this.b = b;
        String c = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            c = null;
        }
        this.c = c;
        this.d = d;
        this.e = e;
        if (e != 0L && e > d) {
            final P k = n0.K;
            n0.f(k);
            k.K.e(P.z(a), P.z(b), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f = f;
    }
    
    public s(final n0 n0, final String s, final String a, String f, final long d, final long e, final Bundle bundle) {
        A.e(a);
        A.e(f);
        this.a = a;
        this.b = f;
        f = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            f = null;
        }
        this.c = f;
        this.d = d;
        this.e = e;
        if (e != 0L && e > d) {
            final P k = n0.K;
            n0.f(k);
            k.K.g("Event created with reverse previous/current timestamps. appId", P.z(a));
        }
        u f2;
        if (bundle != null && !((BaseBundle)bundle).isEmpty()) {
            final Bundle bundle2 = new Bundle(bundle);
            final Iterator iterator = ((BaseBundle)bundle2).keySet().iterator();
            while (iterator.hasNext()) {
                f = (String)iterator.next();
                if (f == null) {
                    final P i = n0.K;
                    n0.f(i);
                    i.H.f("Param name can't be null");
                    iterator.remove();
                }
                else {
                    final J1 n2 = n0.N;
                    n0.c(n2);
                    final Object o0 = n2.o0(f, ((BaseBundle)bundle2).get(f));
                    if (o0 == null) {
                        final P j = n0.K;
                        n0.f(j);
                        f = n0.O.f(f);
                        j.K.g("Param value can't be null", f);
                        iterator.remove();
                    }
                    else {
                        final J1 n3 = n0.N;
                        n0.c(n3);
                        n3.R(bundle2, f, o0);
                    }
                }
            }
            f2 = new u(bundle2);
        }
        else {
            f2 = new u(new Bundle());
        }
        this.f = f2;
    }
    
    public final s a(final n0 n0, final long n2) {
        return new s(n0, this.c, this.a, this.b, this.d, n2, this.f);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf((Object)this.f);
        final StringBuilder sb = new StringBuilder("Event{appId='");
        sb.append(this.a);
        sb.append("', name='");
        sb.append(this.b);
        sb.append("', params=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
