package T4;

import java.io.ByteArrayOutputStream;
import C2.l;
import F4.t;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import S2.f;
import java.nio.ByteBuffer;
import java.util.HashMap;
import F4.u;

public final class c extends u
{
    public final HashMap d;
    
    public c() {
        this.d = new HashMap();
    }
    
    public final Object f(final byte b, final ByteBuffer byteBuffer) {
        switch (b) {
            default: {
                return super.f(b, byteBuffer);
            }
            case -124: {
                return new f((int)this.f(byteBuffer.get(), byteBuffer), (String)this.f(byteBuffer.get(), byteBuffer));
            }
            case -125: {
                return this.d.get((Object)this.f(byteBuffer.get(), byteBuffer));
            }
            case -126: {
                final Integer n = (Integer)this.f(byteBuffer.get(), byteBuffer);
                final Object f = this.f(byteBuffer.get(), byteBuffer);
                ArrayList list;
                if (f == null) {
                    list = null;
                }
                else {
                    list = new ArrayList();
                    if (f instanceof List) {
                        for (final Object next : (List)f) {
                            if (next instanceof String) {
                                list.add((Object)next);
                            }
                        }
                    }
                }
                return new a(n, list);
            }
            case -127: {
                return new b((Boolean)this.f(byteBuffer.get(), byteBuffer), (a)this.f(byteBuffer.get(), byteBuffer));
            }
        }
    }
    
    public final void k(final t t, final Object o) {
        if (o instanceof b) {
            ((ByteArrayOutputStream)t).write(-127);
            final b b = (b)o;
            this.k(t, b.a);
            this.k(t, b.b);
        }
        else if (o instanceof a) {
            ((ByteArrayOutputStream)t).write(-126);
            final a a = (a)o;
            this.k(t, a.a);
            this.k(t, a.b);
        }
        else if (o instanceof l) {
            ((ByteArrayOutputStream)t).write(-125);
            this.k(t, o.hashCode());
        }
        else if (o instanceof f) {
            ((ByteArrayOutputStream)t).write(-124);
            final f f = (f)o;
            this.k(t, f.a);
            this.k(t, f.b);
        }
        else {
            super.k(t, o);
        }
    }
}
