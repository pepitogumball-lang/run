package F1;

import android.graphics.Paint;
import android.content.res.Resources$NotFoundException;
import o.U;
import C2.g0;
import java.lang.ref.WeakReference;
import com.google.android.gms.internal.measurement.L;
import java.util.Arrays;
import android.util.DisplayMetrics;
import android.graphics.Paint$FontMetricsInt;
import o.l0;
import T.m;
import o.t1;
import android.util.TypedValue;
import o.S;
import o.T;
import android.graphics.Typeface;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import O.V;
import android.content.res.TypedArray;
import w2.e;
import i.a;
import android.util.AttributeSet;
import android.graphics.PorterDuff$Mode;
import o.Q;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import S.c;
import S.b;
import android.os.Build$VERSION;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.content.res.ColorStateList;
import o.d1;
import o.p;
import android.content.Context;
import o.e0;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import android.os.Bundle;
import java.util.HashSet;

public final class u0
{
    public int a;
    public int b;
    public boolean c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    
    public u0() {
        this.d = new HashSet();
        this.g = new Bundle();
        this.i = new HashMap();
        this.e = new HashSet();
        this.h = new Bundle();
        this.f = new HashSet();
        this.m = new ArrayList();
        this.a = -1;
        this.b = 60000;
    }
    
    public u0(final TextView d) {
        this.a = 0;
        this.b = -1;
        this.d = d;
        this.l = new e0(d);
    }
    
    public static d1 c(final Context context, final p p3, final int n) {
        synchronized (p3) {
            final ColorStateList f = p3.a.f(context, n);
            monitorexit(p3);
            if (f != null) {
                final Object o = new Object();
                ((d1)o).d = true;
                ((d1)o).a = f;
                return (d1)o;
            }
            return null;
        }
    }
    
