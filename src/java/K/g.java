package K;

import M.a;
import java.util.Locale;

public abstract class g
{
    public static final Locale[] a;
    
    static {
        a = new Locale[] { new Locale("en", "XA"), new Locale("ar", "XB") };
    }
    
    public static Locale a(final String s) {
        return Locale.forLanguageTag(s);
    }
    
    public static boolean b(final Locale locale, final Locale locale2) {
        final boolean equals = locale.equals((Object)locale2);
        final boolean b = true;
        if (equals) {
            return true;
        }
        if (!locale.getLanguage().equals((Object)locale2.getLanguage())) {
            return false;
        }
        final Locale[] a = g.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            if (a[i].equals((Object)locale)) {
                return false;
            }
        }
        for (int length2 = a.length, j = 0; j < length2; ++j) {
            if (a[j].equals((Object)locale2)) {
                return false;
            }
        }
        final String c = M.a.c((Object)M.a.a((Object)M.a.b(locale)));
        if (c.isEmpty()) {
            final String country = locale.getCountry();
            boolean b2 = b;
            if (!country.isEmpty()) {
                b2 = (country.equals((Object)locale2.getCountry()) && b);
            }
            return b2;
        }
        return c.equals((Object)M.a.c((Object)M.a.a((Object)M.a.b(locale2))));
    }
}
