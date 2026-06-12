package C2;

import android.content.Intent;
import android.app.Activity;
import android.content.ContextWrapper;

public final class t extends ContextWrapper
{
    public Activity a;
    
    public final Object getSystemService(final String s) {
        final Activity a = this.a;
        if (a != null) {
            return a.getSystemService(s);
        }
        return super.getSystemService(s);
    }
    
    public final void startActivity(final Intent intent) {
        final Activity a = this.a;
        if (a != null) {
            a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        super.startActivity(intent);
    }
}
