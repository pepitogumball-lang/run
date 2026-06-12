package g2;

import e2.d;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.l;
import f2.e;
import com.google.android.gms.common.api.Status;
import O2.j;

public final class z extends v
{
    public final j b;
    
    public z(final j b) {
        super(4);
        this.b = b;
    }
    
    @Override
    public final void a(final Status status) {
        this.b.c((Exception)new e(status));
    }
    
    @Override
    public final void b(final RuntimeException ex) {
        this.b.c((Exception)ex);
    }
    
    @Override
    public final void d(final o o) {
        try {
            this.h(o);
        }
        catch (final RuntimeException ex) {
            this.b.c((Exception)ex);
        }
        catch (final RemoteException ex2) {
            this.a(A.e(ex2));
        }
        catch (final DeadObjectException ex3) {
            this.a(A.e((RemoteException)ex3));
            throw ex3;
        }
    }
    
    @Override
    public final d[] f(final o o) {
        if (o.H.get((Object)null) == null) {
            return null;
        }
        throw new ClassCastException();
    }
    
    @Override
    public final boolean g(final o o) {
        if (o.H.get((Object)null) == null) {
            return false;
        }
        throw new ClassCastException();
    }
    
    public final void h(final o o) {
        if (o.H.remove((Object)null) == null) {
            this.b.d((Object)Boolean.FALSE);
            return;
        }
        throw new ClassCastException();
    }
}
