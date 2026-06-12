package Z4;

import K2.D;

public enum j
{
    public static final D D;
    
    E("DEBUG", 0, 0), 
    F("ERROR", 1, 1), 
    G("LOG", 2, 2), 
    H("TIP", 3, 3), 
    I("WARNING", 4, 4), 
    J("UNKNOWN", 5, 5);
    
    public static final j[] K;
    public final int C;
    
    static {
        D = new D(19);
    }
    
    public j(final String s, final int n, final int c) {
        this.C = c;
    }
}
