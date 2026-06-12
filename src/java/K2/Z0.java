package K2;

import android.os.BaseBundle;
import java.util.Iterator;
import android.os.Bundle;
import java.util.Map;
import java.util.EnumMap;

public final class z0
{
    public static final z0 c;
    public final EnumMap a;
    public final int b;
    
    static {
        c = new z0(100);
    }
    
    public z0(final int b) {
        final EnumMap a = new EnumMap((Class)y0.class);
        this.a = a;
        final y0 d = y0.D;
        final B0 d2 = B0.D;
        a.put((Enum)d, (Object)d2);
        a.put((Enum)y0.E, (Object)d2);
        this.b = b;
    }
    
    public z0(final EnumMap enumMap, final int b) {
        (this.a = new EnumMap((Class)y0.class)).putAll((Map)enumMap);
        this.b = b;
    }
    
    public static char a(final B0 b0) {
        if (b0 != null) {
            final int ordinal = b0.ordinal();
            if (ordinal == 1) {
                return '+';
            }
            if (ordinal == 2) {
                return '0';
            }
            if (ordinal == 3) {
                return '1';
            }
        }
        return '-';
    }
    
    public static z0 b(final int n, final Bundle bundle) {
        if (bundle == null) {
            return new z0(n);
        }
        final EnumMap enumMap = new EnumMap((Class)y0.class);
        for (final y0 y0 : A0.D.C) {
            enumMap.put((Enum)y0, (Object)f(((BaseBundle)bundle).getString(y0.C)));
        }
        return new z0(enumMap, n);
    }
    
    public static z0 c(final int n, final String s) {
        final EnumMap enumMap = new EnumMap((Class)y0.class);
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        final A0 d = A0.D;
        int n2 = 0;
        while (true) {
            final y0[] c = d.C;
            if (n2 >= c.length) {
                break;
            }
            final y0 y0 = c[n2];
            final int n3 = n2 + 2;
            if (n3 < s2.length()) {
                enumMap.put((Enum)y0, (Object)e(s2.charAt(n3)));
            }
            else {
                enumMap.put((Enum)y0, (Object)B0.D);
            }
            ++n2;
        }
        return new z0(enumMap, n);
    }
    
    public static B0 e(final char c) {
        if (c == '+') {
            return B0.E;
        }
        if (c == '0') {
            return B0.F;
        }
        if (c != '1') {
            return B0.D;
        }
        return B0.G;
    }
    
    public static B0 f(final String s) {
        final B0 d = B0.D;
        if (s == null) {
            return d;
        }
        if (s.equals((Object)"granted")) {
            return B0.G;
        }
        if (s.equals((Object)"denied")) {
            return B0.F;
        }
        return d;
    }
    
    public static String g(final int n) {
        if (n == -30) {
            return "TCF";
        }
        if (n == -20) {
            return "API";
        }
        if (n == -10) {
            return "MANIFEST";
        }
        if (n == 0) {
            return "1P_API";
        }
        if (n == 30) {
            return "1P_INIT";
        }
        if (n == 90) {
            return "REMOTE_CONFIG";
        }
        if (n != 100) {
            return "OTHER";
        }
        return "UNKNOWN";
    }
    
    public static boolean h(final int n, final int n2) {
        if (n != -20 || n2 != -30) {
            if (n != -30 || n2 != -20) {
                if (n != n2) {
                    if (n >= n2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public final z0 d(final z0 z0) {
        final EnumMap enumMap = new EnumMap((Class)y0.class);
        for (final y0 y0 : A0.D.C) {
            B0 g = (B0)this.a.get((Object)y0);
            final B0 b0 = (B0)z0.a.get((Object)y0);
            Label_0168: {
                if (g != null) {
                    if (b0 == null) {
                        break Label_0168;
                    }
                    final B0 d = B0.D;
                    if (g != d) {
                        if (b0 == d) {
                            break Label_0168;
                        }
                        final B0 e = B0.E;
                        if (g != e) {
                            if (b0 == e) {
                                break Label_0168;
                            }
                            final B0 f = B0.F;
                            if (g != f && b0 != f) {
                                g = B0.G;
                                break Label_0168;
                            }
                            g = f;
                            break Label_0168;
                        }
                    }
                }
                g = b0;
            }
            if (g != null) {
                enumMap.put((Enum)y0, (Object)g);
            }
        }
        return new z0(enumMap, 100);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof z0)) {
            return false;
        }
        final z0 z0 = (z0)o;
        for (final y0 y0 : A0.D.C) {
            if (this.a.get((Object)y0) != z0.a.get((Object)y0)) {
                return false;
            }
        }
        return this.b == z0.b;
    }
    
    @Override
    public final int hashCode() {
        int n = this.b * 17;
        final Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            n = n * 31 + iterator.next().hashCode();
        }
        return n;
    }
    
    public final boolean i(final y0 y0) {
        return this.a.get((Object)y0) != B0.F;
    }
    
    public final z0 j(final z0 z0) {
        final EnumMap enumMap = new EnumMap((Class)y0.class);
        for (final y0 y0 : A0.D.C) {
            B0 b0;
            if ((b0 = (B0)this.a.get((Object)y0)) == B0.D) {
                b0 = (B0)z0.a.get((Object)y0);
            }
            if (b0 != null) {
                enumMap.put((Enum)y0, (Object)b0);
            }
        }
        return new z0(enumMap, this.b);
    }
    
    public final boolean k(final z0 z0, final y0... array) {
        for (final y0 y0 : array) {
            final B0 b0 = (B0)this.a.get((Object)y0);
            final B0 b2 = (B0)z0.a.get((Object)y0);
            final B0 f = B0.F;
            if (b0 == f && b2 != f) {
                return true;
            }
        }
        return false;
    }
    
    public final String l() {
        final StringBuilder sb = new StringBuilder("G1");
        final y0[] c = A0.D.C;
        for (int length = c.length, i = 0; i < length; ++i) {
            final B0 b0 = (B0)this.a.get((Object)c[i]);
            char c3;
            final char c2 = c3 = '-';
            Label_0108: {
                if (b0 != null) {
                    final int ordinal = b0.ordinal();
                    c3 = c2;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                c3 = '0';
                                break Label_0108;
                            }
                            if (ordinal != 3) {
                                c3 = c2;
                                break Label_0108;
                            }
                        }
                        c3 = '1';
                    }
                }
            }
            sb.append(c3);
        }
        return sb.toString();
    }
    
    public final String m() {
        final StringBuilder sb = new StringBuilder("G1");
        final y0[] c = A0.D.C;
        for (int length = c.length, i = 0; i < length; ++i) {
            sb.append(a((B0)this.a.get((Object)c[i])));
        }
        return sb.toString();
    }
    
    public final boolean n() {
        return this.i(y0.E);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("source=");
        sb.append(g(this.b));
        for (final y0 y0 : A0.D.C) {
            sb.append(",");
            sb.append(y0.C);
            sb.append("=");
            B0 d;
            if ((d = (B0)this.a.get((Object)y0)) == null) {
                d = B0.D;
            }
            sb.append((Object)d);
        }
        return sb.toString();
    }
}
