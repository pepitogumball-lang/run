package W;

import java.util.Set;
import java.util.Map;
import java.util.Collections;
import Z.b;
import com.google.android.gms.internal.auth.h;
import f5.a;
import X4.B;
import z5.d;

public final class u implements d
{
    public final int C;
    public final d D;
    
    public final Object a(Object a, final e5.d d) {
        switch (this.C) {
            default: {
                B b2 = null;
                Label_0075: {
                    if (d instanceof B) {
                        final B b = (B)d;
                        final int g = b.G;
                        if ((g & Integer.MIN_VALUE) != 0x0) {
                            b.G = g + Integer.MIN_VALUE;
                            b2 = b;
                            break Label_0075;
                        }
                    }
                    b2 = new B(this, d);
                }
                final Object f = b2.F;
                final a c = a.C;
                final int g2 = b2.G;
                if (g2 != 0) {
                    if (g2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h.z(f);
                }
                else {
                    h.z(f);
                    final Map unmodifiableMap = Collections.unmodifiableMap(((b)a).a);
                    n5.h.d("unmodifiableMap(preferencesMap)", (Object)unmodifiableMap);
                    final Set keySet = unmodifiableMap.keySet();
                    b2.G = 1;
                    if (this.D.a((Object)keySet, (e5.d)b2) == c) {
                        return c;
                    }
                }
                return c5.h.a;
            }
            case 0: {
                t t2 = null;
                Label_0231: {
                    if (d instanceof t) {
                        final t t = (t)d;
                        final int g3 = t.G;
                        if ((g3 & Integer.MIN_VALUE) != 0x0) {
                            t.G = g3 + Integer.MIN_VALUE;
                            t2 = t;
                            break Label_0231;
                        }
                    }
                    t2 = new t(this, d);
                }
                final Object f2 = t2.F;
                final a c2 = a.C;
                final int g4 = t2.G;
                if (g4 != 0) {
                    if (g4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h.z(f2);
                }
                else {
                    h.z(f2);
                    final I i = (I)a;
                    if (i instanceof j) {
                        throw ((j)i).a;
                    }
                    if (i instanceof i) {
                        throw ((i)i).a;
                    }
                    if (i instanceof c) {
                        a = ((c)i).a;
                        t2.G = 1;
                        if (this.D.a(a, (e5.d)t2) == c2) {
                            return c2;
                        }
                    }
                    else {
                        if (i instanceof J) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new RuntimeException();
                    }
                }
                return c5.h.a;
            }
        }
    }
}
