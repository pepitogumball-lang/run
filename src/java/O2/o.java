package O2;

import java.util.concurrent.Executor;

public final class o implements q, f, e, c
{
    public final int C;
    public final Executor D;
    public final Object E;
    public final Object F;
    
    public o(final Executor d, final c f) {
        this.C = 0;
        this.E = new Object();
        this.D = d;
        this.F = f;
    }
    
    public o(final Executor d, final d f) {
        this.C = 1;
        this.E = new Object();
        this.D = d;
        this.F = f;
    }
    
    public o(final Executor d, final e f) {
        this.C = 2;
        this.E = new Object();
        this.D = d;
        this.F = f;
    }
    
    public o(final Executor d, final f f) {
        this.C = 3;
        this.E = new Object();
        this.D = d;
        this.F = f;
    }
    
    public o(final Executor d, final h e, final t f) {
        this.C = 4;
        this.D = d;
        this.E = e;
        this.F = f;
    }
    
    @Override
    public final void a(final i i) {
        switch (this.C) {
            default: {
                this.D.execute((Runnable)new p(this, i, (byte)0));
                return;
            }
            case 3: {
                if (i.j()) {
                    final Object e;
                    monitorenter(e = this.E);
                    Label_0093: {
                        try {
                            if (this.F != null) {
                                break Label_0093;
                            }
                            monitorexit(e);
                        }
                        finally {
                            monitorexit(e);
                            monitorexit(e);
                            this.D.execute((Runnable)new p(this, i));
                        }
                    }
                }
                return;
            }
            case 2: {
                if (!i.j() && !((t)i).d) {
                    final Object e2;
                    monitorenter(e2 = this.E);
                    Label_0166: {
                        try {
                            if (this.F != null) {
                                break Label_0166;
                            }
                            monitorexit(e2);
                        }
                        finally {
                            monitorexit(e2);
                            monitorexit(e2);
                            this.D.execute((Runnable)new V2.o(this, i, (byte)0));
                        }
                    }
                }
                return;
            }
            case 1: {
                final Object e3;
                monitorenter(e3 = this.E);
                Label_0223: {
                    try {
                        if (this.F == null) {
                            monitorexit(e3);
                            return;
                        }
                        break Label_0223;
                    }
                    finally {
                        monitorexit(e3);
                        monitorexit(e3);
                        this.D.execute((Runnable)new V2.o(this, i));
                    }
                }
            }
            case 0: {
                if (((t)i).d) {
                    final Object e4;
                    monitorenter(e4 = this.E);
                    Label_0288: {
                        try {
                            if (this.F != null) {
                                break Label_0288;
                            }
                            monitorexit(e4);
                        }
                        finally {
                            monitorexit(e4);
                            monitorexit(e4);
                            this.D.execute((Runnable)new C2.h(this));
                        }
                    }
                }
            }
        }
    }
    
    public void b() {
        ((t)this.F).r();
    }
    
    public void e(final Object o) {
        ((t)this.F).o(o);
    }
    
    public void f(final Exception ex) {
        ((t)this.F).q(ex);
    }
}
