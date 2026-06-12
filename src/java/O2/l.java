package O2;

import java.util.concurrent.CountDownLatch;

public final class l implements f, e, c
{
    public final int C;
    public final CountDownLatch D;
    
    public l(final int c) {
        switch (this.C = c) {
            default: {
                this.D = new CountDownLatch(1);
                return;
            }
            case 1: {
                this.D = new CountDownLatch(1);
            }
        }
    }
    
    public final void b() {
        switch (this.C) {
            default: {
                this.D.countDown();
                return;
            }
            case 0: {
                this.D.countDown();
            }
        }
    }
    
    public final void e(final Object o) {
        switch (this.C) {
            default: {
                this.D.countDown();
                return;
            }
            case 0: {
                this.D.countDown();
            }
        }
    }
    
    public final void f(final Exception ex) {
        switch (this.C) {
            default: {
                this.D.countDown();
                return;
            }
            case 0: {
                this.D.countDown();
            }
        }
    }
}
