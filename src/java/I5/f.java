package I5;

import java.nio.charset.Charset;

public abstract class f
{
    public static final Charset a;
    
    static {
        a = Charset.forName("UTF-8");
    }
    
    public static void a(final long n, final long n2, final long n3) {
        if ((n2 | n3) >= 0L && n2 <= n && n - n2 >= n3) {
            return;
        }
        final StringBuilder sb = new StringBuilder("size=");
        sb.append(n);
        sb.append(" offset=");
        sb.append(n2);
        sb.append(" byteCount=");
        sb.append(n3);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
}
