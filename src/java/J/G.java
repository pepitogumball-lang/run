package j;

import android.widget.AbsListView;
import android.widget.ListView;
import android.app.Dialog;
import m.b;
import android.widget.ListAdapter;
import java.util.WeakHashMap;
import androidx.appcompat.app.AlertController$RecycleListView;
import android.graphics.drawable.Drawable;
import H1.d;
import android.view.Window;
import O.K;
import O.V;
import android.widget.ImageView;
import android.widget.LinearLayout$LayoutParams;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import o.v0;
import android.widget.FrameLayout;
import android.os.Bundle;
import android.view.Window$Callback;
import O.l;
import a.a;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.util.TypedValue;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.content.DialogInterface;
import androidx.activity.o;

public final class g extends o implements DialogInterface, k
{
    public y F;
    public final z G;
    public final f H;
    
    public g(final ContextThemeWrapper contextThemeWrapper, int f) {
        f = f((Context)contextThemeWrapper, f);
        int resourceId;
        if (f == 0) {
            final TypedValue typedValue = new TypedValue();
            ((Context)contextThemeWrapper).getTheme().resolveAttribute(2130903229, typedValue, true);
            resourceId = typedValue.resourceId;
        }
        else {
            resourceId = f;
        }
        super((Context)contextThemeWrapper, resourceId);
        this.G = new z(this);
        final j.o d = this.d();
        int resourceId2 = f;
        if (f == 0) {
            final TypedValue typedValue2 = new TypedValue();
            ((Context)contextThemeWrapper).getTheme().resolveAttribute(2130903229, typedValue2, true);
            resourceId2 = typedValue2.resourceId;
        }
        ((y)d).v0 = resourceId2;
        d.e();
        this.H = new f(((Dialog)this).getContext(), this, ((Dialog)this).getWindow());
    }
    
    public static int f(final Context context, final int n) {
        if ((n >>> 24 & 0xFF) >= 1) {
            return n;
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130903087, typedValue, true);
        return typedValue.resourceId;
    }
    
