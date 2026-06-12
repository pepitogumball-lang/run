package e3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import J5.b;
import java.util.HashSet;
import C2.B;
import java.util.Collections;
import java.util.Set;

public final class a
{
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final c f;
    public final Set g;
    
    public a(final String a, final Set set, final Set set2, final int d, final int e, final c f, final Set set3) {
        this.a = a;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = Collections.unmodifiableSet(set3);
    }
    
    public static B a(final o o) {
        final o[] array = new o[0];
        final Object o2 = new Object();
        ((B)o2).c = null;
        final HashSet d = new HashSet();
        ((B)o2).d = (Serializable)d;
        ((B)o2).e = (Serializable)new HashSet();
        int i = 0;
        ((B)o2).a = 0;
        ((B)o2).b = 0;
        ((B)o2).g = new HashSet();
        d.add((Object)o);
        while (i < array.length) {
            b.k("Null interface", (Object)array[i]);
            ++i;
        }
        Collections.addAll((Collection)((B)o2).d, (Object[])array);
        return (B)o2;
    }
    
    public static B b(final Class clazz) {
        return new B(clazz, new Class[0]);
    }
    
    public static a c(Object o, Class clazz, final Class... array) {
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        final HashSet set3 = new HashSet();
        set.add((Object)o.a(clazz));
        for (int length = array.length, i = 0; i < length; ++i) {
            clazz = array[i];
            b.k("Null interface", (Object)clazz);
            set.add((Object)o.a(clazz));
        }
        o = new Z4.B(o, 26);
        return new a(null, (Set)new HashSet((Collection)set), (Set)new HashSet((Collection)set2), 0, 0, (c)o, (Set)set3);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.b.toArray()));
        sb.append(">{");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.c.toArray()));
        sb.append("}");
        return sb.toString();
    }
}
