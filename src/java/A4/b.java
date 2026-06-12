package a4;

import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class b
{
    public final String a;
    public final c b;
    
    public b(final Set set, final c b) {
        this.a = b(set);
        this.b = b;
    }
    
    public static String b(final Set set) {
        final StringBuilder sb = new StringBuilder();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            final a a = (a)iterator.next();
            sb.append(a.a);
            sb.append('/');
            sb.append(a.b);
            if (iterator.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    
    public final String a() {
        final c b = this.b;
        final HashSet a = b.a;
        synchronized (a) {
            final Set unmodifiableSet = Collections.unmodifiableSet((Set)b.a);
            monitorexit(a);
            final boolean empty = unmodifiableSet.isEmpty();
            final String a2 = this.a;
            if (empty) {
                return a2;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append(' ');
            synchronized (b.a) {
                final Set unmodifiableSet2 = Collections.unmodifiableSet((Set)b.a);
                monitorexit(a);
                sb.append(b(unmodifiableSet2));
                return sb.toString();
            }
        }
    }
}
