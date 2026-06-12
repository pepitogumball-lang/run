package F1;

import y1.s;
import android.os.RemoteException;
import J1.j;
import y1.l;
import y1.c;

public final class w0 extends c
{
    public final Object C;
    public c D;
    public final x0 E;
    
    public w0(final x0 e) {
        this.E = e;
        this.C = new Object();
    }
    
    @Override
    public final void a() {
        final Object c;
        monitorenter(c = this.C);
        Label_0029: {
            try {
                final c d = this.D;
                if (d != null) {
                    d.a();
                }
                break Label_0029;
            }
            finally {
                monitorexit(c);
                monitorexit(c);
            }
        }
    }
    
    @Override
    public final void b(final l l) {
        final x0 e = this.E;
        final s c = e.c;
        final D i = e.i;
        q0 j = null;
        if (i != null) {
            try {
                j = i.l();
            }
            catch (final RemoteException ex) {
                J1.j.k("#007 Could not call remote method.", (Exception)ex);
                j = j;
            }
        }
        c.a(j);
        final Object c2;
        monitorenter(c2 = this.C);
        Label_0083: {
            try {
                final c d = this.D;
                if (d != null) {
                    d.b(l);
                }
                break Label_0083;
            }
            finally {
                monitorexit(c2);
                monitorexit(c2);
            }
        }
    }
    
    @Override
    public final void d() {
        final Object c;
        monitorenter(c = this.C);
        Label_0029: {
            try {
                final c d = this.D;
                if (d != null) {
                    d.d();
                }
                break Label_0029;
            }
            finally {
                monitorexit(c);
                monitorexit(c);
            }
        }
    }
    
    @Override
    public final void g() {
        final x0 e = this.E;
        final s c = e.c;
        final D i = e.i;
        q0 l = null;
        if (i != null) {
            try {
                l = i.l();
            }
            catch (final RemoteException ex) {
                j.k("#007 Could not call remote method.", (Exception)ex);
                l = l;
            }
        }
        c.a(l);
        final Object c2;
        monitorenter(c2 = this.C);
        Label_0080: {
            try {
                final c d = this.D;
                if (d != null) {
                    d.g();
                }
                break Label_0080;
            }
            finally {
                monitorexit(c2);
                monitorexit(c2);
            }
        }
    }
    
    @Override
    public final void k() {
        final Object c;
        monitorenter(c = this.C);
        Label_0029: {
            try {
                final c d = this.D;
                if (d != null) {
                    d.k();
                }
                break Label_0029;
            }
            finally {
                monitorexit(c);
                monitorexit(c);
            }
        }
    }
    
    @Override
    public final void w() {
        final Object c;
        monitorenter(c = this.C);
        Label_0029: {
            try {
                final c d = this.D;
                if (d != null) {
                    d.w();
                }
                break Label_0029;
            }
            finally {
                monitorexit(c);
                monitorexit(c);
            }
        }
    }
}
