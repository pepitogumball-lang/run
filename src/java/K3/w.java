package k3;

public final class w extends c
{
    public final Runnable C;
    
    public w(final Runnable c) {
        this.C = c;
    }
    
    @Override
    public final void a() {
        this.C.run();
    }
}
