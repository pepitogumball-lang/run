package j;

import K.i;
import android.os.LocaleList;
import android.content.res.Configuration;

public abstract class s
{
    public static void a(final Configuration configuration, final Configuration configuration2, final Configuration configuration3) {
        final LocaleList locales = configuration.getLocales();
        final LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals((Object)locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }
    
    public static i b(final Configuration configuration) {
        return i.a(configuration.getLocales().toLanguageTags());
    }
    
    public static void c(final i i) {
        LocaleList.setDefault(LocaleList.forLanguageTags(i.a.a.toLanguageTags()));
    }
    
    public static void d(final Configuration configuration, final i i) {
        configuration.setLocales(LocaleList.forLanguageTags(i.a.a.toLanguageTags()));
    }
}
