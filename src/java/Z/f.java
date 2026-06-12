package Z;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collections;
import f5.a;
import e5.d;
import m5.p;
import g5.h;

public final class f extends h implements p
{
    public int G;
    public Object H;
    public final h I;
    
    public f(final p p2, final d d) {
        this.I = (h)p2;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((f)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object h) {
        final f f = new f((p)this.I, d);
        f.H = h;
        return (d)f;
    }
    
    public final Object l(final Object o) {
        final a c = a.C;
        final int g = this.G;
        b h;
        if (g != 0) {
            if (g != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final b b = (b)this.H;
            com.google.android.gms.internal.auth.h.z(o);
            h = b;
        }
        else {
            com.google.android.gms.internal.auth.h.z(o);
            final Map unmodifiableMap = Collections.unmodifiableMap(((b)this.H).a);
            n5.h.d("unmodifiableMap(preferencesMap)", (Object)unmodifiableMap);
            h = new b((Map)new LinkedHashMap(unmodifiableMap), false);
            this.H = h;
            this.G = 1;
            if (((p)this.I).f((Object)h, (Object)this) == c) {
                return c;
            }
        }
        return h;
    }
}
