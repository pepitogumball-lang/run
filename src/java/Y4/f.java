package Y4;

import o.q1;
import android.util.Log;
import C4.b;
import w2.e;
import C4.a;
import B4.c;

public final class f implements c, a
{
    public e C;
    
    public final void onAttachedToActivity(final b b) {
        final e c = this.C;
        if (c == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
            return;
        }
        c.F = ((q1)b).C;
    }
    
    public final void onAttachedToEngine(final B4.b b) {
        final e c = new e(b.a, 14);
        this.C = c;
        e.M(b.c, c);
    }
    
    public final void onDetachedFromActivity() {
        final e c = this.C;
        if (c == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
            return;
        }
        c.F = null;
    }
    
    public final void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }
    
    public final void onDetachedFromEngine(final B4.b b) {
        if (this.C == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        e.M(b.c, (e)null);
        this.C = null;
    }
    
    public final void onReattachedToActivityForConfigChanges(final b b) {
        this.onAttachedToActivity(b);
    }
}
