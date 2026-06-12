package G0;

import java.util.Collection;
import android.os.Build;
import java.util.HashSet;

public abstract class c implements h
{
    public static final HashSet c;
    public final String a;
    public final String b;
    
    static {
        c = new HashSet();
    }
    
    public c(final String a, final String b) {
        this.a = a;
        this.b = b;
        G0.c.c.add((Object)this);
    }
    
    public abstract boolean a();
    
    public boolean b() {
        final HashSet a = G0.a.a;
        final String b = this.b;
        if (!a.contains((Object)b)) {
            final String type = Build.TYPE;
            if ("eng".equals((Object)type) || "userdebug".equals((Object)type)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(b);
                sb.append(":dev");
                if (((Collection)a).contains((Object)sb.toString())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
