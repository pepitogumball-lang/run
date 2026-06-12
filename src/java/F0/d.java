package F0;

import G0.q;
import android.content.Context;
import java.util.Iterator;
import G0.b;
import m0.a;
import G0.h;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import G0.c;
import G0.z;
import G0.m;

public abstract class d
{
    public static final m a;
    
    static {
        a = (m)new Object();
    }
    
    public static boolean a(final String s) {
        final b a = z.a;
        final Set unmodifiableSet = Collections.unmodifiableSet((Set)c.c);
        final HashSet set = new HashSet();
        for (final h h : unmodifiableSet) {
            if (((c)h).a.equals((Object)s)) {
                set.add((Object)h);
            }
        }
        if (!set.isEmpty()) {
            for (final c c : set) {
                if (c.a() || c.b()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException(m0.a.f("Unknown feature ", s));
    }
    
    public static boolean b(final Context context, final String s) {
        final b a = z.a;
        final Set unmodifiableSet = Collections.unmodifiableSet((Set)q.d);
        final HashSet set = new HashSet();
        for (final q q : unmodifiableSet) {
            if (q.a.equals((Object)s)) {
                set.add((Object)q);
            }
        }
        if (!set.isEmpty()) {
            final Iterator iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                if (((q)iterator2.next()).a(context)) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException(m0.a.f("Unknown feature ", s));
    }
    
    public abstract void onMessage(final o p0, final n p1);
}
