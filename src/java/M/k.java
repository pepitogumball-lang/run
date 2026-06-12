package m;

import O.e0;
import android.view.View;
import java.util.ArrayList;
import o.m1;
import com.google.android.gms.internal.auth.h;

public final class k extends h
{
    public final int d;
    public boolean e;
    public int f;
    public final Object g;
    
    public k(final l g) {
        this.d = 0;
        this.g = g;
        this.e = false;
        this.f = 0;
    }
    
    public k(final m1 g, final int f) {
        this.d = 1;
        this.g = g;
        this.f = f;
        this.e = false;
    }
    
    public final void a() {
        switch (this.d) {
            default: {
                if (!this.e) {
                    ((View)((m1)this.g).a).setVisibility(this.f);
                }
                return;
            }
            case 0: {
                final int f = this.f + 1;
                this.f = f;
                final l l = (l)this.g;
                if (f == ((ArrayList)l.E).size()) {
                    final h h = (h)l.G;
                    if (h != null) {
                        ((e0)h).a();
                    }
                    this.f = 0;
                    this.e = false;
                    l.D = false;
                }
            }
        }
    }
    
    public void b() {
        switch (this.d) {
            default: {
                return;
            }
            case 1: {
                this.e = true;
            }
        }
    }
    
    public final void c() {
        switch (this.d) {
            default: {
                ((View)((m1)this.g).a).setVisibility(0);
                return;
            }
            case 0: {
                if (!this.e) {
                    this.e = true;
                    final h h = (h)((l)this.g).G;
                    if (h != null) {
                        ((e0)h).c();
                    }
                }
            }
        }
    }
}
