package w5;

public abstract class h0
{
    public static final ThreadLocal a;
    
    static {
        a = new ThreadLocal();
    }
    
    public static I a() {
        final ThreadLocal a = h0.a;
        I i;
        if ((i = (I)a.get()) == null) {
            i = new d(Thread.currentThread());
            a.set((Object)i);
        }
        return i;
    }
}
