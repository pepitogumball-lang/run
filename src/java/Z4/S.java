package Z4;

import K2.D;

public enum s
{
    public static final D D;
    
    E("OPEN", 0, 0), 
    F("OPEN_MULTIPLE", 1, 1), 
    G("SAVE", 2, 2), 
    H("UNKNOWN", 3, 3);
    
    public static final s[] I;
    public final int C;
    
    static {
        D = new D(20);
    }
    
    public s(final String s, final int n, final int c) {
        this.C = c;
    }
}
