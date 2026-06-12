package K2;

import com.google.android.gms.internal.measurement.N0;
import java.util.HashMap;
import com.google.android.gms.internal.measurement.i4;
import android.net.Uri;
import android.text.TextUtils;
import android.net.Uri$Builder;

public final class w1 extends v1
{
    public static String A(final G g) {
        final Uri$Builder uri$Builder = new Uri$Builder();
        String s;
        if (TextUtils.isEmpty((CharSequence)(s = g.j()))) {
            s = g.d();
        }
        final Uri$Builder encodedAuthority = uri$Builder.scheme((String)w.f.a(null)).encodedAuthority((String)w.g.a(null));
        final StringBuilder sb = new StringBuilder("config/app/");
        sb.append(s);
        encodedAuthority.path(sb.toString()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "106000").appendQueryParameter("runtime_version", "0");
        return uri$Builder.build().toString();
    }
    
    public final String B(String q) {
        q = this.y().Q(q);
        if (!TextUtils.isEmpty((CharSequence)q)) {
            final Uri parse = Uri.parse((String)w.r.a(null));
            final Uri$Builder buildUpon = parse.buildUpon();
            final String authority = parse.getAuthority();
            final StringBuilder sb = new StringBuilder();
            sb.append(q);
            sb.append(".");
            sb.append(authority);
            buildUpon.authority(sb.toString());
            return buildUpon.build().toString();
        }
        return (String)w.r.a(null);
    }
    
    public final z1 z(final String s) {
        i4.a();
        final n0 n0 = (n0)super.C;
        final d i = n0.I;
        final F w0 = w.w0;
        final z1 z1 = null;
        if (i.G(null, w0)) {
            this.u();
            if (J1.y0(s)) {
                this.j().P.f("sgtm feature flag enabled.");
                final G u0 = this.x().u0(s);
                if (u0 == null) {
                    return new z1(this.B(s), 1);
                }
                final String g = u0.g();
                final N0 m = this.y().M(s);
                if (m != null) {
                    final G u2 = this.x().u0(s);
                    if (u2 != null) {
                        if (!m.G() || m.x().o() != 100) {
                            if (!this.u().w0(s, u2.l())) {
                                if (n0.I.G(null, w.y0)) {
                                    if (TextUtils.isEmpty((CharSequence)g)) {
                                        return new z1(this.B(s), 1);
                                    }
                                    if (Math.abs(g.hashCode() % 100) >= m.x().o()) {
                                        return new z1(this.B(s), 1);
                                    }
                                }
                                else {
                                    if (TextUtils.isEmpty((CharSequence)g)) {
                                        return new z1(this.B(s), 1);
                                    }
                                    if (g.hashCode() % 100 >= m.x().o()) {
                                        return new z1(this.B(s), 1);
                                    }
                                }
                            }
                        }
                        z1 z2;
                        if (!u0.o()) {
                            z2 = z1;
                        }
                        else {
                            this.j().P.f("sgtm upload enabled in manifest.");
                            final N0 j = this.y().M(u0.f());
                            z2 = z1;
                            if (j != null) {
                                if (!j.G()) {
                                    z2 = z1;
                                }
                                else {
                                    final String r = j.x().r();
                                    if (TextUtils.isEmpty((CharSequence)r)) {
                                        z2 = z1;
                                    }
                                    else {
                                        final String q = j.x().q();
                                        final P k = this.j();
                                        String s2;
                                        if (TextUtils.isEmpty((CharSequence)q)) {
                                            s2 = "Y";
                                        }
                                        else {
                                            s2 = "N";
                                        }
                                        k.P.e(r, s2, "sgtm configured with upload_url, server_info");
                                        if (TextUtils.isEmpty((CharSequence)q)) {
                                            z2 = new z1(r, 3);
                                        }
                                        else {
                                            final HashMap hashMap = new HashMap();
                                            hashMap.put((Object)"x-sgtm-server-info", (Object)q);
                                            if (!TextUtils.isEmpty((CharSequence)u0.l())) {
                                                hashMap.put((Object)"x-gtm-server-preview", (Object)u0.l());
                                            }
                                            z2 = new z1(r, hashMap, 3);
                                        }
                                    }
                                }
                            }
                        }
                        if (z2 != null) {
                            return z2;
                        }
                        return new z1(this.B(s), 1);
                    }
                }
                return new z1(this.B(s), 1);
            }
        }
        return new z1(this.B(s), 1);
    }
}
