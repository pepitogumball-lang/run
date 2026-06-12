package o4;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public final class m
{
    public final String a;
    public final List b;
    
    public m(final String a, final List list) {
        this.a = a;
        Object b = list;
        if (list == null) {
            b = new ArrayList();
        }
        this.b = (List)b;
    }
    
    public static Object a(final Object o) {
        if (o == null) {
            return null;
        }
        Object o2 = o;
        if (o instanceof List) {
            final List list = (List)o;
            o2 = new byte[list.size()];
            for (int i = 0; i < list.size(); ++i) {
                o2[i] = (byte)(int)list.get(i);
            }
        }
        return o2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof m)) {
            return false;
        }
        final m m = (m)o;
        final String a = this.a;
        if (a != null) {
            if (!a.equals((Object)m.a)) {
                return false;
            }
        }
        else if (m.a != null) {
            return false;
        }
        final List b = this.b;
        if (b.size() != m.b.size()) {
            return false;
        }
        for (int i = 0; i < b.size(); ++i) {
            final boolean b2 = b.get(i) instanceof byte[];
            final List b3 = m.b;
            if (b2 && b3.get(i) instanceof byte[]) {
                if (!Arrays.equals((byte[])b.get(i), (byte[])b3.get(i))) {
                    return false;
                }
            }
            else if (!b.get(i).equals(b3.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        final List b = this.b;
        String string;
        if (b != null && !b.isEmpty()) {
            final StringBuilder sb2 = new StringBuilder(" ");
            sb2.append((Object)b);
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        return sb.toString();
    }
}
