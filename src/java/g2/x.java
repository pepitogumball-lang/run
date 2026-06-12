package g2;

import f2.c;
import android.os.DeadObjectException;
import android.os.RemoteException;
import f2.k;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import com.google.android.gms.internal.auth.l;
import e2.b;
import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import c2.i;

public final class x extends A
{
    public final i b;
    
    public x(final int n, final i b) {
        super(n);
        this.b = b;
    }
    
    @Override
    public final void a(final Status status) {
        try {
            this.b.O(status);
        }
        catch (final IllegalStateException ex) {
            Log.w("ApiCallRunner", "Exception reporting failure", (Throwable)ex);
        }
    }
    
    @Override
    public final void b(final RuntimeException ex) {
        final String simpleName = ex.getClass().getSimpleName();
        final String localizedMessage = ((Throwable)ex).getLocalizedMessage();
        final StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf((Object)localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        final Status status = new Status(10, sb.toString(), (PendingIntent)null, (b)null);
        try {
            this.b.O(status);
        }
        catch (final IllegalStateException ex2) {
            Log.w("ApiCallRunner", "Exception reporting failure", (Throwable)ex2);
        }
    }
    
    @Override
    public final void c(final l l, final boolean b) {
        final Map map = (Map)l.D;
        final i b2 = this.b;
        map.put((Object)b2, (Object)b);
        ((BasePendingResult)b2).G((k)new D(l, (BasePendingResult)b2));
    }
    
    @Override
    public final void d(final o o) {
        try {
            final i b = this.b;
            final c d = o.D;
            b.getClass();
            try {
                b.N(d);
            }
            catch (final RemoteException ex) {
                b.O(new Status(8, ((Throwable)ex).getLocalizedMessage(), (PendingIntent)null, (b)null));
            }
            catch (final DeadObjectException ex2) {
                b.O(new Status(8, ((Throwable)ex2).getLocalizedMessage(), (PendingIntent)null, (b)null));
                throw ex2;
            }
        }
        catch (final RuntimeException ex3) {
            this.b(ex3);
        }
    }
}
