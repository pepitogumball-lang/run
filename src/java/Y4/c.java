package Y4;

import java.io.ByteArrayOutputStream;
import F4.t;
import java.util.Map;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import F4.u;

public final class c extends u
{
    public static final c d;
    
    static {
        d = (c)new Object();
    }
    
    public final Object f(final byte b, final ByteBuffer byteBuffer) {
        if (b != -127) {
            if (b != -126) {
                return super.f(b, byteBuffer);
            }
            final ArrayList list = (ArrayList)this.e(byteBuffer);
            final Object o = new Object();
            final Boolean a = (Boolean)list.get(0);
            if (a != null) {
                ((a)o).a = a;
                return o;
            }
            throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
        }
        else {
            final ArrayList list2 = (ArrayList)this.e(byteBuffer);
            final Object o2 = new Object();
            final Boolean a2 = (Boolean)list2.get(0);
            if (a2 == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            ((e)o2).a = a2;
            final Boolean b2 = (Boolean)list2.get(1);
            if (b2 == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            ((e)o2).b = b2;
            final Map c = (Map)list2.get(2);
            if (c != null) {
                ((e)o2).c = c;
                return o2;
            }
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }
    }
    
    public final void k(final t t, final Object o) {
        if (o instanceof e) {
            ((ByteArrayOutputStream)t).write(129);
            final e e = (e)o;
            e.getClass();
            final ArrayList list = new ArrayList(3);
            list.add((Object)e.a);
            list.add((Object)e.b);
            list.add((Object)e.c);
            this.k(t, list);
        }
        else if (o instanceof a) {
            ((ByteArrayOutputStream)t).write(130);
            final a a = (a)o;
            a.getClass();
            final ArrayList list2 = new ArrayList(1);
            list2.add((Object)a.a);
            this.k(t, list2);
        }
        else {
            super.k(t, o);
        }
    }
}
