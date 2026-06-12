package d5;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import n5.h;
import m5.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public abstract class d extends j
{
    public static ArrayList G(final Iterable iterable) {
        final ArrayList list = new ArrayList();
        for (final Object next : iterable) {
            if (next != null) {
                list.add(next);
            }
        }
        return list;
    }
    
    public static final void H(final Collection collection, final StringBuilder sb, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final l l) {
        n5.h.e("<this>", (Object)collection);
        n5.h.e("separator", (Object)charSequence);
        n5.h.e("prefix", (Object)charSequence2);
        n5.h.e("postfix", (Object)charSequence3);
        n5.h.e("truncated", (Object)charSequence4);
        sb.append(charSequence2);
        final Iterator iterator = ((Iterable)collection).iterator();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (!iterator.hasNext()) {
                break;
            }
            final Object next = iterator.next();
            ++n2;
            boolean b = true;
            if (n2 > 1) {
                sb.append(charSequence);
            }
            if (n >= 0 && (n3 = n2) > n) {
                break;
            }
            if (l != null) {
                sb.append((CharSequence)l.g(next));
            }
            else {
                if (next != null) {
                    b = (next instanceof CharSequence);
                }
                if (b) {
                    sb.append((CharSequence)next);
                }
                else if (next instanceof Character) {
                    sb.append((char)next);
                }
                else {
                    sb.append((CharSequence)next.toString());
                }
            }
        }
        if (n >= 0 && n3 > n) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }
    
    public static String I(final Collection collection, final String s, String s2, String s3, l l, final int n) {
        if ((n & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n & 0x4) != 0x0) {
            s3 = "";
        }
        if ((n & 0x20) != 0x0) {
            l = null;
        }
        n5.h.e("<this>", (Object)collection);
        n5.h.e("prefix", (Object)s2);
        n5.h.e("postfix", (Object)s3);
        final StringBuilder sb = new StringBuilder();
        H(collection, sb, (CharSequence)s, (CharSequence)s2, (CharSequence)s3, -1, (CharSequence)"...", l);
        return sb.toString();
    }
    
    public static List J(final ArrayList list, final Comparator comparator) {
        if (((Collection)list).size() <= 1) {
            return L((Iterable)list);
        }
        final Object[] array = ((Collection)list).toArray(new Object[0]);
        n5.h.e("<this>", (Object)array);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        final List list2 = Arrays.asList(array);
        n5.h.d("asList(...)", (Object)list2);
        return list2;
    }
    
    public static final void K(final Iterable iterable, final AbstractCollection collection) {
        n5.h.e("<this>", (Object)iterable);
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            ((Collection)collection).add(iterator.next());
        }
    }
    
    public static List L(final Iterable iterable) {
        n5.h.e("<this>", (Object)iterable);
        final boolean b = iterable instanceof Collection;
        Object o = d5.l.C;
        if (b) {
            final Collection collection = (Collection)iterable;
            final int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    o = M(collection);
                }
                else {
                    Object o2;
                    if (iterable instanceof List) {
                        o2 = ((List)iterable).get(0);
                    }
                    else {
                        o2 = collection.iterator().next();
                    }
                    o = com.google.android.gms.internal.auth.h.t(o2);
                }
            }
            return (List)o;
        }
        Object m;
        if (b) {
            m = M((Collection)iterable);
        }
        else {
            final ArrayList list = new ArrayList();
            K(iterable, (AbstractCollection)list);
            m = list;
        }
        final int size2 = ((List)m).size();
        if (size2 != 0) {
            if (size2 != 1) {
                o = m;
            }
            else {
                o = com.google.android.gms.internal.auth.h.t(((List)m).get(0));
            }
        }
        return (List)o;
    }
    
    public static ArrayList M(final Collection collection) {
        n5.h.e("<this>", (Object)collection);
        return new ArrayList(collection);
    }
    
    public static Set N(final Iterable iterable) {
        n5.h.e("<this>", (Object)iterable);
        final boolean b = iterable instanceof Collection;
        Object o = n.C;
        if (b) {
            final Collection collection = (Collection)iterable;
            final int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    o = new LinkedHashSet(d5.o.G(collection.size()));
                    K(iterable, (AbstractCollection)o);
                }
                else {
                    Object o2;
                    if (iterable instanceof List) {
                        o2 = ((List)iterable).get(0);
                    }
                    else {
                        o2 = collection.iterator().next();
                    }
                    o = Collections.singleton(o2);
                    n5.h.d("singleton(...)", o);
                }
            }
            return (Set)o;
        }
        final LinkedHashSet set = new LinkedHashSet();
        K(iterable, (AbstractCollection)set);
        final int size2 = ((Set)set).size();
        Object singleton = o;
        if (size2 != 0) {
            if (size2 != 1) {
                singleton = set;
            }
            else {
                singleton = Collections.singleton(((Set)set).iterator().next());
                n5.h.d("singleton(...)", singleton);
            }
        }
        return (Set)singleton;
    }
}
