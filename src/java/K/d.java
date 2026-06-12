package K;

import android.os.LocaleList;
import android.content.res.Configuration;

public abstract class d
{
    public static LocaleList a(final Configuration configuration) {
        return configuration.getLocales();
    }
    
    public static void b(final Configuration configuration, final i i) {
        configuration.setLocales(i.a.a);
    }
}
