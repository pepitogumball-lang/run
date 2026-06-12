package c0;

import android.os.BaseBundle;
import android.text.Spanned;
import n3.u0;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import android.os.SystemClock;
import z0.e;
import K2.c0;
import K2.N0;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import e3.q;
import java.io.Serializable;
import androidx.lifecycle.W;
import android.os.IBinder;
import android.os.Parcel;
import u2.d;
import android.content.Context;
import a0.t;
import android.text.Selection;
import android.text.Editable;
import com.google.android.gms.internal.ads.n1;
import R0.m;
import g2.j;
import O2.h;
import k0.a;
import androidx.lifecycle.Z;
import e3.c;

public final class b implements e3.c, Z, j.b, a, h, p1.b, r0.b, s.a, s3.b, t3.a, u2.b, c, w1.a, j, y0.a
{
    public static b C;
    
    public static s3.a o(final f f) {
        return new s3.a(System.currentTimeMillis() + 3600000, new m(8, 10), new n1(true, false, false), 10.0, 1.2, 60);
    }
    
    public static boolean p(final c0.c c, final Editable editable, int n, int i, final boolean b) {
        boolean b3;
        final boolean b2 = b3 = false;
        if (editable != null) {
            b3 = b2;
            if (n >= 0) {
                if (i < 0) {
                    b3 = b2;
                }
                else {
                    final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
                    final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
                    b3 = b2;
                    if (selectionStart != -1) {
                        b3 = b2;
                        if (selectionEnd != -1) {
                            if (selectionStart != selectionEnd) {
                                b3 = b2;
                            }
                            else {
                                int n4;
                                if (b) {
                                    final int max = Math.max(n, 0);
                                    n = ((CharSequence)editable).length();
                                    Label_0219: {
                                        Label_0121: {
                                            if (selectionStart >= 0) {
                                                if (n >= selectionStart) {
                                                    n = selectionStart;
                                                    int j;
                                                    if ((j = max) >= 0) {
                                                    Label_0126:
                                                        while (true) {
                                                            int n2 = 0;
                                                            while (j != 0) {
                                                                if (--n < 0) {
                                                                    if (n2 != 0) {
                                                                        break Label_0121;
                                                                    }
                                                                    n = 0;
                                                                    break;
                                                                }
                                                                else {
                                                                    final char char1 = ((CharSequence)editable).charAt(n);
                                                                    if (n2 != 0) {
                                                                        if (!Character.isHighSurrogate(char1)) {
                                                                            break Label_0121;
                                                                        }
                                                                        --j;
                                                                        continue Label_0126;
                                                                    }
                                                                    else if (!Character.isSurrogate(char1)) {
                                                                        --j;
                                                                    }
                                                                    else {
                                                                        if (Character.isHighSurrogate(char1)) {
                                                                            break Label_0121;
                                                                        }
                                                                        n2 = 1;
                                                                    }
                                                                }
                                                            }
                                                            break Label_0219;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        n = -1;
                                    }
                                    final int max2 = Math.max(i, 0);
                                    final int length = ((CharSequence)editable).length();
                                    Label_0365: {
                                        Label_0261: {
                                            if (selectionEnd >= 0) {
                                                if (length >= selectionEnd) {
                                                    i = selectionEnd;
                                                    int k;
                                                    if ((k = max2) >= 0) {
                                                    Label_0266:
                                                        while (true) {
                                                            int n3 = 0;
                                                            while (k != 0) {
                                                                if (i >= length) {
                                                                    i = length;
                                                                    if (n3 != 0) {
                                                                        break Label_0261;
                                                                    }
                                                                    break;
                                                                }
                                                                else {
                                                                    final char char2 = ((CharSequence)editable).charAt(i);
                                                                    if (n3 != 0) {
                                                                        if (!Character.isLowSurrogate(char2)) {
                                                                            break Label_0261;
                                                                        }
                                                                        --k;
                                                                        ++i;
                                                                        continue Label_0266;
                                                                    }
                                                                    else if (!Character.isSurrogate(char2)) {
                                                                        --k;
                                                                        ++i;
                                                                    }
                                                                    else {
                                                                        if (Character.isLowSurrogate(char2)) {
                                                                            break Label_0261;
                                                                        }
                                                                        ++i;
                                                                        n3 = 1;
                                                                    }
                                                                }
                                                            }
                                                            break Label_0365;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i = -1;
                                    }
                                    b3 = b2;
                                    if (n == -1) {
                                        return b3;
                                    }
                                    if ((n4 = i) == -1) {
                                        b3 = b2;
                                        return b3;
                                    }
                                }
                                else {
                                    n = Math.max(selectionStart - n, 0);
                                    n4 = Math.min(selectionEnd + i, ((CharSequence)editable).length());
                                }
                                final t[] array = (t[])((Spanned)editable).getSpans(n, n4, (Class)t.class);
                                b3 = b2;
                                if (array != null) {
                                    b3 = b2;
                                    if (array.length > 0) {
                                        int length2;
                                        t t;
                                        int spanStart;
                                        int spanEnd;
                                        for (length2 = array.length, i = 0; i < length2; ++i) {
                                            t = array[i];
                                            spanStart = ((Spanned)editable).getSpanStart((Object)t);
                                            spanEnd = ((Spanned)editable).getSpanEnd((Object)t);
                                            n = Math.min(spanStart, n);
                                            n4 = Math.max(spanEnd, n4);
                                        }
                                        n = Math.max(n, 0);
                                        i = Math.min(n4, ((CharSequence)editable).length());
                                        c.beginBatchEdit();
                                        editable.delete(n, i);
                                        c.endBatchEdit();
                                        b3 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    public int a(final Context context, final String s, final boolean b) {
        return d.d(context, s, b);
    }
    
    public void accept(Object obtain, final Object o) {
        final w2.b b = (w2.b)obtain;
        final O2.j j = (O2.j)o;
        final w2.c c = (w2.c)((h2.d)b).m();
        final w2.f f = new w2.f(j);
        obtain = Parcel.obtain();
        ((Parcel)obtain).writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        final int a = w2.a.a;
        ((Parcel)obtain).writeInt(1);
        a.a.E((Parcel)obtain, a.a.D((Parcel)obtain, 20293));
        ((Parcel)obtain).writeStrongBinder((IBinder)f);
        final Parcel obtain2 = Parcel.obtain();
        try {
            c.C.transact(1, (Parcel)obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            ((Parcel)obtain).recycle();
            obtain2.recycle();
        }
    }
    
    public W b(final Class clazz) {
        return (W)new i0.c();
    }
    
    public void c(final int n, final Serializable s) {
    }
    
    public Object e(final q q) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0((e3.b)q);
    }
    
    public int f(final Context context, final String s) {
        return d.a(context, s);
    }
    
    public s3.a g(final f f, final JSONObject jsonObject) {
        return o(f);
    }
    
    public Object get() {
        return new N0((Object)Executors.newSingleThreadExecutor(), 4);
    }
    
    public y0.b h(final c0 c0) {
        return (y0.b)new e((Context)c0.E, (String)c0.D, (f2.d)c0.F, c0.C);
    }
    
    public long i() {
        return SystemClock.elapsedRealtime();
    }
    
    public CharSequence j(final Preference preference) {
        final EditTextPreference editTextPreference = (EditTextPreference)preference;
        editTextPreference.getClass();
        Object string = null;
        if (TextUtils.isEmpty((CharSequence)null)) {
            string = ((Preference)editTextPreference).C.getString(2131689549);
        }
        return (CharSequence)string;
    }
    
    public com.google.android.gms.internal.ads.b k(final Context context, final String s, final u2.b b) {
        final com.google.android.gms.internal.ads.b b2 = new com.google.android.gms.internal.ads.b();
        b2.a = b.f(context, s);
        int c = 1;
        final int a = b.a(context, s, true);
        b2.b = a;
        Label_0083: {
            int a2;
            if ((a2 = b2.a) == 0) {
                a2 = 0;
                if (a == 0) {
                    c = 0;
                    break Label_0083;
                }
            }
            if (a2 >= a) {
                c = -1;
            }
        }
        b2.c = c;
        return b2;
    }
    
    public StackTraceElement[] l(final StackTraceElement[] array) {
        if (array.length <= 1024) {
            return array;
        }
        final StackTraceElement[] array2 = new StackTraceElement[1024];
        System.arraycopy((Object)array, 0, (Object)array2, 0, 512);
        System.arraycopy((Object)array, array.length - 512, (Object)array2, 512, 512);
        return array2;
    }
    
    public void m() {
    }
    
    public Bundle n() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
        return bundle;
    }
    
    public O2.t s(final Object o) {
        final Void void1 = (Void)o;
        return u0.m((Object)Boolean.TRUE);
    }
}
