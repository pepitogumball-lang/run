package n5;

public abstract class p
{
    public static final q a;
    
    static {
        Object a2 = null;
        while (true) {
            try {
                a2 = (q)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
                if (a2 == null) {
                    a2 = new Object();
                }
                a = (q)a2;
            }
            catch (final ClassCastException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                continue;
            }
            break;
        }
    }
    
    public static e a(final Class clazz) {
        p.a.getClass();
        return new e(clazz);
    }
}
