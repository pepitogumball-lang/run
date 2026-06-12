package U4;

import java.util.Set;
import O2.t;
import C2.x;
import n3.u0;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Callable;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.HashSet;
import java.util.Iterator;
import f2.g;
import android.os.Looper;
import java.util.Collection;
import java.util.Arrays;
import com.google.android.gms.common.api.Scope;
import h2.A;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Objects;
import Y0.h;
import C2.m;
import java.util.List;
import b2.a;
import K2.D;
import C2.b;
import io.flutter.embedding.android.FlutterActivity;
import android.content.Context;
import F4.r;

public final class f implements r
{
    public final Context C;
    public FlutterActivity D;
    public final b E;
    public final D F;
    public a G;
    public List H;
    public m I;
    
    public f(final Context c, final D f) {
        this.E = new b();
        this.C = c;
        this.F = f;
    }
    
    public static void f(final F4.f f, final f f2) {
        final String f3 = m0.a.f("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.init", "");
        final j d = j.d;
        final h h = new h((Object)f, (Object)f3, (Object)d, (Object)null);
        if (f2 != null) {
            h.u((F4.b)new e(f2, 3));
        }
        else {
            h.u((F4.b)null);
        }
        final h h2 = new h((Object)f, (Object)m0.a.f("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signInSilently", ""), (Object)d, (Object)null);
        if (f2 != null) {
            h2.u((F4.b)new e(f2, 4));
        }
        else {
            h2.u((F4.b)null);
        }
        final h h3 = new h((Object)f, (Object)m0.a.f("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signIn", ""), (Object)d, (Object)null);
        if (f2 != null) {
            h3.u((F4.b)new e(f2, 5));
        }
        else {
            h3.u((F4.b)null);
        }
        final h h4 = new h((Object)f, (Object)m0.a.f("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getAccessToken", ""), (Object)d, (Object)null);
        if (f2 != null) {
            h4.u((F4.b)new e(f2, 6));
        }
        else {
            h4.u((F4.b)null);
        }
        final h h5 = new h((Object)f, (Object)m0.a.f("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signOut", ""), (Object)d, (Object)null);
        if (f2 != null) {
            h5.u((F4.b)new e(f2, 7));
        }
        else {
            h5.u((F4.b)null);
        }
        final h h6 = new h((Object)f, (Object)m0.a.f("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.disconnect", ""), (Object)d, (Object)null);
        if (f2 != null) {
            h6.u((F4.b)new e(f2, 8));
        }
        else {
            h6.u((F4.b)null);
        }
        final h h7 = new h((Object)f, (Object)m0.a.f("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.isSignedIn", ""), (Object)d, (Object)null);
        if (f2 != null) {
            h7.u((F4.b)new e(f2, 9));
        }
        else {
            h7.u((F4.b)null);
        }
        final h h8 = new h((Object)f, (Object)m0.a.f("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthCache", ""), (Object)d, (Object)null);
        if (f2 != null) {
            h8.u((F4.b)new e(f2, 10));
        }
        else {
            h8.u((F4.b)null);
        }
        final h h9 = new h((Object)f, (Object)m0.a.f("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.requestScopes", ""), (Object)d, (Object)null);
        if (f2 != null) {
            h9.u((F4.b)new e(f2, 11));
        }
        else {
            h9.u((F4.b)null);
        }
    }
    
    public final void a(final String s, final k k, final n n, final L4.h h, final L4.h h2, final Object o) {
        if (this.I == null) {
            this.I = new m(s, k, n, h, h2, o);
            return;
        }
        final StringBuilder sb = new StringBuilder("Concurrent operations detected: ");
        sb.append((String)this.I.D);
        sb.append(", ");
        sb.append(s);
        throw new IllegalStateException(sb.toString());
    }
    
    public final void b(final String s, final String s2) {
        final m i = this.I;
        final n n = (n)i.E;
        if (n != null) {
            n.a(new U4.h(s, s2));
        }
        else {
            Object o = i.H;
            if (o == null) {
                o = i.F;
                if (o == null) {
                    o = i.G;
                }
            }
            Objects.requireNonNull(o);
            ((k)o).a(new U4.h(s, s2));
        }
        this.I = null;
    }
    
