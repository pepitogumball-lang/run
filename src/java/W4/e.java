package w4;

import F4.o;
import F4.p;
import io.flutter.embedding.engine.FlutterJNI;
import android.content.Context;
import io.flutter.plugin.platform.r;
import java.util.List;
import x4.a;
import com.google.android.gms.internal.ads.vo;
import c2.k;
import z4.d;
import io.flutter.embedding.android.FlutterActivity;
import java.util.ArrayList;

public final class e
{
    public final ArrayList a;
    
    public e(final FlutterActivity flutterActivity, final String[] array) {
        this.a = new ArrayList();
        final d d = (d)k.t().D;
        if (!d.a) {
            d.c(((Context)flutterActivity).getApplicationContext());
            d.a(((Context)flutterActivity).getApplicationContext(), array);
        }
    }
    
    public final c a(final vo vo) {
        final FlutterActivity flutterActivity = (FlutterActivity)vo.E;
        final a a = (a)vo.H;
        final String s = (String)vo.F;
        final List list = (List)vo.G;
        final r r = new r();
        final boolean c = vo.C;
        final boolean d = vo.D;
        a a2 = a;
        if (a == null) {
            final d d2 = (d)k.t().D;
            if (!d2.a) {
                throw new AssertionError((Object)"DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            a2 = new a((String)d2.d.c, "main");
        }
        final ArrayList a3 = this.a;
        c c3;
        if (a3.size() == 0) {
            final c c2 = new c((Context)flutterActivity, null, r, null, c, d);
            if (s != null) {
                ((p)c2.i.D).a("setInitialRoute", (Object)s, (o)null);
            }
            c2.c.b(a2, list);
            c3 = c2;
        }
        else {
            final c c4 = (c)a3.get(0);
            if (!c4.a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            c3 = new c((Context)flutterActivity, c4.a.spawn(a2.c, a2.b, s, list, w4.c.y), r, null, c, d);
        }
        a3.add((Object)c3);
        c3.v.add((Object)new w4.d(this, c3));
        return c3;
    }
}
