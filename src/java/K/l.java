package K;

import android.os.UserManager;
import android.content.Context;

public abstract class l
{
    public static boolean a(final Context context) {
        return ((UserManager)context.getSystemService((Class)UserManager.class)).isUserUnlocked();
    }
}
