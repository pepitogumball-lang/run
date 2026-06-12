package o;

import com.google.android.gms.internal.auth.m;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.content.res.ColorStateList;
import J5.b;
import android.view.ActionMode$Callback;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$NotFoundException;
import android.graphics.PorterDuff$Mode;
import O.V;
import android.content.res.TypedArray;
import w2.e;
import i.a;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import F1.u0;
import com.google.android.gms.internal.ads.Zr;
import E4.k;
import android.widget.CheckedTextView;

public final class o extends CheckedTextView
{
    public final k C;
    public final Zr D;
    public final u0 E;
    public s F;
    
    public o(Context o, AttributeSet set) {
        c1.a((Context)o);
        super((Context)o, set, 2130903156);
        b1.a(((View)this).getContext(), (View)this);
        final u0 e = new u0((TextView)this);
        (this.E = e).f(set, 2130903156);
        e.b();
        (this.D = new Zr((View)this)).d(set, 2130903156);
        this.C = new k((TextView)this);
        o = ((View)this).getContext();
        final int[] l = a.l;
        o = w2.e.H((Context)o, set, l, 2130903156);
        final TypedArray typedArray = (TypedArray)((e)o).E;
        V.g((View)this, ((View)this).getContext(), l, set, (TypedArray)((e)o).E, 2130903156);
    Label_0200_Outer:
        while (true) {
        Block_9_Outer:
            while (true) {
                Label_0257: {
                    int resourceId;
                    try {
                        if (!typedArray.hasValue(1)) {
                            break Label_0167;
                        }
                        resourceId = typedArray.getResourceId(1, 0);
                        if (resourceId != 0) {
                            final o o2 = this;
                            final o o3 = this;
                            final Context context = ((View)o3).getContext();
                            final int n = resourceId;
                            final Drawable drawable = s2.a.f(context, n);
                            o2.setCheckMarkDrawable(drawable);
                            break Label_0200;
                        }
                        break Label_0167;
                    }
                    finally {
                        final AttributeSet set2;
                        set = set2;
                        break Label_0257;
                    }
                    try {
                        final o o2 = this;
                        final o o3 = this;
                        final Context context = ((View)o3).getContext();
                        final int n = resourceId;
                        final Drawable drawable = s2.a.f(context, n);
                        o2.setCheckMarkDrawable(drawable);
                        if (typedArray.hasValue(2)) {
                            this.setCheckMarkTintList(((e)o).z(2));
                        }
                        if (typedArray.hasValue(3)) {
                            this.setCheckMarkTintMode(l0.c(typedArray.getInt(3, -1), null));
                        }
                        ((e)o).K();
                        this.getEmojiTextViewHelper().b(set, 2130903156);
                        return;
                        int resourceId2 = 0;
                    Block_10:
                        while (true) {
                            resourceId2 = typedArray.getResourceId(0, 0);
                            iftrue(Label_0200:)(resourceId2 == 0);
                            break Block_10;
                            iftrue(Label_0200:)(!typedArray.hasValue(0));
                            continue;
                        }
                        this.setCheckMarkDrawable(s2.a.f(((View)this).getContext(), resourceId2));
                        continue Block_9_Outer;
                        ((e)o).K();
                    }
                    catch (final Resources$NotFoundException ex) {
                        continue Label_0200_Outer;
                    }
                }
                break;
            }
            break;
        }
    }
    
    private s getEmojiTextViewHelper() {
        if (this.F == null) {
            this.F = new s((TextView)this);
        }
        return this.F;
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final u0 e = this.E;
        if (e != null) {
            e.b();
        }
        final Zr d = this.D;
        if (d != null) {
            d.a();
        }
        final k c = this.C;
        if (c != null) {
            c.b();
        }
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return b.U(super.getCustomSelectionActionModeCallback());
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
    
    public ColorStateList getSupportCheckMarkTintList() {
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
    
    public PorterDuff$Mode getSupportCheckMarkTintMode() {
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
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        m.r(editorInfo, onCreateInputConnection, (TextView)this);
        return onCreateInputConnection;
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
    
    public void setCheckMarkDrawable(final int n) {
        this.setCheckMarkDrawable(s2.a.f(((View)this).getContext(), n));
    }
    
    public void setCheckMarkDrawable(final Drawable checkMarkDrawable) {
        super.setCheckMarkDrawable(checkMarkDrawable);
        final k c = this.C;
        if (c != null) {
            if (c.c) {
                c.c = false;
            }
            else {
                c.c = true;
                c.b();
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
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(b.W(actionMode$Callback, (TextView)this));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
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
    
    public void setSupportCheckMarkTintList(final ColorStateList e) {
        final k c = this.C;
        if (c != null) {
            c.e = e;
            c.a = true;
            c.b();
        }
    }
    
    public void setSupportCheckMarkTintMode(final PorterDuff$Mode f) {
        final k c = this.C;
        if (c != null) {
            c.f = f;
            c.b = true;
            c.b();
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
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final u0 e = this.E;
        if (e != null) {
            e.g(context, n);
        }
    }
}
