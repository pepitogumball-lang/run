package K2;

import android.os.BaseBundle;
import java.util.Objects;
import android.os.Bundle;
import java.util.Map;
import java.util.EnumMap;

public final class n
{
    public static final n f;
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;
    
    static {
        f = new n((Boolean)null, 100, null, null);
    }
    
    public n(final Boolean b, final int a, final Boolean c, final String d) {
        final EnumMap e = new EnumMap((Class)y0.class);
        this.e = e;
        final y0 f = y0.F;
        B0 b2;
        if (b == null) {
            b2 = B0.D;
        }
        else if (b) {
            b2 = B0.G;
        }
        else {
            b2 = B0.F;
        }
        e.put((Enum)f, (Object)b2);
        this.a = a;
        this.b = this.e();
        this.c = c;
        this.d = d;
    }
    
    public n(final EnumMap enumMap, final int a, final Boolean c, final String d) {
        (this.e = new EnumMap((Class)y0.class)).putAll((Map)enumMap);
        this.a = a;
        this.b = this.e();
        this.c = c;
        this.d = d;
    }
    
    public static n a(final int n, final Bundle bundle) {
        Boolean value = null;
        if (bundle == null) {
            return new n((Boolean)null, n, null, null);
        }
        final EnumMap enumMap = new EnumMap((Class)y0.class);
        for (final y0 y0 : A0.E.C) {
            enumMap.put((Enum)y0, (Object)z0.f(((BaseBundle)bundle).getString(y0.C)));
        }
        if (((BaseBundle)bundle).containsKey("is_dma_region")) {
            value = Boolean.valueOf(((BaseBundle)bundle).getString("is_dma_region"));
        }
        return new n(enumMap, n, value, ((BaseBundle)bundle).getString("cps_display_str"));
    }
    
    public static n b(final String s) {
        if (s != null && s.length() > 0) {
            final String[] split = s.split(":");
            final int int1 = Integer.parseInt(split[0]);
            final EnumMap enumMap = new EnumMap((Class)y0.class);
            final y0[] c = A0.E.C;
            for (int length = c.length, n = 1, i = 0; i < length; ++i, ++n) {
                enumMap.put((Enum)c[i], (Object)z0.e(split[n].charAt(0)));
            }
            return new n(enumMap, int1, null, null);
        }
        return n.f;
    }
    
    public static Boolean c(final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        final int n = q.a[z0.f(((BaseBundle)bundle).getString("ad_personalization")).ordinal()];
        if (n == 3) {
            return Boolean.FALSE;
        }
        if (n != 4) {
            return null;
        }
        return Boolean.TRUE;
    }
    
    public final B0 d() {
        B0 d;
        if ((d = (B0)this.e.get((Object)y0.F)) == null) {
            d = B0.D;
        }
        return d;
    }
    
    public final String e() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (final y0 y0 : A0.E.C) {
            sb.append(":");
            sb.append(z0.a((B0)this.e.get((Object)y0)));
        }
        return sb.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof n)) {
            return false;
        }
        final n n = (n)o;
        return this.b.equalsIgnoreCase(n.b) && Objects.equals((Object)this.c, (Object)n.c) && Objects.equals((Object)this.d, (Object)n.d);
    }
    
    @Override
    public final int hashCode() {
        final Boolean c = this.c;
        int n;
        if (c == null) {
            n = 3;
        }
        else if (c == Boolean.TRUE) {
            n = 7;
        }
        else {
            n = 13;
        }
        final String d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 17;
        }
        else {
            hashCode = d.hashCode();
        }
        return hashCode * 137 + (n * 29 + this.b.hashCode());
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("source=");
        sb.append(z0.g(this.a));
        for (final y0 y0 : A0.E.C) {
            sb.append(",");
            sb.append(y0.C);
            sb.append("=");
            final B0 b0 = (B0)this.e.get((Object)y0);
            if (b0 == null) {
                sb.append("uninitialized");
            }
            else {
                final int n = q.a[b0.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n == 4) {
                                sb.append("granted");
                            }
                        }
                        else {
                            sb.append("denied");
                        }
                    }
                    else {
                        sb.append("eu_consent_policy");
                    }
                }
                else {
                    sb.append("uninitialized");
                }
            }
        }
        final Boolean c2 = this.c;
        if (c2 != null) {
            sb.append(",isDmaRegion=");
            sb.append((Object)c2);
        }
        final String d = this.d;
        if (d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(d);
        }
        return sb.toString();
    }
}
