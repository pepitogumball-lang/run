package K2;

public enum g
{
    D("UNSET", 0, '0'), 
    E("REMOTE_DEFAULT", 1, '1'), 
    F("REMOTE_DELEGATION", 2, '2'), 
    G("MANIFEST", 3, '3'), 
    H("INITIALIZATION", 4, '4'), 
    I("API", 5, '5'), 
    J("TCF", 7, '7'), 
    K("REMOTE_ENFORCED_DEFAULT", 8, '8'), 
    L("FAILSAFE", 9, '9');
    
    public static final g[] M;
    public final char C;
    
    public g(final String s, final int n, final char c) {
        this.C = c;
    }
}
