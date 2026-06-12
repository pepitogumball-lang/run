package V2;

import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.play_billing.l;
import java.util.logging.Logger;

public final class p
{
    public final int a;
    public final String b;
    public volatile Logger c;
    public final Object d;
    
    public p() {
        this.a = 0;
        this.d = new Object();
        this.b = n.class.getName();
    }
    
    public p(final Class clazz, final int a) {
        switch (this.a = a) {
            default: {
                this.d = new Object();
                this.b = clazz.getName();
                return;
            }
            case 2: {
                this.d = new Object();
                this.b = clazz.getName();
            }
        }
    }
    
    public Logger a() {
        final Logger c = this.c;
        if (c != null) {
            return c;
        }
        final Object d;
        monitorenter(d = this.d);
        Label_0037: {
            try {
                final Logger c2 = this.c;
                if (c2 != null) {
                    monitorexit(d);
                    return c2;
                }
                break Label_0037;
            }
            finally {
                monitorexit(d);
                final Logger logger = Logger.getLogger(this.b);
                this.c = logger;
                monitorexit(d);
                return logger;
            }
        }
    }
    
    public Logger b() {
        switch (this.a) {
            default: {
                Logger c = this.c;
                if (c != null) {
                    return c;
                }
                final l l;
                monitorenter(l = (l)this.d);
                Label_0066: {
                    try {
                        c = this.c;
                        if (c != null) {
                            monitorexit(l);
                            return c;
                        }
                        break Label_0066;
                    }
                    finally {
                        monitorexit(l);
                        c = Logger.getLogger(this.b);
                        this.c = c;
                        monitorexit(l);
                        return c;
                    }
                }
            }
            case 1: {
                Logger c2 = this.c;
                if (c2 != null) {
                    return c2;
                }
                final st st;
                monitorenter(st = (st)this.d);
                Label_0132: {
                    try {
                        c2 = this.c;
                        if (c2 != null) {
                            monitorexit(st);
                            return c2;
                        }
                        break Label_0132;
                    }
                    finally {
                        monitorexit(st);
                        return c2;
                        c2 = Logger.getLogger(this.b);
                        this.c = c2;
                        monitorexit(st);
                        return c2;
                    }
                }
                break;
            }
        }
    }
}
