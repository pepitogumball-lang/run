package W3;

import android.content.Context;
import R3.a;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;

public final class d
{
    public final Runtime a;
    public final ActivityManager b;
    public final ActivityManager$MemoryInfo c;
    
    static {
        a.d();
    }
    
    public d(final Context context) {
        final Runtime runtime = Runtime.getRuntime();
        this.a = runtime;
        (this.b = (ActivityManager)context.getSystemService("activity")).getMemoryInfo(this.c = new ActivityManager$MemoryInfo());
    }
}
