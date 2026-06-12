package n1;

import a0.l;
import java.util.Set;
import java.nio.charset.Charset;
import k1.c;
import java.util.Collections;
import android.content.Context;
import t1.i;
import t1.h;
import s1.b;
import w1.a;

public final class p
{
    public static volatile k e;
    public final a a;
    public final a b;
    public final b c;
    public final h d;
    
    public p(final a a, final a b, final b c, final h d, final i i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        i.getClass();
        i.a.execute((Runnable)new C.a((Object)i, 14));
    }
    
    public static p a() {
        final k e = p.e;
        if (e != null) {
            return (p)e.H.get();
        }
        throw new IllegalStateException("Not initialized!");
    }
    
    public static void b(final Context a) {
        if (p.e == null) {
            final Class<p> clazz;
            monitorenter(clazz = p.class);
            Label_0049: {
                try {
                    if (p.e == null) {
                        final Object o = new Object();
                        a.getClass();
                        ((l)o).a = a;
                        p.e = ((l)o).b();
                    }
                    break Label_0049;
                }
                finally {
                    monitorexit(clazz);
                    monitorexit(clazz);
                }
            }
        }
    }
    
    public final o c(final l1.a a) {
        Set set;
        if (a != null) {
            set = Collections.unmodifiableSet(l1.a.d);
        }
        else {
            set = Collections.singleton((Object)new c("proto"));
        }
        final c2.k a2 = j.a();
        a.getClass();
        a2.D = "cct";
        final String a3 = a.a;
        final String b = a.b;
        Object bytes;
        if (b == null && a3 == null) {
            bytes = null;
        }
        else {
            String s;
            if ((s = b) == null) {
                s = "";
            }
            final StringBuilder sb = new StringBuilder("1$");
            sb.append(a3);
            sb.append("\\");
            sb.append(s);
            bytes = sb.toString().getBytes(Charset.forName("UTF-8"));
        }
        a2.E = bytes;
        return new o(set, a2.d(), this);
    }
}
