package v5;

public abstract class b
{
    public static final int a = 0;
    
    static {
        final ThreadLocal[] array = new ThreadLocal[4];
        for (int i = 0; i < 4; ++i) {
            array[i] = new ThreadLocal();
        }
    }
}
