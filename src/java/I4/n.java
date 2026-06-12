package i4;

import android.util.Log;
import java.io.IOException;
import f5.a;
import g5.c;
import Z.b;
import m5.p;
import w5.v;
import n3.u0;
import W.h;
import Z.d;

public final class n
{
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public final h a;
    public f b;
    
    static {
        c = u0.e("firebase_sessions_enabled");
        d = new d("firebase_sessions_sampling_rate");
        e = new d("firebase_sessions_restart_timeout");
        f = new d("firebase_sessions_cache_duration");
        g = new d("firebase_sessions_cache_updated_time");
    }
    
    public n(final h a) {
        this.a = a;
        v.m((p)new k(this, null));
    }
    
    public static final void a(final n n, final b b) {
        n.getClass();
        n.b = new f((Boolean)b.b(n.c), (Double)b.b(n.d), (Integer)b.b(n.e), (Integer)b.b(n.f), (Long)b.b(n.g));
    }
    
    public final boolean b() {
        final f b = this.b;
        if (b == null) {
            n5.h.h("sessionConfigs");
            throw null;
        }
        if (b != null) {
            final Long e = b.e;
            if (e != null) {
                final Integer d = b.d;
                if (d != null && (System.currentTimeMillis() - e) / 1000 < d) {
                    return false;
                }
            }
            return true;
        }
        n5.h.h("sessionConfigs");
        throw null;
    }
    
    public final Object c(final d d, final Object o, final c c) {
        l i = null;
        Label_0054: {
            if (c instanceof l) {
                final l l = (l)c;
                final int h = l.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    l.H = h + Integer.MIN_VALUE;
                    i = l;
                    break Label_0054;
                }
            }
            i = new l(this, c);
        }
        final Object f = i.F;
        final a c2 = f5.a.C;
        final int h2 = i.H;
        if (h2 != 0) {
            if (h2 == 1) {
                Label_0152: {
                    try {
                        com.google.android.gms.internal.auth.h.z(f);
                        return c5.h.a;
                    }
                    catch (final IOException ex) {
                        break Label_0152;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                final StringBuilder sb = new StringBuilder("Failed to update cache config value: ");
                final IOException ex;
                sb.append((Object)ex);
                Log.w("SettingsCache", sb.toString());
                return c5.h.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.android.gms.internal.auth.h.z(f);
        final h a = this.a;
        final m m = new m(o, d, this, null);
        i.H = 1;
        if (s2.a.b(a, (p)m, (c)i) == c2) {
            return c2;
        }
        return c5.h.a;
    }
}
