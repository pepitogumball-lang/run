package h3;

import X.a;
import java.util.Iterator;
import java.util.HashSet;
import android.util.Log;
import G.l;
import java.util.List;
import h1.w;
import m3.m;
import f4.e;
import f4.c;
import java.util.ArrayList;
import d5.f;
import f4.d;
import o.q1;

public final class b
{
    public final q1 a;
    
    public b(final q1 a) {
        this.a = a;
    }
    
    public final void a(final d d) {
        final q1 a = this.a;
        final HashSet a2 = d.a;
        final ArrayList list = new ArrayList(f.E((Iterable)a2));
        for (final c c : a2) {
            final String b = c.b;
            final String d2 = c.d;
            String s = c.e;
            final String c2 = c.c;
            final long f = c.f;
            final a a3 = m.a;
            if (s.length() > 256) {
                s = s.substring(0, 256);
            }
            list.add((Object)new m3.b(b, d2, s, c2, f));
        }
        final w w;
        monitorenter(w = (w)a.H);
        Label_0180: {
            try {
                if (!((w)a.H).i((List)list)) {
                    monitorexit(w);
                    break Label_0180;
                }
                break Label_0180;
            }
            finally {
                monitorexit(w);
                ((l3.c)a.D).b.a((Runnable)new l((Object)a, 23, (Object)((w)a.H).h()));
                monitorexit(w);
                break Label_0180;
                Label_0251: {
                    return;
                }
                while (true) {
                    Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", (Throwable)null);
                    return;
                    iftrue(Label_0251:)(!Log.isLoggable("FirebaseCrashlytics", 3));
                    continue;
                }
            }
        }
    }
}
