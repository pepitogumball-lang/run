package h2;

import e2.b;
import java.util.Objects;
import android.os.Bundle;

public abstract class w
{
    public Boolean a;
    public boolean b;
    public final d c;
    public final int d;
    public final Bundle e;
    public final d f;
    
    public w(final d d, final int d2, final Bundle e) {
        Objects.requireNonNull((Object)d);
        this.f = d;
        final Boolean true = Boolean.TRUE;
        this.c = d;
        this.a = true;
        this.b = false;
        this.d = d2;
        this.e = e;
    }
    
    public abstract boolean a();
    
    public abstract void b(final b p0);
}
