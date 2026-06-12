package S0;

import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import R0.n;
import R0.m;
import java.util.ArrayList;
import java.util.List;
import n3.u0;

public final class e extends u0
{
    public static final String n;
    public final k i;
    public final List j;
    public final ArrayList k;
    public final ArrayList l;
    public boolean m;
    
    static {
        n = m.h("WorkContinuationImpl");
    }
    
    public e(final k i, final List j) {
        this.i = i;
        this.j = j;
        this.k = new ArrayList(j.size());
        this.l = new ArrayList();
        for (int k = 0; k < j.size(); ++k) {
            final String string = ((n)j.get(k)).a.toString();
            this.k.add((Object)string);
            this.l.add((Object)string);
        }
    }
    
    public static boolean Q(final e e, final HashSet set) {
        ((Set)set).addAll((Collection)e.k);
        final HashSet r = R(e);
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            if (r.contains((Object)iterator.next())) {
                return true;
            }
        }
        ((Set)set).removeAll((Collection)e.k);
        return false;
    }
    
    public static HashSet R(final e e) {
        final HashSet set = new HashSet();
        e.getClass();
        return set;
    }
}
