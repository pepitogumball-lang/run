package g2;

import java.util.Objects;
import e2.d;
import h2.A;

public final class k
{
    public Object a;
    public boolean b;
    public int c;
    public Object d;
    
    public k a() {
        A.a("execute parameter required", this.d != null);
        final d[] a = (d[])this.a;
        final boolean b = this.b;
        final int c = this.c;
        final Object o = new Object();
        Objects.requireNonNull((Object)this);
        ((k)o).d = this;
        ((k)o).a = a;
        boolean b2 = false;
        if (a != null) {
            b2 = b2;
            if (b) {
                b2 = true;
            }
        }
        ((k)o).b = b2;
        ((k)o).c = c;
        return (k)o;
    }
}
