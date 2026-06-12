package i4;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collections;
import Z.b;
import g5.c;
import f5.a;
import e5.d;
import m5.p;
import g5.h;

public final class k extends h implements p
{
    public n G;
    public int H;
    public final n I;
    
    public k(final n i, final d d) {
        this.I = i;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((k)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object o) {
        return (d)new k(this.I, d);
    }
    
    public final Object l(Object c) {
        final a c2 = a.C;
        final int h = this.H;
        n g;
        if (h != 0) {
            if (h != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g = this.G;
            com.google.android.gms.internal.auth.h.z(c);
        }
        else {
            com.google.android.gms.internal.auth.h.z(c);
            g = this.I;
            final z5.c data = g.a.getData();
            this.G = g;
            this.H = 1;
            c = z5.p.c(data, (c)this);
            if (c == c2) {
                return c2;
            }
        }
        final Map unmodifiableMap = Collections.unmodifiableMap(((b)c).a);
        n5.h.d("unmodifiableMap(preferencesMap)", (Object)unmodifiableMap);
        n.a(g, new b((Map)new LinkedHashMap(unmodifiableMap), true));
        return c5.h.a;
    }
}
