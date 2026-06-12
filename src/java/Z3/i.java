package Z3;

public enum i
{
    D("APPLICATION_PROCESS_STATE_UNKNOWN", 0, 0), 
    E("FOREGROUND", 1, 1), 
    F("BACKGROUND", 2, 2), 
    G("FOREGROUND_BACKGROUND", 3, 3);
    
    public static final i[] H;
    public final int C;
    
    public i(final String s, final int n, final int c) {
        this.C = c;
    }
}
