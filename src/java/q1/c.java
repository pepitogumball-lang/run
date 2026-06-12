package q1;

public enum c implements A3.c
{
    D("REASON_UNKNOWN", 0, 0), 
    E("MESSAGE_TOO_OLD", 1, 1), 
    F("CACHE_FULL", 2, 2), 
    G("PAYLOAD_TOO_BIG", 3, 3), 
    H("MAX_RETRIES_REACHED", 4, 4), 
    I("INVALID_PAYLOD", 5, 5), 
    J("SERVER_ERROR", 6, 6);
    
    public static final c[] K;
    public final int C;
    
    public c(final String s, final int n, final int c) {
        this.C = c;
    }
    
    public final int a() {
        return this.C;
    }
}
