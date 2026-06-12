package o;

import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import O.V;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import w2.e;
import i.a;
import android.view.Window$Callback;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

public final class m1 implements i0
{
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public final Drawable f;
    public boolean g;
    public CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public Window$Callback k;
    public boolean l;
    public i m;
    public final int n;
    public final Drawable o;
    
    public m1(final Toolbar a, final boolean b) {
        this.n = 0;
        this.a = a;
        this.h = a.getTitle();
        this.i = a.getSubtitle();
        this.g = (this.h != null);
        this.f = a.getNavigationIcon();
        final Context context = ((View)a).getContext();
        final int[] a2 = i.a.a;
        Object string = null;
        final e h = w2.e.H(context, (AttributeSet)null, a2, 2130903047);
        int b2 = 15;
        this.o = h.A(15);
        if (b) {
            final TypedArray typedArray = (TypedArray)h.E;
            final CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.h = text;
                if ((this.b & 0x8) != 0x0) {
                    final Toolbar a3 = this.a;
                    a3.setTitle(text);
                    if (this.g) {
                        V.i(((View)a3).getRootView(), text);
                    }
                }
            }
            final CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.b & 0x8) != 0x0) {
                    a.setSubtitle(text2);
                }
            }
            final Drawable a4 = h.A(20);
            if (a4 != null) {
                this.e = a4;
                this.c();
            }
            final Drawable a5 = h.A(17);
            if (a5 != null) {
                this.d = a5;
                this.c();
            }
            if (this.f == null) {
                final Drawable o = this.o;
                if (o != null) {
                    this.f = o;
                    final int b3 = this.b;
                    final Toolbar a6 = this.a;
                    if ((b3 & 0x4) != 0x0) {
                        a6.setNavigationIcon(o);
                    }
                    else {
                        a6.setNavigationIcon((Drawable)null);
                    }
                }
            }
            this.a(typedArray.getInt(10, 0));
            final int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                final View inflate = LayoutInflater.from(((View)a).getContext()).inflate(resourceId, (ViewGroup)a, false);
                final View c = this.c;
                if (c != null && (this.b & 0x10) != 0x0) {
                    ((ViewGroup)a).removeView(c);
                }
                if ((this.c = inflate) != null && (this.b & 0x10) != 0x0) {
                    ((ViewGroup)a).addView(inflate);
                }
                this.a(this.b | 0x10);
            }
            final int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                final ViewGroup$LayoutParams layoutParams = ((View)a).getLayoutParams();
                layoutParams.height = layoutDimension;
                ((View)a).setLayoutParams(layoutParams);
            }
            final int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            final int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                final int max = Math.max(dimensionPixelOffset, 0);
                final int max2 = Math.max(dimensionPixelOffset2, 0);
                a.d();
                a.V.a(max, max2);
            }
            final int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                final Context context2 = ((View)a).getContext();
                a.N = resourceId2;
                final X d = a.D;
                if (d != null) {
                    d.setTextAppearance(context2, resourceId2);
                }
            }
            final int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                final Context context3 = ((View)a).getContext();
                a.O = resourceId3;
                final X e = a.E;
                if (e != null) {
                    e.setTextAppearance(context3, resourceId3);
                }
            }
            final int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                a.setPopupTheme(resourceId4);
            }
        }
        else {
            if (a.getNavigationIcon() != null) {
                this.o = a.getNavigationIcon();
            }
            else {
                b2 = 11;
            }
            this.b = b2;
        }
        h.K();
        if (2131689473 != this.n) {
            this.n = 2131689473;
            if (TextUtils.isEmpty(a.getNavigationContentDescription())) {
                final int n = this.n;
                if (n != 0) {
                    string = ((View)a).getContext().getString(n);
                }
                this.j = (CharSequence)string;
                this.b();
            }
        }
        this.j = a.getNavigationContentDescription();
        a.setNavigationOnClickListener((View$OnClickListener)new l1(this));
    }
    
    public final void a(final int b) {
        final int n = this.b ^ b;
        this.b = b;
        if (n != 0) {
            if ((n & 0x4) != 0x0) {
                if ((b & 0x4) != 0x0) {
                    this.b();
                }
                final int b2 = this.b;
                final Toolbar a = this.a;
                if ((b2 & 0x4) != 0x0) {
                    Drawable navigationIcon = this.f;
                    if (navigationIcon == null) {
                        navigationIcon = this.o;
                    }
                    a.setNavigationIcon(navigationIcon);
                }
                else {
                    a.setNavigationIcon((Drawable)null);
                }
            }
            if ((n & 0x3) != 0x0) {
                this.c();
            }
            final Toolbar a2 = this.a;
            if ((n & 0x8) != 0x0) {
                if ((b & 0x8) != 0x0) {
                    a2.setTitle(this.h);
                    a2.setSubtitle(this.i);
                }
                else {
                    a2.setTitle((CharSequence)null);
                    a2.setSubtitle((CharSequence)null);
                }
            }
            if ((n & 0x10) != 0x0) {
                final View c = this.c;
                if (c != null) {
                    if ((b & 0x10) != 0x0) {
                        ((ViewGroup)a2).addView(c);
                    }
                    else {
                        ((ViewGroup)a2).removeView(c);
                    }
                }
            }
        }
    }
    
    public final void b() {
        if ((this.b & 0x4) != 0x0) {
            final boolean empty = TextUtils.isEmpty(this.j);
            final Toolbar a = this.a;
            if (empty) {
                a.setNavigationContentDescription(this.n);
            }
            else {
                a.setNavigationContentDescription(this.j);
            }
        }
    }
    
    public final void c() {
        final int b = this.b;
        Drawable logo;
        if ((b & 0x2) != 0x0) {
            if ((b & 0x1) != 0x0) {
                logo = this.e;
                if (logo == null) {
                    logo = this.d;
                }
            }
            else {
                logo = this.d;
            }
        }
        else {
            logo = null;
        }
        this.a.setLogo(logo);
    }
}
