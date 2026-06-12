package G5;

import java.util.Collections;
import I5.a;
import java.util.ArrayList;
import java.util.List;

public final class d
{
    public static final char[] i;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;
    
    static {
        i = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
    
    public d(final c c) {
        this.a = c.a;
        final String b = c.b;
        this.b = d(b, 0, b.length(), false);
        final String c2 = c.c;
        this.c = d(c2, 0, c2.length(), false);
        this.d = c.d;
        int e = c.e;
        if (e == -1) {
            e = b(c.a);
        }
        this.e = e;
        e(c.f, false);
        final ArrayList g = c.g;
        final String s = null;
        List e2;
        if (g != null) {
            e2 = e(g, true);
        }
        else {
            e2 = null;
        }
        this.f = e2;
        final String h = c.h;
        String d = s;
        if (h != null) {
            d = d(h, 0, h.length(), false);
        }
        this.g = d;
        this.h = c.toString();
    }
    
    public static String a(final String s, int c, final int n, final String s2, final boolean b, final boolean b2, final boolean b3) {
        int codePoint;
        for (int i = c; i < n; i += Character.charCount(codePoint)) {
            codePoint = s.codePointAt(i);
            final int n2 = 43;
            int n3 = -1;
            int n4 = 128;
            int n5 = 127;
            if (codePoint < 32 || codePoint == 127 || (codePoint >= 128 && b3) || s2.indexOf(codePoint) != -1 || (codePoint == 37 && !b) || (codePoint == 43 && b2)) {
                final Object o = new Object();
                ((a)o).g(c, s, i);
                a a = null;
                c = n2;
                while (i < n) {
                    final int codePoint2 = s.codePointAt(i);
                    int n6 = 0;
                    int n7 = 0;
                    int n8 = 0;
                    int n9 = 0;
                    Object o2 = null;
                    Label_0458: {
                        if (b) {
                            n6 = c;
                            n7 = n3;
                            n8 = n4;
                            n9 = n5;
                            o2 = a;
                            if (codePoint2 == 9) {
                                break Label_0458;
                            }
                            n6 = c;
                            n7 = n3;
                            n8 = n4;
                            n9 = n5;
                            o2 = a;
                            if (codePoint2 == 10) {
                                break Label_0458;
                            }
                            n6 = c;
                            n7 = n3;
                            n8 = n4;
                            n9 = n5;
                            o2 = a;
                            if (codePoint2 == 12) {
                                break Label_0458;
                            }
                            if (codePoint2 == 13) {
                                n6 = c;
                                n7 = n3;
                                n8 = n4;
                                n9 = n5;
                                o2 = a;
                                break Label_0458;
                            }
                        }
                        if (codePoint2 == c && b2) {
                            String s3;
                            if (b) {
                                s3 = "+";
                            }
                            else {
                                s3 = "%2B";
                            }
                            ((a)o).g(0, s3, s3.length());
                            n6 = c;
                            n7 = n3;
                            n8 = n4;
                            n9 = n5;
                            o2 = a;
                        }
                        else if (codePoint2 >= 32 && codePoint2 != n5 && (codePoint2 < n4 || !b3) && s2.indexOf(codePoint2) == n3 && (codePoint2 != 37 || b)) {
                            ((a)o).j(codePoint2);
                            n6 = c;
                            n7 = n3;
                            n8 = n4;
                            n9 = n5;
                            o2 = a;
                        }
                        else {
                            if ((o2 = a) == null) {
                                o2 = new Object();
                            }
                            ((a)o2).j(codePoint2);
                            while (true) {
                                final long d = ((a)o2).D;
                                final long n10 = lcmp(d, 0L);
                                if (n10 == 0) {
                                    n9 = n5;
                                    n8 = n4;
                                    n7 = n3;
                                    n6 = c;
                                    break;
                                }
                                if (n10 == 0) {
                                    throw new IllegalStateException("size == 0");
                                }
                                final I5.c c2 = ((a)o2).C;
                                final int b4 = c2.b;
                                c = c2.c;
                                final int b5 = b4 + 1;
                                final byte b6 = c2.a[b4];
                                ((a)o2).D = d - 1L;
                                if (b5 == c) {
                                    ((a)o2).C = c2.a();
                                    I5.d.l(c2);
                                }
                                else {
                                    c2.b = b5;
                                }
                                ((a)o).f(37);
                                final char[] j = G5.d.i;
                                ((a)o).f(j[(b6 & 0xFF) >> 4 & 0xF]);
                                ((a)o).f(j[b6 & 0xF]);
                                c = 43;
                                n3 = -1;
                                n4 = 128;
                                n5 = 127;
                            }
                        }
                    }
                    i += Character.charCount(codePoint2);
                    c = n6;
                    n3 = n7;
                    n4 = n8;
                    n5 = n9;
                    a = (a)o2;
                }
                return ((a)o).b();
            }
        }
        return s.substring(c, n);
    }
    
    public static int b(final String s) {
        if (s.equals((Object)"http")) {
            return 80;
        }
        if (s.equals((Object)"https")) {
            return 443;
        }
        return -1;
    }
    
    public static d c(final String s) {
        final c c = new c();
        final int length = s.length();
        final int a = H5.a.a;
        while (true) {
        Label_0137_Outer:
            for (int i = 0; i < length; ++i) {
                final char char1 = s.charAt(i);
                if (char1 != '\t' && char1 != '\n' && char1 != '\f' && char1 != '\r' && char1 != ' ') {
                    int j = s.length() - 1;
                    while (true) {
                        while (j >= i) {
                            final char char2 = s.charAt(j);
                            if (char2 != '\t' && char2 != '\n' && char2 != '\f' && char2 != '\r' && char2 != ' ') {
                                final int n = j + 1;
                                int k = 0;
                                Label_0271: {
                                    Label_0145: {
                                        if (n - i >= 2) {
                                            final char char3 = s.charAt(i);
                                            if (char3 < 'a' || char3 > 'z') {
                                                if (char3 < 'A') {
                                                    break Label_0145;
                                                }
                                                if (char3 > 'Z') {
                                                    break Label_0145;
                                                }
                                            }
                                            k = i + 1;
                                            while (k < n) {
                                                final char char4 = s.charAt(k);
                                                if ((char4 < 'a' || char4 > 'z') && (char4 < 'A' || char4 > 'Z') && (char4 < '0' || char4 > '9') && char4 != '+' && char4 != '-' && char4 != '.') {
                                                    if (char4 == ':') {
                                                        break Label_0271;
                                                    }
                                                    break;
                                                }
                                                else {
                                                    ++k;
                                                }
                                            }
                                        }
                                    }
                                    k = -1;
                                }
                                Label_1419: {
                                    Object f = null;
                                    int n5 = 0;
                                    int n9 = 0;
                                    Block_44: {
                                        if (k != -1) {
                                            if (s.regionMatches(true, i, "https:", 0, 6)) {
                                                c.a = "https";
                                                i += 6;
                                            }
                                            else {
                                                if (!s.regionMatches(true, i, "http:", 0, 5)) {
                                                    break Label_1419;
                                                }
                                                c.a = "http";
                                                i += 5;
                                            }
                                            int l = i;
                                            int n2 = 0;
                                            while (l < n) {
                                                final char char5 = s.charAt(l);
                                                if (char5 != '\\' && char5 != '/') {
                                                    break;
                                                }
                                                ++n2;
                                                ++l;
                                            }
                                            f = c.f;
                                            k = i + n2;
                                            int n3 = 0;
                                            int n4 = 0;
                                            while (true) {
                                                n5 = H5.a.d(s, "@/\\?#", k, n);
                                                int char6;
                                                if (n5 != n) {
                                                    char6 = s.charAt(n5);
                                                }
                                                else {
                                                    char6 = -1;
                                                }
                                                if (char6 == -1 || char6 == 35 || char6 == 47 || char6 == 92 || char6 == 63) {
                                                    break;
                                                }
                                                if (char6 != 64) {
                                                    continue Label_0137_Outer;
                                                }
                                                if (n3 == 0) {
                                                    final int c2 = H5.a.c(s, k, n5, ':');
                                                    String b = a(s, k, c2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                                    if (n4 != 0) {
                                                        final StringBuilder sb = new StringBuilder();
                                                        sb.append(c.b);
                                                        sb.append("%40");
                                                        sb.append(b);
                                                        b = sb.toString();
                                                    }
                                                    c.b = b;
                                                    if (c2 != n5) {
                                                        c.c = a(s, c2 + 1, n5, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                                        n3 = 1;
                                                    }
                                                    n4 = 1;
                                                }
                                                else {
                                                    final StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(c.c);
                                                    sb2.append("%40");
                                                    sb2.append(a(s, k, n5, " \"':;<=>@[]^`{}|/\\?#", true, false, true));
                                                    c.c = sb2.toString();
                                                }
                                                k = n5 + 1;
                                            }
                                            i = k;
                                            while (true) {
                                                while (i < n5) {
                                                    final char char7 = s.charAt(i);
                                                    if (char7 != ':') {
                                                        int n6 = i;
                                                        int n7 = 0;
                                                        Label_0704: {
                                                            if (char7 != '[') {
                                                                n7 = i;
                                                            }
                                                            else {
                                                                int n8;
                                                                do {
                                                                    n8 = n6 + 1;
                                                                    if ((n7 = n8) >= n5) {
                                                                        break Label_0704;
                                                                    }
                                                                    n6 = n8;
                                                                } while (s.charAt(n8) != ']');
                                                                n7 = n8;
                                                            }
                                                        }
                                                        i = n7 + 1;
                                                    }
                                                    else {
                                                        n9 = i + 1;
                                                        if (n9 < n5) {
                                                            break Block_44;
                                                        }
                                                        break Label_1419;
                                                    }
                                                }
                                                i = n5;
                                                continue;
                                            }
                                        }
                                        break Label_1419;
                                    }
                                    c.d = G5.c.a(k, s, i);
                                    while (true) {
                                        try {
                                            int int1 = Integer.parseInt(a(s, n9, n5, "", false, false, true));
                                            if (int1 <= 0 || int1 > 65535) {
                                                int1 = -1;
                                            }
                                            c.e = int1;
                                            if (int1 == -1) {
                                                f = new StringBuilder("Invalid URL port: \"");
                                                ((StringBuilder)f).append(s.substring(n9, n5));
                                                ((StringBuilder)f).append('\"');
                                                throw new IllegalArgumentException(((StringBuilder)f).toString());
                                            }
                                            while (true) {
                                                if (c.d == null) {
                                                    f = new StringBuilder("Invalid URL host: \"");
                                                    ((StringBuilder)f).append(s.substring(k, i));
                                                    ((StringBuilder)f).append('\"');
                                                    throw new IllegalArgumentException(((StringBuilder)f).toString());
                                                }
                                                final int d = H5.a.d(s, "?#", n5, n);
                                                if (n5 != d) {
                                                    i = s.charAt(n5);
                                                    if (i == 47 || i == 92) {
                                                        ((ArrayList)f).clear();
                                                        ((ArrayList)f).add((Object)"");
                                                        i = n5 + 1;
                                                    }
                                                    else {
                                                        ((ArrayList)f).set(((ArrayList)f).size() - 1, (Object)"");
                                                        i = n5;
                                                    }
                                                    while (i < d) {
                                                        n5 = H5.a.d(s, "/\\", i, d);
                                                        if (n5 < d) {
                                                            k = 1;
                                                        }
                                                        else {
                                                            k = 0;
                                                        }
                                                        final String a2 = a(s, i, n5, " \"<>^`{}|/\\?#", true, false, true);
                                                        if (!a2.equals((Object)".")) {
                                                            if (!a2.equalsIgnoreCase("%2e")) {
                                                                if (!a2.equals((Object)"..") && !a2.equalsIgnoreCase("%2e.") && !a2.equalsIgnoreCase(".%2e") && !a2.equalsIgnoreCase("%2e%2e")) {
                                                                    if (((String)((ArrayList)f).get(((ArrayList)f).size() - 1)).isEmpty()) {
                                                                        ((ArrayList)f).set(((ArrayList)f).size() - 1, (Object)a2);
                                                                    }
                                                                    else {
                                                                        ((ArrayList)f).add((Object)a2);
                                                                    }
                                                                    if (k != 0) {
                                                                        ((ArrayList)f).add((Object)"");
                                                                    }
                                                                }
                                                                else if (((String)((ArrayList)f).remove(((ArrayList)f).size() - 1)).isEmpty() && !((ArrayList)f).isEmpty()) {
                                                                    ((ArrayList)f).set(((ArrayList)f).size() - 1, (Object)"");
                                                                }
                                                                else {
                                                                    ((ArrayList)f).add((Object)"");
                                                                }
                                                            }
                                                        }
                                                        i = n5;
                                                        if (k != 0) {
                                                            i = n5 + 1;
                                                        }
                                                    }
                                                }
                                                if (d < n && s.charAt(d) == '?') {
                                                    i = H5.a.c(s, d, n, '#');
                                                    c.g = f(a(s, d + 1, i, " \"'<>#", true, true, true));
                                                }
                                                else {
                                                    i = d;
                                                }
                                                if (i < n && s.charAt(i) == '#') {
                                                    c.h = a(s, i + 1, n, "", true, false, false);
                                                }
                                                if (c.a == null) {
                                                    throw new IllegalStateException("scheme == null");
                                                }
                                                if (c.d != null) {
                                                    return new d(c);
                                                }
                                                throw new IllegalStateException("host == null");
                                                c.d = G5.c.a(k, s, i);
                                                c.e = b(c.a);
                                                continue;
                                            }
                                            f = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                                            ((StringBuilder)f).append(s.substring(0, k));
                                            ((StringBuilder)f).append("'");
                                            throw new IllegalArgumentException(((StringBuilder)f).toString());
                                            throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                                        }
                                        catch (final NumberFormatException ex) {
                                            continue;
                                        }
                                        break;
                                    }
                                }
                            }
                            else {
                                --j;
                            }
                        }
                        final int n = i;
                        continue;
                    }
                }
            }
            int i = length;
            continue;
        }
    }
    
    public static String d(final String s, int i, final int n, final boolean b) {
        for (int j = i; j < n; ++j) {
            final char char1 = s.charAt(j);
            if (char1 == '%' || (char1 == '+' && b)) {
                final Object o = new Object();
                ((a)o).g(i, s, j);
                int codePoint;
                int n2;
                int a;
                int a2;
                for (i = j; i < n; i += Character.charCount(codePoint)) {
                    codePoint = s.codePointAt(i);
                    Label_0169: {
                        if (codePoint == 37) {
                            n2 = i + 2;
                            if (n2 < n) {
                                a = H5.a.a(s.charAt(i + 1));
                                a2 = H5.a.a(s.charAt(n2));
                                if (a != -1 && a2 != -1) {
                                    ((a)o).f((a << 4) + a2);
                                    i = n2;
                                    continue;
                                }
                                break Label_0169;
                            }
                        }
                        if (codePoint == 43 && b) {
                            ((a)o).f(32);
                            continue;
                        }
                    }
                    ((a)o).j(codePoint);
                }
                return ((a)o).b();
            }
        }
        return s.substring(i, n);
    }
    
    public static List e(final ArrayList list, final boolean b) {
        final int size = ((List)list).size();
        final ArrayList list2 = new ArrayList(size);
        for (int i = 0; i < size; ++i) {
            final String s = (String)((List)list).get(i);
            String d;
            if (s != null) {
                d = d(s, 0, s.length(), b);
            }
            else {
                d = null;
            }
            list2.add((Object)d);
        }
        return Collections.unmodifiableList((List)list2);
    }
    
    public static ArrayList f(final String s) {
        final ArrayList list = new ArrayList();
        int n;
        for (int i = 0; i <= s.length(); i = n + 1) {
            if ((n = s.indexOf(38, i)) == -1) {
                n = s.length();
            }
            final int index = s.indexOf(61, i);
            if (index != -1 && index <= n) {
                list.add((Object)s.substring(i, index));
                list.add((Object)s.substring(index + 1, n));
            }
            else {
                list.add((Object)s.substring(i, n));
                list.add((Object)null);
            }
        }
        return list;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof d && ((d)o).h.equals((Object)this.h);
    }
    
    @Override
    public final int hashCode() {
        return this.h.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.h;
    }
}
