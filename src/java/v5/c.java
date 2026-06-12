package v5;

import java.util.concurrent.TimeUnit;

public enum c
{
    D("NANOSECONDS", 0, TimeUnit.NANOSECONDS), 
    E("MILLISECONDS", 2, TimeUnit.MILLISECONDS), 
    F("SECONDS", 3, TimeUnit.SECONDS), 
    G("MINUTES", 4, TimeUnit.MINUTES), 
    H("HOURS", 5, TimeUnit.HOURS), 
    I("DAYS", 6, TimeUnit.DAYS);
    
    public static final c[] J;
    public final TimeUnit C;
    
    public c(final String s, final int n, final TimeUnit c) {
        this.C = c;
    }
}
