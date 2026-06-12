package E4;

import java.util.Locale;
import v.e;
import F4.w;
import m.l;
import Y0.h;

public final class c
{
    public int a;
    public int b;
    public boolean c;
    public final h d;
    
    public c(final l l) {
        final h d = new h((Object)l, (Object)"flutter/lifecycle", (Object)w.b, (Object)null);
        this.a = 0;
        this.b = 0;
        this.c = true;
        this.d = d;
    }
    
    public final void a(final int a, final boolean b) {
        final int a2 = this.a;
        if (a2 == a && b == this.c) {
            return;
        }
        if (a == 0 && a2 == 0) {
            this.c = b;
            return;
        }
        final int d = e.d(a);
        int b2 = 0;
        Label_0086: {
            if (d != 0) {
                b2 = 3;
                if (d == 1) {
                    if (b) {
                        b2 = 2;
                    }
                    break Label_0086;
                }
                if (d != 2 && d != 3 && d != 4) {
                    b2 = 0;
                    break Label_0086;
                }
            }
            b2 = a;
        }
        this.a = a;
        this.c = b;
        if (b2 == this.b) {
            return;
        }
        final StringBuilder sb = new StringBuilder("AppLifecycleState.");
        String s;
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 != 4) {
                        if (b2 != 5) {
                            throw null;
                        }
                        s = "PAUSED";
                    }
                    else {
                        s = "HIDDEN";
                    }
                }
                else {
                    s = "INACTIVE";
                }
            }
            else {
                s = "RESUMED";
            }
        }
        else {
            s = "DETACHED";
        }
        sb.append(s.toLowerCase(Locale.ROOT));
        this.d.t((Object)sb.toString(), (F4.c)null);
        this.b = b2;
    }
}