    public static void h(final EditorInfo editorInfo, final InputConnection inputConnection, final TextView textView) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 30 && inputConnection != null) {
            final CharSequence text = textView.getText();
            if (sdk_INT >= 30) {
                b.a(editorInfo, text);
            }
            else {
                text.getClass();
                if (sdk_INT >= 30) {
                    b.a(editorInfo, text);
                }
                else {
                    final int initialSelStart = editorInfo.initialSelStart;
                    int initialSelEnd = editorInfo.initialSelEnd;
                    int n;
                    if (initialSelStart > initialSelEnd) {
                        n = initialSelEnd;
                    }
                    else {
                        n = initialSelStart;
                    }
                    if (initialSelStart > initialSelEnd) {
                        initialSelEnd = initialSelStart;
                    }
                    final int length = text.length();
                    if (n >= 0 && initialSelEnd <= length) {
                        final int n2 = editorInfo.inputType & 0xFFF;
                        if (n2 != 129 && n2 != 225 && n2 != 18) {
                            if (length <= 2048) {
                                c.b(editorInfo, text, n, initialSelEnd);
                            }
                            else {
                                final int n3 = initialSelEnd - n;
                                int n4;
                                if (n3 > 1024) {
                                    n4 = 0;
                                }
                                else {
                                    n4 = n3;
                                }
                                final int length2 = text.length();
                                final int n5 = 2048 - n4;
                                final int min = Math.min(length2 - initialSelEnd, n5 - Math.min(n, (int)(n5 * 0.8)));
                                final int min2 = Math.min(n, n5 - min);
                                final int n6 = n - min2;
                                int n7 = min2;
                                int n8 = n6;
                                if (Character.isLowSurrogate(text.charAt(n6))) {
                                    n8 = n6 + 1;
                                    n7 = min2 - 1;
                                }
                                int n9 = min;
                                if (Character.isHighSurrogate(text.charAt(initialSelEnd + min - 1))) {
                                    n9 = min - 1;
                                }
                                final int n10 = n7 + n4;
                                CharSequence charSequence;
                                if (n4 != n3) {
                                    charSequence = TextUtils.concat(new CharSequence[] { text.subSequence(n8, n8 + n7), text.subSequence(initialSelEnd, n9 + initialSelEnd) });
                                }
                                else {
                                    charSequence = text.subSequence(n8, n10 + n9 + n8);
                                }
                                c.b(editorInfo, charSequence, n7, n10);
                            }
                        }
                        else {
                            c.b(editorInfo, (CharSequence)null, 0, 0);
                        }
                    }
                    else {
                        c.b(editorInfo, (CharSequence)null, 0, 0);
                    }
                }
            }
        }
    }
    
    public void a(final Drawable drawable, final d1 d1) {
        if (drawable != null && d1 != null) {
            p.d(drawable, d1, ((View)this.d).getDrawableState());
        }
    }
    
    public void b() {
        final d1 d1 = (d1)this.e;
        final TextView textView = (TextView)this.d;
        if (d1 != null || this.f != null || this.g != null || this.h != null) {
            final Drawable[] compoundDrawables = textView.getCompoundDrawables();
            this.a(compoundDrawables[0], (d1)this.e);
            this.a(compoundDrawables[1], (d1)this.f);
            this.a(compoundDrawables[2], (d1)this.g);
            this.a(compoundDrawables[3], (d1)this.h);
        }
        if (this.i != null || this.j != null) {
            final Drawable[] a = Q.a(textView);
            this.a(a[0], (d1)this.i);
            this.a(a[2], (d1)this.j);
        }
    }
    
    public ColorStateList d() {
        final d1 d1 = (d1)this.k;
        ColorStateList a;
        if (d1 != null) {
            a = d1.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public PorterDuff$Mode e() {
        final d1 d1 = (d1)this.k;
        PorterDuff$Mode b;
        if (d1 != null) {
            b = d1.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public void f(final AttributeSet set, int i) {
        final TextView textView = (TextView)this.d;
        final Context context = ((View)textView).getContext();
        final p a = p.a();
        final int[] h = i.a.h;
        final e h2 = w2.e.H(context, set, h, i);
        V.g((View)textView, ((View)textView).getContext(), h, set, (TypedArray)h2.E, i);
        final TypedArray typedArray = (TypedArray)h2.E;
        final int resourceId = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.e = c(context, a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f = c(context, a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.g = c(context, a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.h = c(context, a, typedArray.getResourceId(2, 0));
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.i = c(context, a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.j = c(context, a, typedArray.getResourceId(6, 0));
        }
        h2.K();
        final boolean b = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        final int[] x = i.a.x;
        boolean allCaps;
        boolean b2;
        String s;
        String string;
        if (resourceId != -1) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, x);
            final e e = new e(context, obtainStyledAttributes);
            if (!b && obtainStyledAttributes.hasValue(14)) {
                allCaps = obtainStyledAttributes.getBoolean(14, false);
                b2 = true;
            }
            else {
                allCaps = false;
                b2 = false;
            }
            this.n(context, e);
            if (obtainStyledAttributes.hasValue(15)) {
                s = obtainStyledAttributes.getString(15);
            }
            else {
                s = null;
            }
            if (sdk_INT >= 26 && obtainStyledAttributes.hasValue(13)) {
                string = obtainStyledAttributes.getString(13);
            }
            else {
                string = null;
            }
            e.K();
        }
        else {
            allCaps = false;
            b2 = false;
            string = null;
            s = null;
        }
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, x, i, 0);
        final e e2 = new e(context, obtainStyledAttributes2);
        if (!b && obtainStyledAttributes2.hasValue(14)) {
            allCaps = obtainStyledAttributes2.getBoolean(14, false);
            b2 = true;
        }
        if (obtainStyledAttributes2.hasValue(15)) {
            s = obtainStyledAttributes2.getString(15);
        }
        String string2 = string;
        if (sdk_INT >= 26) {
            string2 = string;
            if (obtainStyledAttributes2.hasValue(13)) {
                string2 = obtainStyledAttributes2.getString(13);
            }
        }
        if (sdk_INT >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        this.n(context, e2);
        e2.K();
        if (!b && b2) {
            textView.setAllCaps(allCaps);
        }
        final Typeface typeface = (Typeface)this.m;
        if (typeface != null) {
            if (this.b == -1) {
                textView.setTypeface(typeface, this.a);
            }
            else {
                textView.setTypeface(typeface);
            }
        }
        if (string2 != null) {
            T.d(textView, string2);
        }
        if (s != null) {
            S.b(textView, S.a(s));
        }
        final int[] j = i.a.i;
        final e0 e3 = (e0)this.l;
        final Context k = e3.j;
        final TypedArray obtainStyledAttributes3 = k.obtainStyledAttributes(set, j, i, 0);
        final TextView l = e3.i;
        V.g((View)l, ((View)l).getContext(), j, set, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            e3.a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension;
        if (obtainStyledAttributes3.hasValue(4)) {
            dimension = obtainStyledAttributes3.getDimension(4, -1.0f);
        }
        else {
            dimension = -1.0f;
        }
        float n;
        if (obtainStyledAttributes3.hasValue(2)) {
            n = obtainStyledAttributes3.getDimension(2, -1.0f);
        }
        else {
            n = -1.0f;
        }
        float dimension2;
        if (obtainStyledAttributes3.hasValue(1)) {
            dimension2 = obtainStyledAttributes3.getDimension(1, -1.0f);
        }
        else {
            dimension2 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3)) {
            i = obtainStyledAttributes3.getResourceId(3, 0);
            if (i > 0) {
                final TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(i);
                final int length = obtainTypedArray.length();
                final int[] array = new int[length];
                if (length > 0) {
                    for (i = 0; i < length; ++i) {
                        array[i] = obtainTypedArray.getDimensionPixelSize(i, -1);
                    }
                    e3.f = e0.b(array);
                    e3.i();
                }
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes3.recycle();
        if (e3.j()) {
            if (e3.a == 1) {
                if (!e3.g) {
                    final DisplayMetrics displayMetrics = k.getResources().getDisplayMetrics();
                    if (n == -1.0f) {
                        n = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    float applyDimension = dimension2;
                    if (dimension2 == -1.0f) {
                        applyDimension = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    float n2 = dimension;
                    if (dimension == -1.0f) {
                        n2 = 1.0f;
                    }
                    e3.k(n, applyDimension, n2);
                }
                e3.h();
            }
        }
        else {
            e3.a = 0;
        }
        if (t1.b && e3.a != 0) {
            final int[] f = e3.f;
            if (f.length > 0) {
                if (T.a(textView) != -1.0f) {
                    T.b(textView, Math.round(e3.d), Math.round(e3.e), Math.round(e3.c), 0);
                }
                else {
                    T.c(textView, f, 0);
                }
            }
        }
        final TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(set, j);
        i = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b3;
        if (i != -1) {
            b3 = a.b(context, i);
        }
        else {
            b3 = null;
        }
        i = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b4;
        if (i != -1) {
            b4 = a.b(context, i);
        }
        else {
            b4 = null;
        }
        i = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b5;
        if (i != -1) {
            b5 = a.b(context, i);
        }
        else {
            b5 = null;
        }
        i = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b6;
        if (i != -1) {
            b6 = a.b(context, i);
        }
        else {
            b6 = null;
        }
        i = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b7;
        if (i != -1) {
            b7 = a.b(context, i);
        }
        else {
            b7 = null;
        }
        i = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b8;
        if (i != -1) {
            b8 = a.b(context, i);
        }
        else {
            b8 = null;
        }
        if (b7 == null && b8 == null) {
            if (b3 != null || b4 != null || b5 != null || b6 != null) {
                final Drawable[] a2 = Q.a(textView);
                final Drawable drawable = a2[0];
                if (drawable == null && a2[2] == null) {
                    final Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (b3 == null) {
                        b3 = compoundDrawables[0];
                    }
                    if (b4 == null) {
                        b4 = compoundDrawables[1];
                    }
                    if (b5 == null) {
                        b5 = compoundDrawables[2];
                    }
                    if (b6 == null) {
                        b6 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(b3, b4, b5, b6);
                }
                else {
                    if (b4 == null) {
                        b4 = a2[1];
                    }
                    final Drawable drawable2 = a2[2];
                    if (b6 == null) {
                        b6 = a2[3];
                    }
                    Q.b(textView, drawable, b4, drawable2, b6);
                }
            }
        }
        else {
            final Drawable[] a3 = Q.a(textView);
            if (b7 == null) {
                b7 = a3[0];
            }
            if (b4 == null) {
                b4 = a3[1];
            }
            if (b8 == null) {
                b8 = a3[2];
            }
            if (b6 == null) {
                b6 = a3[3];
            }
            Q.b(textView, b7, b4, b8, b6);
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            ColorStateList list = null;
            Label_1642: {
                if (obtainStyledAttributes4.hasValue(11)) {
                    i = obtainStyledAttributes4.getResourceId(11, 0);
                    if (i != 0) {
                        list = s2.a.e(context, i);
                        if (list != null) {
                            break Label_1642;
                        }
                    }
                }
                list = obtainStyledAttributes4.getColorStateList(11);
            }
            T.m.f(textView, list);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            T.m.g(textView, l0.c(obtainStyledAttributes4.getInt(12, -1), (PorterDuff$Mode)null));
        }
        final int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        final int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        i = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            J5.b.P(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            J5.b.Q(textView, dimensionPixelSize2);
        }
        if (i != -1) {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
            final int fontMetricsInt = ((Paint)textView.getPaint()).getFontMetricsInt((Paint$FontMetricsInt)null);
            if (i != fontMetricsInt) {
                textView.setLineSpacing((float)(i - fontMetricsInt), 1.0f);
            }
        }
    }
    
    public void g(final Context context, int sdk_INT) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(sdk_INT, i.a.x);
        final e e = new e(context, obtainStyledAttributes);
        final boolean hasValue = obtainStyledAttributes.hasValue(14);
        final TextView textView = (TextView)this.d;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        sdk_INT = Build$VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        this.n(context, e);
        if (sdk_INT >= 26 && obtainStyledAttributes.hasValue(13)) {
            final String string = obtainStyledAttributes.getString(13);
            if (string != null) {
                T.d(textView, string);
            }
        }
        e.K();
        final Typeface typeface = (Typeface)this.m;
        if (typeface != null) {
            textView.setTypeface(typeface, this.a);
        }
    }
    
    public void i(final int n, final int n2, final int n3, final int n4) {
        final e0 e0 = (e0)this.l;
        if (e0.j()) {
            final DisplayMetrics displayMetrics = e0.j.getResources().getDisplayMetrics();
            e0.k(TypedValue.applyDimension(n4, (float)n, displayMetrics), TypedValue.applyDimension(n4, (float)n2, displayMetrics), TypedValue.applyDimension(n4, (float)n3, displayMetrics));
            if (e0.h()) {
                e0.a();
            }
        }
    }
    
    public void j(final int[] array, final int n) {
        final e0 e0 = (e0)this.l;
        if (e0.j()) {
            final int length = array.length;
            int n2 = 0;
            if (length > 0) {
                final int[] array2 = new int[length];
                int[] copy;
                if (n == 0) {
                    copy = Arrays.copyOf(array, length);
                }
                else {
                    final DisplayMetrics displayMetrics = e0.j.getResources().getDisplayMetrics();
                    while (true) {
                        copy = array2;
                        if (n2 >= length) {
                            break;
                        }
                        array2[n2] = Math.round(TypedValue.applyDimension(n, (float)array[n2], displayMetrics));
                        ++n2;
                    }
                }
                e0.f = o.e0.b(copy);
                if (!e0.i()) {
                    final StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(array));
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            else {
                e0.g = false;
            }
            if (e0.h()) {
                e0.a();
            }
        }
    }
    
    public void k(final int n) {
        final e0 e0 = (e0)this.l;
        if (e0.j()) {
            if (n != 0) {
                if (n != 1) {
                    throw new IllegalArgumentException(L.h(n, "Unknown auto-size text type: "));
                }
                final DisplayMetrics displayMetrics = e0.j.getResources().getDisplayMetrics();
                e0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (e0.h()) {
                    e0.a();
                }
            }
            else {
                e0.a = 0;
                e0.d = -1.0f;
                e0.e = -1.0f;
                e0.c = -1.0f;
                e0.f = new int[0];
                e0.b = false;
            }
        }
    }
    
    public void l(final ColorStateList a) {
        if (this.k == null) {
            this.k = new Object();
        }
        final d1 d1 = (d1)this.k;
        d1.a = a;
        d1.d = (a != null);
        this.e = d1;
        this.f = d1;
        this.g = d1;
        this.h = d1;
        this.i = d1;
        this.j = d1;
    }
    
    public void m(final PorterDuff$Mode b) {
        if (this.k == null) {
            this.k = new Object();
        }
        final d1 d1 = (d1)this.k;
        d1.b = b;
        d1.c = (b != null);
        this.e = d1;
        this.f = d1;
        this.g = d1;
        this.h = d1;
        this.i = d1;
        this.j = d1;
    }
    
    public void n(final Context context, final e e) {
        final int a = this.a;
        final TypedArray typedArray = (TypedArray)e.E;
        this.a = typedArray.getInt(2, a);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28 && (this.b = typedArray.getInt(11, -1)) != -1) {
            this.a &= 0x2;
        }
        int b = 10;
        final boolean hasValue = typedArray.hasValue(10);
        final boolean b2 = false;
        if (!hasValue && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.c = false;
                final int int1 = typedArray.getInt(1, 1);
                if (int1 != 1) {
                    if (int1 != 2) {
                        if (int1 == 3) {
                            this.m = Typeface.MONOSPACE;
                        }
                    }
                    else {
                        this.m = Typeface.SERIF;
                    }
                }
                else {
                    this.m = Typeface.SANS_SERIF;
                }
            }
            return;
        }
        this.m = null;
        if (typedArray.hasValue(12)) {
            b = 12;
        }
        final int b3 = this.b;
        final int a2 = this.a;
        while (true) {
            if (context.isRestricted()) {
                break Label_0360;
            }
            final WeakReference c = new WeakReference((Object)this.d);
            final Object o = new Object();
            ((g0)o).d = this;
            ((g0)o).a = b3;
            ((g0)o).b = a2;
            ((g0)o).c = c;
            try {
                final Typeface c2 = e.C(b, this.a, (g0)o);
                if (c2 != null) {
                    if (sdk_INT >= 28 && this.b != -1) {
                        this.m = U.a(Typeface.create(c2, 0), this.b, (this.a & 0x2) != 0x0);
                    }
                    else {
                        this.m = c2;
                    }
                }
                this.c = (this.m == null);
                if (this.m == null) {
                    final String string = typedArray.getString(b);
                    if (string != null) {
                        if (Build$VERSION.SDK_INT >= 28 && this.b != -1) {
                            final Typeface create = Typeface.create(string, 0);
                            b = this.b;
                            boolean b4 = b2;
                            if ((this.a & 0x2) != 0x0) {
                                b4 = true;
                            }
                            this.m = U.a(create, b, b4);
                        }
                        else {
                            this.m = Typeface.create(string, this.a);
                        }
                    }
                }
            }
            catch (final UnsupportedOperationException | Resources$NotFoundException ex) {
                continue;
            }
            break;
        }
    }
}
