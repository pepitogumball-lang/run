package e3;

import E3.b;

public final class k implements b
{
    public static final Object c;
    public volatile Object a;
    public volatile b b;
    
    static {
        c = new Object();
    }
    
    public k(final b b) {
        this.a = k.c;
        this.b = b;
    }
    
    public final Object get() {
        final Object a = this.a;
        final Object c = k.c;
        Object a2 = a;
        if (a == c) {
            monitorenter(this);
            Label_0060: {
                try {
                    if ((a2 = this.a) == c) {
                        a2 = this.b.get();
                        this.a = a2;
                        this.b = null;
                    }
                    break Label_0060;
                }
                finally {
                    monitorexit(this);
                    monitorexit(this);
                }
            }
        }
        return a2;
    }
}
