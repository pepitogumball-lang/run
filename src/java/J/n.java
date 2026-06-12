package j;

import android.app.LocaleManager;
import android.os.LocaleList;

public abstract class n
{
    public static LocaleList a(final Object o) {
        return ((LocaleManager)o).getApplicationLocales();
    }
    
    public static void b(final Object o, final LocaleList applicationLocales) {
        ((LocaleManager)o).setApplicationLocales(applicationLocales);
    }
}
