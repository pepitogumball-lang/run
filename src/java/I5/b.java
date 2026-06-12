package I5;

import java.util.Arrays;
import x.a;
import java.nio.charset.Charset;
import java.io.Serializable;

public class b implements Serializable, Comparable
{
    public static final char[] F;
    public static final b G;
    public final byte[] C;
    public transient int D;
    public transient String E;
    
    static {
        F = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        G = new b(new byte[0].clone());
    }
    
    public b(final byte[] c) {
        this.C = c;
    }
    
    public static void a(final String s) {
        if (s.length() % 2 == 0) {
            final int n = s.length() / 2;
            final byte[] array = new byte[n];
            for (int i = 0; i < n; ++i) {
                final int n2 = i * 2;
                array[i] = (byte)(b(s.charAt(n2 + 1)) + (b(s.charAt(n2)) << 4));
            }
            return;
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(s));
    }
    
    public static int b(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        final StringBuilder sb = new StringBuilder("Unexpected hex digit: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public byte c(final int n) {
        return this.C[n];
    }
    
    public final int compareTo(final Object o) {
        final b b = (b)o;
        final int f = this.f();
        final int f2 = b.f();
        final int min = Math.min(f, f2);
        final int n = 0;
        while (true) {
            while (true) {
                for (int i = 0; i < min; ++i) {
                    final int n2 = this.c(i) & 0xFF;
                    final int n3 = b.c(i) & 0xFF;
                    if (n2 != n3) {
                        int n4;
                        if (n2 < n3) {
                            n4 = -1;
                        }
                        else {
                            n4 = 1;
                        }
                        return n4;
                    }
                }
                if (f == f2) {
                    return n;
                }
                if (f < f2) {
                    continue;
                }
                break;
            }
            continue;
        }
    }
    
    public String d() {
        final byte[] c = this.C;
        final char[] array = new char[c.length * 2];
        final int length = c.length;
        int n = 0;
        int n2 = 0;
        while (true) {
            final int n3 = n2;
            if (n >= length) {
                break;
            }
            final byte b = c[n];
            final char[] f = I5.b.F;
            array[n3] = f[b >> 4 & 0xF];
            n2 = n3 + 2;
            array[n3 + 1] = f[b & 0xF];
            ++n;
        }
        return new String(array);
    }
    
    public boolean e(final int n, final int n2, final int n3, final byte[] array) {
        final boolean b = true;
        if (n >= 0) {
            final byte[] c = this.C;
            if (n <= c.length - n3 && n2 >= 0 && n2 <= array.length - n3) {
                final Charset a = f.a;
                int n4 = 0;
                while (true) {
                    final boolean b2 = b;
                    if (n4 >= n3) {
                        return b2;
                    }
                    if (c[n4 + n] != array[n4 + n2]) {
                        break;
                    }
                    ++n4;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof b) {
            final b b2 = (b)o;
            final int f = b2.f();
            final byte[] c = this.C;
            if (f == c.length && b2.e(0, 0, c.length, c)) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public int f() {
        return this.C.length;
    }
    
    public b g() {
        final byte[] c = this.C;
        if (64 > c.length) {
            throw new IllegalArgumentException(a.a(new StringBuilder("endIndex > length("), c.length, ")"));
        }
        if (64 == c.length) {
            return this;
        }
        final byte[] array = new byte[64];
        System.arraycopy((Object)c, 0, (Object)array, 0, 64);
        return new b(array);
    }
    
    public String h() {
        String e = this.E;
        if (e == null) {
            e = new String(this.C, f.a);
            this.E = e;
        }
        return e;
    }
    
    @Override
    public int hashCode() {
        int d = this.D;
        if (d == 0) {
            d = Arrays.hashCode(this.C);
            this.D = d;
        }
        return d;
    }
    
    @Override
    public String toString() {
        final byte[] c = this.C;
        if (c.length == 0) {
            return "[size=0]";
        }
        final String h = this.h();
        final int length = h.length();
        int i = 0;
        int n = 0;
        while (true) {
            while (i < length) {
                if (n != 64) {
                    final int codePoint = h.codePointAt(i);
                    if ((Character.isISOControl(codePoint) || codePoint == 10 || codePoint == 13) && codePoint != 65533) {
                        ++n;
                        i += Character.charCount(codePoint);
                        continue;
                    }
                    i = -1;
                }
                if (i == -1) {
                    String s;
                    if (c.length <= 64) {
                        final StringBuilder sb = new StringBuilder("[hex=");
                        sb.append(this.d());
                        sb.append("]");
                        s = sb.toString();
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder("[size=");
                        sb2.append(c.length);
                        sb2.append(" hex=");
                        sb2.append(this.g().d());
                        sb2.append("\u2026]");
                        s = sb2.toString();
                    }
                    return s;
                }
                final String replace = h.substring(0, i).replace((CharSequence)"\\", (CharSequence)"\\\\").replace((CharSequence)"\n", (CharSequence)"\\n").replace((CharSequence)"\r", (CharSequence)"\\r");
                String s2;
                if (i < h.length()) {
                    final StringBuilder sb3 = new StringBuilder("[size=");
                    sb3.append(c.length);
                    sb3.append(" text=");
                    sb3.append(replace);
                    sb3.append("\u2026]");
                    s2 = sb3.toString();
                }
                else {
                    s2 = m0.a.g("[text=", replace, "]");
                }
                return s2;
            }
            i = h.length();
            continue;
        }
    }
}
