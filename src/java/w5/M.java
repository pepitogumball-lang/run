package w5;

import n5.h;
import java.util.concurrent.CancellationException;
import m5.l;

public final class m
{
    public final Object a;
    public final E b;
    public final l c;
    public final Object d;
    public final Throwable e;
    
    public m(final Object a, final E b, final l c, final Object d, final Throwable e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static m a(final m m, E b, CancellationException e, final int n) {
        final Object a = m.a;
        if ((n & 0x2) != 0x0) {
            b = m.b;
        }
        final l c = m.c;
        final Object d = m.d;
        if ((n & 0x10) != 0x0) {
            e = (CancellationException)m.e;
        }
        m.getClass();
        return new m(a, b, c, d, (Throwable)e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final m m = (m)o;
        return h.a(this.a, m.a) && h.a((Object)this.b, (Object)m.b) && h.a((Object)this.c, (Object)m.c) && h.a(this.d, m.d) && h.a((Object)this.e, (Object)m.e);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Object a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final E b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final l c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Object d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Throwable e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CompletedContinuation(result=");
        sb.append(this.a);
        sb.append(", cancelHandler=");
        sb.append((Object)this.b);
        sb.append(", onCancellation=");
        sb.append((Object)this.c);
        sb.append(", idempotentResume=");
        sb.append(this.d);
        sb.append(", cancelCause=");
        sb.append((Object)this.e);
        sb.append(')');
        return sb.toString();
    }
}
