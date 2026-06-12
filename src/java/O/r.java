package o;

import android.os.BaseBundle;
import android.graphics.drawable.Drawable;
import android.content.ClipData;
import b1.f;
import android.content.ClipboardManager;
import android.util.Log;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.DragEvent;
import android.os.Bundle;
import S.e;
import S.a;
import S.d;
import S.c;
import O.V;
import com.google.android.gms.internal.auth.m;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.textclassifier.TextClassifier;
import android.os.Build$VERSION;
import android.text.Editable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import J5.b;
import android.view.ActionMode$Callback;
import O.g;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import T.q;
import F1.u0;
import com.google.android.gms.internal.ads.Zr;
import O.y;
import android.widget.EditText;

public final class r extends EditText implements y
{
    public final Zr C;
    public final u0 D;
    public final x E;
    public final q F;
    public final x G;
    public o.q H;
    
    public r(final Context context, final AttributeSet set) {
        c1.a(context);
        super(context, set, 2130903258);
        b1.a(((View)this).getContext(), (View)this);
        (this.C = new Zr((View)this)).d(set, 2130903258);
        final u0 d = new u0((TextView)this);
        (this.D = d).f(set, 2130903258);
        d.b();
        final x e = new x();
        e.b = (View)this;
        this.E = e;
        this.F = (q)new Object();
        final x g = new x(this);
        (this.G = g).b(set, 2130903258);
        final KeyListener keyListener = ((TextView)this).getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            final boolean focusable = ((View)this).isFocusable();
            final boolean clickable = ((View)this).isClickable();
            final boolean longClickable = ((View)this).isLongClickable();
            final int inputType = ((TextView)this).getInputType();
            final KeyListener a = g.a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                ((TextView)this).setRawInputType(inputType);
                ((View)this).setFocusable(focusable);
                ((View)this).setClickable(clickable);
                ((View)this).setLongClickable(longClickable);
            }
        }
    }
    
    private o.q getSuperCaller() {
        if (this.H == null) {
            this.H = new o.q(this);
        }
        return this.H;
    }
    
    public final g a(final g g) {
        return this.F.a((View)this, g);
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
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return b.U(super.getCustomSelectionActionModeCallback());
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
    
    public Editable getText() {
        if (Build$VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return ((TextView)this).getEditableText();
    }
    
    public TextClassifier getTextClassifier() {
        if (Build$VERSION.SDK_INT < 28) {
            final x e = this.E;
            if (e != null) {
                TextClassifier a;
                if ((a = (TextClassifier)e.c) == null) {
                    a = P.a((TextView)e.b);
                }
                return a;
            }
        }
        return this.getSuperCaller().a.getTextClassifier();
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.D.getClass();
        u0.h(editorInfo, onCreateInputConnection, (TextView)this);
        m.r(editorInfo, onCreateInputConnection, (TextView)this);
        Object o = onCreateInputConnection;
        if (onCreateInputConnection != null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            o = onCreateInputConnection;
            if (sdk_INT <= 30) {
                final String[] d = V.d(this);
                o = onCreateInputConnection;
                if (d != null) {
                    c.a(editorInfo, d);
                    final E4.b b = new E4.b((Object)this, 6);
                    if (sdk_INT >= 25) {
                        o = new d(onCreateInputConnection, b);
                    }
                    else {
                        String[] a = c.a;
                        Label_0176: {
                            String[] array;
                            if (sdk_INT >= 25) {
                                array = S.a.e(editorInfo);
                                if (array == null) {
                                    break Label_0176;
                                }
                            }
                            else {
                                final Bundle extras = editorInfo.extras;
                                if (extras == null) {
                                    break Label_0176;
                                }
                                if ((array = ((BaseBundle)extras).getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES")) == null) {
                                    array = ((BaseBundle)editorInfo.extras).getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                                }
                                if (array == null) {
                                    break Label_0176;
                                }
                            }
                            a = array;
                        }
                        if (a.length == 0) {
                            o = onCreateInputConnection;
                        }
                        else {
                            o = new e(onCreateInputConnection, b);
                        }
                    }
                }
            }
        }
        return (InputConnection)this.G.c((InputConnection)o, editorInfo);
    }
    
    public final boolean onDragEvent(final DragEvent dragEvent) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        int a;
        final int n = a = 0;
        if (sdk_INT < 31) {
            a = n;
            if (dragEvent.getLocalState() == null) {
                if (V.d(this) != null) {
                    Context context = ((View)this).getContext();
                    while (true) {
                        while (context instanceof ContextWrapper) {
                            if (context instanceof Activity) {
                                final Activity activity = (Activity)context;
                                if (activity == null) {
                                    final StringBuilder sb = new StringBuilder("Can't handle drop: no activity: view=");
                                    sb.append((Object)this);
                                    Log.i("ReceiveContent", sb.toString());
                                    a = n;
                                    return a != 0 || super.onDragEvent(dragEvent);
                                }
                                if (dragEvent.getAction() == 1) {
                                    a = n;
                                    return a != 0 || super.onDragEvent(dragEvent);
                                }
                                a = n;
                                if (dragEvent.getAction() == 3) {
                                    a = (A.a(dragEvent, (TextView)this, activity) ? 1 : 0);
                                    return a != 0 || super.onDragEvent(dragEvent);
                                }
                                return a != 0 || super.onDragEvent(dragEvent);
                            }
                            else {
                                context = ((ContextWrapper)context).getBaseContext();
                            }
                        }
                        final Activity activity = null;
                        continue;
                    }
                }
                a = n;
            }
        }
        return a != 0 || super.onDragEvent(dragEvent);
    }
    
    public final boolean onTextContextMenuItem(int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 31 && V.d(this) != null && (n == 16908322 || n == 16908337)) {
            final ClipboardManager clipboardManager = (ClipboardManager)((View)this).getContext().getSystemService("clipboard");
            ClipData primaryClip;
            if (clipboardManager == null) {
                primaryClip = null;
            }
            else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                Object o;
                if (sdk_INT >= 31) {
                    o = new f(primaryClip, 1);
                }
                else {
                    final O.e e = new O.e();
                    e.D = primaryClip;
                    e.E = 1;
                    o = e;
                }
                if (n == 16908322) {
                    n = 0;
                }
                else {
                    n = 1;
                }
                ((O.d)o).g(n);
                V.f((View)this, ((O.d)o).b());
            }
            return true;
        }
        return super.onTextContextMenuItem(n);
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
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(b.W(actionMode$Callback, (TextView)this));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.G.d(b);
    }
    
    public void setKeyListener(final KeyListener keyListener) {
        super.setKeyListener(this.G.a(keyListener));
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
    
    public void setTextClassifier(final TextClassifier textClassifier) {
        if (Build$VERSION.SDK_INT < 28) {
            final x e = this.E;
            if (e != null) {
                e.c = textClassifier;
                return;
            }
        }
        this.getSuperCaller().a.setTextClassifier(textClassifier);
    }
}
