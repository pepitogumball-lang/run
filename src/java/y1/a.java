package y1;

public enum a
{
    D("BANNER", 0, 0), 
    E("INTERSTITIAL", 1, 1), 
    F("REWARDED", 2, 2), 
    G("REWARDED_INTERSTITIAL", 3, 3), 
    H("NATIVE", 4, 4), 
    I("APP_OPEN_AD", 5, 6);
    
    public static final a[] J;
    public final int C;
    
    public a(final String s, final int n, final int c) {
        this.C = c;
    }
    
    public static a a(final int n) {
        for (final a a : values()) {
            if (a.C == n) {
                return a;
            }
        }
        return null;
    }
}
