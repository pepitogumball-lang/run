package t0;

import android.view.View;
import android.graphics.Rect;
import C.u;

public final class l extends u
{
    public final int D;
    
    public l(final r c, final int d) {
        this.D = d;
        new Rect();
        super.C = c;
    }
    
    public final int i(final View view) {
        switch (this.D) {
            default: {
                final s s = (s)view.getLayoutParams();
                super.C.getClass();
                return view.getBottom() + ((s)view.getLayoutParams()).a.bottom + s.bottomMargin;
            }
            case 0: {
                final s s2 = (s)view.getLayoutParams();
                super.C.getClass();
                return view.getRight() + ((s)view.getLayoutParams()).a.right + s2.rightMargin;
            }
        }
    }
    
    public final int k(final View view) {
        switch (this.D) {
            default: {
                final s s = (s)view.getLayoutParams();
                super.C.getClass();
                return view.getTop() - ((s)view.getLayoutParams()).a.top - s.topMargin;
            }
            case 0: {
                final s s2 = (s)view.getLayoutParams();
                super.C.getClass();
                return view.getLeft() - ((s)view.getLayoutParams()).a.left - s2.leftMargin;
            }
        }
    }
    
    public final int m() {
        switch (this.D) {
            default: {
                final r r = (r)super.C;
                return r.g - r.r();
            }
            case 0: {
                final r r2 = (r)super.C;
                return r2.f - r2.t();
            }
        }
    }
    
    public final int n() {
        switch (this.D) {
            default: {
                return ((r)super.C).u();
            }
            case 0: {
                return ((r)super.C).s();
            }
        }
    }
    
    public final int o() {
        switch (this.D) {
            default: {
                final r r = (r)super.C;
                return r.g - r.u() - r.r();
            }
            case 0: {
                final r r2 = (r)super.C;
                return r2.f - r2.s() - r2.t();
            }
        }
    }
}
