package r;

import android.os.LocaleList;

public abstract class i
{
    public static String a() {
        final LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag;
        if (adjustedDefault.size() > 0) {
            languageTag = adjustedDefault.get(0).toLanguageTag();
        }
        else {
            languageTag = null;
        }
        return languageTag;
    }
}
