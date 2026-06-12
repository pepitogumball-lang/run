package o4;

public abstract class a
{
    public static final String[] a;
    
    static {
        a = new String[0];
    }
    
    public static boolean a(final int n) {
        boolean b = true;
        if (n < 1) {
            b = false;
        }
        return b;
    }
    
    public static boolean b(final int n) {
        return n >= 2;
    }
}
