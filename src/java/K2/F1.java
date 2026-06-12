package K2;

import i2.a;
import android.os.RemoteException;

public final class f1 implements Runnable
{
    public final int C;
    public final B1 D;
    public final b1 E;
    
    public final void run() {
        switch (this.C) {
            default: {
                final B1 d = this.D;
                final b1 e = this.E;
                final H f = e.F;
                if (f == null) {
                    e.j().H.f("Failed to send consent settings to service");
                }
                else {
                    try {
                        f.F3(d);
                        e.N();
                    }
                    catch (final RemoteException ex) {
                        e.j().H.g("Failed to send consent settings to the service", ex);
                    }
                }
                return;
            }
            case 3: {
                final B1 d2 = this.D;
                final b1 e2 = this.E;
                final H f2 = e2.F;
                if (f2 == null) {
                    e2.j().H.f("Failed to send measurementEnabled to service");
                }
                else {
                    try {
                        f2.U0(d2);
                        e2.N();
                    }
                    catch (final RemoteException ex2) {
                        e2.j().H.g("Failed to send measurementEnabled to the service", ex2);
                    }
                }
                return;
            }
            case 2: {
                final B1 d3 = this.D;
                final b1 e3 = this.E;
                final H f3 = e3.F;
                if (f3 == null) {
                    e3.j().K.f("Failed to send app backgrounded");
                }
                else {
                    try {
                        f3.M2(d3);
                        e3.N();
                    }
                    catch (final RemoteException ex3) {
                        e3.j().H.g("Failed to send app backgrounded to the service", ex3);
                    }
                }
                return;
            }
            case 1: {
                final B1 d4 = this.D;
                final b1 e4 = this.E;
                final H f4 = e4.F;
                if (f4 == null) {
                    e4.j().H.f("Discarding data. Failed to send app launch");
                }
                else {
                    try {
                        f4.n1(d4);
                        ((n0)e4.C).p().F();
                        e4.D(f4, null, d4);
                        e4.N();
                    }
                    catch (final RemoteException ex4) {
                        e4.j().H.g("Failed to send app launch to the service", ex4);
                    }
                }
                return;
            }
            case 0: {
                final B1 d5 = this.D;
                final b1 e5 = this.E;
                final H f5 = e5.F;
                if (f5 == null) {
                    e5.j().H.f("Failed to reset data on the service: not connected to service");
                }
                else {
                    try {
                        f5.U4(d5);
                    }
                    catch (final RemoteException ex5) {
                        e5.j().H.g("Failed to reset data on the service: remote exception", ex5);
                    }
                    e5.N();
                }
            }
        }
    }
}
