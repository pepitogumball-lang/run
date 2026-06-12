package F0;

public final class t
{
    public final boolean a;
    public final String b;
    public final String c;
    public final s d;
    
    public t(final String b, final String c, final boolean a, final s d) {
        if (c.isEmpty() || c.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (c.endsWith("/")) {
            this.b = b;
            this.c = c;
            this.a = a;
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("Path should end with a slash '/'");
    }
}