    public final void c(final i i) {
        b2.b b = null;
        Label_0074: {
            Label_0049: {
                try {
                    final int ordinal = i.b.ordinal();
                    if (ordinal == 0) {
                        break Label_0049;
                    }
                    if (ordinal == 1) {
                        b = new b2.b(GoogleSignInOptions.N);
                        break Label_0074;
                    }
                }
                catch (final Exception ex) {
                    throw new U4.h("exception", ((Throwable)ex).getMessage());
                }
                throw new IllegalStateException("Unknown signInOption");
            }
            b = new b2.b(GoogleSignInOptions.M);
            b.a.add((Object)GoogleSignInOptions.O);
        }
        String s2;
        final String s = s2 = i.e;
        if (!a.a.p(i.d)) {
            s2 = s;
            if (a.a.p(s)) {
                Log.w("google_sign_in", "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning.");
                s2 = i.d;
            }
        }
        final boolean p = a.a.p(s2);
        final Context c = this.C;
        String string = s2;
        if (p) {
            final int identifier = c.getResources().getIdentifier("default_web_client_id", "string", c.getPackageName());
            string = s2;
            if (identifier != 0) {
                string = c.getString(identifier);
            }
        }
        if (!a.a.p(string)) {
            b.d = true;
            A.e(string);
            final String e = b.e;
            A.a("two different server client ids provided", e == null || e.equals((Object)string));
            b.e = string;
            final boolean booleanValue = i.f;
            b.b = true;
            A.e(string);
            final String e2 = b.e;
            A.a("two different server client ids provided", e2 == null || e2.equals((Object)string));
            b.e = string;
            b.c = booleanValue;
        }
        final List a = i.a;
        this.H = a;
        final Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            final Scope scope = new Scope(1, (String)iterator.next());
            final HashSet a2 = b.a;
            a2.add((Object)scope);
            ((Set)a2).addAll((Collection)Arrays.asList((Object[])new Scope[0]));
        }
        if (!a.a.p(i.c)) {
            final String c2 = i.c;
            A.e(c2);
            b.g = c2;
        }
        final D f = this.F;
        final GoogleSignInOptions a3 = b.a();
        f.getClass();
        this.G = (a)new g(c, (FlutterActivity)null, X1.a.a, (f2.b)a3, new f2.f((c0.b)new Object(), Looper.getMainLooper()));
    }
    
    public final void d(final GoogleSignInAccount googleSignInAccount) {
        final String e = googleSignInAccount.E;
        final String h = googleSignInAccount.H;
        final Uri g = googleSignInAccount.G;
        String string;
        if (g != null) {
            string = g.toString();
        }
        else {
            string = null;
        }
        final Object o = new Object();
        ((U4.m)o).a = googleSignInAccount.F;
        if (e == null) {
            throw new IllegalStateException("Nonnull field \"email\" is null.");
        }
        ((U4.m)o).b = e;
        final String c = googleSignInAccount.C;
        if (c != null) {
            ((U4.m)o).c = c;
            ((U4.m)o).d = string;
            ((U4.m)o).e = googleSignInAccount.D;
            ((U4.m)o).f = h;
            final k k = (k)this.I.H;
            Objects.requireNonNull((Object)k);
            k.success(o);
            this.I = null;
            return;
        }
        throw new IllegalStateException("Nonnull field \"id\" is null.");
    }
    
    public final void e(final O2.i i) {
        Label_0025: {
            try {
                this.d((GoogleSignInAccount)i.h(f2.e.class));
            }
            catch (final O2.g g) {
                break Label_0025;
            }
            catch (final f2.e e) {
                final int c = e.C.C;
                String s;
                if (c != 4) {
                    if (c != 7) {
                        if (c != 12501) {
                            s = "sign_in_failed";
                        }
                        else {
                            s = "sign_in_canceled";
                        }
                    }
                    else {
                        s = "network_error";
                    }
                }
                else {
                    s = "sign_in_required";
                }
                this.b(s, e.toString());
                final O2.g g;
                this.b("exception", g.toString());
            }
        }
    }
    
    public final boolean onActivityResult(final int n, final int n2, final Intent intent) {
        final m i = this.I;
        boolean b = false;
        if (i == null) {
            return false;
        }
        switch (n) {
            default: {
                return false;
            }
            case 53295: {
                if (n2 == -1) {
                    b = true;
                }
                final L4.h h = (L4.h)this.I.F;
                Objects.requireNonNull((Object)h);
                h.success((Object)b);
                this.I = null;
                return true;
            }
            case 53294: {
                if (n2 == -1) {
                    final L4.h h2 = (L4.h)i.G;
                    Objects.requireNonNull((Object)h2);
                    final Object j = this.I.I;
                    Objects.requireNonNull(j);
                    final String s = (String)j;
                    this.I = null;
                    this.E.A((Callable)new c(this, s, 0), (U4.a)new d(this, h2, Boolean.FALSE, s));
                }
                else {
                    this.b("failed_to_recover_auth", "Failed attempt to recover authentication");
                }
                return true;
            }
            case 53293: {
                if (intent != null) {
                    final x a = c2.j.a;
                    final Status k = Status.I;
                    final Status status = (Status)intent.getParcelableExtra("googleSignInStatus");
                    final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)intent.getParcelableExtra("googleSignInAccount");
                    b2.c c;
                    if (googleSignInAccount == null) {
                        Status status2;
                        if (status == null) {
                            status2 = k;
                        }
                        else {
                            status2 = status;
                        }
                        c = new b2.c((GoogleSignInAccount)null, status2);
                    }
                    else {
                        c = new b2.c(googleSignInAccount, Status.G);
                    }
                    final Status c2 = c.C;
                    t t = null;
                    Label_0312: {
                        if (c2.h()) {
                            final GoogleSignInAccount d = c.D;
                            if (d != null) {
                                t = u0.m(d);
                                break Label_0312;
                            }
                        }
                        t = u0.l(A.m(c2));
                    }
                    this.e(t);
                }
                else {
                    this.b("sign_in_failed", "Signin failed");
                }
                return true;
            }
        }
    }
}
