package S3;

import com.google.protobuf.n;
import java.util.Collection;
import java.util.regex.Pattern;
import Z3.w;
import java.util.Iterator;
import L3.h;
import U3.g;
import java.util.Arrays;
import com.google.firebase.perf.session.SessionManager;
import java.util.Collections;
import java.util.ArrayList;
import Z3.r;
import O3.c;
import java.lang.ref.WeakReference;
import Z3.p;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.List;
import R3.a;
import V3.b;
import O3.d;

public final class f extends d implements b
{
    public static final a K;
    public final List C;
    public final GaugeManager D;
    public final X3.f E;
    public final p F;
    public final WeakReference G;
    public String H;
    public boolean I;
    public boolean J;
    
    static {
        K = a.d();
    }
    
    public f(final X3.f e) {
        final c a = c.a();
        final GaugeManager instance = GaugeManager.getInstance();
        super(a);
        this.F = r.b0();
        this.G = new WeakReference((Object)this);
        this.E = e;
        this.D = instance;
        this.C = Collections.synchronizedList((List)new ArrayList());
        this.registerForAppState();
    }
    
    public static f c(final X3.f f) {
        return new f(f);
    }
    
    @Override
    public final void a(final V3.a a) {
        if (a == null) {
            f.K.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        final p f = this.F;
        if (((r)((n)f).D).T() && !((r)((n)f).D).Z()) {
            this.C.add((Object)a);
        }
    }
    
    public final void b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.G);
        this.unregisterForAppState();
        final List c;
        monitorenter(c = this.C);
        Label_0081: {
            try {
                final ArrayList list = new ArrayList();
                for (final V3.a a : this.C) {
                    if (a != null) {
                        list.add((Object)a);
                    }
                }
                break Label_0081;
            }
            finally {
                monitorexit(c);
                while (true) {
                    String h = null;
                    Block_7: {
                        while (true) {
                            while (true) {
                                r r = null;
                                Block_9: {
                                    while (true) {
                                        while (true) {
                                            r = (r)((n)this.F).j();
                                            h = this.H;
                                            iftrue(Label_0171:)(h == null);
                                            break Block_7;
                                            f.K.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
                                            return;
                                            final p f = this.F;
                                            final w[] b;
                                            final List list2 = Arrays.asList((Object[])b);
                                            ((n)f).l();
                                            Z3.r.E((r)((n)f).D, (List)list2);
                                            continue;
                                        }
                                        Label_0171: {
                                            final Pattern a2 = g.a;
                                        }
                                        iftrue(Label_0217:)(this.I);
                                        break Block_9;
                                        Label_0162:
                                        f.K.a("Dropping network request from a 'User-Agent' that is not allowed");
                                        return;
                                        Label_0217:
                                        iftrue(Label_0232:)(!this.J);
                                        continue;
                                    }
                                    Label_0232: {
                                        return;
                                    }
                                }
                                final X3.f e = this.E;
                                e.K.execute((Runnable)new h((Object)e, (Object)r, (Object)this.getAppState(), 8));
                                this.I = true;
                                return;
                                final ArrayList list;
                                final List unmodifiableList = Collections.unmodifiableList((List)list);
                                monitorexit(c);
                                final w[] b = V3.a.b(unmodifiableList);
                                iftrue(Label_0126:)(b == null);
                                continue;
                            }
                            continue;
                        }
                    }
                    iftrue(Label_0162:)(g.a.matcher((CharSequence)h).matches());
                    continue;
                }
            }
        }
    }
    
    public final void d(String upperCase) {
        int n = 8;
        if (upperCase != null) {
            upperCase = upperCase.toUpperCase();
            upperCase.getClass();
            int n2 = -1;
            switch (upperCase.hashCode()) {
                case 2012838315: {
                    if (!upperCase.equals((Object)"DELETE")) {
                        break;
                    }
                    n2 = 8;
                    break;
                }
                case 1669334218: {
                    if (!upperCase.equals((Object)"CONNECT")) {
                        break;
                    }
                    n2 = 7;
                    break;
                }
                case 80083237: {
                    if (!upperCase.equals((Object)"TRACE")) {
                        break;
                    }
                    n2 = 6;
                    break;
                }
                case 75900968: {
                    if (!upperCase.equals((Object)"PATCH")) {
                        break;
                    }
                    n2 = 5;
                    break;
                }
                case 2461856: {
                    if (!upperCase.equals((Object)"POST")) {
                        break;
                    }
                    n2 = 4;
                    break;
                }
                case 2213344: {
                    if (!upperCase.equals((Object)"HEAD")) {
                        break;
                    }
                    n2 = 3;
                    break;
                }
                case 79599: {
                    if (!upperCase.equals((Object)"PUT")) {
                        break;
                    }
                    n2 = 2;
                    break;
                }
                case 70454: {
                    if (!upperCase.equals((Object)"GET")) {
                        break;
                    }
                    n2 = 1;
                    break;
                }
                case -531492226: {
                    if (!upperCase.equals((Object)"OPTIONS")) {
                        break;
                    }
                    n2 = 0;
                    break;
                }
            }
            while (true) {
                switch (n2) {
                    default: {
                        n = 1;
                    }
                    case 0: {
                        final p f = this.F;
                        ((n)f).l();
                        r.F((r)((n)f).D, n);
                        break;
                    }
                    case 8: {
                        n = 5;
                        continue;
                    }
                    case 7: {
                        n = 10;
                        continue;
                    }
                    case 6: {
                        n = 9;
                        continue;
                    }
                    case 5: {
                        n = 7;
                        continue;
                    }
                    case 4: {
                        n = 4;
                        continue;
                    }
                    case 3: {
                        n = 6;
                        continue;
                    }
                    case 2: {
                        n = 3;
                        continue;
                    }
                    case 1: {
                        n = 2;
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public final void e(final int n) {
        final p f = this.F;
        ((n)f).l();
        r.w((r)((n)f).D, n);
    }
    
    public final void f(final long n) {
        final p f = this.F;
        ((n)f).l();
        r.G((r)((n)f).D, n);
    }
    
    public final void g(final long n) {
        final V3.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.G);
        final p f = this.F;
        ((n)f).l();
        r.z((r)((n)f).D, n);
        this.a(perfSession);
        if (perfSession.E) {
            this.D.collectGaugeMetricOnce(perfSession.D);
        }
    }
    
    public final void h(String concat) {
        final p f = this.F;
        if (concat == null) {
            ((n)f).l();
            r.y((r)((n)f).D);
            return;
        }
        Label_0077: {
            if (concat.length() <= 128) {
                for (int i = 0; i < concat.length(); ++i) {
                    final char char1 = concat.charAt(i);
                    if (char1 <= '\u001f') {
                        break Label_0077;
                    }
                    if (char1 > '\u007f') {
                        break Label_0077;
                    }
                }
                ((n)f).l();
                r.x((r)((n)f).D, concat);
                return;
            }
        }
        concat = "The content type of the response is not a valid content-type:".concat(concat);
        S3.f.K.f(concat);
    }
    
    public final void i(final long n) {
        final p f = this.F;
        ((n)f).l();
        r.H((r)((n)f).D, n);
    }
    
    public final void j(final long n) {
        final p f = this.F;
        ((n)f).l();
        r.C((r)((n)f).D, n);
        if (SessionManager.getInstance().perfSession().E) {
            this.D.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().D);
        }
    }
    
    public final void k(String h) {
        if (h == null) {
            return;
        }
        final G5.d d = null;
        G5.d c;
        try {
            c = G5.d.c(h);
        }
        catch (final IllegalArgumentException ex) {
            c = null;
        }
        if (c != null) {
            final G5.c c2 = new G5.c();
            final String a = c.a;
            c2.a = a;
            final boolean empty = c.b.isEmpty();
            final String s = "";
            final String h2 = c.h;
            if (empty) {
                h = "";
            }
            else {
                final int n = a.length() + 3;
                h = h2.substring(n, H5.a.d(h2, ":@", n, h2.length()));
            }
            c2.b = h;
            if (c.c.isEmpty()) {
                h = s;
            }
            else {
                h = h2.substring(h2.indexOf(58, a.length() + 3) + 1, h2.indexOf(64));
            }
            c2.c = h;
            c2.d = c.d;
            final int b = G5.d.b(a);
            int e = c.e;
            if (e == b) {
                e = -1;
            }
            c2.e = e;
            final ArrayList f = c2.f;
            f.clear();
            int i = h2.indexOf(47, a.length() + 3);
            final int d2 = H5.a.d(h2, "?#", i, h2.length());
            final ArrayList list = new ArrayList();
            while (i < d2) {
                final int n2 = i + 1;
                i = H5.a.c(h2, n2, d2, '/');
                list.add((Object)h2.substring(n2, i));
            }
            f.addAll((Collection)list);
            if (c.f == null) {
                h = null;
            }
            else {
                final int n3 = h2.indexOf(63) + 1;
                h = h2.substring(n3, H5.a.c(h2, n3, h2.length(), '#'));
            }
            ArrayList f2;
            if (h != null) {
                f2 = G5.d.f(G5.d.a(h, 0, h.length(), " \"'<>#", true, true, true));
            }
            else {
                f2 = null;
            }
            c2.g = f2;
            if (c.g == null) {
                h = null;
            }
            else {
                h = h2.substring(h2.indexOf(35) + 1);
            }
            c2.h = h;
            c2.b = G5.d.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, true);
            c2.c = G5.d.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, true);
            c2.g = null;
            c2.h = null;
            h = c2.toString();
        }
    Label_0515_Outer:
        while (true) {
            if (h.length() <= 2000) {
                break Label_0482;
            }
            if (h.charAt(2000) == '/') {
                h = h.substring(0, 2000);
                break Label_0482;
            }
            Label_0509: {
                break Label_0509;
                Label_0623: {
                    break Label_0623;
                    while (true) {
                        try {
                            final G5.d c3 = G5.d.c(h);
                            if (c3 == null) {
                                h = h.substring(0, 2000);
                                continue Label_0515_Outer;
                            }
                            final int length = c3.a.length();
                            final String h3 = c3.h;
                            final int index = h3.indexOf(47, length + 3);
                            if (h3.substring(index, H5.a.d(h3, "?#", index, h3.length())).lastIndexOf(47) >= 0) {
                                final int lastIndex = h.lastIndexOf(47, 1999);
                                if (lastIndex >= 0) {
                                    h = h.substring(0, lastIndex);
                                    continue Label_0515_Outer;
                                }
                            }
                            h = h.substring(0, 2000);
                            continue Label_0515_Outer;
                            final p f3 = this.F;
                            ((n)f3).l();
                            r.u((r)((n)f3).D, h);
                        }
                        catch (final IllegalArgumentException ex2) {
                            final G5.d c3 = d;
                            continue;
                        }
                        break;
                    }
                }
            }
            break;
        }
    }
}
