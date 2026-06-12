package K2;

public abstract class u1 extends v1
{
    public boolean E;
    
    public u1(y1 d) {
        super(d);
        d = super.D;
        ++d.T;
    }
    
    public final void A() {
        if (!this.E) {
            this.B();
            final y1 d = super.D;
            ++d.U;
            this.E = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public abstract boolean B();
    
    public final void z() {
        if (this.E) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
}
