package r3;

import g4.o;

public final class a
{
    public static final o3.a b;
    public static final String c;
    public static final String d;
    public static final o e;
    public final c a;
    
    static {
        b = (o3.a)new Object();
        c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
        d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
        e = new o(12);
    }
    
    public a(final c a) {
        this.a = a;
    }
    
    public static String a(final String s, final String s2) {
        final int n = s.length() - s2.length();
        if (n >= 0 && n <= 1) {
            final StringBuilder sb = new StringBuilder(s2.length() + s.length());
            for (int i = 0; i < s.length(); ++i) {
                sb.append(s.charAt(i));
                if (s2.length() > i) {
                    sb.append(s2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
