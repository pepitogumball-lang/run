package p;

import s2.a;

public final class b extends a
{
    public static volatile b e;
    public static final p.a f;
    public final c d;
    
    static {
        f = new p.a(0);
    }
    
    public b() {
        this.d = new c();
    }
    
    public static b u() {
        if (b.e != null) {
            return b.e;
        }
        final Class<b> clazz;
        monitorenter(clazz = b.class);
        Label_0040: {
            try {
                if (b.e == null) {
                    b.e = new b();
                }
                break Label_0040;
            }
            finally {
                monitorexit(clazz);
                monitorexit(clazz);
                return b.e;
            }
        }
    }
}
