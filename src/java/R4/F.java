package R4;

import android.os.BaseBundle;
import java.util.Objects;
import d2.m;
import java.util.Iterator;
import F1.R0;
import java.util.HashMap;
import y1.j;
import java.util.Map;

public final class f
{
    public final String a;
    public final long b;
    public final String c;
    public final Map d;
    public final e e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    
    public f(final String a, final long b, final String c, final Map d, final e e, final String f, final String g, final String h, final String i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public f(final j j) {
        final R0 a = j.a;
        this.a = a.C;
        this.b = a.D;
        this.c = j.toString();
        final R0 a2 = j.a;
        if (a2.F != null) {
            this.d = (Map)new HashMap();
            for (final String s : ((BaseBundle)a2.F).keySet()) {
                this.d.put((Object)s, (Object)((BaseBundle)a2.F).getString(s));
            }
        }
        else {
            this.d = (Map)new HashMap();
        }
        final m b = j.b;
        if (b != null) {
            this.e = new e(b);
        }
        this.f = a2.G;
        this.g = a2.H;
        this.h = a2.I;
        this.i = a2.J;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        if (!Objects.equals((Object)this.a, (Object)f.a) || this.b != f.b || !Objects.equals((Object)this.c, (Object)f.c) || !Objects.equals((Object)this.e, (Object)f.e) || !Objects.equals((Object)this.d, (Object)f.d) || !Objects.equals((Object)this.f, (Object)f.f) || !Objects.equals((Object)this.g, (Object)f.g) || !Objects.equals((Object)this.h, (Object)f.h) || !Objects.equals((Object)this.i, (Object)f.i)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c, this.e, this.f, this.g, this.h, this.i });
    }
}
