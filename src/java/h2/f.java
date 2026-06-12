package h2;

import android.os.Parcel;
import com.google.android.gms.common.internal.AccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor$Stub;
import f2.p;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import e2.d;
import com.google.android.gms.common.api.Scope;
import android.os.Parcelable$Creator;
import i2.a;

public final class f extends a
{
    public static final Parcelable$Creator<f> CREATOR;
    public static final Scope[] Q;
    public static final d[] R;
    public final int C;
    public final int D;
    public final int E;
    public String F;
    public IBinder G;
    public Scope[] H;
    public Bundle I;
    public Account J;
    public d[] K;
    public d[] L;
    public final boolean M;
    public final int N;
    public boolean O;
    public final String P;
    
    static {
        CREATOR = (Parcelable$Creator)new p(12);
        Q = new Scope[0];
        R = new d[0];
    }
    
    public f(final int c, final int d, final int e, final String f, final IBinder g, final Scope[] array, final Bundle bundle, final Account j, d[] l, final d[] array2, final boolean m, final int n, final boolean o, final String p14) {
        Scope[] q = array;
        if (array == null) {
            q = f.Q;
        }
        Bundle i;
        if ((i = bundle) == null) {
            i = new Bundle();
        }
        final d[] r = f.R;
        d[] k;
        if ((k = l) == null) {
            k = r;
        }
        if ((l = array2) == null) {
            l = r;
        }
        this.C = c;
        this.D = d;
        this.E = e;
        if ("com.google.android.gms".equals((Object)f)) {
            this.F = "com.google.android.gms";
        }
        else {
            this.F = f;
        }
        if (c < 2) {
            Account accountBinderSafe;
            if (g != null) {
                accountBinderSafe = AccountAccessor.getAccountBinderSafe(IAccountAccessor$Stub.asInterface(g));
            }
            else {
                accountBinderSafe = null;
            }
            this.J = accountBinderSafe;
        }
        else {
            this.G = g;
            this.J = j;
        }
        this.H = q;
        this.I = i;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p14;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        p.a(this, parcel, n);
    }
}
