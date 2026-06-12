package K2;

import android.database.Cursor;
import com.google.android.gms.internal.measurement.S1;
import java.util.AbstractMap;
import com.google.android.gms.internal.measurement.g2;
import c2.k;
import java.util.Set;
import java.util.Map;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.t0;
import java.util.Collection;
import java.util.ArrayList;
import h2.A;
import com.google.android.gms.internal.measurement.I;
import com.google.android.gms.internal.measurement.w1;
import E1.m;
import com.google.android.gms.internal.measurement.u2;
import java.util.HashMap;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.x1;
import java.util.LinkedHashMap;
import com.google.android.gms.internal.measurement.L0;
import com.google.android.gms.internal.measurement.K0;
import com.google.android.gms.internal.measurement.J0;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.M0;
import com.google.android.gms.internal.measurement.I0;
import com.google.android.gms.internal.measurement.F0;
import android.text.TextUtils;
import java.util.Iterator;
import com.google.android.gms.internal.measurement.R0;
import com.google.android.gms.internal.measurement.N0;
import t.j;
import t.b;

public final class h0 extends u1 implements e
{
    public final b F;
    public final b G;
    public final b H;
    public final b I;
    public final b J;
    public final b K;
    public final i0 L;
    public final C2.b M;
    public final b N;
    public final b O;
    public final b P;
    
    public h0(final y1 y1) {
        super(y1);
        this.F = (b)new j();
        this.G = (b)new j();
        this.H = (b)new j();
        this.I = (b)new j();
        this.J = (b)new j();
        this.N = (b)new j();
        this.O = (b)new j();
        this.P = (b)new j();
        this.K = (b)new j();
        this.L = new i0(this);
        this.M = new C2.b((Object)this, 17);
    }
    
    public static y0 D(int n) {
        n = j0.b[v.e.d(n)];
        if (n == 1) {
            return y0.D;
        }
        if (n == 2) {
            return y0.E;
        }
        if (n == 3) {
            return y0.F;
        }
        if (n != 4) {
            return null;
        }
        return y0.G;
    }
    
    public static b G(final N0 n0) {
        final j j = new j();
        for (final R0 r0 : n0.D()) {
            j.put((Object)r0.o(), (Object)r0.p());
        }
        return (b)j;
    }
    
    @Override
    public final boolean B() {
        return false;
    }
    
    public final long C(final String s) {
        final String c = this.c(s, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty((CharSequence)c)) {
            try {
                return Long.parseLong(c);
            }
            catch (final NumberFormatException ex) {
                this.j().K.e(K2.P.z(s), ex, "Unable to parse timezone offset. appId");
            }
        }
        return 0L;
    }
    
    public final B0 E(final String s, final y0 y0) {
        this.v();
        this.T(s);
        final I0 l = this.L(s);
        final B0 d = B0.D;
        if (l == null) {
            return d;
        }
        for (final F0 f0 : l.s()) {
            if (D(f0.p()) == y0) {
                final int n = j0.c[v.e.d(f0.o())];
                if (n == 1) {
                    return B0.F;
                }
                if (n != 2) {
                    return d;
                }
                return B0.G;
            }
        }
        return d;
    }
    
    public final N0 F(final String s, final byte[] array) {
        if (array == null) {
            return N0.w();
        }
        Label_0125: {
            Label_0099: {
                N0 n0 = null;
                S p2 = null;
                Object y = null;
                Long value = null;
                Label_0071: {
                    try {
                        n0 = (N0)((f2)T.L((f2)N0.v(), array)).d();
                        p2 = this.j().P;
                        final boolean h = n0.H();
                        y = null;
                        if (h) {
                            value = n0.t();
                            break Label_0071;
                        }
                    }
                    catch (final RuntimeException ex) {
                        break Label_0099;
                    }
                    catch (final o2 o2) {
                        break Label_0125;
                    }
                    value = null;
                }
                if (n0.F()) {
                    y = n0.y();
                }
                p2.e(value, y, "Parsed config. version, gmp_app_id");
                return n0;
            }
            final RuntimeException ex;
            this.j().K.e(K2.P.z(s), ex, "Unable to merge remote config. appId");
            return N0.w();
        }
        final o2 o2;
        this.j().K.e(K2.P.z(s), o2, "Unable to merge remote config. appId");
        return N0.w();
    }
    
