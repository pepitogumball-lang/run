package z3;

import java.text.DateFormat;
import java.util.Date;
import x3.g;
import java.util.TimeZone;
import java.util.Locale;
import java.text.SimpleDateFormat;
import x3.f;

public final class b implements f
{
    public static final SimpleDateFormat a;
    
    static {
        ((DateFormat)(a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US))).setTimeZone(TimeZone.getTimeZone("UTC"));
    }
    
    public final void a(final Object o, final Object o2) {
        ((g)o2).d(((DateFormat)b.a).format((Date)o));
    }
}
