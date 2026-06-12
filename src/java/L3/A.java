package l3;

import java.util.concurrent.Executor;
import L3.q;
import java.util.concurrent.atomic.AtomicBoolean;
import O2.j;
import C2.f;
import O2.t;
import O2.i;

public abstract class a
{
    public static final p.a a;
    
    static {
        a = new p.a(1);
    }
    
    public static t a(final i i, final t t) {
        final f f = new f(20);
        final j j = new j((f)f.D);
        final q q = new q((Object)j, (Object)new AtomicBoolean(false), (Object)f, 4);
        final p.a a = l3.a.a;
        i.e((Executor)a, (O2.a)q);
        t.e((Executor)a, (O2.a)q);
        return j.a;
    }
}
