package o1;

import w1.a;
import android.content.Context;

public final class b extends c
{
    public final Context a;
    public final a b;
    public final a c;
    public final String d;
    
    public b(final Context a, final a b, final a c, final String d) {
        if (a == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = b;
        if (c == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = c;
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null backendName");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            if (this.a.equals(((b)c).a)) {
                final b b2 = (b)c;
                if (this.b.equals(b2.b) && this.c.equals(b2.c) && this.d.equals((Object)b2.d)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append((Object)this.a);
        sb.append(", wallClock=");
        sb.append((Object)this.b);
        sb.append(", monotonicClock=");
        sb.append((Object)this.c);
        sb.append(", backendName=");
        return x.a.b(sb, this.d, "}");
    }
}
