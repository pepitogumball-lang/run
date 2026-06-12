package U4;

import java.io.ByteArrayOutputStream;
import F4.t;
import java.util.List;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import F4.u;

public final class j extends u
{
    public static final j d;
    
    static {
        d = (j)new Object();
    }
    
    public final Object f(final byte b, final ByteBuffer byteBuffer) {
        switch (b) {
            default: {
                return super.f(b, byteBuffer);
            }
            case -125: {
                final ArrayList list = (ArrayList)this.e(byteBuffer);
                final Object o = new Object();
                ((m)o).a = (String)list.get(0);
                final String b2 = (String)list.get(1);
                if (b2 == null) {
                    throw new IllegalStateException("Nonnull field \"email\" is null.");
                }
                ((m)o).b = b2;
                final String c = (String)list.get(2);
                if (c != null) {
                    ((m)o).c = c;
                    ((m)o).d = (String)list.get(3);
                    ((m)o).e = (String)list.get(4);
                    ((m)o).f = (String)list.get(5);
                    return o;
                }
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            case -126: {
                final ArrayList list2 = (ArrayList)this.e(byteBuffer);
                final Object o2 = new Object();
                final List a = (List)list2.get(0);
                if (a == null) {
                    throw new IllegalStateException("Nonnull field \"scopes\" is null.");
                }
                ((i)o2).a = a;
                final l b3 = (l)list2.get(1);
                if (b3 == null) {
                    throw new IllegalStateException("Nonnull field \"signInType\" is null.");
                }
                ((i)o2).b = b3;
                ((i)o2).c = (String)list2.get(2);
                ((i)o2).d = (String)list2.get(3);
                ((i)o2).e = (String)list2.get(4);
                final Boolean f = (Boolean)list2.get(5);
                if (f != null) {
                    ((i)o2).f = f;
                    return o2;
                }
                throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
            }
            case -127: {
                final Object e = this.e(byteBuffer);
                Object o3;
                if (e == null) {
                    o3 = null;
                }
                else {
                    o3 = l.values()[((Long)e).intValue()];
                }
                return o3;
            }
        }
    }
    
    public final void k(final t t, final Object o) {
        if (o instanceof l) {
            ((ByteArrayOutputStream)t).write(129);
            Object value;
            if (o == null) {
                value = null;
            }
            else {
                value = ((l)o).C;
            }
            this.k(t, value);
        }
        else if (o instanceof i) {
            ((ByteArrayOutputStream)t).write(130);
            final i i = (i)o;
            i.getClass();
            final ArrayList list = new ArrayList(6);
            list.add((Object)i.a);
            list.add((Object)i.b);
            list.add((Object)i.c);
            list.add((Object)i.d);
            list.add((Object)i.e);
            list.add((Object)i.f);
            this.k(t, list);
        }
        else if (o instanceof m) {
            ((ByteArrayOutputStream)t).write(131);
            final m m = (m)o;
            m.getClass();
            final ArrayList list2 = new ArrayList(6);
            list2.add((Object)m.a);
            list2.add((Object)m.b);
            list2.add((Object)m.c);
            list2.add((Object)m.d);
            list2.add((Object)m.e);
            list2.add((Object)m.f);
            this.k(t, list2);
        }
        else {
            super.k(t, o);
        }
    }
}
