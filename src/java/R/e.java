package r;

import android.os.Bundle;

public final class e implements Runnable
{
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final Bundle H;
    public final f I;
    
    public e(final f i, final int c, final int d, final int e, final int f, final int g, final Bundle h) {
        this.I = i;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
    }
    
    public final void run() {
        this.I.D.onActivityLayout(this.C, this.D, this.E, this.F, this.G, this.H);
    }
}
