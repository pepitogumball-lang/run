package r;

import android.os.Bundle;
import android.net.Uri;

public final class d implements Runnable
{
    public final int C;
    public final Uri D;
    public final boolean E;
    public final Bundle F;
    public final f G;
    
    public d(final f g, final int c, final Uri d, final boolean e, final Bundle f) {
        this.G = g;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
    }
    
    public final void run() {
        this.G.D.onRelationshipValidationResult(this.C, this.D, this.E, this.F);
    }
}
