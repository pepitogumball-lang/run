package L4;

import java.util.ArrayList;

public final class l
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    
    public static l a(final ArrayList list) {
        final Object o = new Object();
        final String a = (String)list.get(0);
        if (a == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        ((l)o).a = a;
        final String b = (String)list.get(1);
        if (b == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        ((l)o).b = b;
        final String c = (String)list.get(2);
        if (c == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        ((l)o).c = c;
        final String d = (String)list.get(3);
        if (d != null) {
            ((l)o).d = d;
            ((l)o).e = (String)list.get(4);
            ((l)o).f = (String)list.get(5);
            ((l)o).g = (String)list.get(6);
            ((l)o).h = (String)list.get(7);
            ((l)o).i = (String)list.get(8);
            ((l)o).j = (String)list.get(9);
            ((l)o).k = (String)list.get(10);
            ((l)o).l = (String)list.get(11);
            ((l)o).m = (String)list.get(12);
            ((l)o).n = (String)list.get(13);
            return (l)o;
        }
        throw new IllegalStateException("Nonnull field \"projectId\" is null.");
    }
    
    public final ArrayList b() {
        final ArrayList list = new ArrayList(14);
        list.add((Object)this.a);
        list.add((Object)this.b);
        list.add((Object)this.c);
        list.add((Object)this.d);
        list.add((Object)this.e);
        list.add((Object)this.f);
        list.add((Object)this.g);
        list.add((Object)this.h);
        list.add((Object)this.i);
        list.add((Object)this.j);
        list.add((Object)this.k);
        list.add((Object)this.l);
        list.add((Object)this.m);
        list.add((Object)this.n);
        return list;
    }
}
