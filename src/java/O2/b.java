package o2;

import android.util.Base64;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import h2.A;
import i2.c;

public abstract class b implements c
{
    public static final Object f(final a a, final Object o) {
        final n2.a m = a.M;
        Object o2 = o;
        if (m != null) {
            final String s = (String)m.E.get((int)o);
            if ((o2 = s) == null) {
                o2 = s;
                if (m.D.containsKey((Object)"gms_unknown")) {
                    o2 = "gms_unknown";
                }
            }
        }
        return o2;
    }
    
    public static final void g(final StringBuilder sb, final a a, final Object obj) {
        final int d = a.D;
        if (d == 11) {
            final Class j = a.J;
            A.h((Object)j);
            sb.append(((b)j.cast(obj)).toString());
            return;
        }
        if (d == 7) {
            sb.append("\"");
            sb.append(q2.c.a((String)obj));
            sb.append("\"");
            return;
        }
        sb.append(obj);
    }
    
    public abstract Map a();
    
    public Object b(final a a) {
        final String h = a.H;
        if (a.J != null) {
            if (this.c() == null) {
                try {
                    final char upperCase = Character.toUpperCase(h.charAt(0));
                    final String substring = h.substring(1);
                    final StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 3 + String.valueOf((Object)substring).length());
                    sb.append("get");
                    sb.append(upperCase);
                    sb.append(substring);
                    return this.getClass().getMethod(sb.toString(), (Class<?>[])null).invoke((Object)this, (Object[])null);
                }
                catch (final Exception ex) {
                    throw new RuntimeException((Throwable)ex);
                }
            }
            throw new IllegalStateException(m0.a.f("Concrete field shouldn't be value object: ", h));
        }
        return this.c();
    }
    
    public Object c() {
        return null;
    }
    
    public boolean d(final a a) {
        if (a.F != 11) {
            return this.e();
        }
        if (a.G) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public boolean e() {
        return false;
    }
    
    @Override
    public final boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!this.getClass().isInstance(obj)) {
            return false;
        }
        final b b = (b)obj;
        for (final a a : this.a().values()) {
            if (this.d(a)) {
                if (!b.d(a) || !A.l(this.b(a), b.b(a))) {
                    return false;
                }
                continue;
            }
            else {
                if (b.d(a)) {
                    return false;
                }
                continue;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final Iterator iterator = this.a().values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final a a = (a)iterator.next();
            if (this.d(a)) {
                final Object b = this.b(a);
                A.h(b);
                n = n * 31 + b.hashCode();
            }
        }
        return n;
    }
    
    @Override
    public String toString() {
        final Map a = this.a();
        final StringBuilder sb = new StringBuilder(100);
        for (final String s : a.keySet()) {
            final a a2 = (a)a.get((Object)s);
            if (this.d(a2)) {
                final Object f = f(a2, this.b(a2));
                if (sb.length() == 0) {
                    sb.append("{");
                }
                else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(s);
                sb.append("\":");
                if (f == null) {
                    sb.append("null");
                }
                else {
                    final int f2 = a2.F;
                    int i = 0;
                    switch (f2) {
                        default: {
                            if (a2.E) {
                                final ArrayList list = (ArrayList)f;
                                sb.append("[");
                                while (i < list.size()) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    final Object value = list.get(i);
                                    if (value != null) {
                                        g(sb, a2, value);
                                    }
                                    ++i;
                                }
                                sb.append("]");
                                continue;
                            }
                            g(sb, a2, f);
                            continue;
                        }
                        case 10: {
                            q2.b.o(sb, (HashMap)f);
                            continue;
                        }
                        case 9: {
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[])f, 10));
                            sb.append("\"");
                            continue;
                        }
                        case 8: {
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[])f, 0));
                            sb.append("\"");
                            continue;
                        }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        }
        else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
