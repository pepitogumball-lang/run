package K;

import android.os.LocaleList;
import java.util.Locale;

public abstract class h
{
    public static LocaleList a(final Locale... array) {
        return new LocaleList(array);
    }
    
    public static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }
    
    public static LocaleList c() {
        return LocaleList.getDefault();
    }
}
