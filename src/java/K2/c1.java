package K2;

public final class c1 extends m
{
    public final int e;
    public final b1 f;
    
    @Override
    public final void c() {
        switch (this.e) {
            default: {
                this.f.j().K.f("Tasks have been queued for a long time");
                return;
            }
            case 0: {
                final b1 f = this.f;
                f.v();
                if (f.J()) {
                    f.j().P.f("Inactivity, disconnecting from the service");
                    f.I();
                }
            }
        }
    }
}
