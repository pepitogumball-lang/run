package I5;

public final class c
{
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public c f;
    public c g;
    
    public c() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
    
    public c(final byte[] a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = true;
        this.e = false;
    }
    
    public final c a() {
        final c f = this.f;
        c c;
        if (f != this) {
            c = f;
        }
        else {
            c = null;
        }
        final c g = this.g;
        g.f = f;
        this.f.g = g;
        this.f = null;
        this.g = null;
        return c;
    }
}
