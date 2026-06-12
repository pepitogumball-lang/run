package io.flutter.plugin.platform;

import android.content.Context;
import F4.u;
import F4.l;

public abstract class g
{
    private final l createArgsCodec;
    
    public g() {
        final u a = u.a;
        this.createArgsCodec = (l)a;
    }
    
    public abstract f create(final Context p0, final int p1, final Object p2);
    
    public final l getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
