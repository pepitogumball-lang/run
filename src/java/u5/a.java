package u5;

import n5.h;
import java.nio.charset.Charset;

public abstract class a
{
    public static final Charset a;
    
    static {
        final Charset forName = Charset.forName("UTF-8");
        h.d("forName(...)", forName);
        a = forName;
        h.d("forName(...)", Charset.forName("UTF-16"));
        h.d("forName(...)", Charset.forName("UTF-16BE"));
        h.d("forName(...)", Charset.forName("UTF-16LE"));
        h.d("forName(...)", Charset.forName("US-ASCII"));
        h.d("forName(...)", Charset.forName("ISO-8859-1"));
    }
}
