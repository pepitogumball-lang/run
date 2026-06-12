package o;

import android.text.InputFilter;
import s2.a;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import F1.u0;
import com.google.android.gms.internal.ads.Zr;
import E4.k;
import android.widget.CheckBox;

public final class n extends CheckBox
{
    public final k C;
    public final Zr D;
    public final u0 E;
    public s F;
    
    public n(final Context context, final AttributeSet set) {
        c1.a(context);
        super(context, set, 2130903155);
        b1.a(((View)this).getContext(), (View)this);
        (this.C = new k((TextView)this)).c(set, 2130903155);
        (this.D = new Zr((View)this)).d(set, 2130903155);
        (this.E = new u0((TextView)this)).f(set, 2130903155);
        this.getEmojiTextViewHelper().b(set, 2130903155);
    }
    
    private s getEmojiTextViewHelper() {
        if (this.F == null) {
            this.F = new s((TextView)this);
        }
        return this.F;
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final Zr d = this.D;
        if (d != null) {
            d.a();
        }
        final u0 e = this.E;
        if (e != null) {
            e.b();
        }
    }
    
    public int getCompoundPaddingLeft() {
        final int compoundPaddingLeft = super.getCompoundPaddingLeft();
        final k c = this.C;
        if (c != null) {
            c.getClass();
        }
        return compoundPaddingLeft;
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final Zr d = this.D;
        ColorStateList b;
        if (d != null) {
            b = d.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final Zr d = this.D;
        PorterDuff$Mode c;
        if (d != null) {
            c = d.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportButtonTintList() {
        final k c = this.C;
        ColorStateList list;
        if (c != null) {
            list = (ColorStateList)c.e;
        }
        else {
            list = null;
        }
        return list;
    }
    
    public PorterDuff$Mode getSupportButtonTintMode() {
        final k c = this.C;
        PorterDuff$Mode porterDuff$Mode;
        if (c != null) {
            porterDuff$Mode = (PorterDuff$Mode)c.f;
        }
        else {
            porterDuff$Mode = null;
        }
        return porterDuff$Mode;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.E.d();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.E.e();
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final Zr d = this.D;
        if (d != null) {
            d.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final Zr d = this.D;
        if (d != null) {
            d.f(backgroundResource);
        }
    }
    
    public void setButtonDrawable(final int n) {
        this.setButtonDrawable(a.f(((View)this).getContext(), n));
    }
    
    public void setButtonDrawable(final Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        final k c = this.C;
        if (c != null) {
            if (c.c) {
                c.c = false;
            }
            else {
                c.c = true;
                c.a();
            }
        }
    }
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final u0 e = this.E;
        if (e != null) {
            e.b();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final u0 e = this.E;
        if (e != null) {
            e.b();
        }
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
    }
    
    public void setFilters(final InputFilter[] array) {
        super.setFilters(this.getEmojiTextViewHelper().a(array));
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final Zr d = this.D;
        if (d != null) {
            d.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final Zr d = this.D;
        if (d != null) {
            d.i(porterDuff$Mode);
        }
    }
    
    public void setSupportButtonTintList(final ColorStateList e) {
        final k c = this.C;
        if (c != null) {
            c.e = e;
            c.a = true;
            c.a();
        }
    }
    
    public void setSupportButtonTintMode(final PorterDuff$Mode f) {
        final k c = this.C;
        if (c != null) {
            c.f = f;
            c.b = true;
            c.a();
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        final u0 e = this.E;
        e.l(list);
        e.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final u0 e = this.E;
        e.m(porterDuff$Mode);
        e.b();
    }
}
