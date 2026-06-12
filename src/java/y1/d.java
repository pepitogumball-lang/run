package y1;

import F1.o;
import com.google.android.gms.internal.ads.w8;
import F1.L0;
import F1.u;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.zzbsd;
import O1.b;
import android.os.RemoteException;
import F1.y;
import com.google.android.gms.ads.internal.client.zzff;
import F1.H0;
import com.google.android.gms.ads.internal.client.zzbs;
import J1.j;
import F1.n;
import F1.k;
import com.google.android.gms.internal.ads.zzbok;
import F1.p;
import F1.A;
import android.content.Context;

public final class d
{
    public final Context a;
    public final A b;
    
    public d(final Context a, final String s) {
        h2.A.i("context cannot be null", (Object)a);
        final n b = p.f.b;
        final zzbok zzbok = new zzbok();
        b.getClass();
        final A b2 = (A)((o)new k(b, a, s, zzbok)).d(a, false);
        this.a = a;
        this.b = b2;
    }
    
    public final e a() {
        final Context a = this.a;
        try {
            return new e(a, this.b.b());
        }
        catch (final RemoteException ex) {
            j.g("Failed to build AdLoader.", (Throwable)ex);
            return new e(a, (y)new H0((zzff)new zzbs()));
        }
    }
    
    public final void b(final b b) {
        try {
            this.b.Q0((d9)new zzbsd(b));
        }
        catch (final RemoteException ex) {
            j.j("Failed to add google native ad listener", (Throwable)ex);
        }
    }
    
    public final void c(final c c) {
        try {
            this.b.L3((u)new zzg(c));
        }
        catch (final RemoteException ex) {
            j.j("Failed to set AdListener.", (Throwable)ex);
        }
    }
    
    public final void d(final O1.c c) {
        Label_0107: {
            A b = null;
            boolean a = false;
            boolean c2 = false;
            int d = 0;
            L0 l0 = null;
            Label_0060: {
                try {
                    b = this.b;
                    a = c.a;
                    c2 = c.c;
                    d = c.d;
                    final t e = c.e;
                    if (e != null) {
                        l0 = new L0(e);
                        break Label_0060;
                    }
                }
                catch (final RemoteException ex) {
                    break Label_0107;
                }
                l0 = null;
            }
            b.Y3(new w8(4, a, -1, c2, d, l0, c.f, c.b, c.h, c.g, c.i - 1));
            return;
        }
        final RemoteException ex;
        j.j("Failed to specify native ad options", (Throwable)ex);
    }
}
