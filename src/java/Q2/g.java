package Q2;

import android.os.IInterface;
import android.content.ServiceConnection;
import android.os.IBinder$DeathRecipient;

public final class g extends d
{
    public final int D;
    public final Object E;
    
    @Override
    public final void a() {
        switch (this.D) {
            default: {
                final h h = (h)this.E;
                final i i = (i)h.D;
                i.b.e("unlinkToDeath", new Object[0]);
                ((IInterface)i.m).asBinder().unlinkToDeath((IBinder$DeathRecipient)i.j, 0);
                final i j = (i)h.D;
                j.m = null;
                j.g = false;
                return;
            }
            case 0: {
                final Object f;
                monitorenter(f = ((i)this.E).f);
                Label_0167: {
                    try {
                        if (((i)this.E).k.get() > 0 && ((i)this.E).k.decrementAndGet() > 0) {
                            ((i)this.E).b.e("Leaving the connection open for other ongoing calls.", new Object[0]);
                            monitorexit(f);
                            return;
                        }
                        break Label_0167;
                    }
                    finally {
                        monitorexit(f);
                        while (true) {
                            while (true) {
                                ((i)this.E).c();
                                monitorexit(f);
                                return;
                                final i k;
                                k.b.e("Unbind from service.", new Object[0]);
                                final i l = (i)this.E;
                                l.a.unbindService((ServiceConnection)l.l);
                                final i m = (i)this.E;
                                m.g = false;
                                m.m = null;
                                m.l = null;
                                continue;
                            }
                            final i k = (i)this.E;
                            iftrue(Label_0237:)(k.m == null);
                            continue;
                        }
                    }
                }
                break;
            }
        }
    }
}
