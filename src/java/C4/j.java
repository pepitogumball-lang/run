package c4;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.nio.charset.Charset;

public final class j
{
    public static final Charset e;
    public static final Pattern f;
    public static final Pattern g;
    public final HashSet a;
    public final Executor b;
    public final c c;
    public final c d;
    
    static {
        e = Charset.forName("UTF-8");
        f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }
    
    public j(final Executor b, final c c, final c d) {
        this.a = new HashSet();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static HashSet a(final c c) {
        final HashSet set = new HashSet();
        final e c2 = c.c();
        if (c2 == null) {
            return set;
        }
        final Iterator keys = c2.b.keys();
        while (keys.hasNext()) {
            set.add((Object)keys.next());
        }
        return set;
    }
}
