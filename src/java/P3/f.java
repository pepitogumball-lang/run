package P3;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import a.a;

public final class f extends a
{
    public static f f;
    public static final Map g;
    
    static {
        final HashMap hashMap = new HashMap();
        ((AbstractMap)hashMap).put((Object)461L, (Object)"FIREPERF_AUTOPUSH");
        ((AbstractMap)hashMap).put((Object)462L, (Object)"FIREPERF");
        ((AbstractMap)hashMap).put((Object)675L, (Object)"FIREPERF_INTERNAL_LOW");
        ((AbstractMap)hashMap).put((Object)676L, (Object)"FIREPERF_INTERNAL_HIGH");
        g = Collections.unmodifiableMap((Map)hashMap);
    }
    
    @Override
    public final String i() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
