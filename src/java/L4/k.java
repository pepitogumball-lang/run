package L4;

import F4.t;
import java.util.Map;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import F4.u;

public final class k extends u
{
    public static final k d;
    
    static {
        d = (k)new Object();
    }
    
    @Override
    public final Object f(final byte b, final ByteBuffer byteBuffer) {
        if (b == -128) {
            return L4.l.a((ArrayList)this.e(byteBuffer));
        }
        if (b != -127) {
            return super.f(b, byteBuffer);
        }
        final ArrayList list = (ArrayList)this.e(byteBuffer);
        final Object o = new Object();
        final String a = (String)list.get(0);
        if (a == null) {
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }
        ((m)o).a = a;
        final Object value = list.get(1);
        L4.l a2;
        if (value == null) {
            a2 = null;
        }
        else {
            a2 = L4.l.a((ArrayList)value);
        }
        if (a2 == null) {
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }
        ((m)o).b = a2;
        ((m)o).c = (Boolean)list.get(2);
        final Map d = (Map)list.get(3);
        if (d != null) {
            ((m)o).d = d;
            return o;
        }
        throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
    }
    
    @Override
    public final void k(final t t, final Object o) {
        if (o instanceof L4.l) {
            t.write(128);
            this.k(t, ((L4.l)o).b());
        }
        else if (o instanceof m) {
            t.write(129);
            final m m = (m)o;
            m.getClass();
            final ArrayList list = new ArrayList(4);
            list.add((Object)m.a);
            final L4.l b = m.b;
            Object b2;
            if (b == null) {
                b2 = null;
            }
            else {
                b2 = b.b();
            }
            list.add(b2);
            list.add((Object)m.c);
            list.add((Object)m.d);
            this.k(t, list);
        }
        else {
            super.k(t, o);
        }
    }
}
