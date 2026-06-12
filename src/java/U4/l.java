package U4;

public enum l
{
    public static final l[] D;
    public final int C;
    
    static {
        D = new l[] { new l("STANDARD", 0, 0), new l("GAMES", 1, 1) };
    }
    
    public l(final String s, final int n, final int c) {
        this.C = c;
    }
}