    public final void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final y y = (y)this.d();
        y.x();
        ((ViewGroup)((View)y.c0).findViewById(16908290)).addView(view, viewGroup$LayoutParams);
        y.O.a(y.N.getCallback());
    }
    
    public final j.o d() {
        if (this.F == null) {
            final E c = j.o.C;
            this.F = new y(((Dialog)this).getContext(), ((Dialog)this).getWindow(), (k)this, this);
        }
        return this.F;
    }
    
    public final void dismiss() {
        super.dismiss();
        this.d().g();
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return a.f((l)this.G, ((Dialog)this).getWindow().getDecorView(), (Window$Callback)this, keyEvent);
    }
    
    public final void e(final Bundle bundle) {
        this.d().a();
        super.onCreate(bundle);
        this.d().e();
    }
    
    public final View findViewById(final int n) {
        final y y = (y)this.d();
        y.x();
        return y.N.findViewById(n);
    }
    
    public final void g(final CharSequence title) {
        super.setTitle(title);
        this.d().m(title);
    }
    
    public final boolean h(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public final void invalidateOptionsMenu() {
        this.d().b();
    }
    
    public final void onCreate(final Bundle bundle) {
        this.e(bundle);
        final f h = this.H;
        h.b.setContentView(h.z);
        final Window c = h.c;
        final View viewById = c.findViewById(2131230968);
        final View viewById2 = viewById.findViewById(2131231075);
        final View viewById3 = viewById.findViewById(2131230854);
        final View viewById4 = viewById.findViewById(2131230833);
        final ViewGroup viewGroup = (ViewGroup)viewById.findViewById(2131230860);
        Object g = h.g;
        if (g == null) {
            g = null;
        }
        final int n = false ? 1 : 0;
        final boolean b = g != null;
        if (!b || !f.a((View)g)) {
            c.setFlags(131072, 131072);
        }
        if (b) {
            final FrameLayout frameLayout = (FrameLayout)c.findViewById(2131230859);
            ((ViewGroup)frameLayout).addView((View)g, new ViewGroup$LayoutParams(-1, -1));
            if (h.h) {
                ((View)frameLayout).setPadding(0, 0, 0, 0);
            }
            if (h.f != null) {
                ((LinearLayout$LayoutParams)((View)viewGroup).getLayoutParams()).weight = 0.0f;
            }
        }
        else {
            ((View)viewGroup).setVisibility(8);
        }
        final View viewById5 = ((View)viewGroup).findViewById(2131231075);
        final View viewById6 = ((View)viewGroup).findViewById(2131230854);
        final View viewById7 = ((View)viewGroup).findViewById(2131230833);
        final ViewGroup b2 = f.b(viewById5, viewById2);
        final ViewGroup b3 = f.b(viewById6, viewById3);
        final ViewGroup b4 = f.b(viewById7, viewById4);
        ((View)(h.r = (NestedScrollView)c.findViewById(2131231002))).setFocusable(false);
        h.r.setNestedScrollingEnabled(false);
        final TextView v = (TextView)((View)b3).findViewById(16908299);
        if ((h.v = v) != null) {
            final String e = h.e;
            if (e != null) {
                v.setText((CharSequence)e);
            }
            else {
                ((View)v).setVisibility(8);
                ((ViewGroup)h.r).removeView((View)h.v);
                if (h.f != null) {
                    final ViewGroup viewGroup2 = (ViewGroup)((View)h.r).getParent();
                    final int indexOfChild = viewGroup2.indexOfChild((View)h.r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView((View)h.f, indexOfChild, new ViewGroup$LayoutParams(-1, -1));
                }
                else {
                    ((View)b3).setVisibility(8);
                }
            }
        }
        final Button i = (Button)((View)b4).findViewById(16908313);
        h.i = i;
        final d f = h.F;
        ((View)i).setOnClickListener((View$OnClickListener)f);
        int n2;
        if (TextUtils.isEmpty(h.j)) {
            ((View)h.i).setVisibility(8);
            n2 = 0;
        }
        else {
            ((TextView)h.i).setText(h.j);
            ((View)h.i).setVisibility(0);
            n2 = 1;
        }
        ((View)(h.l = (Button)((View)b4).findViewById(16908314))).setOnClickListener((View$OnClickListener)f);
        if (TextUtils.isEmpty(h.m)) {
            ((View)h.l).setVisibility(8);
        }
        else {
            ((TextView)h.l).setText(h.m);
            ((View)h.l).setVisibility(0);
            n2 |= 0x2;
        }
        ((View)(h.o = (Button)((View)b4).findViewById(16908315))).setOnClickListener((View$OnClickListener)f);
        if (TextUtils.isEmpty(h.p)) {
            ((View)h.o).setVisibility(8);
        }
        else {
            ((TextView)h.o).setText(h.p);
            ((View)h.o).setVisibility(0);
            n2 |= 0x4;
        }
        final TypedValue typedValue = new TypedValue();
        h.a.getTheme().resolveAttribute(2130903085, typedValue, true);
        if (typedValue.data != 0) {
            if (n2 == 1) {
                final Button j = h.i;
                final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)((View)j).getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                ((View)j).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
            else if (n2 == 2) {
                final Button l = h.l;
                final LinearLayout$LayoutParams layoutParams2 = (LinearLayout$LayoutParams)((View)l).getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                ((View)l).setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            }
            else if (n2 == 4) {
                final Button o = h.o;
                final LinearLayout$LayoutParams layoutParams3 = (LinearLayout$LayoutParams)((View)o).getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                ((View)o).setLayoutParams((ViewGroup$LayoutParams)layoutParams3);
            }
        }
        if (n2 == 0) {
            ((View)b4).setVisibility(8);
        }
        if (h.w != null) {
            b2.addView(h.w, 0, new ViewGroup$LayoutParams(-1, -2));
            c.findViewById(2131231072).setVisibility(8);
        }
        else {
            h.t = (ImageView)c.findViewById(16908294);
            if (!TextUtils.isEmpty(h.d) && h.D) {
                (h.u = (TextView)c.findViewById(2131230796)).setText(h.d);
                final Drawable s = h.s;
                if (s != null) {
                    h.t.setImageDrawable(s);
                }
                else {
                    h.u.setPadding(((View)h.t).getPaddingLeft(), ((View)h.t).getPaddingTop(), ((View)h.t).getPaddingRight(), ((View)h.t).getPaddingBottom());
                    h.t.setVisibility(8);
                }
            }
            else {
                c.findViewById(2131231072).setVisibility(8);
                h.t.setVisibility(8);
                ((View)b2).setVisibility(8);
            }
        }
        final boolean b5 = ((View)viewGroup).getVisibility() != 8;
        final boolean b6 = b2 != null && ((View)b2).getVisibility() != 8;
        final boolean b7 = ((View)b4).getVisibility() != 8;
        if (!b7) {
            final View viewById8 = ((View)b3).findViewById(2131231067);
            if (viewById8 != null) {
                viewById8.setVisibility(0);
            }
        }
        if (b6) {
            final NestedScrollView r = h.r;
            if (r != null) {
                ((ViewGroup)r).setClipToPadding(true);
            }
            View viewById9;
            if (h.e == null && h.f == null) {
                viewById9 = null;
            }
            else {
                viewById9 = ((View)b2).findViewById(2131231071);
            }
            if (viewById9 != null) {
                viewById9.setVisibility(0);
            }
        }
        else {
            final View viewById10 = ((View)b3).findViewById(2131231068);
            if (viewById10 != null) {
                viewById10.setVisibility(0);
            }
        }
        final AlertController$RecycleListView f2 = h.f;
        if (f2 != null) {
            f2.getClass();
            if (!b7 || !b6) {
                final int paddingLeft = ((View)f2).getPaddingLeft();
                int n3;
                if (b6) {
                    n3 = ((View)f2).getPaddingTop();
                }
                else {
                    n3 = f2.C;
                }
                final int paddingRight = ((View)f2).getPaddingRight();
                int n4;
                if (b7) {
                    n4 = ((View)f2).getPaddingBottom();
                }
                else {
                    n4 = f2.D;
                }
                ((View)f2).setPadding(paddingLeft, n3, paddingRight, n4);
            }
        }
        if (!b5) {
            Object o2 = h.f;
            if (o2 == null) {
                o2 = h.r;
            }
            if (o2 != null) {
                int n5 = n;
                if (b7) {
                    n5 = 2;
                }
                final View viewById11 = c.findViewById(2131231001);
                final View viewById12 = c.findViewById(2131231000);
                final WeakHashMap a = V.a;
                K.d((View)o2, (b6 ? 1 : 0) | n5, 3);
                if (viewById11 != null) {
                    b3.removeView(viewById11);
                }
                if (viewById12 != null) {
                    b3.removeView(viewById12);
                }
            }
        }
        final AlertController$RecycleListView f3 = h.f;
        if (f3 != null) {
            final ListAdapter x = h.x;
            if (x != null) {
                ((ListView)f3).setAdapter(x);
                final int y = h.y;
                if (y > -1) {
                    ((AbsListView)f3).setItemChecked(y, true);
                    ((ListView)f3).setSelection(y);
                }
            }
        }
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final NestedScrollView r = this.H.r;
        return (r != null && r.d(keyEvent)) || super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        final NestedScrollView r = this.H.r;
        return (r != null && r.d(keyEvent)) || super.onKeyUp(n, keyEvent);
    }
    
    public final void onStop() {
        super.onStop();
        final y y = (y)this.d();
        y.B();
        final j.a q = y.Q;
        if (q != null) {
            q.q(false);
        }
    }
    
    public final void onSupportActionModeFinished(final b b) {
    }
    
    public final void onSupportActionModeStarted(final b b) {
    }
    
    public final b onWindowStartingSupportActionMode(final m.a a) {
        return null;
    }
    
    public final void setContentView(final int n) {
        this.d().j(n);
    }
    
    public final void setContentView(final View view) {
        this.d().k(view);
    }
    
    public final void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.d().l(view, viewGroup$LayoutParams);
    }
    
    public final void setTitle(final int title) {
        super.setTitle(title);
        this.d().m((CharSequence)((Dialog)this).getContext().getString(title));
    }
    
    public final void setTitle(final CharSequence charSequence) {
        this.g(charSequence);
        final f h = this.H;
        h.d = charSequence;
        final TextView u = h.u;
        if (u != null) {
            u.setText(charSequence);
        }
    }
}
