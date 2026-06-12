package t0;

import android.view.ViewGroup;
import android.view.accessibility.AccessibilityRecord;
import X4.C;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.util.WeakHashMap;
import O.V;
import android.graphics.Rect;
import java.util.ArrayList;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.em;
import android.view.accessibility.AccessibilityEvent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.View$MeasureSpec;
import X.a;
import V4.G;
import f2.d;
import androidx.recyclerview.widget.RecyclerView;
import w2.e;

public abstract class r
{
    public e a;
    public RecyclerView b;
    public final d c;
    public final d d;
    public boolean e;
    public int f;
    public int g;
    
    public r() {
        final G g = new G(this, 21);
        final a a = new a(this, 21);
        this.c = new d((H)g);
        this.d = new d((H)a);
        this.e = false;
    }
    
    public static int e(int n, final int n2, final int n3) {
        final int mode = View$MeasureSpec.getMode(n);
        n = View$MeasureSpec.getSize(n);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                n = Math.max(n2, n3);
            }
            return n;
        }
        return Math.min(n, Math.max(n2, n3));
    }
    
    public static void v(final View view) {
        ((s)view.getLayoutParams()).getClass();
        throw null;
    }
    
    public static j w(final Context context, final AttributeSet set, final int n, final int n2) {
        final j j = new j(1);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, s0.a.a, n, n2);
        j.b = obtainStyledAttributes.getInt(0, 1);
        j.c = obtainStyledAttributes.getInt(9, 1);
        j.d = obtainStyledAttributes.getBoolean(8, false);
        j.e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return j;
    }
    
    public void A(final AccessibilityEvent accessibilityEvent) {
        final RecyclerView b = this.b;
        final em c = b.C;
        final z z0 = b.z0;
        if (b != null) {
            if (accessibilityEvent != null) {
                boolean scrollable;
                final boolean b2 = scrollable = true;
                if (!((View)b).canScrollVertically(1)) {
                    scrollable = b2;
                    if (!((View)this.b).canScrollVertically(-1)) {
                        scrollable = b2;
                        if (!((View)this.b).canScrollHorizontally(-1)) {
                            scrollable = (((View)this.b).canScrollHorizontally(1) && b2);
                        }
                    }
                }
                ((AccessibilityRecord)accessibilityEvent).setScrollable(scrollable);
                this.b.getClass();
            }
        }
    }
    
    public abstract void B(final Parcelable p0);
    
    public abstract Parcelable C();
    
    public void D(final int n) {
    }
    
    public final void E() {
        final int n = this.p() - 1;
        if (n < 0) {
            return;
        }
        RecyclerView.j(this.o(n));
        throw null;
    }
    
    public final void F(final em em) {
        final int size = ((ArrayList)em.c).size();
        final int n = size - 1;
        final ArrayList list = (ArrayList)em.c;
        if (n < 0) {
            list.clear();
            if (size > 0) {
                ((View)this.b).invalidate();
            }
            return;
        }
        m0.a.m(list.get(n));
        throw null;
    }
    
    public final boolean G(final RecyclerView recyclerView, final View view, final Rect rect, final boolean b, final boolean b2) {
        final int s = this.s();
        final int u = this.u();
        final int f = this.f;
        final int t = this.t();
        final int g = this.g;
        final int r = this.r();
        final int n = view.getLeft() + rect.left - view.getScrollX();
        final int n2 = view.getTop() + rect.top - view.getScrollY();
        final int width = rect.width();
        final int height = rect.height();
        final int n3 = n - s;
        int n4 = Math.min(0, n3);
        final int n5 = n2 - u;
        int n6 = Math.min(0, n5);
        final int n7 = width + n - (f - t);
        final int max = Math.max(0, n7);
        final int max2 = Math.max(0, height + n2 - (g - r));
        final RecyclerView b3 = this.b;
        final WeakHashMap a = V.a;
        if (((View)b3).getLayoutDirection() == 1) {
            if (max != 0) {
                n4 = max;
            }
            else {
                n4 = Math.max(n4, n7);
            }
        }
        else if (n4 == 0) {
            n4 = Math.min(n3, max);
        }
        if (n6 == 0) {
            n6 = Math.min(n5, max2);
        }
        final int[] array = { n4, n6 };
        final int n8 = array[0];
        final int n9 = array[1];
        Label_0454: {
            if (!b2) {
                break Label_0454;
            }
            final View focusedChild = ((ViewGroup)recyclerView).getFocusedChild();
            if (focusedChild != null) {
                final int s2 = this.s();
                final int u2 = this.u();
                final int f2 = this.f;
                final int t2 = this.t();
                final int g2 = this.g;
                final int r2 = this.r();
                final Rect i = this.b.I;
                final int[] j0 = RecyclerView.J0;
                final s s3 = (s)focusedChild.getLayoutParams();
                final Rect a2 = s3.a;
                i.set(focusedChild.getLeft() - a2.left - ((ViewGroup$MarginLayoutParams)s3).leftMargin, focusedChild.getTop() - a2.top - ((ViewGroup$MarginLayoutParams)s3).topMargin, focusedChild.getRight() + a2.right + ((ViewGroup$MarginLayoutParams)s3).rightMargin, focusedChild.getBottom() + a2.bottom + ((ViewGroup$MarginLayoutParams)s3).bottomMargin);
                if (i.left - n8 < f2 - t2 && i.right - n8 > s2 && i.top - n9 < g2 - r2 && i.bottom - n9 > u2) {
                    break Label_0454;
                }
            }
            return false;
        }
        if (n8 == 0 && n9 == 0) {
            return false;
        }
        if (b) {
            recyclerView.scrollBy(n8, n9);
        }
        else {
            recyclerView.r(n8, n9);
        }
        return true;
    }
    
    public final void H() {
        final RecyclerView b = this.b;
        if (b != null) {
            b.requestLayout();
        }
    }
    
    public final void I(final RecyclerView b) {
        if (b == null) {
            this.b = null;
            this.a = null;
            this.f = 0;
            this.g = 0;
        }
        else {
            this.b = b;
            this.a = b.F;
            this.f = ((View)b).getWidth();
            this.g = ((View)b).getHeight();
        }
    }
    
    public abstract void a(final String p0);
    
    public abstract boolean b();
    
    public abstract boolean c();
    
    public boolean d(final s s) {
        return s != null;
    }
    
    public abstract int f(final z p0);
    
    public abstract void g(final z p0);
    
    public abstract int h(final z p0);
    
    public abstract int i(final z p0);
    
    public abstract void j(final z p0);
    
    public abstract int k(final z p0);
    
    public abstract s l();
    
    public s m(final Context context, final AttributeSet set) {
        return new s(context, set);
    }
    
    public s n(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof s) {
            return new s((s)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new s((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new s(viewGroup$LayoutParams);
    }
    
    public final View o(int n) {
        final e a = this.a;
        View child;
        if (a != null) {
            final int n2 = -1;
            int n3 = 0;
            Label_0105: {
                if (n < 0) {
                    n3 = n2;
                }
                else {
                    final int childCount = ((ViewGroup)((C)a.D).D).getChildCount();
                    int n4 = n;
                    while (true) {
                        n3 = n2;
                        if (n4 >= childCount) {
                            break;
                        }
                        final E1.d d = (E1.d)a.E;
                        final int n5 = n - (n4 - d.i(n4));
                        if (n5 == 0) {
                            n = n4;
                            while (true) {
                                n3 = n;
                                if (!d.l(n)) {
                                    break Label_0105;
                                }
                                ++n;
                            }
                        }
                        else {
                            n4 += n5;
                        }
                    }
                }
            }
            child = ((ViewGroup)((C)a.D).D).getChildAt(n3);
        }
        else {
            child = null;
        }
        return child;
    }
    
    public final int p() {
        final e a = this.a;
        int n;
        if (a != null) {
            n = ((ViewGroup)((C)a.D).D).getChildCount() - ((ArrayList)a.F).size();
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public int q(final em em, final z z) {
        final RecyclerView b = this.b;
        if (b != null) {
            b.getClass();
        }
        return 1;
    }
    
    public final int r() {
        final RecyclerView b = this.b;
        int paddingBottom;
        if (b != null) {
            paddingBottom = ((View)b).getPaddingBottom();
        }
        else {
            paddingBottom = 0;
        }
        return paddingBottom;
    }
    
    public final int s() {
        final RecyclerView b = this.b;
        int paddingLeft;
        if (b != null) {
            paddingLeft = ((View)b).getPaddingLeft();
        }
        else {
            paddingLeft = 0;
        }
        return paddingLeft;
    }
    
    public final int t() {
        final RecyclerView b = this.b;
        int paddingRight;
        if (b != null) {
            paddingRight = ((View)b).getPaddingRight();
        }
        else {
            paddingRight = 0;
        }
        return paddingRight;
    }
    
    public final int u() {
        final RecyclerView b = this.b;
        int paddingTop;
        if (b != null) {
            paddingTop = ((View)b).getPaddingTop();
        }
        else {
            paddingTop = 0;
        }
        return paddingTop;
    }
    
    public int x(final em em, final z z) {
        final RecyclerView b = this.b;
        if (b != null) {
            b.getClass();
        }
        return 1;
    }
    
    public abstract boolean y();
    
    public abstract void z(final RecyclerView p0);
}
