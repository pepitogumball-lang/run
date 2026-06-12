package f2;

import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

public abstract class j
{
    public static final Set a;
    
    static {
        a = Collections.newSetFromMap((Map)new WeakHashMap());
    }
}
