package L;

import F1.n;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.fd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import java.util.concurrent.Callable;

public final class c implements Callable
{
    public final int a;
    public final Object b = b;
    public final Object c = c;
    public final Object d = d;
    public final int e = e;
    
    public final Object call() {
        switch (this.a) {
            default: {
                return zzau.zzr((zzau)this.b, (fd)this.c, this.e, (Bundle)this.d);
            }
            case 1: {
                e e;
                try {
                    f.a((String)this.b, (Context)this.c, (n)this.d, this.e);
                }
                finally {
                    e = new e(-3);
                }
                return e;
            }
            case 0: {
                return f.a((String)this.b, (Context)this.c, (n)this.d, this.e);
            }
        }
    }
}
