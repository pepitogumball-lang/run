package S3;

import com.google.protobuf.n;
import Z3.p;
import java.util.Map;
import Z3.r;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import Y3.j;
import R3.a;

public final class e
{
    public static final a f;
    public final f a;
    public final j b;
    public final ConcurrentHashMap c;
    public boolean d;
    public final boolean e;
    
    static {
        f = a.d();
    }
    
    public e(final String s, final String s2, final X3.f f, final j b) {
        this.d = false;
        this.e = false;
        this.c = new ConcurrentHashMap();
        this.b = b;
        final f a = new f(f);
        a.k(s);
        a.d(s2);
        this.a = a;
        a.J = true;
        if (!P3.a.e().p()) {
            S3.e.f.e("HttpMetric feature is disabled. URL %s", s);
            this.e = true;
        }
    }
    
    public final void a(String trim, final String s) {
        final ConcurrentHashMap c = this.c;
        final a f = S3.e.f;
        String trim2 = trim;
        String s2 = s;
        boolean b = false;
        Label_0268: {
            Label_0235: {
                try {
                    final String s3 = trim2 = trim.trim();
                    s2 = s;
                    trim = s.trim();
                    trim2 = s3;
                    s2 = trim;
                    if (!this.d) {
                        trim2 = s3;
                        s2 = trim;
                        if (!c.containsKey((Object)s3)) {
                            trim2 = s3;
                            s2 = trim;
                            if (c.size() >= 5) {
                                trim2 = s3;
                                s2 = trim;
                                trim2 = s3;
                                s2 = trim;
                                final Locale english = Locale.ENGLISH;
                                trim2 = s3;
                                s2 = trim;
                                final IllegalArgumentException ex = new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
                                trim2 = s3;
                                s2 = trim;
                                throw ex;
                            }
                        }
                        trim2 = s3;
                        s2 = trim;
                        T3.e.b(s3, trim);
                        trim2 = s3;
                        s2 = trim;
                        f.b("Setting attribute '%s' to %s on network request '%s'", s3, trim, ((r)((n)this.a.F).D).S());
                        b = true;
                        trim2 = s3;
                        break Label_0268;
                    }
                }
                catch (final Exception ex2) {
                    break Label_0235;
                }
                throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
            }
            final Exception ex2;
            f.c("Cannot set attribute '%s' with value '%s' (%s)", trim2, s2, ((Throwable)ex2).getMessage());
            b = false;
            trim = s2;
        }
        if (b) {
            c.put((Object)trim2, (Object)trim);
        }
    }
    
    public final void b() {
        if (this.e) {
            return;
        }
        final long a = this.b.a();
        final f a2 = this.a;
        a2.j(a);
        final ConcurrentHashMap c = this.c;
        final p f = a2.F;
        ((n)f).l();
        r.D((r)((n)f).D).clear();
        ((n)f).l();
        r.D((r)((n)f).D).putAll((Map)c);
        a2.b();
        this.d = true;
    }
}
