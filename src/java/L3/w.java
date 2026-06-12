package L3;

import A3.f;
import java.util.Map;
import M3.d;
import M3.e;
import A3.h;
import java.util.HashMap;
import c2.k;

public abstract class w
{
    public static final k a;
    
    static {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final f a2 = h.a;
        hashMap.put((Object)w.class, (Object)c.a);
        hashMap2.remove((Object)w.class);
        hashMap.put((Object)e.class, (Object)b.a);
        hashMap2.remove((Object)e.class);
        hashMap.put((Object)d.class, (Object)L3.a.a);
        hashMap2.remove((Object)d.class);
        a = new k((Object)new HashMap((Map)hashMap), (Object)new HashMap((Map)hashMap2), (Object)a2, 1);
    }
}
