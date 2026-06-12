package G5;

import java.util.List;
import java.net.InetAddress;
import java.util.Locale;
import java.net.IDN;
import H5.a;
import java.util.ArrayList;

public final class c
{
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public final ArrayList f;
    public ArrayList g;
    public String h;
    
    public c() {
        this.b = "";
        this.c = "";
        this.e = -1;
        (this.f = new ArrayList()).add((Object)"");
    }
    
    public static String a(int i, String b, int j) {
        final int n = 0;
        final int n2 = 0;
        final String d = G5.d.d(b, i, j, false);
        i = a.a;
        final boolean contains = d.contains((CharSequence)":");
        Object o = null;
        if (contains) {
            InetAddress inetAddress;
            if (d.startsWith("[") && d.endsWith("]")) {
                inetAddress = a.b(1, d, d.length() - 1);
            }
            else {
                inetAddress = a.b(0, d, d.length());
            }
            if (inetAddress == null) {
                b = (String)o;
                return b;
            }
            final byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int n3 = -1;
                i = 0;
                j = 0;
                while (i < address.length) {
                    int n4;
                    for (n4 = i; n4 < 16 && address[n4] == 0 && address[n4 + 1] == 0; n4 += 2) {}
                    final int n5 = n4 - i;
                    int n6 = n3;
                    int n7;
                    if (n5 > (n7 = j)) {
                        n6 = n3;
                        n7 = j;
                        if (n5 >= 4) {
                            n7 = n5;
                            n6 = i;
                        }
                    }
                    i = n4 + 2;
                    n3 = n6;
                    j = n7;
                }
                o = new Object();
                i = j;
                j = n2;
                while (j < address.length) {
                    if (j == n3) {
                        ((I5.a)o).f(58);
                        final int n8 = j + i;
                        if ((j = n8) != 16) {
                            continue;
                        }
                        ((I5.a)o).f(58);
                        j = n8;
                    }
                    else {
                        if (j > 0) {
                            ((I5.a)o).f(58);
                        }
                        long n9 = (address[j] & 0xFF) << 8 | (address[j + 1] & 0xFF);
                        if (n9 == 0L) {
                            ((I5.a)o).f(48);
                        }
                        else {
                            final int n10 = Long.numberOfTrailingZeros(Long.highestOneBit(n9)) / 4 + 1;
                            final I5.c d2 = ((I5.a)o).d(n10);
                            for (int c = d2.c, k = c + n10 - 1; k >= c; --k) {
                                d2.a[k] = I5.a.E[(int)(n9 & 0xFL)];
                                n9 >>>= 4;
                            }
                            d2.c += n10;
                            ((I5.a)o).D += n10;
                        }
                        j += 2;
                    }
                }
                b = ((I5.a)o).b();
                return b;
            }
            throw new AssertionError((Object)m0.a.g("Invalid IPv6 address: '", d, "'"));
        }
        try {
            final String lowerCase = IDN.toASCII(d).toLowerCase(Locale.US);
            i = n;
            if (lowerCase.isEmpty()) {
                b = (String)o;
            }
            else {
                while (i < lowerCase.length()) {
                    j = lowerCase.charAt(i);
                    b = (String)o;
                    if (j <= 31) {
                        return b;
                    }
                    if (j >= 127) {
                        b = (String)o;
                        return b;
                    }
                    j = " #%/:?@[\\]".indexOf(j);
                    if (j != -1) {
                        b = (String)o;
                        return b;
                    }
                    ++i;
                }
                b = lowerCase;
            }
            return b;
        }
        catch (final IllegalArgumentException ex) {
            b = (String)o;
            return b;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final String a = this.a;
        if (a != null) {
            sb.append(a);
            sb.append("://");
        }
        else {
            sb.append("//");
        }
        if (!this.b.isEmpty() || !this.c.isEmpty()) {
            sb.append(this.b);
            if (!this.c.isEmpty()) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        final String d = this.d;
        if (d != null) {
            if (d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            }
            else {
                sb.append(this.d);
            }
        }
        int n = this.e;
        if (n != -1 || this.a != null) {
            if (n == -1) {
                n = G5.d.b(this.a);
            }
            final String a2 = this.a;
            if (a2 == null || n != G5.d.b(a2)) {
                sb.append(':');
                sb.append(n);
            }
        }
        final ArrayList f = this.f;
        final int size = f.size();
        final int n2 = 0;
        for (int i = 0; i < size; ++i) {
            sb.append('/');
            sb.append((String)((List)f).get(i));
        }
        if (this.g != null) {
            sb.append('?');
            final ArrayList g = this.g;
            for (int size2 = ((List)g).size(), j = n2; j < size2; j += 2) {
                final String s = (String)((List)g).get(j);
                final String s2 = (String)((List)g).get(j + 1);
                if (j > 0) {
                    sb.append('&');
                }
                sb.append(s);
                if (s2 != null) {
                    sb.append('=');
                    sb.append(s2);
                }
            }
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