    public final void H(final String s, final M0 m0) {
        final HashSet set = new HashSet();
        final j j = new j();
        final j i = new j();
        final j k = new j();
        final Iterator iterator = Collections.unmodifiableList((List)((N0)((f2)m0).D).B()).iterator();
        while (iterator.hasNext()) {
            set.add((Object)((J0)iterator.next()).o());
        }
        for (int l = 0; l < ((N0)((f2)m0).D).s(); ++l) {
            final K0 k2 = (K0)((g2)((N0)((f2)m0).D).p(l)).l();
            if (k2.j().isEmpty()) {
                this.j().K.f("EventConfig contained null event name");
            }
            else {
                final String j2 = k2.j();
                final String c = C0.c(k2.j(), C0.a, C0.c);
                if (!TextUtils.isEmpty((CharSequence)c)) {
                    ((f2)k2).f();
                    L0.p((L0)((f2)k2).D, c);
                    ((f2)m0).f();
                    N0.r((N0)((f2)m0).D, l, (L0)((f2)k2).d());
                }
                if (((L0)((f2)k2).D).t() && ((L0)((f2)k2).D).r()) {
                    j.put((Object)j2, (Object)Boolean.TRUE);
                }
                if (((L0)((f2)k2).D).u() && ((L0)((f2)k2).D).s()) {
                    i.put((Object)k2.j(), (Object)Boolean.TRUE);
                }
                if (((L0)((f2)k2).D).v()) {
                    if (((L0)((f2)k2).D).o() >= 2 && ((L0)((f2)k2).D).o() <= 65535) {
                        k.put((Object)k2.j(), (Object)((L0)((f2)k2).D).o());
                    }
                    else {
                        this.j().K.e(k2.j(), ((L0)((f2)k2).D).o(), "Invalid sampling rate. Event name, sample rate");
                    }
                }
            }
        }
        ((j)this.G).put((Object)s, (Object)set);
        ((j)this.H).put((Object)s, (Object)j);
        ((j)this.I).put((Object)s, (Object)i);
        ((j)this.K).put((Object)s, (Object)k);
    }
    
    public final void I(final String s, final N0 n0) {
        if (n0.o() == 0) {
            final i0 l = this.L;
            if (s != null) {
                final i0 i0;
                monitorenter(i0 = l);
                Label_0052: {
                    try {
                        if (((AbstractMap)l.H).remove((Object)s) != null) {
                            --l.D;
                        }
                        break Label_0052;
                    }
                    finally {
                        monitorexit(i0);
                        monitorexit(i0);
                        return;
                    }
                }
            }
            l.getClass();
            throw new NullPointerException("key == null");
        }
        this.j().P.g("EES programs found", n0.o());
        final x1 x1 = (x1)((List)n0.C()).get(0);
        try {
            final v v = new v();
            final g0 g0 = new g0(2);
            g0.b = this;
            g0.c = s;
            ((HashMap)((u2)v.a.G).C).put((Object)"internal.remoteConfig", (Object)g0);
            final g0 g2 = new g0(1);
            g2.b = this;
            g2.c = s;
            ((HashMap)((u2)v.a.G).C).put((Object)"internal.appMetadata", (Object)g2);
            final m m = new m();
            m.b = this;
            ((HashMap)((u2)v.a.G).C).put((Object)"internal.logger", (Object)m);
            v.a(x1);
            this.L.e((Object)s, (Object)v);
            this.j().P.e(s, x1.o().o(), "EES program loaded for appId, activities");
            final Iterator iterator = x1.o().q().iterator();
            while (iterator.hasNext()) {
                this.j().P.g("EES program activity", ((w1)iterator.next()).o());
            }
        }
        catch (final I j) {
            this.j().H.g("Failed to load EES program. appId", s);
        }
    }
    
