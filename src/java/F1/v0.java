package F1;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.HashSet;
import android.os.Bundle;
import java.util.Set;
import java.util.ArrayList;

public final class v0
{
    public final String a;
    public final ArrayList b;
    public final Set c;
    public final Bundle d;
    public final String e;
    public final String f;
    public final int g;
    public final Set h;
    public final Bundle i;
    public final Set j;
    public final boolean k;
    public final int l;
    public long m;
    
    public v0(final u0 u0) {
        this.m = 0L;
        this.a = (String)u0.j;
        this.b = (ArrayList)u0.m;
        this.c = Collections.unmodifiableSet((Set)u0.d);
        this.d = (Bundle)u0.g;
        Collections.unmodifiableMap((Map)u0.i);
        this.e = (String)u0.k;
        this.f = (String)u0.l;
        this.g = u0.a;
        this.h = Collections.unmodifiableSet((Set)u0.e);
        this.i = (Bundle)u0.h;
        this.j = Collections.unmodifiableSet((Set)u0.f);
        this.k = u0.c;
        this.l = u0.b;
    }
}
