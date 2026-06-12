package V0;

import androidx.work.impl.background.systemjob.SystemJobService;
import android.content.Context;
import R0.m;
import android.content.ComponentName;

public final class a
{
    public static final String b;
    public final ComponentName a;
    
    static {
        b = m.h("SystemJobInfoConverter");
    }
    
    public a(final Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class)SystemJobService.class);
    }
}
