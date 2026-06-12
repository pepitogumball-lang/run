package P1;

import com.google.android.gms.internal.ads.z7;
import com.google.android.gms.internal.ads.pd;
import F1.q;
import com.google.android.gms.internal.ads.D7;
import w2.e;
import J1.a;
import android.content.Context;
import com.google.android.gms.internal.ads.Iv;
import com.google.android.gms.internal.ads.y7;
import com.google.android.gms.internal.ads.rd;
import com.google.android.gms.internal.ads.FC;
import com.google.android.gms.internal.ads.Dk;
import com.google.android.gms.internal.ads.KC;
import com.google.android.gms.internal.ads.We;
import com.google.android.gms.internal.ads.GC;

public final class w implements GC
{
    public final int a;
    public final We b;
    public final KC c;
    
    public final Object d() {
        final KC c = this.c;
        final We b = this.b;
        switch (this.a) {
            default: {
                final Context b2 = b.b();
                final Dk dk = (Dk)((FC)c).d();
                final pd a = rd.a;
                y7.H((Object)a);
                return new A(b2, dk, (Iv)a);
            }
            case 1: {
                return new e((Context)b.d(), (a)((We)c).d());
            }
            case 0: {
                final Context b3 = b.b();
                final z7 a2 = D7.a;
                return new v(b3, q.d.a.m(), ((We)c).a());
            }
        }
    }
}
