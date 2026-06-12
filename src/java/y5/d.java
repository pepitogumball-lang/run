package y5;

import m5.l;
import w5.e;
import B5.a;
import B5.w;

public abstract class d
{
    public static final j a;
    public static final int b;
    public static final int c;
    public static final w d;
    public static final w e;
    public static final w f;
    public static final w g;
    public static final w h;
    public static final w i;
    public static final w j;
    public static final w k;
    public static final w l;
    public static final w m;
    public static final w n;
    public static final w o;
    public static final w p;
    public static final w q;
    public static final w r;
    public static final w s;
    
    static {
        a = new j(-1L, null, null, 0);
        b = B5.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
        c = B5.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
        d = new w("BUFFERED", 0);
        e = new w("SHOULD_BUFFER", 0);
        f = new w("S_RESUMING_BY_RCV", 0);
        g = new w("RESUMING_BY_EB", 0);
        h = new w("POISONED", 0);
        i = new w("DONE_RCV", 0);
        j = new w("INTERRUPTED_SEND", 0);
        k = new w("INTERRUPTED_RCV", 0);
        l = new w("CHANNEL_CLOSED", 0);
        m = new w("SUSPEND", 0);
        n = new w("SUSPEND_NO_WAITER", 0);
        o = new w("FAILED", 0);
        p = new w("NO_RECEIVE_RESULT", 0);
        q = new w("CLOSE_HANDLER_CLOSED", 0);
        r = new w("CLOSE_HANDLER_INVOKED", 0);
        s = new w("NO_CLOSE_CAUSE", 0);
    }
    
    public static final boolean a(final e e, final Object o, final l l) {
        final w d = e.d(o, l);
        boolean b;
        if (d != null) {
            e.m((Object)d);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
