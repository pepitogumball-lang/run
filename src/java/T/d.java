package t;

public abstract class d
{
    public static final int[] a;
    public static final Object[] b;
    
    static {
        a = new int[0];
        b = new Object[0];
    }
    
    public static int a(int n, final int n2, final int[] array) {
        --n;
        int i = 0;
        while (i <= n) {
            final int n3 = i + n >>> 1;
            final int n4 = array[n3];
            if (n4 < n2) {
                i = n3 + 1;
            }
            else {
                if (n4 <= n2) {
                    return n3;
                }
                n = n3 - 1;
            }
        }
        return ~i;
    }
    
    public static int b(final long[] array, int n, final long n2) {
        --n;
        int i = 0;
        while (i <= n) {
            final int n3 = i + n >>> 1;
            final long n4 = lcmp(array[n3], n2);
            if (n4 < 0) {
                i = n3 + 1;
            }
            else {
                if (n4 <= 0) {
                    return n3;
                }
                n = n3 - 1;
            }
        }
        return ~i;
    }
}
