package T3;

import android.content.res.Resources;
import java.net.URI;
import android.content.Context;
import Z3.r;
import R3.a;

public final class c extends e
{
    public static final a c;
    public final r a;
    public final Context b;
    
    static {
        c = a.d();
    }
    
    public c(final r a, final Context b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean a() {
        final r a = this.a;
        final String s = a.S();
        final boolean b = s == null || s.trim().isEmpty();
        final a c = T3.c.c;
        if (b) {
            final StringBuilder sb = new StringBuilder("URL is missing:");
            sb.append(a.S());
            c.f(sb.toString());
            return false;
        }
        Object o = a.S();
        final URI uri = null;
        Label_0137: {
            if (o == null) {
                o = uri;
            }
            else {
                try {
                    o = URI.create((String)o);
                    break Label_0137;
                }
                catch (final IllegalStateException o) {}
                catch (final IllegalArgumentException ex) {}
                c.g("getResultUrl throws exception %s", ((Throwable)o).getMessage());
                o = uri;
            }
        }
        if (o == null) {
            c.f("URL cannot be parsed");
            return false;
        }
        final Context b2 = this.b;
        final Resources resources = b2.getResources();
        final int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", b2.getPackageName());
        Label_0252: {
            if (identifier != 0) {
                R3.a.d().a("Detected domain allowlist, only allowlisted domains will be measured.");
                if (a.a.e == null) {
                    a.a.e = resources.getStringArray(identifier);
                }
                final String host = ((URI)o).getHost();
                if (host != null) {
                    final String[] e = a.a.e;
                    for (int length = e.length, i = 0; i < length; ++i) {
                        if (host.contains((CharSequence)e[i])) {
                            break Label_0252;
                        }
                    }
                    final StringBuilder sb2 = new StringBuilder("URL fails allowlist rule: ");
                    sb2.append(o);
                    c.f(sb2.toString());
                    return false;
                }
            }
        }
        final String host2 = ((URI)o).getHost();
        if (host2 != null && !host2.trim().isEmpty() && host2.length() <= 255) {
            final String scheme = ((URI)o).getScheme();
            if (scheme != null) {
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (((URI)o).getUserInfo() != null) {
                        c.f("URL user info is null");
                        return false;
                    }
                    final int port = ((URI)o).getPort();
                    if (port != -1 && port <= 0) {
                        c.f("URL port is less than or equal to 0");
                        return false;
                    }
                    int k;
                    if (a.U()) {
                        k = a.K();
                    }
                    else {
                        k = 0;
                    }
                    if (k == 0 || k == 1) {
                        String s2 = null;
                        switch (a.K()) {
                            default: {
                                s2 = "null";
                                break;
                            }
                            case 10: {
                                s2 = "CONNECT";
                                break;
                            }
                            case 9: {
                                s2 = "TRACE";
                                break;
                            }
                            case 8: {
                                s2 = "OPTIONS";
                                break;
                            }
                            case 7: {
                                s2 = "PATCH";
                                break;
                            }
                            case 6: {
                                s2 = "HEAD";
                                break;
                            }
                            case 5: {
                                s2 = "DELETE";
                                break;
                            }
                            case 4: {
                                s2 = "POST";
                                break;
                            }
                            case 3: {
                                s2 = "PUT";
                                break;
                            }
                            case 2: {
                                s2 = "GET";
                                break;
                            }
                            case 1: {
                                s2 = "HTTP_METHOD_UNKNOWN";
                                break;
                            }
                        }
                        c.f("HTTP Method is null or invalid: ".concat(s2));
                        return false;
                    }
                    if (a.V() && a.L() <= 0) {
                        final StringBuilder sb3 = new StringBuilder("HTTP ResponseCode is a negative value:");
                        sb3.append(a.L());
                        c.f(sb3.toString());
                        return false;
                    }
                    if (a.W() && a.N() < 0L) {
                        final StringBuilder sb4 = new StringBuilder("Request Payload is a negative value:");
                        sb4.append(a.N());
                        c.f(sb4.toString());
                        return false;
                    }
                    if (a.X() && a.O() < 0L) {
                        final StringBuilder sb5 = new StringBuilder("Response Payload is a negative value:");
                        sb5.append(a.O());
                        c.f(sb5.toString());
                        return false;
                    }
                    if (!a.T() || a.I() <= 0L) {
                        final StringBuilder sb6 = new StringBuilder("Start time of the request is null, or zero, or a negative value:");
                        sb6.append(a.I());
                        c.f(sb6.toString());
                        return false;
                    }
                    if (a.Y() && a.P() < 0L) {
                        final StringBuilder sb7 = new StringBuilder("Time to complete the request is a negative value:");
                        sb7.append(a.P());
                        c.f(sb7.toString());
                        return false;
                    }
                    if (a.a0() && a.R() < 0L) {
                        final StringBuilder sb8 = new StringBuilder("Time from the start of the request to the start of the response is null or a negative value:");
                        sb8.append(a.R());
                        c.f(sb8.toString());
                        return false;
                    }
                    if (!a.Z() || a.Q() <= 0L) {
                        final StringBuilder sb9 = new StringBuilder("Time from the start of the request to the end of the response is null, negative or zero:");
                        sb9.append(a.Q());
                        c.f(sb9.toString());
                        return false;
                    }
                    if (!a.V()) {
                        c.f("Did not receive a HTTP Response Code");
                        return false;
                    }
                    return true;
                }
            }
            c.f("URL scheme is null or invalid");
            return false;
        }
        c.f("URL host is null or invalid");
        return false;
    }
}
