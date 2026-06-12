package o;

import android.widget.AutoCompleteTextView;
import s2.a;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.auth.m;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.widget.EditText;
import android.widget.TextView;
import android.content.res.TypedArray;
import w2.e;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import F1.u0;
import com.google.android.gms.internal.ads.Zr;
import android.widget.MultiAutoCompleteTextView;

public final class v extends MultiAutoCompleteTextView
{
    public static final int[] F;
    public final Zr C;
    public final u0 D;
    public final x E;
    
    static {
        F = new int[] { 16843126 };
    }
    
    public v(final Context context, final AttributeSet set) {
        c1.a(context);
        super(context, set, 2130903105);
        b1.a(((View)this).getContext(), (View)this);
        final e h = e.H(((View)this).getContext(), set, v.F, 2130903105);
        if (((TypedArray)h.E).hasValue(0)) {
            ((AutoCompleteTextView)this).setDropDownBackgroundDrawable(h.A(0));
        }
        h.K();
        (this.C = new Zr((View)this)).d(set, 2130903105);
        final u0 d = new u0((TextView)this);
        (this.D = d).f(set, 2130903105);
        d.b();
        final x e = new x((EditText)this);
        (this.E = e).b(set, 2130903105);
        final KeyListener keyListener = ((TextView)this).getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            final boolean focusable = ((View)this).isFocusable();
            final boolean clickable = ((View)this).isClickable();
            final boolean longClickable = ((View)this).isLongClickable();
            final int inputType = ((TextView)this).getInputType();
            final KeyListener a = e.a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                ((TextView)this).setRawInputType(inputType);
                ((View)this).setFocusable(focusable);
                ((View)this).setClickable(clickable);
                ((View)this).setLongClickable(longClickable);
            }
        }
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
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        m.r(editorInfo, onCreateInputConnection, (TextView)this);
        return (InputConnection)this.E.c(onCreateInputConnection, editorInfo);
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
    
    public void setDropDownBackgroundResource(final int n) {
        ((AutoCompleteTextView)this).setDropDownBackgroundDrawable(a.f(((View)this).getContext(), n));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.E.d(b);
    }
    
    public void setKeyListener(final KeyListener keyListener) {
        super.setKeyListener(this.E.a(keyListener));
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
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final u0 d = this.D;
        if (d != null) {
            d.g(context, n);
        }
    }
}
