package o;

import android.text.Layout;
import android.graphics.Paint;
import java.lang.reflect.AccessibleObject;
import android.util.TypedValue;
import android.content.res.Resources;
import android.text.StaticLayout;
import android.text.method.TransformationMethod;
import android.text.Layout$Alignment;
import android.view.View;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Build$VERSION;
import android.content.Context;
import android.widget.TextView;
import android.text.TextPaint;
import java.util.concurrent.ConcurrentHashMap;
import android.graphics.RectF;

public final class e0
{
    public static final RectF l;
    public static final ConcurrentHashMap m;
    public int a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public int[] f;
    public boolean g;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final b0 k;
    
    static {
        l = new RectF();
        m = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
    
    public e0(final TextView i) {
        this.a = 0;
        this.b = false;
        this.c = -1.0f;
        this.d = -1.0f;
        this.e = -1.0f;
        this.f = new int[0];
        this.g = false;
        this.i = i;
        this.j = ((View)i).getContext();
        if (Build$VERSION.SDK_INT >= 29) {
            this.k = new c0();
        }
        else {
            this.k = new b0();
        }
    }
    
    public static int[] b(int[] array) {
        final int length = array.length;
        if (length == 0) {
            return array;
        }
        Arrays.sort(array);
        final ArrayList list = new ArrayList();
        final int n = 0;
        for (final int n2 : array) {
            if (n2 > 0 && Collections.binarySearch((List)list, (Object)n2) < 0) {
                list.add((Object)n2);
            }
        }
        if (length == list.size()) {
            return array;
        }
        final int size = list.size();
        array = new int[size];
        for (int j = n; j < size; ++j) {
            array[j] = (int)list.get(j);
        }
        return array;
    }
    
    public static Method d(final String name) {
        Label_0056: {
            Method method;
            try {
                final ConcurrentHashMap m = e0.m;
                if ((method = (Method)m.get((Object)name)) == null) {
                    final Method declaredMethod = TextView.class.getDeclaredMethod(name, (Class<?>[])null);
                    if ((method = declaredMethod) != null) {
                        ((AccessibleObject)declaredMethod).setAccessible(true);
                        m.put((Object)name, (Object)declaredMethod);
                        method = declaredMethod;
                    }
                }
            }
            catch (final Exception ex) {
                break Label_0056;
            }
            return method;
        }
        final StringBuilder sb = new StringBuilder("Failed to retrieve TextView#");
        sb.append(name);
        sb.append("() method");
        final Exception ex;
        Log.w("ACTVAutoSizeHelper", sb.toString(), (Throwable)ex);
        return null;
    }
    
    public static Object e(Object o, Object invoke, final String s) {
        final Throwable t;
        Label_0025: {
            try {
                o = (invoke = d(s).invoke(o, (Object[])null));
                return invoke;
            }
            catch (final Exception ex) {
                break Label_0025;
            }
            throw t;
        }
        final StringBuilder sb = new StringBuilder("Failed to invoke TextView#");
        sb.append(s);
        sb.append("() method");
        Log.w("ACTVAutoSizeHelper", sb.toString(), t);
        return invoke;
    }
    
    public final void a() {
        if (!this.f()) {
            return;
        }
        Label_0194: {
            if (this.b) {
                if (((View)this.i).getMeasuredHeight() > 0) {
                    if (((View)this.i).getMeasuredWidth() > 0) {
                        int n;
                        if (this.k.b(this.i)) {
                            n = 1048576;
                        }
                        else {
                            n = ((View)this.i).getMeasuredWidth() - this.i.getTotalPaddingLeft() - this.i.getTotalPaddingRight();
                        }
                        final int n2 = ((View)this.i).getHeight() - this.i.getCompoundPaddingBottom() - this.i.getCompoundPaddingTop();
                        if (n > 0) {
                            if (n2 > 0) {
                                final RectF l = e0.l;
                                final RectF rectF;
                                monitorenter(rectF = l);
                                Label_0181: {
                                    try {
                                        l.setEmpty();
                                        l.right = (float)n;
                                        l.bottom = (float)n2;
                                        final float n3 = (float)this.c(l);
                                        if (n3 != this.i.getTextSize()) {
                                            this.g(n3, 0);
                                        }
                                        break Label_0181;
                                    }
                                    finally {
                                        monitorexit(rectF);
                                        monitorexit(rectF);
                                        break Label_0194;
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
        }
        this.b = true;
    }
    
    public final int c(final RectF rectF) {
        final int length = this.f.length;
        if (length != 0) {
            int n = length - 1;
            int n2 = 0;
            int i = 1;
            while (i <= n) {
                final int n3 = (i + n) / 2;
                final int n4 = this.f[n3];
                final TextView j = this.i;
                final CharSequence text = j.getText();
                final TransformationMethod transformationMethod = j.getTransformationMethod();
                CharSequence charSequence = text;
                if (transformationMethod != null) {
                    final CharSequence transformation = transformationMethod.getTransformation(text, (View)j);
                    charSequence = text;
                    if (transformation != null) {
                        charSequence = transformation;
                    }
                }
                final int b = Y.b(j);
                final TextPaint h = this.h;
                if (h == null) {
                    this.h = new TextPaint();
                }
                else {
                    ((Paint)h).reset();
                }
                this.h.set(j.getPaint());
                ((Paint)this.h).setTextSize((float)n4);
                final StaticLayout a = a0.a(charSequence, (Layout$Alignment)e(j, Layout$Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), b, this.i, this.h, this.k);
                Label_0265: {
                    if (b != -1) {
                        if (a.getLineCount() > b) {
                            break Label_0265;
                        }
                        if (((Layout)a).getLineEnd(a.getLineCount() - 1) != charSequence.length()) {
                            break Label_0265;
                        }
                    }
                    if (((Layout)a).getHeight() <= rectF.bottom) {
                        n2 = i;
                        i = n3 + 1;
                        continue;
                    }
                }
                n2 = (n = n3 - 1);
            }
            return this.f[n2];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }
    
    public final boolean f() {
        return this.j() && this.a != 0;
    }
    
    public final void g(float applyDimension, final int n) {
        final Context j = this.j;
        Resources resources;
        if (j == null) {
            resources = Resources.getSystem();
        }
        else {
            resources = j.getResources();
        }
        applyDimension = TypedValue.applyDimension(n, applyDimension, resources.getDisplayMetrics());
        final TextView i = this.i;
        if (applyDimension != ((Paint)i.getPaint()).getTextSize()) {
            ((Paint)i.getPaint()).setTextSize(applyDimension);
            final boolean a = Z.a((View)i);
            if (i.getLayout() != null) {
                this.b = false;
                try {
                    final Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke((Object)i, (Object[])null);
                    }
                }
                catch (final Exception ex) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", (Throwable)ex);
                }
                if (!a) {
                    ((View)i).requestLayout();
                }
                else {
                    ((View)i).forceLayout();
                }
                ((View)i).invalidate();
            }
        }
    }
    
    public final boolean h() {
        final boolean j = this.j();
        int i = 0;
        if (j && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                final int n = (int)Math.floor((double)((this.e - this.d) / this.c)) + 1;
                final int[] array = new int[n];
                while (i < n) {
                    array[i] = Math.round(i * this.c + this.d);
                    ++i;
                }
                this.f = b(array);
            }
            this.b = true;
        }
        else {
            this.b = false;
        }
        return this.b;
    }
    
    public final boolean i() {
        final int[] f = this.f;
        final int length = f.length;
        final boolean g = length > 0;
        this.g = g;
        if (g) {
            this.a = 1;
            this.d = (float)f[0];
            this.e = (float)f[length - 1];
            this.c = -1.0f;
        }
        return g;
    }
    
    public final boolean j() {
        return this.i instanceof r ^ true;
    }
    
    public final void k(final float d, final float e, final float c) {
        if (d <= 0.0f) {
            final StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(d);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        }
        if (e <= d) {
            final StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(e);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(d);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (c > 0.0f) {
            this.a = 1;
            this.d = d;
            this.e = e;
            this.c = c;
            this.g = false;
            return;
        }
        final StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
        sb3.append(c);
        sb3.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(sb3.toString());
    }
}
