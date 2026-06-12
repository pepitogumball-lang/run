package v5;

import n5.h;

public final class a implements Comparable
{
    public static final long D;
    public static final long E;
    public static final int F = 0;
    public final long C = c;
    
    static {
        final int a = b.a;
        D = Long.MAX_VALUE;
        E = -9223372036854775805L;
    }
    
    public static final void a(final StringBuilder sb, int length, int n, int n2, final String s) {
        sb.append(length);
        if (n != 0) {
            sb.append('.');
            final String value = String.valueOf(n);
            h.e("<this>", (Object)value);
            if (n2 < 0) {
                throw new IllegalArgumentException(Y3.a.j(n2, "Desired length ", " is less than zero."));
            }
            Object subSequence;
            if (n2 <= value.length()) {
                subSequence = value.subSequence(0, value.length());
            }
            else {
                subSequence = new StringBuilder(n2);
                n = n2 - value.length();
                length = 1;
                if (1 <= n) {
                    while (true) {
                        ((StringBuilder)subSequence).append('0');
                        if (length == n) {
                            break;
                        }
                        ++length;
                    }
                }
                ((StringBuilder)subSequence).append((CharSequence)value);
            }
            final String string = subSequence.toString();
            length = string.length();
            n = -1;
            n2 = length - 1;
            length = n;
            if (n2 >= 0) {
                length = n2;
                while (true) {
                    n2 = length - 1;
                    if (string.charAt(length) != '0') {
                        break;
                    }
                    if (n2 < 0) {
                        length = n;
                        break;
                    }
                    length = n2;
                }
            }
            n = length + 1;
            if (n < 3) {
                sb.append((CharSequence)string, 0, n);
            }
            else {
                sb.append((CharSequence)string, 0, (length + 3) / 3 * 3);
            }
        }
        sb.append(s);
    }
    
    public static final boolean b(final long n) {
        return n == a.D || n == a.E;
    }
    
    public static final long c(long convert, final c c) {
        h.e("unit", (Object)c);
        if (convert == a.D) {
            convert = Long.MAX_VALUE;
        }
        else if (convert == a.E) {
            convert = Long.MIN_VALUE;
        }
        else {
            c c2;
            if (((int)convert & 0x1) == 0x0) {
                c2 = c.D;
            }
            else {
                c2 = c.E;
            }
            h.e("sourceUnit", (Object)c2);
            convert = c.C.convert(convert >> 1, c2.C);
        }
        return convert;
    }
    
    public final int compareTo(final Object o) {
        final long c = ((a)o).C;
        final long c2 = this.C;
        final long n = c2 ^ c;
        int n2 = 1;
        if (n >= 0L && ((int)n & 0x1) != 0x0) {
            n2 = ((int)c2 & 0x1) - ((int)c & 0x1);
            if (c2 < 0L) {
                n2 = -n2;
            }
        }
        else {
            final long n3 = lcmp(c2, c);
            if (n3 < 0) {
                n2 = -1;
            }
            else if (n3 == 0) {
                n2 = 0;
            }
        }
        return n2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof a;
        boolean b2 = false;
        if (b) {
            if (this.C == ((a)o).C) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.C);
    }
    
    @Override
    public final String toString() {
        final long c = this.C;
        final long n = lcmp(c, 0L);
        String string;
        if (n == 0) {
            string = "0s";
        }
        else if (c == a.D) {
            string = "Infinity";
        }
        else if (c == a.E) {
            string = "-Infinity";
        }
        else {
            final boolean b = n < 0;
            final StringBuilder sb = new StringBuilder();
            if (b) {
                sb.append('-');
            }
            final boolean b2 = n < 0;
            long n2 = c;
            if (b2) {
                n2 = ((int)c & 0x1) + (-(c >> 1) << 1);
                final int a = v5.b.a;
            }
            final long c2 = c(n2, v5.c.I);
            int n3;
            if (b(n2)) {
                n3 = 0;
            }
            else {
                n3 = (int)(c(n2, v5.c.H) % 24);
            }
            int n4;
            if (b(n2)) {
                n4 = 0;
            }
            else {
                n4 = (int)(c(n2, v5.c.G) % 60);
            }
            int n5;
            if (b(n2)) {
                n5 = 0;
            }
            else {
                n5 = (int)(c(n2, v5.c.F) % 60);
            }
            int n6;
            if (b(n2)) {
                n6 = 0;
            }
            else {
                long n7;
                if (((int)n2 & 0x1) == 0x1) {
                    n7 = (n2 >> 1) % 1000 * 1000000;
                }
                else {
                    n7 = (n2 >> 1) % 1000000000;
                }
                n6 = (int)n7;
            }
            final boolean b3 = c2 != 0L;
            final boolean b4 = n3 != 0;
            final boolean b5 = n4 != 0;
            final boolean b6 = n5 != 0 || n6 != 0;
            int n8;
            if (b3) {
                sb.append(c2);
                sb.append('d');
                n8 = 1;
            }
            else {
                n8 = 0;
            }
            int n9 = 0;
            Label_0435: {
                if (!b4) {
                    n9 = n8;
                    if (!b3) {
                        break Label_0435;
                    }
                    if (!b5) {
                        n9 = n8;
                        if (!b6) {
                            break Label_0435;
                        }
                    }
                }
                if (n8 > 0) {
                    sb.append(' ');
                }
                sb.append(n3);
                sb.append('h');
                n9 = n8 + 1;
            }
            int n10 = 0;
            Label_0491: {
                if (!b5) {
                    n10 = n9;
                    if (!b6) {
                        break Label_0491;
                    }
                    if (!b4) {
                        n10 = n9;
                        if (!b3) {
                            break Label_0491;
                        }
                    }
                }
                if (n9 > 0) {
                    sb.append(' ');
                }
                sb.append(n4);
                sb.append('m');
                n10 = n9 + 1;
            }
            int n11 = n10;
            if (b6) {
                if (n10 > 0) {
                    sb.append(' ');
                }
                if (n5 == 0 && !b3 && !b4 && !b5) {
                    if (n6 >= 1000000) {
                        a(sb, n6 / 1000000, n6 % 1000000, 6, "ms");
                    }
                    else if (n6 >= 1000) {
                        a(sb, n6 / 1000, n6 % 1000, 3, "us");
                    }
                    else {
                        sb.append(n6);
                        sb.append("ns");
                    }
                }
                else {
                    a(sb, n5, n6, 9, "s");
                }
                n11 = n10 + 1;
            }
            if (b && n11 > 1) {
                sb.insert(1, '(').append(')');
            }
            string = sb.toString();
        }
        return string;
    }
}
