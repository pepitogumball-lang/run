package p4;

import java.util.HashMap;
import java.util.ArrayList;
import com.google.android.gms.internal.ads.Rc;
import java.util.Map;
import u2.f;

public final class a extends f
{
    public final Map F;
    public final Rc G;
    public final boolean H;
    
    public a(final Map f, final boolean h) {
        this.G = new Rc(19, false);
        this.F = f;
        this.H = h;
    }
    
    public final void P(final ArrayList list) {
        if (!this.H) {
            final HashMap hashMap = new HashMap();
            final HashMap hashMap2 = new HashMap();
            final Rc g = this.G;
            hashMap2.put((Object)"code", (Object)g.E);
            hashMap2.put((Object)"message", (Object)g.F);
            hashMap2.put((Object)"data", (Object)g.G);
            hashMap.put((Object)"error", (Object)hashMap2);
            list.add((Object)hashMap);
        }
    }
    
    public final void Q(final ArrayList list) {
        if (!this.H) {
            final HashMap hashMap = new HashMap();
            hashMap.put((Object)"result", (Object)this.G.D);
            list.add((Object)hashMap);
        }
    }
    
    @Override
    public final Object g(final String s) {
        return this.F.get((Object)s);
    }
    
    @Override
    public final String i() {
        return (String)this.F.get((Object)"method");
    }
    
    @Override
    public final boolean k() {
        return this.H;
    }
    
    @Override
    public final c l() {
        return (c)this.G;
    }
    
    @Override
    public final boolean p() {
        return this.F.containsKey((Object)"transactionId");
    }
}
