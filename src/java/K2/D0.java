package K2;

import com.google.android.gms.internal.measurement.g2;
import android.content.SharedPreferences$Editor;
import com.google.android.gms.internal.measurement.G2;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.n1;
import h2.A;
import com.google.android.gms.internal.ads.la;
import com.google.android.gms.internal.ads.va;
import java.util.ArrayList;
import G3.a;
import java.io.Serializable;

public final class d0
{
    public long a = a;
    public Object b = b;
    public Serializable c = c;
    public Object d = d;
    public final Object e = e;
    
    public d0(final a0 e, final long a) {
        this.e = e;
        A.e("health_monitor");
        A.b(a > 0L);
        this.b = "health_monitor:start";
        this.c = (Serializable)"health_monitor:count";
        this.d = "health_monitor:value";
        this.a = a;
    }
    
    public d0(final y1 e) {
        this.e = e;
    }
    
    public void a(final n1 b) {
        this.b = b;
    }
    
    public boolean b(final long n, final f1 f1) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (this.c == null) {
            this.c = (Serializable)new ArrayList();
        }
        if (!((ArrayList)this.d).isEmpty() && ((f1)((ArrayList)this.d).get(0)).A() / 1000L / 60L / 60L != f1.A() / 1000L / 60L / 60L) {
            return false;
        }
        final long a = this.a + ((g2)f1).a((G2)null);
        final y1 y1 = (y1)this.e;
        y1.T();
        if (a >= Math.max(0, (int)w.j.a(null))) {
            return false;
        }
        this.a = a;
        ((ArrayList)this.d).add((Object)f1);
        ((ArrayList)this.c).add((Object)n);
        final int size = ((ArrayList)this.d).size();
        y1.T();
        return size < Math.max(1, (int)w.k.a(null));
    }
    
    public void c() {
        final a0 a0 = (a0)this.e;
        a0.v();
        ((n0)a0.C).P.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final SharedPreferences$Editor edit = a0.D().edit();
        edit.remove((String)this.c);
        edit.remove((String)this.d);
        edit.putLong((String)this.b, currentTimeMillis);
        edit.apply();
    }
}
