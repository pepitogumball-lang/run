package C;

import android.os.BaseBundle;
import K2.J1;
import K2.a0;
import K2.d;
import com.google.android.gms.internal.ads.rd;
import V2.q;
import K2.k0;
import K2.x0;
import K2.P;
import android.view.View;
import R3.b;
import q2.a;
import com.google.ads.mediation.admob.AdMobAdapter;
import android.os.Bundle;
import android.content.Context;
import t0.l;
import t0.r;
import h2.A;
import K2.n0;
import java.util.HashSet;
import F1.u0;
import C2.h;
import K2.w0;

public abstract class u implements w0
{
    public Object C;
    
    public u(final int n) {
        switch (n) {
            default: {
                this.C = new h(this, 8);
                return;
            }
            case 4: {
                final u0 c = new u0();
                this.C = c;
                ((HashSet)c.e).add((Object)"B3EEABB8EE11C2BE770B684D95219ECB");
            }
        }
    }
    
    public u(final n0 c) {
        A.h((Object)c);
        this.C = c;
    }
    
    public static u f(final r r, final int n) {
        if (n == 0) {
            return (u)new l(r, 0);
        }
        if (n == 1) {
            return (u)new l(r, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }
    
    @Override
    public Context a() {
        return ((n0)this.C).C;
    }
    
    public u b(final Bundle bundle, final Class clazz) {
        final u0 u0 = (u0)this.C;
        u0.getClass();
        ((Bundle)u0.g).putBundle(clazz.getName(), bundle);
        if (clazz.equals(AdMobAdapter.class) && ((BaseBundle)bundle).getBoolean("_emulatorLiveAds")) {
            ((HashSet)u0.e).remove((Object)"B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return this.p();
    }
    
    @Override
    public a d() {
        return ((n0)this.C).P;
    }
    
    public abstract void e(final L3.A p0);
    
    public abstract String g();
    
    @Override
    public b h() {
        return ((n0)this.C).H;
    }
    
    public abstract int i(final View p0);
    
    @Override
    public P j() {
        final P k = ((n0)this.C).K;
        n0.f((x0)k);
        return k;
    }
    
    public abstract int k(final View p0);
    
    @Override
    public k0 l() {
        final k0 l = ((n0)this.C).L;
        n0.f((x0)l);
        return l;
    }
    
    public abstract int m();
    
    public abstract int n();
    
    public abstract int o();
    
    public abstract u p();
    
    public abstract void q();
    
    public q r() {
        return rd.a.a((Runnable)this.C);
    }
    
    public d s() {
        return ((n0)this.C).I;
    }
    
    public a0 t() {
        final a0 j = ((n0)this.C).J;
        n0.c((u)j);
        return j;
    }
    
    public J1 u() {
        final J1 n = ((n0)this.C).N;
        n0.c((u)n);
        return n;
    }
    
    public void v() {
        final k0 l = ((n0)this.C).L;
        n0.f((x0)l);
        l.v();
    }
}
