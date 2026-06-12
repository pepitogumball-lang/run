package C;

import android.app.Notification$BigTextStyle;
import android.app.Notification$Builder;
import L3.A;

public final class r extends u
{
    public CharSequence D;
    
    @Override
    public final void e(final A a) {
        new Notification$BigTextStyle((Notification$Builder)a.E).setBigContentTitle((CharSequence)null).bigText(this.D);
    }
    
    @Override
    public final String g() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
