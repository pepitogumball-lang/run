package o;

import android.text.InputFilter;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import F1.u0;
import com.google.android.gms.internal.ads.Zr;
import android.widget.ToggleButton;

public final class f0 extends ToggleButton
{
    public final Zr C;
    public final u0 D;
    public s E;
    
    public f0(final Context context, final AttributeSet set) {
        super(context, set, 16842827);
        b1.a(((View)this).getContext(), (View)this);
        (this.C = new Zr((View)this)).d(set, 16842827);
        (this.D = new u0((TextView)this)).f(set, 16842827);
        this.getEmojiTextViewHelper().b(set, 16842827);
    }
    
    private s getEmojiTextViewHelper() {
        if (this.E == null) {
            this.E = new s((TextView)this);
        }
        return this.E;
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final Zr c = this.C;
        if (c != null) {
            c.a();
        }
        final u0 d = this.D;
        if (d != null) {
            d.b();
        }
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final Zr c = this.C;
        ColorStateList b;
        if (c != null) {
            b = c.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final Zr c = this.C;
        PorterDuff$Mode c2;
        if (c != null) {
            c2 = c.c();
        }
        else {
            c2 = null;
        }
        return c2;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.D.d();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.D.e();
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final Zr c = this.C;
        if (c != null) {
            c.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final Zr c = this.C;
        if (c != null) {
            c.f(backgroundResource);
        }
    }
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final u0 d = this.D;
        if (d != null) {
            d.b();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final u0 d = this.D;
        if (d != null) {
            d.b();
        }
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
    }
    
    public void setFilters(final InputFilter[] array) {
        super.setFilters(this.getEmojiTextViewHelper().a(array));
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final Zr c = this.C;
        if (c != null) {
            c.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final Zr c = this.C;
        if (c != null) {
            c.i(porterDuff$Mode);
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        final u0 d = this.D;
        d.l(list);
        d.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final u0 d = this.D;
        d.m(porterDuff$Mode);
        d.b();
    }
}
