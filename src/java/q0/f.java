package q0;

import android.adservices.topics.Topic;
import java.util.Iterator;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.GetTopicsRequest;
import java.util.List;
import java.util.ArrayList;
import android.os.OutcomeReceiver;
import n3.u0;
import e5.d;
import n5.h;
import android.adservices.topics.TopicsManager;

public abstract class f
{
    public final TopicsManager a;
    
    public f(final TopicsManager a) {
        h.e("mTopicsManager", a);
        this.a = a;
    }
    
    public static Object c(f f, final a a, final d d) {
        Object o = null;
        Label_0051: {
            if (d instanceof e) {
                final e e = (e)d;
                final int i = e.I;
                if ((i & Integer.MIN_VALUE) != 0x0) {
                    e.I = i + Integer.MIN_VALUE;
                    o = e;
                    break Label_0051;
                }
            }
            o = new e(f, d);
        }
        final Object g = ((e)o).G;
        final f5.a c = f5.a.C;
        final int j = ((e)o).I;
        Object t;
        if (j != 0) {
            if (j != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = ((e)o).F;
            com.google.android.gms.internal.auth.h.z(g);
            t = g;
        }
        else {
            com.google.android.gms.internal.auth.h.z(g);
            final GetTopicsRequest a2 = f.a(a);
            ((e)o).F = f;
            ((e)o).I = 1;
            final w5.f f2 = new w5.f(1, u0.o((d)o));
            f2.u();
            E4.a.s(f.a, a2, new p.a(1), (OutcomeReceiver)new K.e(f2));
            if ((t = f2.t()) == c) {
                return c;
            }
        }
        final GetTopicsResponse k = E4.a.j(t);
        f.getClass();
        h.e("response", k);
        final ArrayList list = new ArrayList();
        final Iterator iterator = E4.a.n(k).iterator();
        while (iterator.hasNext()) {
            final Topic l = E4.a.k(iterator.next());
            list.add((Object)new c(E4.a.b(l), E4.a.d(l), E4.a.v(l)));
        }
        return new b((List)list);
    }
    
    public GetTopicsRequest a(final a a) {
        h.e("request", a);
        final GetTopicsRequest i = E4.a.i(E4.a.g(E4.a.f()));
        h.d("Builder()\n            .s\u2026ame)\n            .build()", i);
        return i;
    }
    
    public Object b(final a a, final d d) {
        return c(this, a, d);
    }
}
