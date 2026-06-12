package g;

import android.os.BaseBundle;
import java.util.Iterator;
import androidx.lifecycle.s;
import androidx.lifecycle.r;
import android.util.Log;
import com.google.android.gms.internal.measurement.L;
import p5.d;
import android.os.Parcelable;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class h
{
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public ArrayList d;
    public final transient HashMap e;
    public final HashMap f;
    public final Bundle g;
    
    public h() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new Bundle();
    }
    
    public final boolean a(final int n, final int n2, final Intent intent) {
        final String s = (String)this.a.get((Object)n);
        if (s == null) {
            return false;
        }
        final f f = (f)this.e.get((Object)s);
        if (f != null) {
            final b a = f.a;
            if (a != null && this.d.contains((Object)s)) {
                a.b(f.b.c(intent, n2));
                this.d.remove((Object)s);
                return true;
            }
        }
        this.f.remove((Object)s);
        this.g.putParcelable(s, (Parcelable)new a(intent, n2));
        return true;
    }
    
    public abstract void b(final int p0, final h.a p1, final Parcelable p2);
    
    public final e c(final String s, final h.a a, final b b) {
        this.d(s);
        this.e.put((Object)s, (Object)new f(a, b));
        final HashMap f = this.f;
        if (f.containsKey((Object)s)) {
            final Object value = f.get((Object)s);
            f.remove((Object)s);
            b.b(value);
        }
        final Bundle g = this.g;
        final a a2 = (a)g.getParcelable(s);
        if (a2 != null) {
            g.remove(s);
            b.b(a.c(a2.D, a2.C));
        }
        return new e(this, s, a, 1);
    }
    
    public final void d(final String s) {
        final HashMap b = this.b;
        if (b.get((Object)s) != null) {
            return;
        }
        p5.d.C.getClass();
        int n = p5.d.D.a().nextInt(2147418112);
        int n2;
        HashMap a;
        while (true) {
            n2 = n + 65536;
            a = this.a;
            if (!a.containsKey((Object)n2)) {
                break;
            }
            p5.d.C.getClass();
            n = p5.d.D.a().nextInt(2147418112);
        }
        a.put((Object)n2, (Object)s);
        b.put((Object)s, (Object)n2);
    }
    
    public final void e(final String s) {
        if (!this.d.contains((Object)s)) {
            final Integer n = (Integer)this.b.remove((Object)s);
            if (n != null) {
                this.a.remove((Object)n);
            }
        }
        this.e.remove((Object)s);
        final HashMap f = this.f;
        if (f.containsKey((Object)s)) {
            final StringBuilder l = L.l("Dropping pending result for request ", s, ": ");
            l.append(f.get((Object)s));
            Log.w("ActivityResultRegistry", l.toString());
            f.remove((Object)s);
        }
        final Bundle g = this.g;
        if (((BaseBundle)g).containsKey(s)) {
            final StringBuilder i = L.l("Dropping pending result for request ", s, ": ");
            i.append((Object)g.getParcelable(s));
            Log.w("ActivityResultRegistry", i.toString());
            g.remove(s);
        }
        final HashMap c = this.c;
        final g g2 = (g)c.get((Object)s);
        if (g2 != null) {
            final ArrayList b = g2.b;
            final Iterator iterator = b.iterator();
            while (iterator.hasNext()) {
                g2.a.b((s)iterator.next());
            }
            b.clear();
            c.remove((Object)s);
        }
    }
}