    public final void J(final String s, final String s2, final String s3, byte[] c) {
        this.z();
        this.v();
        A.e(s);
        Object o = ((g2)this.F(s, c)).l();
        this.H(s, (M0)o);
        this.I(s, (N0)((f2)o).d());
        final N0 n0 = (N0)((f2)o).d();
        Object j = this.J;
        ((j)j).put((Object)s, (Object)n0);
        ((j)this.N).put((Object)s, (Object)((N0)((f2)o).D).z());
        ((j)this.O).put((Object)s, (Object)s2);
        ((j)this.P).put((Object)s, (Object)s3);
        ((j)this.F).put((Object)s, (Object)G((N0)((f2)o).d()));
        final h x = this.x();
        final ArrayList list = new ArrayList((Collection)Collections.unmodifiableList(((N0)((f2)o).D).A()));
        Object value = "app_id=? and audience_id=?";
        Object o2;
        Object o3 = null;
        Object o4;
        for (int i = 0; i < list.size(); ++i, j = o3, o = o2, value = o4) {
            final t0 t0 = (t0)((g2)list.get(i)).l();
            o2 = o;
            o3 = j;
            o4 = value;
            if (((u0)((f2)t0).D).s() != 0) {
                int n2 = 0;
                while (true) {
                    o2 = o;
                    o3 = j;
                    o4 = value;
                    if (n2 >= ((u0)((f2)t0).D).s()) {
                        break;
                    }
                    final v0 v0 = (v0)((g2)((u0)((f2)t0).D).p(n2)).l();
                    final v0 v2 = (v0)((f2)v0).clone();
                    final String c2 = C0.c(((w0)((f2)v0).D).v(), C0.a, C0.c);
                    boolean b;
                    if (c2 != null) {
                        ((f2)v2).f();
                        w0.r((w0)((f2)v2).D, c2);
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    for (int k = 0; k < ((w0)((f2)v0).D).o(); ++k) {
                        final com.google.android.gms.internal.measurement.y0 p4 = ((w0)((f2)v0).D).p(k);
                        final String c3 = C0.c(p4.s(), C0.g, C0.h);
                        if (c3 != null) {
                            final x0 x2 = (x0)((g2)p4).l();
                            ((f2)x2).f();
                            com.google.android.gms.internal.measurement.y0.o((com.google.android.gms.internal.measurement.y0)((f2)x2).D, c3);
                            final com.google.android.gms.internal.measurement.y0 y0 = (com.google.android.gms.internal.measurement.y0)((f2)x2).d();
                            ((f2)v2).f();
                            w0.q((w0)((f2)v2).D, k, y0);
                            b = true;
                        }
                    }
                    if (b) {
                        ((f2)t0).f();
                        u0.q((u0)((f2)t0).D, n2, (w0)((f2)v2).d());
                        list.set(i, (Object)((f2)t0).d());
                    }
                    ++n2;
                }
            }
            if (((u0)((f2)t0).D).u() != 0) {
                for (int l = 0; l < ((u0)((f2)t0).D).u(); ++l) {
                    final com.google.android.gms.internal.measurement.C0 t2 = ((u0)((f2)t0).D).t(l);
                    final String c4 = C0.c(t2.s(), C0.e, C0.f);
                    if (c4 != null) {
                        final com.google.android.gms.internal.measurement.B0 b2 = (com.google.android.gms.internal.measurement.B0)((g2)t2).l();
                        ((f2)b2).f();
                        com.google.android.gms.internal.measurement.C0.p((com.google.android.gms.internal.measurement.C0)((f2)b2).D, c4);
                        ((f2)t0).f();
                        u0.r((u0)((f2)t0).D, l, (com.google.android.gms.internal.measurement.C0)((f2)b2).d());
                        list.set(i, (Object)((f2)t0).d());
                    }
                }
            }
        }
    Label_0782_Outer:
        while (true) {
            x.z();
            x.v();
            A.e(s);
            final SQLiteDatabase d = x.D();
            d.beginTransaction();
            Label_1500: {
                Label_1188: {
                    while (true) {
                    Label_0782:
                        while (true) {
                            Label_0856: {
                                try {
                                    x.z();
                                    x.v();
                                    A.e(s);
                                    o2 = x.D();
                                    ((SQLiteDatabase)o2).delete("property_filters", "app_id=?", new String[] { s });
                                    ((SQLiteDatabase)o2).delete("event_filters", "app_id=?", new String[] { s });
                                    o2 = list.iterator();
                                    while (((Iterator)o2).hasNext()) {
                                        o3 = ((Iterator)o2).next();
                                        x.z();
                                        x.v();
                                        A.e(s);
                                        A.h(o3);
                                        if (((u0)o3).x()) {
                                            break Label_0856;
                                        }
                                        x.j().K.g("Audience with no ID. appId", K2.P.z(s));
                                    }
                                    break Label_1188;
                                }
                                finally {
                                    break Label_1500;
                                }
                            }
                            final int o5 = ((u0)o3).o();
                            final Iterator iterator = ((u0)o3).v().iterator();
                            while (iterator.hasNext()) {
                                if (!((w0)iterator.next()).B()) {
                                    x.j().K.e(K2.P.z(s), o5, "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                    continue Label_0782;
                                }
                            }
                            final Iterator iterator2 = ((u0)o3).w().iterator();
                            while (iterator2.hasNext()) {
                                if (!((com.google.android.gms.internal.measurement.C0)iterator2.next()).w()) {
                                    x.j().K.e(K2.P.z(s), o5, "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                    continue Label_0782;
                                }
                            }
                            final Iterator iterator3 = ((u0)o3).v().iterator();
                            while (iterator3.hasNext()) {
                                if (!x.g0(s, o5, (w0)iterator3.next())) {
                                    final int n3 = 0;
                                    boolean b3 = n3 != 0;
                                    Label_1102: {
                                        if (n3 != 0) {
                                            o3 = ((u0)o3).w().iterator();
                                            do {
                                                b3 = (n3 != 0);
                                                if (((Iterator)o3).hasNext()) {
                                                    continue Label_0782_Outer;
                                                }
                                                break Label_1102;
                                            } while (x.h0(s, o5, (com.google.android.gms.internal.measurement.C0)((Iterator)o3).next()));
                                            b3 = false;
                                        }
                                    }
                                    Label_1185: {
                                        if (!b3) {
                                            x.z();
                                            x.v();
                                            A.e(s);
                                            o3 = x.D();
                                            ((SQLiteDatabase)o3).delete("property_filters", (String)value, new String[] { s, String.valueOf(o5) });
                                            ((SQLiteDatabase)o3).delete("event_filters", (String)value, new String[] { s, String.valueOf(o5) });
                                            break Label_1185;
                                        }
                                        break Label_1185;
                                    }
                                    continue Label_0782;
                                }
                            }
                            break;
                        }
                        final int n3 = true ? 1 : 0;
                        continue;
                    }
                }
                final ArrayList list2 = new ArrayList();
                for (final u0 u0 : list) {
                    if (u0.x()) {
                        value = u0.o();
                    }
                    else {
                        value = null;
                    }
                    list2.add(value);
                }
                x.p0(s, list2);
                d.setTransactionSuccessful();
                d.endTransaction();
                try {
                    ((f2)o).f();
                    try {
                        N0.q((N0)((f2)o).D);
                        c = ((S1)((f2)o).d()).c();
                    }
                    catch (final RuntimeException value) {}
                }
                catch (final RuntimeException ex) {}
                this.j().K.e(K2.P.z(s), value, "Unable to serialize reduced-size config. Storing full config instead. appId");
                final h x3 = this.x();
                A.e(s);
                x3.v();
                x3.z();
                final ContentValues contentValues = new ContentValues();
                contentValues.put("remote_config", c);
                contentValues.put("config_last_modified_time", s2);
                contentValues.put("e_tag", s3);
                try {
                    if (x3.D().update("apps", contentValues, "app_id = ?", new String[] { s }) == 0L) {
                        x3.j().H.g("Failed to update remote config (got 0). appId", K2.P.z(s));
                    }
                }
                catch (final SQLiteException ex2) {
                    x3.j().H.e(K2.P.z(s), ex2, "Error storing remote config. appId");
                }
                ((j)j).put((Object)s, (Object)((f2)o).d());
                return;
            }
            d.endTransaction();
        }
    }
    
    public final int K(final String s, final String s2) {
        this.v();
        this.T(s);
        final Map map = (Map)((j)this.K).getOrDefault((Object)s, (Object)null);
        if (map == null) {
            return 1;
        }
        final Integer n = (Integer)map.get((Object)s2);
        if (n == null) {
            return 1;
        }
        return n;
    }
    
    public final I0 L(final String s) {
        this.v();
        this.T(s);
        final N0 m = this.M(s);
        if (m != null && m.E()) {
            return m.u();
        }
        return null;
    }
    
    public final N0 M(final String s) {
        this.z();
        this.v();
        A.e(s);
        this.T(s);
        return (N0)((j)this.J).getOrDefault((Object)s, (Object)null);
    }
    
    public final boolean N(final String s, final y0 y0) {
        this.v();
        this.T(s);
        final I0 l = this.L(s);
        if (l == null) {
            return false;
        }
        for (final F0 f0 : l.q()) {
            if (y0 == D(f0.p())) {
                if (f0.o() == 2) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
    
    public final boolean O(final String s, final String s2) {
        this.v();
        this.T(s);
        if ("ecommerce_purchase".equals((Object)s2)) {
            return true;
        }
        if ("purchase".equals((Object)s2) || "refund".equals((Object)s2)) {
            return true;
        }
        final Map map = (Map)((j)this.I).getOrDefault((Object)s, (Object)null);
        if (map != null) {
            final Boolean b = (Boolean)map.get((Object)s2);
            return b != null && b;
        }
        return false;
    }
    
    public final boolean P(final String s, final String s2) {
        this.v();
        this.T(s);
        if ("1".equals((Object)this.c(s, "measurement.upload.blacklist_internal")) && J1.A0(s2)) {
            return true;
        }
        if ("1".equals((Object)this.c(s, "measurement.upload.blacklist_public")) && J1.B0(s2)) {
            return true;
        }
        final Map map = (Map)((j)this.H).getOrDefault((Object)s, (Object)null);
        if (map != null) {
            final Boolean b = (Boolean)map.get((Object)s2);
            return b != null && b;
        }
        return false;
    }
    
    public final String Q(final String s) {
        this.v();
        this.T(s);
        return (String)((j)this.N).getOrDefault((Object)s, (Object)null);
    }
    
    public final boolean R(final String s) {
        this.v();
        this.T(s);
        final b g = this.G;
        return ((j)g).getOrDefault((Object)s, (Object)null) != null && ((Set)((j)g).getOrDefault((Object)s, (Object)null)).contains((Object)"app_instance_id");
    }
    
    public final boolean S(final String s) {
        this.v();
        this.T(s);
        final b g = this.G;
        return ((j)g).getOrDefault((Object)s, (Object)null) != null && (((Set)((j)g).getOrDefault((Object)s, (Object)null)).contains((Object)"os_version") || ((Set)((j)g).getOrDefault((Object)s, (Object)null)).contains((Object)"device_info"));
    }
    
    public final void T(String s) {
        this.z();
        this.v();
        A.e(s);
        final b j = this.J;
        Object blob = null;
        if (((j)j).getOrDefault((Object)s, (Object)null) == null) {
            while (true) {
                final h x = this.x();
                A.e(s);
                x.v();
                x.z();
                Label_0547: {
                Label_0122:
                    while (true) {
                        Object o = null;
                        Label_0278: {
                            try {
                                String string;
                                String string2;
                                while (true) {
                                    Object query;
                                    o = (query = x.D().query("apps", new String[] { "remote_config", "config_last_modified_time", "e_tag" }, "app_id=?", new String[] { s }, (String)null, (String)null, (String)null));
                                    try {
                                        try {
                                            if (!((Cursor)o).moveToFirst()) {
                                                ((Cursor)o).close();
                                                query = null;
                                                break Label_0122;
                                            }
                                            query = o;
                                            blob = ((Cursor)o).getBlob(0);
                                            query = o;
                                            string = ((Cursor)o).getString(1);
                                            query = o;
                                            string2 = ((Cursor)o).getString(2);
                                            query = o;
                                            if (((Cursor)o).moveToNext()) {
                                                query = o;
                                                x.j().H.g("Got multiple records for app config, expected one. appId", K2.P.z(s));
                                            }
                                        }
                                        finally {
                                            s = (String)query;
                                        }
                                    }
                                    catch (final SQLiteException blob) {
                                        break Label_0278;
                                    }
                                    if (blob == null) {
                                        ((Cursor)o).close();
                                        continue Label_0122;
                                    }
                                    break;
                                }
                                blob = new k(blob, (Object)string, (Object)string2, 7);
                                ((Cursor)o).close();
                            }
                            catch (final SQLiteException blob) {
                                o = null;
                            }
                            finally {
                                s = (String)blob;
                                break Label_0547;
                            }
                        }
                        Object query = o;
                        x.j().H.e(K2.P.z(s), blob, "Error querying remote config. appId");
                        if (o != null) {
                            ((Cursor)o).close();
                            continue Label_0122;
                        }
                        continue Label_0122;
                    }
                    final b p = this.P;
                    final b o2 = this.O;
                    final b n = this.N;
                    final b f = this.F;
                    final k k;
                    if (k == null) {
                        ((j)f).put((Object)s, (Object)null);
                        ((j)this.H).put((Object)s, (Object)null);
                        ((j)this.G).put((Object)s, (Object)null);
                        ((j)this.I).put((Object)s, (Object)null);
                        ((j)j).put((Object)s, (Object)null);
                        ((j)n).put((Object)s, (Object)null);
                        ((j)o2).put((Object)s, (Object)null);
                        ((j)p).put((Object)s, (Object)null);
                        ((j)this.K).put((Object)s, (Object)null);
                        return;
                    }
                    final M0 m0 = (M0)((g2)this.F(s, (byte[])k.D)).l();
                    this.H(s, m0);
                    ((j)f).put((Object)s, (Object)G((N0)((f2)m0).d()));
                    ((j)j).put((Object)s, (Object)((f2)m0).d());
                    this.I(s, (N0)((f2)m0).d());
                    ((j)n).put((Object)s, (Object)((N0)((f2)m0).D).z());
                    ((j)o2).put((Object)s, (Object)k.E);
                    ((j)p).put((Object)s, (Object)k.F);
                    break;
                }
                if (s != null) {
                    ((Cursor)s).close();
                }
            }
        }
    }
    
    public final String c(final String s, final String s2) {
        this.v();
        this.T(s);
        final Map map = (Map)((j)this.F).getOrDefault((Object)s, (Object)null);
        if (map != null) {
            return (String)map.get((Object)s2);
        }
        return null;
    }
}
