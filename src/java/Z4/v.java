package Z4;

import K2.C;

public enum v
{
    public static final C D;
    public static final v[] E;
    public final int C;
    
    static {
        E = new v[] { new v("ALWAYS_ALLOW", 0, 0), new v("COMPATIBILITY_MODE", 1, 1), new v("NEVER_ALLOW", 2, 2) };
        D = new C(22);
    }
    
    public v(final String s, final int n, final int c) {
        this.C = c;
    }
}
