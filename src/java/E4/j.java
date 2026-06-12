package E4;

import j0.c;
import java.nio.ByteBuffer;
import g2.n;
import android.util.Log;
import com.google.android.gms.internal.measurement.K1;
import F4.p;
import x4.f;
import A1.b;
import android.os.Handler;
import android.os.Looper;
import F4.o;

public final class j implements o
{
    public final int a;
    public final Object b;
    public final Object c;
    
    public j(final j b) {
        this.a = 2;
        this.b = b;
        this.c = new Handler(Looper.getMainLooper());
    }
    
    private final void a() {
    }
    
    @Override
    public final void error(final String s, final String s2, final Object o) {
        switch (this.a) {
            default: {
                ((Handler)this.c).post((Runnable)new b(this, s, s2, o, 19));
                return;
            }
            case 1: {
                ((f)this.b).a(((p)((K1)this.c).E).c.c(s, s2, o));
                return;
            }
            case 0: {
                final StringBuilder sb = new StringBuilder("Error ");
                sb.append(s);
                sb.append(" while sending restoration data to framework: ");
                sb.append(s2);
                Log.e("RestorationChannel", sb.toString());
            }
        }
    }
    
    @Override
    public final void notImplemented() {
        switch (this.a) {
            default: {
                ((Handler)this.c).post((Runnable)new n((Object)this, 4));
                return;
            }
            case 1: {
                ((f)this.b).a((ByteBuffer)null);
            }
            case 0: {}
        }
    }
    
    @Override
    public final void success(final Object o) {
        switch (this.a) {
            default: {
                ((Handler)this.c).post((Runnable)new c((Object)this, 2, o));
                return;
            }
            case 1: {
                ((f)this.b).a(((p)((K1)this.c).E).c.a(o));
                return;
            }
            case 0: {
                ((k)this.c).d = this.b;
            }
        }
    }
}
