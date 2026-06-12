package U4;

import K2.D;
import io.flutter.embedding.android.FlutterActivity;
import F4.r;
import o.q1;
import C4.b;
import C4.a;
import B4.c;

public class g implements c, a
{
    public f C;
    public F4.f D;
    public b E;
    
    public final void onAttachedToActivity(final b e) {
        this.E = e;
        final f c = this.C;
        final q1 q1 = (q1)e;
        q1.b((r)c);
        this.C.D = (FlutterActivity)q1.C;
    }
    
    public final void onAttachedToEngine(final B4.b b) {
        f.f(this.D = b.c, this.C = new f(b.a, new D(14)));
    }
    
    public final void onDetachedFromActivity() {
        ((q1)this.E).h((r)this.C);
        this.C.D = null;
        this.E = null;
    }
    
    public final void onDetachedFromActivityForConfigChanges() {
        ((q1)this.E).h((r)this.C);
        this.C.D = null;
        this.E = null;
    }
    
    public final void onDetachedFromEngine(final B4.b b) {
        this.C = null;
        final F4.f d = this.D;
        if (d != null) {
            f.f(d, null);
            this.D = null;
        }
    }
    
    public final void onReattachedToActivityForConfigChanges(final b e) {
        this.E = e;
        final f c = this.C;
        final q1 q1 = (q1)e;
        q1.b((r)c);
        this.C.D = (FlutterActivity)q1.C;
    }
}
