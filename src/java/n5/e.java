package n5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.ArrayList;
import m5.o;
import m5.n;
import m5.m;
import m5.k;
import m5.j;
import m5.i;
import m5.h;
import m5.g;
import m5.f;
import m5.c;
import m5.w;
import m5.v;
import m5.u;
import m5.t;
import m5.s;
import m5.r;
import m5.q;
import m5.p;
import m5.l;
import m5.a;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import s5.b;

public final class e implements b, d
{
    public static final Map b;
    public static final HashMap c;
    public static final LinkedHashMap d;
    public final Class a;
    
    static {
        final Iterable iterable = (Iterable)d5.e.D((Object[])new Class[] { a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, m5.b.class, c.class, m5.d.class, m5.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class });
        final ArrayList list = new ArrayList(d5.f.E(iterable));
        final Iterator iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            list.add((Object)new c5.c((Object)next, (Object)n));
            ++n;
        }
        b = d5.o.H(list);
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"boolean", (Object)"kotlin.Boolean");
        hashMap.put((Object)"char", (Object)"kotlin.Char");
        hashMap.put((Object)"byte", (Object)"kotlin.Byte");
        hashMap.put((Object)"short", (Object)"kotlin.Short");
        hashMap.put((Object)"int", (Object)"kotlin.Int");
        hashMap.put((Object)"float", (Object)"kotlin.Float");
        hashMap.put((Object)"long", (Object)"kotlin.Long");
        hashMap.put((Object)"double", (Object)"kotlin.Double");
        final HashMap hashMap2 = new HashMap();
        hashMap2.put((Object)"java.lang.Boolean", (Object)"kotlin.Boolean");
        hashMap2.put((Object)"java.lang.Character", (Object)"kotlin.Char");
        hashMap2.put((Object)"java.lang.Byte", (Object)"kotlin.Byte");
        hashMap2.put((Object)"java.lang.Short", (Object)"kotlin.Short");
        hashMap2.put((Object)"java.lang.Integer", (Object)"kotlin.Int");
        hashMap2.put((Object)"java.lang.Float", (Object)"kotlin.Float");
        hashMap2.put((Object)"java.lang.Long", (Object)"kotlin.Long");
        hashMap2.put((Object)"java.lang.Double", (Object)"kotlin.Double");
        final HashMap c2 = new HashMap();
        c2.put((Object)"java.lang.Object", (Object)"kotlin.Any");
        c2.put((Object)"java.lang.String", (Object)"kotlin.String");
        c2.put((Object)"java.lang.CharSequence", (Object)"kotlin.CharSequence");
        c2.put((Object)"java.lang.Throwable", (Object)"kotlin.Throwable");
        c2.put((Object)"java.lang.Cloneable", (Object)"kotlin.Cloneable");
        c2.put((Object)"java.lang.Number", (Object)"kotlin.Number");
        c2.put((Object)"java.lang.Comparable", (Object)"kotlin.Comparable");
        c2.put((Object)"java.lang.Enum", (Object)"kotlin.Enum");
        c2.put((Object)"java.lang.annotation.Annotation", (Object)"kotlin.Annotation");
        c2.put((Object)"java.lang.Iterable", (Object)"kotlin.collections.Iterable");
        c2.put((Object)"java.util.Iterator", (Object)"kotlin.collections.Iterator");
        c2.put((Object)"java.util.Collection", (Object)"kotlin.collections.Collection");
        c2.put((Object)"java.util.List", (Object)"kotlin.collections.List");
        c2.put((Object)"java.util.Set", (Object)"kotlin.collections.Set");
        c2.put((Object)"java.util.ListIterator", (Object)"kotlin.collections.ListIterator");
        c2.put((Object)"java.util.Map", (Object)"kotlin.collections.Map");
        c2.put((Object)"java.util.Map$Entry", (Object)"kotlin.collections.Map.Entry");
        c2.put((Object)"kotlin.jvm.internal.StringCompanionObject", (Object)"kotlin.String.Companion");
        c2.put((Object)"kotlin.jvm.internal.EnumCompanionObject", (Object)"kotlin.Enum.Companion");
        c2.putAll((Map)hashMap);
        c2.putAll((Map)hashMap2);
        final Collection values = hashMap.values();
        n5.h.d("<get-values>(...)", values);
        for (final String s : (Iterable)values) {
            final StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            n5.h.b(s);
            sb.append(u5.i.X(s, s));
            sb.append("CompanionObject");
            c2.put((Object)sb.toString(), (Object)s.concat(".Companion"));
        }
        for (final Map$Entry map$Entry : e.b.entrySet()) {
            final Class clazz = (Class)map$Entry.getKey();
            final int intValue = ((Number)map$Entry.getValue()).intValue();
            final String name = clazz.getName();
            final StringBuilder sb2 = new StringBuilder("kotlin.Function");
            sb2.append(intValue);
            c2.put((Object)name, (Object)sb2.toString());
        }
        c = c2;
        final LinkedHashMap d2 = new LinkedHashMap(d5.o.G(c2.size()));
        for (final Map$Entry map$Entry2 : c2.entrySet()) {
            final Object key = map$Entry2.getKey();
            final String s2 = (String)map$Entry2.getValue();
            n5.h.b(s2);
            ((Map)d2).put(key, (Object)u5.i.X(s2, s2));
        }
        d = d2;
    }
    
    public e(final Class a) {
        n5.h.e("jClass", a);
        this.a = a;
    }
    
    @Override
    public final Class a() {
        return this.a;
    }
    
    public final String b() {
        final Class a = this.a;
        n5.h.e("jClass", a);
        final boolean anonymousClass = a.isAnonymousClass();
        final String s = null;
        final String s2 = null;
        String s3;
        if (anonymousClass) {
            s3 = s;
        }
        else if (a.isLocalClass()) {
            s3 = a.getSimpleName();
            final Method enclosingMethod = a.getEnclosingMethod();
            if (enclosingMethod != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(enclosingMethod.getName());
                sb.append('$');
                s3 = u5.i.W(s3, sb.toString());
            }
            else {
                final Constructor enclosingConstructor = a.getEnclosingConstructor();
                if (enclosingConstructor != null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(enclosingConstructor.getName());
                    sb2.append('$');
                    s3 = u5.i.W(s3, sb2.toString());
                }
                else {
                    final int index = s3.indexOf(36, 0);
                    if (index != -1) {
                        s3 = s3.substring(index + 1, s3.length());
                        n5.h.d("substring(...)", s3);
                    }
                }
            }
        }
        else {
            final boolean array = a.isArray();
            final LinkedHashMap d = e.d;
            if (array) {
                final Class componentType = a.getComponentType();
                String concat = s2;
                if (componentType.isPrimitive()) {
                    final String s4 = (String)d.get((Object)componentType.getName());
                    concat = s2;
                    if (s4 != null) {
                        concat = s4.concat("Array");
                    }
                }
                if ((s3 = concat) == null) {
                    s3 = "Array";
                }
            }
            else if ((s3 = (String)d.get((Object)a.getName())) == null) {
                s3 = a.getSimpleName();
            }
        }
        return s3;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof e && J5.b.B((b)this).equals(J5.b.B((b)o));
    }
    
    @Override
    public final int hashCode() {
        return J5.b.B((b)this).hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this.a);
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
