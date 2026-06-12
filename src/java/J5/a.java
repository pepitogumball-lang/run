package j5;

public abstract class a
{
    public static final Integer a;
    
    static {
        final Integer n = null;
        while (true) {
            try {
                final Object value = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object)null);
                Integer n2;
                if (value instanceof Integer) {
                    n2 = (Integer)value;
                }
                else {
                    n2 = null;
                }
                Integer a2 = n;
                if (n2 != null) {
                    a2 = n;
                    if (((Number)n2).intValue() > 0) {
                        a2 = n2;
                    }
                }
                a = a2;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
