package a3;

import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.zzdk;
import java.util.Map;
import java.util.List;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.f0;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.e0;
import K2.U0;

public final class e implements U0
{
    public final e0 a;
    
    public e(final e0 a) {
        this.a = a;
    }
    
    public final void a0(final Bundle bundle) {
        final e0 a = this.a;
        a.f((b0)new f0(a, bundle, 0));
    }
    
    public final void b0(final String s, final String s2, final Bundle bundle) {
        final e0 a = this.a;
        a.f((b0)new i0(a, s, s2, (Object)bundle, 1));
    }
    
    public final long c() {
        return this.a.b();
    }
    
    public final List c0(final String s, final String s2) {
        return this.a.d(s, s2);
    }
    
    public final Map d0(final String s, final String s2, final boolean b) {
        return this.a.e(s, s2, b);
    }
    
    public final String e() {
        final e0 a = this.a;
        final zzdk zzdk = new zzdk();
        a.f((b0)new o0(a, zzdk, 2));
        return zzdk.e0(500L);
    }
    
    public final void e0(final String s, final String s2, final Bundle bundle) {
        final e0 a = this.a;
        a.f((b0)new h0(a, s, s2, (Object)bundle, true, 2));
    }
    
    public final String f() {
        final e0 a = this.a;
        final zzdk zzdk = new zzdk();
        a.f((b0)new o0(a, zzdk, 0));
        return zzdk.e0(50L);
    }
    
    public final String i() {
        final e0 a = this.a;
        final zzdk zzdk = new zzdk();
        a.f((b0)new o0(a, zzdk, 4));
        return zzdk.e0(500L);
    }
    
    public final String j() {
        final e0 a = this.a;
        final zzdk zzdk = new zzdk();
        a.f((b0)new o0(a, zzdk, 1));
        return zzdk.e0(500L);
    }
    
    public final int p(final String s) {
        return this.a.a(s);
    }
    
    public final void v(final String s) {
        final e0 a = this.a;
        a.f((b0)new j0(a, s, 1));
    }
    
    public final void y(final String s) {
        final e0 a = this.a;
        a.f((b0)new j0(a, s, 2));
    }
}
