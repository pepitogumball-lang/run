package T3;

import java.util.List;
import java.util.Iterator;
import java.util.Map$Entry;
import Z3.A;
import R3.a;

public final class d extends e
{
    public static final a b;
    public final A a;
    
    static {
        b = a.d();
    }
    
    public d(final A a) {
        this.a = a;
    }
    
    public static boolean d(final A a, final int n) {
        if (a == null) {
            return false;
        }
        final a b = d.b;
        if (n > 1) {
            b.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (final Map$Entry map$Entry : a.F().entrySet()) {
            final String s = (String)map$Entry.getKey();
            if (s != null) {
                final String trim = s.trim();
                if (trim.isEmpty()) {
                    b.f("counterId is empty");
                }
                else if (trim.length() > 100) {
                    b.f("counterId exceeded max length 100");
                }
                else {
                    if (map$Entry.getValue() != null) {
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder("invalid CounterValue:");
                    sb.append(map$Entry.getValue());
                    b.f(sb.toString());
                    return false;
                }
            }
            final StringBuilder sb2 = new StringBuilder("invalid CounterId:");
            sb2.append((String)map$Entry.getKey());
            b.f(sb2.toString());
            return false;
        }
        final Iterator iterator2 = ((List)a.L()).iterator();
        while (iterator2.hasNext()) {
            if (!d((A)iterator2.next(), n + 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean e(final A a, final int n) {
        final a b = d.b;
        if (a == null) {
            b.f("TraceMetric is null");
            return false;
        }
        if (n > 1) {
            b.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        final String j = a.J();
        if (j != null) {
            final String trim = j.trim();
            if (!trim.isEmpty() && trim.length() <= 100) {
                if (a.I() <= 0L) {
                    final StringBuilder sb = new StringBuilder("invalid TraceDuration:");
                    sb.append(a.I());
                    b.f(sb.toString());
                    return false;
                }
                if (!a.M()) {
                    b.f("clientStartTimeUs is null.");
                    return false;
                }
                if (a.J().startsWith("_st_")) {
                    final Long n2 = (Long)a.F().get((Object)"_fr_tot");
                    if (n2 == null || n2.compareTo(Long.valueOf(0L)) <= 0) {
                        final StringBuilder sb2 = new StringBuilder("non-positive totalFrames in screen trace ");
                        sb2.append(a.J());
                        b.f(sb2.toString());
                        return false;
                    }
                }
                final Iterator iterator = ((List)a.L()).iterator();
                while (iterator.hasNext()) {
                    if (!e((A)iterator.next(), n + 1)) {
                        return false;
                    }
                }
                for (final Map$Entry map$Entry : a.G().entrySet()) {
                    try {
                        e.b((String)map$Entry.getKey(), (String)map$Entry.getValue());
                        continue;
                    }
                    catch (final IllegalArgumentException ex) {
                        b.f(((Throwable)ex).getLocalizedMessage());
                        return false;
                    }
                    break;
                }
                return true;
            }
        }
        final StringBuilder sb3 = new StringBuilder("invalid TraceId:");
        sb3.append(a.J());
        b.f(sb3.toString());
        return false;
    }
    
    @Override
    public final boolean a() {
        final A a = this.a;
        final boolean e = e(a, 0);
        final a b = d.b;
        if (!e) {
            final StringBuilder sb = new StringBuilder("Invalid Trace:");
            sb.append(a.J());
            b.f(sb.toString());
            return false;
        }
        Label_0098: {
            if (a.E() <= 0) {
                final Iterator iterator = ((List)a.L()).iterator();
                while (iterator.hasNext()) {
                    if (((A)iterator.next()).E() > 0) {
                        break Label_0098;
                    }
                }
                return true;
            }
        }
        if (!d(a, 0)) {
            final StringBuilder sb2 = new StringBuilder("Invalid Counters for Trace:");
            sb2.append(a.J());
            b.f(sb2.toString());
            return false;
        }
        return true;
    }
}
