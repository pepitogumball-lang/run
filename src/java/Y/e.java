package y;

import java.util.Iterator;
import java.util.ArrayList;

public class e implements d
{
    public n a;
    public boolean b;
    public boolean c;
    public final n d;
    public int e;
    public int f;
    public int g;
    public int h;
    public f i;
    public boolean j;
    public final ArrayList k;
    public final ArrayList l;
    
    public e(final n d) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.e = 1;
        this.h = 1;
        this.i = null;
        this.j = false;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = d;
    }
    
    @Override
    public final void a(final d d) {
        final ArrayList l = this.l;
        final Iterator iterator = l.iterator();
        while (iterator.hasNext()) {
            if (!((e)iterator.next()).j) {
                return;
            }
        }
        this.c = true;
        final n a = this.a;
        if (a != null) {
            a.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        final Iterator iterator2 = l.iterator();
        e e = null;
        int n = 0;
        while (iterator2.hasNext()) {
            final e e2 = (e)iterator2.next();
            if (e2 instanceof f) {
                continue;
            }
            ++n;
            e = e2;
        }
        if (e != null && n == 1 && e.j) {
            final f i = this.i;
            if (i != null) {
                if (!i.j) {
                    return;
                }
                this.f = this.h * i.g;
            }
            this.d(e.g + this.f);
        }
        final n a2 = this.a;
        if (a2 != null) {
            a2.a(this);
        }
    }
    
    public final void b(final n n) {
        this.k.add((Object)n);
        if (this.j) {
            n.a(n);
        }
    }
    
    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }
    
    public void d(final int g) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = g;
        for (final d d : this.k) {
            d.a(d);
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.g0);
        sb.append(":");
        String s = null;
        switch (this.e) {
            default: {
                s = "null";
                break;
            }
            case 8: {
                s = "BASELINE";
                break;
            }
            case 7: {
                s = "BOTTOM";
                break;
            }
            case 6: {
                s = "TOP";
                break;
            }
            case 5: {
                s = "RIGHT";
                break;
            }
            case 4: {
                s = "LEFT";
                break;
            }
            case 3: {
                s = "VERTICAL_DIMENSION";
                break;
            }
            case 2: {
                s = "HORIZONTAL_DIMENSION";
                break;
            }
            case 1: {
                s = "UNKNOWN";
                break;
            }
        }
        sb.append(s);
        sb.append("(");
        Object value;
        if (this.j) {
            value = this.g;
        }
        else {
            value = "unresolved";
        }
        sb.append(value);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
