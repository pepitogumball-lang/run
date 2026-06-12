package u5;

import r5.a;

public abstract class i extends h
{
    public static boolean Q(final String s, final String s2) {
        boolean b = false;
        if (T(s, 2, s2, false) >= 0) {
            b = true;
        }
        return b;
    }
    
    public static final int R(final CharSequence charSequence) {
        n5.h.e("<this>", charSequence);
        return charSequence.length() - 1;
    }
    
    public static final int S(final String s, int index, final String s2, final boolean b) {
        n5.h.e("string", s2);
        if (!b) {
            index = s.indexOf(s2, index);
        }
        else {
            final int length = s.length();
            int n;
            if ((n = index) < 0) {
                n = 0;
            }
            final int length2 = s.length();
            if ((index = length) > length2) {
                index = length2;
            }
            final int d = new a(n, index, 1).D;
            if ((index = n) <= d) {
                while (true) {
                    final int length3 = s2.length();
                    boolean b2;
                    if (!b) {
                        b2 = s2.regionMatches(0, s, index, length3);
                    }
                    else {
                        b2 = s2.regionMatches(b, 0, s, index, length3);
                    }
                    if (b2) {
                        return index;
                    }
                    if (index == d) {
                        break;
                    }
                    ++index;
                }
            }
            index = -1;
        }
        return index;
    }
    
    public static /* synthetic */ int T(final String s, final int n, final String s2, boolean b) {
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        return S(s, 0, s2, b);
    }
    
    public static boolean U(final CharSequence charSequence) {
        n5.h.e("<this>", charSequence);
        final boolean b = false;
        for (int i = 0; i < charSequence.length(); ++i) {
            final char char1 = charSequence.charAt(i);
            if (!Character.isWhitespace(char1)) {
                final boolean b2 = b;
                if (!Character.isSpaceChar(char1)) {
                    return b2;
                }
            }
        }
        return true;
    }
    
    public static String V(String string, final String s, final String s2) {
        int n = S(string, 0, s, false);
        if (n >= 0) {
            final int length = s.length();
            int n2 = 1;
            if (length >= 1) {
                n2 = length;
            }
            final int n3 = s2.length() + (string.length() - length);
            if (n3 < 0) {
                throw new OutOfMemoryError();
            }
            final StringBuilder sb = new StringBuilder(n3);
            int n4 = 0;
            int i;
            int n5;
            do {
                sb.append((CharSequence)string, n4, n);
                sb.append(s2);
                n5 = n + length;
                if (n >= string.length()) {
                    break;
                }
                i = (n = S(string, n + n2, s, (boolean)(0 != 0)));
                n4 = n5;
            } while (i > 0);
            sb.append((CharSequence)string, n5, string.length());
            string = sb.toString();
            n5.h.d("toString(...)", string);
        }
        return string;
    }
    
    public static String W(String substring, final String s) {
        n5.h.e("delimiter", s);
        final int t = T(substring, 6, s, false);
        if (t != -1) {
            substring = substring.substring(s.length() + t, substring.length());
            n5.h.d("substring(...)", substring);
        }
        return substring;
    }
    
    public static String X(final String s, String substring) {
        n5.h.e("missingDelimiterValue", substring);
        final int lastIndex = s.lastIndexOf(46, R((CharSequence)s));
        if (lastIndex != -1) {
            substring = s.substring(lastIndex + 1, s.length());
            n5.h.d("substring(...)", substring);
        }
        return substring;
    }
}
