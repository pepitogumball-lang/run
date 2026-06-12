package z0;

import java.io.File;
import f2.d;
import android.content.Context;
import y0.b;

public final class e implements b
{
    public final Context C;
    public final String D;
    public final d E;
    public final boolean F;
    public final Object G;
    public z0.d H;
    public boolean I;
    
    public e(final Context c, final String d, final d e, final boolean f) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = new Object();
    }
    
    public final z0.d a() {
        final Object g;
        monitorenter(g = this.G);
        Label_0091: {
            try {
                if (this.H != null) {
                    break Label_0091;
                }
                final z0.b[] array = { null };
                if (this.D != null && this.F) {
                    this.H = new z0.d(this.C, new File(this.C.getNoBackupFilesDir(), this.D).getAbsolutePath(), array, this.E);
                    break Label_0091;
                }
                break Label_0091;
            }
            finally {
                monitorexit(g);
                final z0.b[] array;
                this.H = new z0.d(this.C, this.D, array, this.E);
                this.H.setWriteAheadLoggingEnabled(this.I);
                final z0.d h = this.H;
                monitorexit(g);
                return h;
            }
        }
    }
    
    public final void close() {
        this.a().close();
    }
    
    public final z0.b e() {
        return this.a().b();
    }
    
    public final void setWriteAheadLoggingEnabled(final boolean b) {
        final Object g;
        monitorenter(g = this.G);
        Label_0031: {
            try {
                final z0.d h = this.H;
                if (h != null) {
                    h.setWriteAheadLoggingEnabled(b);
                }
                break Label_0031;
            }
            finally {
                monitorexit(g);
                this.I = b;
                monitorexit(g);
            }
        }
    }
}
