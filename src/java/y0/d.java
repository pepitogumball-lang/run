package Y0;

import java.util.Set;
import O2.p;
import java.util.Collection;
import java.util.ArrayList;
import c2.k;
import K2.N0;
import X0.b;
import R0.m;
import java.util.LinkedHashSet;
import android.content.Context;
import d1.a;

public abstract class d
{
    public static final String f;
    public final a a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;
    
    static {
        f = m.h("ConstraintTracker");
    }
    
    public d(final Context context, final a a) {
        this.c = new Object();
        this.d = new LinkedHashSet();
        this.b = context.getApplicationContext();
        this.a = a;
    }
    
    public abstract Object a();
    
    public final void b(final b b) {
        final Object c;
        monitorenter(c = this.c);
        Label_0045: {
            try {
                if (((Set)this.d).remove((Object)b) && ((Set)this.d).isEmpty()) {
                    this.e();
                }
                break Label_0045;
            }
            finally {
                monitorexit(c);
                monitorexit(c);
            }
        }
    }
    
    public final void c(final Object o) {
        final Object c;
        monitorenter(c = this.c);
        Label_0095: {
            try {
                final Object e = this.e;
                if (e != o && (e == null || !e.equals(o))) {
                    break Label_0095;
                }
                break Label_0095;
            }
            finally {
                monitorexit(c);
                this.e = o;
                ((N0)((k)this.a).F).execute((Runnable)new p(9, (Object)this, (Object)new ArrayList((Collection)this.d), false));
                monitorexit(c);
                return;
                monitorexit(c);
            }
        }
    }
    
    public abstract void d();
    
    public abstract void e();
}
