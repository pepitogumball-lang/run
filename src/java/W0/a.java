package w0;

import java.util.Locale;

public final class a
{
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;
    public final String f;
    public final int g;
    
    public a(int n, final int g, String upperCase, final String b, final String f, final boolean d) {
        this.a = upperCase;
        this.b = b;
        this.d = d;
        this.e = n;
        n = 5;
        if (b != null) {
            upperCase = b.toUpperCase(Locale.US);
            if (upperCase.contains((CharSequence)"INT")) {
                n = 3;
            }
            else if (!upperCase.contains((CharSequence)"CHAR") && !upperCase.contains((CharSequence)"CLOB") && !upperCase.contains((CharSequence)"TEXT")) {
                if (!upperCase.contains((CharSequence)"BLOB")) {
                    if (!upperCase.contains((CharSequence)"REAL") && !upperCase.contains((CharSequence)"FLOA") && !upperCase.contains((CharSequence)"DOUB")) {
                        n = 1;
                    }
                    else {
                        n = 4;
                    }
                }
            }
            else {
                n = 2;
            }
        }
        this.c = n;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || a.class != o.getClass()) {
            return false;
        }
        final a a = (a)o;
        if (this.e != a.e) {
            return false;
        }
        if (!this.a.equals((Object)a.a)) {
            return false;
        }
        if (this.d != a.d) {
            return false;
        }
        final String f = this.f;
        final int g = this.g;
        final int g2 = a.g;
        final String f2 = a.f;
        if (g == 1 && g2 == 2 && f != null && !f.equals((Object)f2)) {
            return false;
        }
        if (g == 2 && g2 == 1 && f2 != null && !f2.equals((Object)f)) {
            return false;
        }
        Label_0183: {
            if (g != 0 && g == g2) {
                if (f != null) {
                    if (f.equals((Object)f2)) {
                        break Label_0183;
                    }
                }
                else if (f2 == null) {
                    break Label_0183;
                }
                return false;
            }
        }
        if (this.c != a.c) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int c = this.c;
        int n;
        if (this.d) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return ((hashCode * 31 + c) * 31 + n) * 31 + this.e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.c);
        sb.append("', notNull=");
        sb.append(this.d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.e);
        sb.append(", defaultValue='");
        return x.a.b(sb, this.f, "'}");
    }
}
