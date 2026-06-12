package E4;

import java.lang.ref.Reference;
import com.google.android.gms.internal.ads.FB;
import android.widget.CheckedTextView;
import com.google.android.gms.internal.ads.sa;
import android.view.Window;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import com.google.android.gms.internal.ads.wd;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.google.android.gms.internal.ads.Ie;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources$NotFoundException;
import o.l0;
import T.b;
import android.view.View;
import O.V;
import android.content.res.TypedArray;
import w2.e;
import android.util.AttributeSet;
import o.o;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import I.a;
import android.content.res.ColorStateList;
import T.c;
import android.widget.CompoundButton;
import java.util.HashMap;
import android.widget.TextView;

public final class k
{
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    
    public static HashMap d(final byte[] array) {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"enabled", (Object)Boolean.TRUE);
        hashMap.put((Object)"data", (Object)array);
        return hashMap;
    }
    
    public void a() {
        final CompoundButton compoundButton = (CompoundButton)this.d;
        final Drawable a = T.c.a(compoundButton);
        if (a != null && (this.a || this.b)) {
            final Drawable mutate = a.mutate();
            if (this.a) {
                I.a.h(mutate, (ColorStateList)this.e);
            }
            if (this.b) {
                I.a.i(mutate, (PorterDuff$Mode)this.f);
            }
            if (mutate.isStateful()) {
                mutate.setState(((View)compoundButton).getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }
    
    public void b() {
        final o o = (o)this.d;
        final Drawable checkMarkDrawable = ((CheckedTextView)o).getCheckMarkDrawable();
        if (checkMarkDrawable != null && (this.a || this.b)) {
            final Drawable mutate = checkMarkDrawable.mutate();
            if (this.a) {
                I.a.h(mutate, (ColorStateList)this.e);
            }
            if (this.b) {
                I.a.i(mutate, (PorterDuff$Mode)this.f);
            }
            if (mutate.isStateful()) {
                mutate.setState(((View)o).getDrawableState());
            }
            o.setCheckMarkDrawable(mutate);
        }
    }
    
    public void c(final AttributeSet set, int n) {
        final CompoundButton compoundButton = (CompoundButton)this.d;
        final Context context = ((View)compoundButton).getContext();
        final int[] m = i.a.m;
        final e h = w2.e.H(context, set, m, n);
        final TypedArray typedArray = (TypedArray)h.E;
        V.g((View)compoundButton, ((View)compoundButton).getContext(), m, set, (TypedArray)h.E, n);
    Label_0136_Outer:
        while (true) {
            while (true) {
                Label_0185: {
                    try {
                        if (!typedArray.hasValue(1)) {
                            break Label_0101;
                        }
                        n = typedArray.getResourceId(1, 0);
                        if (n != 0) {
                            final CompoundButton compoundButton2 = compoundButton;
                            final Object o = compoundButton;
                            final Context context2 = ((View)o).getContext();
                            final int n2 = n;
                            final Drawable drawable = s2.a.f(context2, n2);
                            compoundButton2.setButtonDrawable(drawable);
                            break Label_0136;
                        }
                        break Label_0101;
                    }
                    finally {
                        break Label_0185;
                    }
                    try {
                        final CompoundButton compoundButton2 = compoundButton;
                        final Object o = compoundButton;
                        final Context context2 = ((View)o).getContext();
                        final int n2 = n;
                        final Drawable drawable = s2.a.f(context2, n2);
                        compoundButton2.setButtonDrawable(drawable);
                        if (typedArray.hasValue(2)) {
                            T.b.c(compoundButton, h.z(2));
                        }
                        if (typedArray.hasValue(3)) {
                            T.b.d(compoundButton, l0.c(typedArray.getInt(3, -1), (PorterDuff$Mode)null));
                        }
                        h.K();
                        return;
                        iftrue(Label_0136:)(!typedArray.hasValue(0));
                        Block_9: {
                            break Block_9;
                            h.K();
                        }
                        n = typedArray.getResourceId(0, 0);
                        iftrue(Label_0136:)(n == 0);
                        compoundButton.setButtonDrawable(s2.a.f(((View)compoundButton).getContext(), n));
                        continue;
                    }
                    catch (final Resources$NotFoundException ex) {
                        continue Label_0136_Outer;
                    }
                }
                break;
            }
            break;
        }
    }
    
    public void e() {
        if (!this.a) {
            final Activity activity = (Activity)this.e;
            final Ie ie = (Ie)this.f;
            final ViewTreeObserver viewTreeObserver = null;
            if (activity != null) {
                final Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver2 = null;
                Label_0060: {
                    if (window != null) {
                        final View decorView = window.getDecorView();
                        if (decorView != null) {
                            viewTreeObserver2 = decorView.getViewTreeObserver();
                            break Label_0060;
                        }
                    }
                    viewTreeObserver2 = null;
                }
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)ie);
                }
            }
            final sa a = E1.o.B.A;
            final wd wd = new wd((View)this.d, (ViewTreeObserver$OnGlobalLayoutListener)ie);
            final View view = (View)((Reference)((FB)wd).C).get();
            ViewTreeObserver viewTreeObserver3;
            if (view == null) {
                viewTreeObserver3 = viewTreeObserver;
            }
            else {
                final ViewTreeObserver viewTreeObserver4 = view.getViewTreeObserver();
                viewTreeObserver3 = viewTreeObserver;
                if (viewTreeObserver4 != null) {
                    if (!viewTreeObserver4.isAlive()) {
                        viewTreeObserver3 = viewTreeObserver;
                    }
                    else {
                        viewTreeObserver3 = viewTreeObserver4;
                    }
                }
            }
            if (viewTreeObserver3 != null) {
                wd.n1(viewTreeObserver3);
            }
            this.a = true;
        }
    }
}
