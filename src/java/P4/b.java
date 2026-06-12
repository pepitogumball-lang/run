package p4;

import org.json.JSONObject;
import java.util.Map;
import F4.o;
import F4.m;
import V4.G;
import u2.f;

public final class b extends f
{
    public final G F;
    public final m G;
    
    public b(final m g, final o o) {
        this.G = g;
        this.F = new G((Object)o, 19);
    }
    
    @Override
    public final Object g(final String s) {
        return this.G.a(s);
    }
    
    @Override
    public final String i() {
        return this.G.a;
    }
    
    @Override
    public final c l() {
        return (c)this.F;
    }
    
    @Override
    public final boolean p() {
        final Object b = this.G.b;
        boolean b2;
        if (b == null) {
            b2 = false;
        }
        else if (b instanceof Map) {
            b2 = ((Map)b).containsKey((Object)"transactionId");
        }
        else {
            if (!(b instanceof JSONObject)) {
                throw new ClassCastException();
            }
            b2 = ((JSONObject)b).has("transactionId");
        }
        return b2;
    }
}
