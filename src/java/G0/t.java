package G0;

import java.util.Objects;
import Y3.a;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

public final class t implements WebMessagePayloadBoundaryInterface
{
    public final int C;
    public final String D;
    public final byte[] E;
    
    public t(final String d) {
        this.C = 0;
        this.D = d;
        this.E = null;
    }
    
    public t(final byte[] e) {
        this.C = 1;
        this.D = null;
        this.E = e;
    }
    
    public final void a(final int n) {
        final int c = this.C;
        if (c == n) {
            return;
        }
        throw new IllegalStateException(a.k("Expected ", ", but type is ", n, c));
    }
    
    @Override
    public final byte[] getAsArrayBuffer() {
        this.a(1);
        final byte[] e = this.E;
        Objects.requireNonNull((Object)e);
        return e;
    }
    
    @Override
    public final String getAsString() {
        this.a(0);
        return this.D;
    }
    
    @Override
    public final String[] getSupportedFeatures() {
        return new String[0];
    }
    
    @Override
    public final int getType() {
        return this.C;
    }
}
