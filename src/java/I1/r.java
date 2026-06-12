package I1;

import com.google.android.gms.internal.auth.m;
import android.app.Activity;
import android.view.Window;
import O.n0;
import com.google.android.gms.internal.ads.sE;
import v.e;
import O.u0;
import O.w0;
import android.os.Build$VERSION;
import C2.B;
import io.flutter.plugin.platform.o;
import com.google.android.gms.internal.auth.l;
import io.flutter.embedding.android.FlutterActivity;
import java.util.ArrayList;
import c2.k;

public final class r
{
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    
    public r(final k k) {
        final ArrayList list = (ArrayList)k.E;
        final int size = list.size();
        this.b = ((ArrayList)k.D).toArray((Object[])new String[size]);
        final int size2 = list.size();
        final double[] c = new double[size2];
        for (int i = 0; i < size2; ++i) {
            c[i] = (double)list.get(i);
        }
        this.c = c;
        final ArrayList list2 = (ArrayList)k.F;
        final int size3 = list2.size();
        final double[] d = new double[size3];
        for (int j = 0; j < size3; ++j) {
            d[j] = (double)list2.get(j);
        }
        this.d = d;
        this.e = new int[size];
        this.a = 0;
    }
    
    public r(final FlutterActivity b, final l c, final FlutterActivity d) {
        final o e = new o((Object)this, 1);
        this.b = b;
        this.c = c;
        c.E = e;
        this.d = d;
        this.a = 1280;
    }
    
    public void a(final B e) {
        final Window window = ((Activity)this.b).getWindow();
        window.getDecorView();
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object o;
        if (sdk_INT >= 30) {
            o = new w0(window);
        }
        else if (sdk_INT >= 26) {
            o = new u0(window);
        }
        else {
            o = new u0(window);
        }
        final int sdk_INT2 = Build$VERSION.SDK_INT;
        if (sdk_INT2 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        final int a = e.a;
        if (a != 0) {
            final int d = e.d(a);
            if (d != 0) {
                if (d == 1) {
                    ((m)o).x(true);
                }
            }
            else {
                ((m)o).x(false);
            }
        }
        final Integer n = (Integer)e.c;
        if (n != null) {
            window.setStatusBarColor((int)n);
        }
        final Boolean b = (Boolean)e.d;
        if (b != null && sdk_INT2 >= 29) {
            sE.p(window, (boolean)b);
        }
        if (sdk_INT2 >= 26) {
            final int b2 = e.b;
            if (b2 != 0) {
                final int d2 = e.d(b2);
                if (d2 != 0) {
                    if (d2 == 1) {
                        ((m)o).w(true);
                    }
                }
                else {
                    ((m)o).w(false);
                }
            }
            final Integer n2 = (Integer)e.e;
            if (n2 != null) {
                window.setNavigationBarColor((int)n2);
            }
        }
        final Integer n3 = (Integer)e.f;
        if (n3 != null && sdk_INT2 >= 28) {
            n0.p(window, (int)n3);
        }
        final Boolean b3 = (Boolean)e.g;
        if (b3 != null && sdk_INT2 >= 29) {
            sE.w(window, (boolean)b3);
        }
        this.e = e;
    }
    
    public void b() {
        ((Activity)this.b).getWindow().getDecorView().setSystemUiVisibility(this.a);
        final B b = (B)this.e;
        if (b != null) {
            this.a(b);
        }
    }
}
