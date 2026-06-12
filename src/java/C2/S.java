package C2;

import V2.o;
import m0.a;
import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;

public final class s extends WebView
{
    public static final int F = 0;
    public final Handler C;
    public final c D;
    public boolean E;
    
    public s(final t t, final Handler c, final c d) {
        super((Context)t);
        this.E = false;
        this.C = c;
        this.D = d;
    }
    
    public final void a(final String s, final String s2) {
        this.C.post((Runnable)new o((Object)this, 6, (Object)a.h(s, "(", s2, ");")));
    }
}
