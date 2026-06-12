package K2;

public final class g1 implements Runnable
{
    public final int C;
    public final H D;
    public final h1 E;
    
    public final void run() {
        switch (this.C) {
            default: {
                final h1 e;
                monitorenter(e = this.E);
                Label_0110: {
                    try {
                        this.E.C = false;
                        if (!this.E.E.J()) {
                            this.E.E.j().O.f("Connected to remote service");
                            final b1 e2 = this.E.E;
                            final H d = this.D;
                            e2.v();
                            e2.F = d;
                            e2.N();
                            e2.M();
                        }
                        break Label_0110;
                    }
                    finally {
                        monitorexit(e);
                        monitorexit(e);
                    }
                }
            }
            case 0: {
                final h1 e3;
                monitorenter(e3 = this.E);
                Label_0205: {
                    try {
                        this.E.C = false;
                        if (!this.E.E.J()) {
                            this.E.E.j().P.f("Connected to service");
                            final b1 e4 = this.E.E;
                            final H d2 = this.D;
                            e4.v();
                            e4.F = d2;
                            e4.N();
                            e4.M();
                        }
                        break Label_0205;
                    }
                    finally {
                        monitorexit(e3);
                        monitorexit(e3);
                        return;
                    }
                }
                break;
            }
        }
    }
}
