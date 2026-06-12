package i4;

import g5.c;
import org.json.JSONException;
import android.util.Log;
import org.json.JSONObject;
import f5.a;
import n5.o;
import m5.p;
import g5.h;

public final class b extends h implements p
{
    public o G;
    public o H;
    public int I;
    public Object J;
    public final d K;
    
    public b(final d k, final e5.d d) {
        this.K = k;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((b)this.i((e5.d)o2, o)).l(c5.h.a);
    }
    
    public final e5.d i(final e5.d d, final Object j) {
        final b b = new b(this.K, d);
        b.J = j;
        return (e5.d)b;
    }
    
    public final Object l(Object j) {
        final a c = a.C;
        final int i = this.I;
        final Object a = c5.h.a;
        final d k = this.K;
        Label_0850: {
            c5.h h3 = null;
            Label_0778: {
                Label_0771: {
                    Object o = null;
                    Label_0693: {
                        Object o2 = null;
                        Label_0603: {
                            o h = null;
                            Object m = null;
                            o o5 = null;
                            Label_0505: {
                                o g2 = null;
                                switch (i) {
                                    default: {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    case 6: {
                                        com.google.android.gms.internal.auth.h.z(j);
                                        return a;
                                    }
                                    case 5: {
                                        com.google.android.gms.internal.auth.h.z(j);
                                        break Label_0850;
                                    }
                                    case 4: {
                                        com.google.android.gms.internal.auth.h.z(j);
                                        break Label_0771;
                                    }
                                    case 3: {
                                        o = this.J;
                                        com.google.android.gms.internal.auth.h.z(j);
                                        break Label_0693;
                                    }
                                    case 2: {
                                        final o g = this.G;
                                        o2 = this.J;
                                        com.google.android.gms.internal.auth.h.z(j);
                                        j = g;
                                        break Label_0603;
                                    }
                                    case 1: {
                                        h = this.H;
                                        g2 = this.G;
                                        final o o3 = (o)this.J;
                                        com.google.android.gms.internal.auth.h.z(j);
                                        j = o3;
                                        break;
                                    }
                                    case 0: {
                                        com.google.android.gms.internal.auth.h.z(j);
                                        final JSONObject jsonObject = (JSONObject)this.J;
                                        final StringBuilder sb = new StringBuilder("Fetched settings: ");
                                        sb.append((Object)jsonObject);
                                        Log.d("SessionConfigFetcher", sb.toString());
                                        final Object l = new Object();
                                        final Object g3 = new Object();
                                        final Object h2 = new Object();
                                        Object o4 = null;
                                        Label_0407: {
                                            if (jsonObject.has("app_quality")) {
                                                j = jsonObject.get("app_quality");
                                                n5.h.c("null cannot be cast to non-null type org.json.JSONObject", j);
                                                final JSONObject jsonObject2 = (JSONObject)j;
                                                Label_0388: {
                                                    Label_0296: {
                                                        try {
                                                            if (jsonObject2.has("sessions_enabled")) {
                                                                j = jsonObject2.get("sessions_enabled");
                                                                break Label_0296;
                                                            }
                                                        }
                                                        catch (final JSONException ex) {
                                                            j = null;
                                                            break Label_0388;
                                                        }
                                                        j = null;
                                                        try {
                                                            if (jsonObject2.has("sampling_rate")) {
                                                                ((o)l).C = jsonObject2.get("sampling_rate");
                                                            }
                                                        }
                                                        catch (final JSONException ex) {
                                                            break Label_0388;
                                                        }
                                                    }
                                                    if (jsonObject2.has("session_timeout_seconds")) {
                                                        ((o)g3).C = jsonObject2.get("session_timeout_seconds");
                                                    }
                                                    o4 = j;
                                                    if (jsonObject2.has("cache_duration")) {
                                                        ((o)h2).C = jsonObject2.get("cache_duration");
                                                        o4 = j;
                                                    }
                                                    break Label_0407;
                                                }
                                                final JSONException ex;
                                                Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", (Throwable)ex);
                                                o4 = j;
                                            }
                                            else {
                                                o4 = null;
                                            }
                                        }
                                        if (o4 == null) {
                                            m = l;
                                            o5 = (o)g3;
                                            h = (o)h2;
                                            break Label_0505;
                                        }
                                        final n b = k.b();
                                        this.J = l;
                                        this.G = (o)g3;
                                        this.H = (o)h2;
                                        this.I = 1;
                                        j = b.c(n.c, o4, (c)this);
                                        if (j != c) {
                                            j = a;
                                        }
                                        if (j == c) {
                                            return c;
                                        }
                                        j = l;
                                        g2 = (o)g3;
                                        h = (o)h2;
                                        break;
                                    }
                                }
                                o5 = g2;
                                m = j;
                            }
                            j = h;
                            o2 = m;
                            if (o5.C != null) {
                                final n b2 = k.b();
                                final Integer n = (Integer)o5.C;
                                this.J = m;
                                this.G = h;
                                this.H = null;
                                this.I = 2;
                                Object c2 = b2.c(i4.n.e, n, (c)this);
                                if (c2 != c) {
                                    c2 = a;
                                }
                                j = h;
                                o2 = m;
                                if (c2 == c) {
                                    return c;
                                }
                            }
                        }
                        o = j;
                        if (((o)o2).C != null) {
                            final n b3 = k.b();
                            final Double n2 = (Double)((o)o2).C;
                            this.J = j;
                            this.G = null;
                            this.H = null;
                            this.I = 3;
                            Object c3 = b3.c(n.d, n2, (c)this);
                            if (c3 != c) {
                                c3 = a;
                            }
                            o = j;
                            if (c3 == c) {
                                return c;
                            }
                        }
                    }
                    if (((o)o).C == null) {
                        h3 = null;
                        break Label_0778;
                    }
                    final n b4 = k.b();
                    final Integer n3 = (Integer)((o)o).C;
                    this.J = null;
                    this.G = null;
                    this.H = null;
                    this.I = 4;
                    j = b4.c(n.f, n3, (c)this);
                    if (j != c) {
                        j = a;
                    }
                    if (j == c) {
                        return c;
                    }
                }
                h3 = (c5.h)a;
            }
            if (h3 == null) {
                final n b5 = k.b();
                j = new Integer(86400);
                this.J = null;
                this.G = null;
                this.H = null;
                this.I = 5;
                j = b5.c(n.f, j, (c)this);
                if (j != c) {
                    j = a;
                }
                if (j == c) {
                    return c;
                }
            }
        }
        final n b6 = k.b();
        final Long n4 = new Long(System.currentTimeMillis());
        this.J = null;
        this.G = null;
        this.H = null;
        this.I = 6;
        j = b6.c(n.g, n4, (c)this);
        if (j != c) {
            j = a;
        }
        if (j == c) {
            return c;
        }
        return a;
    }
}
