package m;

import android.content.Context;
import android.content.res.Configuration;

public abstract class d
{
    public static Context a(final e e, final Configuration configuration) {
        return ((Context)e).createConfigurationContext(configuration);
    }
}
